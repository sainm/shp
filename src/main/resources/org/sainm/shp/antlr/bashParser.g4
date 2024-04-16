parser grammar bashParser;

options {
	tokenVocab = bashLexer;
}

script: listWithOptionalTerminator;

simpleOrComplexCommand: simpleCommand | complexCommands;

simpleCommand:
	commandModifier? commandName = literal (
		literal
		| shortFlagGroupWithOptionalValue
		| longFlagGroupWithOptionalValue
	)*;
pipeline:
	COPROC? simpleOrComplexCommand (pipe simpleOrComplexCommand)*;
sublist: pipeline (sublistJoiner pipeline)*;

pipe:
	BITOR			# PipeStdoutToStdin
	| BITOR BITAND	# PipeStdoutAndStderrToStdin;

sublistJoiner: AND | OR;

list:
	sublist? (listTerminator sublist)* listTerminator
	| LPAREN sublist? (listTerminator sublist)* listTerminator* RPAREN
	| LBRACE sublist? (listTerminator sublist)* listTerminator* RBRACE;
listWithOptionalTerminator:
	sublist? (listTerminator sublist)* listTerminator*;

listTerminator: listTerminatorWait | listTerminatorBackground;

listTerminatorWait: (SEMI | NL)+;

listTerminatorBackground: BITAND (BITOR | BANG)?;

complexCommands:
	ifThenFi
	| ifElifElse
	| ifSingular
	| forInDoDone
	| forLiteralsDoDone
	| whileDoDone
	| untilDoDone
	| repeatDoDone
	| caseInEsac
	| selectDoDone
	| forkProcess
	| codeblock
	| tryAlways
	| functionDeclaration
	| simpleFunctionListDeclaration
	| simpleFunctionSingleDeclaration
	| conditionalExpression;

ifThenFi:
	IF conditional THEN list (ELIF conditional THEN list)* (
		ELSE list
	)? FI;
ifElifElse:
	IF conditional LBRACE list RBRACE (
		ELIF conditional LBRACE list RBRACE
	)* (ELSE LBRACE list RBRACE)?;
ifSingular: IF conditional sublist;

forInDoDone:
	FOR identifier+ (
		IN literal+ (SEMI | NL)+
		| LPAREN literal+ RPAREN (SEMI | NL)*
	) DO list DONE;
forLiteralsDoDone:
	FOR LPAREN LPAREN literal SEMI literal SEMI literal RPAREN RPAREN DO list DONE;

whileDoDone: WHILE conditional DO list DONE;
untilDoDone: UNTIL conditional DO list DONE;
repeatDoDone: REPEAT arithmeticStatement DO list DONE;
caseInEsac: CASE literal IN casePattern* ESAC;
selectDoDone:
	SELECT literal (IN literal+ (SEMI | NL)+) DO list DONE;

casePattern:
	LPAREN? literal (BITOR literal)* RPAREN list caseTerminator;
caseTerminator: (SEMI (SEMI | BITAND | BITOR));

forkProcess: LPAREN listWithOptionalTerminator RPAREN;
codeblock: LBRACE listWithOptionalTerminator RBRACE;
tryAlways:
	LBRACE tryList = list RBRACE ALWAYS (SEMI | NL)* LBRACE alwaysList = list RBRACE;
functionDeclaration:
	FUNCTION identifier (LPAREN RPAREN)? (SEMI | NL)* LBRACE list RBRACE;
simpleFunctionListDeclaration:
	identifier LPAREN RPAREN (SEMI | NL)* LBRACE list RBRACE;
simpleFunctionSingleDeclaration:
	identifier LPAREN RPAREN (SEMI | NL)* simpleOrComplexCommand;

conditional: list | conditionalExpression;

conditionalExpression: LBRACK LBRACK expression RBRACK RBRACK;

expression:
	literal								# expressionLiteral
	| shortFlagGroup literal			# expressionShortFlagLiteral
	| literal shortFlagGroup literal	# expressionShortFlagLiterals
	| literal ASSIGN ASSIGN? literal	# expressionStringEquals
	| literal BANG ASSIGN literal		# expressionStringNotEquals
	| literal ASSIGN TILDE literal		# expressionStringNotEqualsRegexp
	| literal LT literal				# expressionStringLessThan
	| literal RT literal				# expressionStringGreaterThan
	| LPAREN expression RPAREN			# expressionIsTrue
	| BANG expression					# expressionIsFalse
	| expression AND expression			# expressionAnd
	| expression OR expression			# expressionOr;

commandModifier:
	SUB
	| BUILTIN
	| COMMAND shortFlagGroup*
	| EXEC shortFlagGroupWithOptionalValue*
	| NOCORRECT
	| NOGLOB;

identifier:
	IDENTIFIER
	| SUB
	| BUILTIN
	| COMMAND
	| EXEC
	| NOCORRECT
	| NOGLOB
	| BOOL_LITERAL
	| NULL_LITERAL;

literal:
	integerLiteral
	| floatLiteral
	| CHAR_LITERAL
	| quotedString
	| BOOL_LITERAL
	| NULL_LITERAL
	| identifier
	| variableReference
	| commandSubstitutionLiteral
	| arithmeticLiteral
	; //    | TEXT_BLOCK // Java17

commandSubstitutionLiteral:
	DOLLER LPAREN listWithOptionalTerminator RPAREN;
arithmeticLiteral:
	ARITHMETIC_OPEN arithmeticExpression ARITHMETIC_CLOSE;

integerLiteral:
	DECIMAL_LITERAL
	| HEX_LITERAL
	| OCT_LITERAL
	| BINARY_LITERAL
	| HASH_LITERAL
	| BRACKET_LITERAL;

floatLiteral:
	FLOAT_LITERAL
	; //    | HEX_FLOAT_LITERAL

shortFlagGroup: SUB name = IDENTIFIER;
longFlagGroup: DEC name = IDENTIFIER;

shortFlagGroupWithOptionalValue:
	shortFlagGroup (ASSIGN value = literal)?;
longFlagGroupWithOptionalValue:
	longFlagGroup (ASSIGN value = literal)?;

quotedString:
	SUBSTITUTION_QUOTING (
		ESCAPES
		| STRING_CHARACTERS
		| variableReference
		| commandSubstitutionLiteral
		| arithmeticLiteral
	)* END_QUOTED_STRING;

variableReference: VARIABLE_REFERENCE;

arithmeticExpression: (
		arithmeticStatement (',' arithmeticStatement)*
	)?;

arithmeticStatement:
	arithmeticModifier* LPAREN arithmeticStatement RPAREN					# GroupedArithmeticOperation
	| arithmeticStatement '?' arithmeticStatement ':' arithmeticStatement	#
		TernaryArithmeticExpression
	| IDENTIFIER arithmeticAssignmentOperator arithmeticStatement	# ArithmeticAssignment
	| arithmeticStatement arithmeticOperator arithmeticStatement	# ArithmeticOperation
	| arithmeticModifier* ('++' | '--')? identifier ('++' | '--')?	# ArithmeticVariableReference
	| arithmeticModifier* (integerLiteral | floatLiteral)			# ArithmeticNumericalLiteral;

arithmeticModifier: BANG | TILDE | ADD | SUB;

arithmeticAssignmentOperator:
	ASSIGN
	| ADD_ASSIGN
	| '-='
	| '*='
	| '/='
	| '%='
	| '^='
	| '|='
	| '<<='
	| '>>='
	| BITAND BITAND ASSIGN
	| BITOR BITOR ASSIGN
	| CARET CARET ASSIGN
	| '*' '*' ASSIGN;

arithmeticOperator:
	LT LT
	| RT RT
	| BITAND
	| CARET
	| BITOR
	| '*' '*'
	| '*'
	| '/'
	| '%'
	| '+'
	| '-'
	| LT
	| RT
	| '<='
	| '>='
	| '=='
	| '!='
	| AND
	| OR
	| CARET CARET;