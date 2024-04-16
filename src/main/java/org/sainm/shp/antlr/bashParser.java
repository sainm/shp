// Generated from D:/github/shp/src/main/resources/org/sainm/shp/antlr/bashParser.g4 by ANTLR 4.13.1
package org.sainm.shp.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class bashParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BUILTIN=1, COMMAND=2, EXEC=3, NOCORRECT=4, NOGLOB=5, COPROC=6, IF=7, THEN=8, 
		ELIF=9, ELSE=10, FI=11, FOR=12, IN=13, DO=14, DONE=15, WHILE=16, UNTIL=17, 
		REPEAT=18, CASE=19, ESAC=20, SELECT=21, ALWAYS=22, FUNCTION=23, DECIMAL_LITERAL=24, 
		HEX_LITERAL=25, OCT_LITERAL=26, BINARY_LITERAL=27, HASH_LITERAL=28, BRACKET_LITERAL=29, 
		FLOAT_LITERAL=30, BOOL_LITERAL=31, CHAR_LITERAL=32, SUBSTITUTION_QUOTING=33, 
		NULL_LITERAL=34, LPAREN=35, RPAREN=36, LBRACE=37, RBRACE=38, LBRACK=39, 
		RBRACK=40, SEMI=41, COMMA=42, DOT=43, DOLLER=44, ASSIGN=45, GT=46, LT=47, 
		BANG=48, TILDE=49, QUESTION=50, COLON=51, EQUAL=52, LE=53, GE=54, NOTEQUAL=55, 
		AND=56, OR=57, INC=58, DEC=59, ADD=60, SUB=61, MUL=62, DIV=63, BITAND=64, 
		BITOR=65, CARET=66, MOD=67, ADD_ASSIGN=68, SUB_ASSIGN=69, MUL_ASSIGN=70, 
		DIV_ASSIGN=71, AND_ASSIGN=72, OR_ASSIGN=73, XOR_ASSIGN=74, MOD_ASSIGN=75, 
		LSHIFT_ASSIGN=76, RSHIFT_ASSIGN=77, URSHIFT_ASSIGN=78, ARROW=79, COLONCOLON=80, 
		AT=81, ELLIPSIS=82, NL=83, WS=84, COMMENT=85, LINE_COMMENT=86, IDENTIFIER=87, 
		VARIABLE_REFERENCE=88, SUBSHELL=89, ARITHMETIC_OPEN=90, ARITHMETIC_CLOSE=91, 
		ESCAPES=92, STRING_CHARACTERS=93, END_QUOTED_STRING=94, RT=95;
	public static final int
		RULE_script = 0, RULE_simpleOrComplexCommand = 1, RULE_simpleCommand = 2, 
		RULE_pipeline = 3, RULE_sublist = 4, RULE_pipe = 5, RULE_sublistJoiner = 6, 
		RULE_list = 7, RULE_listWithOptionalTerminator = 8, RULE_listTerminator = 9, 
		RULE_listTerminatorWait = 10, RULE_listTerminatorBackground = 11, RULE_complexCommands = 12, 
		RULE_ifThenFi = 13, RULE_ifElifElse = 14, RULE_ifSingular = 15, RULE_forInDoDone = 16, 
		RULE_forLiteralsDoDone = 17, RULE_whileDoDone = 18, RULE_untilDoDone = 19, 
		RULE_repeatDoDone = 20, RULE_caseInEsac = 21, RULE_selectDoDone = 22, 
		RULE_casePattern = 23, RULE_caseTerminator = 24, RULE_forkProcess = 25, 
		RULE_codeblock = 26, RULE_tryAlways = 27, RULE_functionDeclaration = 28, 
		RULE_simpleFunctionListDeclaration = 29, RULE_simpleFunctionSingleDeclaration = 30, 
		RULE_conditional = 31, RULE_conditionalExpression = 32, RULE_expression = 33, 
		RULE_commandModifier = 34, RULE_identifier = 35, RULE_literal = 36, RULE_commandSubstitutionLiteral = 37, 
		RULE_arithmeticLiteral = 38, RULE_integerLiteral = 39, RULE_floatLiteral = 40, 
		RULE_shortFlagGroup = 41, RULE_longFlagGroup = 42, RULE_shortFlagGroupWithOptionalValue = 43, 
		RULE_longFlagGroupWithOptionalValue = 44, RULE_quotedString = 45, RULE_variableReference = 46, 
		RULE_arithmeticExpression = 47, RULE_arithmeticStatement = 48, RULE_arithmeticModifier = 49, 
		RULE_arithmeticAssignmentOperator = 50, RULE_arithmeticOperator = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "simpleOrComplexCommand", "simpleCommand", "pipeline", "sublist", 
			"pipe", "sublistJoiner", "list", "listWithOptionalTerminator", "listTerminator", 
			"listTerminatorWait", "listTerminatorBackground", "complexCommands", 
			"ifThenFi", "ifElifElse", "ifSingular", "forInDoDone", "forLiteralsDoDone", 
			"whileDoDone", "untilDoDone", "repeatDoDone", "caseInEsac", "selectDoDone", 
			"casePattern", "caseTerminator", "forkProcess", "codeblock", "tryAlways", 
			"functionDeclaration", "simpleFunctionListDeclaration", "simpleFunctionSingleDeclaration", 
			"conditional", "conditionalExpression", "expression", "commandModifier", 
			"identifier", "literal", "commandSubstitutionLiteral", "arithmeticLiteral", 
			"integerLiteral", "floatLiteral", "shortFlagGroup", "longFlagGroup", 
			"shortFlagGroupWithOptionalValue", "longFlagGroupWithOptionalValue", 
			"quotedString", "variableReference", "arithmeticExpression", "arithmeticStatement", 
			"arithmeticModifier", "arithmeticAssignmentOperator", "arithmeticOperator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'builtin'", "'command'", "'exec'", "'nocorrect'", "'noglob'", 
			"'coproc'", "'if'", "'then'", "'elif'", "'else'", "'fi'", "'for'", "'in'", 
			"'do'", "'done'", "'while'", "'until'", "'repeat'", "'case'", "'esac'", 
			"'select'", "'always'", "'function'", null, null, null, null, null, null, 
			null, null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "';'", "','", "'.'", "'$'", "'='", "'>'", "'<'", "'!'", "'~'", 
			"'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
			"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", 
			"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", 
			"'>>>='", "'->'", "'::'", "'@'", "'...'", null, null, null, null, null, 
			null, "'$('", "'$(('", "'))'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BUILTIN", "COMMAND", "EXEC", "NOCORRECT", "NOGLOB", "COPROC", 
			"IF", "THEN", "ELIF", "ELSE", "FI", "FOR", "IN", "DO", "DONE", "WHILE", 
			"UNTIL", "REPEAT", "CASE", "ESAC", "SELECT", "ALWAYS", "FUNCTION", "DECIMAL_LITERAL", 
			"HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "HASH_LITERAL", "BRACKET_LITERAL", 
			"FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "SUBSTITUTION_QUOTING", 
			"NULL_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "DOLLER", "ASSIGN", "GT", "LT", "BANG", "TILDE", 
			"QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", 
			"DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", 
			"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
			"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
			"URSHIFT_ASSIGN", "ARROW", "COLONCOLON", "AT", "ELLIPSIS", "NL", "WS", 
			"COMMENT", "LINE_COMMENT", "IDENTIFIER", "VARIABLE_REFERENCE", "SUBSHELL", 
			"ARITHMETIC_OPEN", "ARITHMETIC_CLOSE", "ESCAPES", "STRING_CHARACTERS", 
			"END_QUOTED_STRING", "RT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "bashParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public bashParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptContext extends ParserRuleContext {
		public ListWithOptionalTerminatorContext listWithOptionalTerminator() {
			return getRuleContext(ListWithOptionalTerminatorContext.class,0);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			listWithOptionalTerminator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleOrComplexCommandContext extends ParserRuleContext {
		public SimpleCommandContext simpleCommand() {
			return getRuleContext(SimpleCommandContext.class,0);
		}
		public ComplexCommandsContext complexCommands() {
			return getRuleContext(ComplexCommandsContext.class,0);
		}
		public SimpleOrComplexCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleOrComplexCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterSimpleOrComplexCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitSimpleOrComplexCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitSimpleOrComplexCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleOrComplexCommandContext simpleOrComplexCommand() throws RecognitionException {
		SimpleOrComplexCommandContext _localctx = new SimpleOrComplexCommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_simpleOrComplexCommand);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				simpleCommand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				complexCommands();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleCommandContext extends ParserRuleContext {
		public LiteralContext commandName;
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public CommandModifierContext commandModifier() {
			return getRuleContext(CommandModifierContext.class,0);
		}
		public List<ShortFlagGroupWithOptionalValueContext> shortFlagGroupWithOptionalValue() {
			return getRuleContexts(ShortFlagGroupWithOptionalValueContext.class);
		}
		public ShortFlagGroupWithOptionalValueContext shortFlagGroupWithOptionalValue(int i) {
			return getRuleContext(ShortFlagGroupWithOptionalValueContext.class,i);
		}
		public List<LongFlagGroupWithOptionalValueContext> longFlagGroupWithOptionalValue() {
			return getRuleContexts(LongFlagGroupWithOptionalValueContext.class);
		}
		public LongFlagGroupWithOptionalValueContext longFlagGroupWithOptionalValue(int i) {
			return getRuleContext(LongFlagGroupWithOptionalValueContext.class,i);
		}
		public SimpleCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterSimpleCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitSimpleCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitSimpleCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleCommandContext simpleCommand() throws RecognitionException {
		SimpleCommandContext _localctx = new SimpleCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simpleCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(110);
				commandModifier();
				}
				break;
			}
			setState(113);
			((SimpleCommandContext)_localctx).commandName = literal();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2882321388046123070L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 11L) != 0)) {
				{
				setState(117);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(114);
					literal();
					}
					break;
				case 2:
					{
					setState(115);
					shortFlagGroupWithOptionalValue();
					}
					break;
				case 3:
					{
					setState(116);
					longFlagGroupWithOptionalValue();
					}
					break;
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PipelineContext extends ParserRuleContext {
		public List<SimpleOrComplexCommandContext> simpleOrComplexCommand() {
			return getRuleContexts(SimpleOrComplexCommandContext.class);
		}
		public SimpleOrComplexCommandContext simpleOrComplexCommand(int i) {
			return getRuleContext(SimpleOrComplexCommandContext.class,i);
		}
		public TerminalNode COPROC() { return getToken(bashParser.COPROC, 0); }
		public List<PipeContext> pipe() {
			return getRuleContexts(PipeContext.class);
		}
		public PipeContext pipe(int i) {
			return getRuleContext(PipeContext.class,i);
		}
		public PipelineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterPipeline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitPipeline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitPipeline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PipelineContext pipeline() throws RecognitionException {
		PipelineContext _localctx = new PipelineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pipeline);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COPROC) {
				{
				setState(122);
				match(COPROC);
				}
			}

			setState(125);
			simpleOrComplexCommand();
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126);
					pipe();
					setState(127);
					simpleOrComplexCommand();
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SublistContext extends ParserRuleContext {
		public List<PipelineContext> pipeline() {
			return getRuleContexts(PipelineContext.class);
		}
		public PipelineContext pipeline(int i) {
			return getRuleContext(PipelineContext.class,i);
		}
		public List<SublistJoinerContext> sublistJoiner() {
			return getRuleContexts(SublistJoinerContext.class);
		}
		public SublistJoinerContext sublistJoiner(int i) {
			return getRuleContext(SublistJoinerContext.class,i);
		}
		public SublistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sublist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterSublist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitSublist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitSublist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SublistContext sublist() throws RecognitionException {
		SublistContext _localctx = new SublistContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sublist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			pipeline();
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(135);
					sublistJoiner();
					setState(136);
					pipeline();
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PipeContext extends ParserRuleContext {
		public PipeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipe; }
	 
		public PipeContext() { }
		public void copyFrom(PipeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PipeStdoutAndStderrToStdinContext extends PipeContext {
		public TerminalNode BITOR() { return getToken(bashParser.BITOR, 0); }
		public TerminalNode BITAND() { return getToken(bashParser.BITAND, 0); }
		public PipeStdoutAndStderrToStdinContext(PipeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterPipeStdoutAndStderrToStdin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitPipeStdoutAndStderrToStdin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitPipeStdoutAndStderrToStdin(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PipeStdoutToStdinContext extends PipeContext {
		public TerminalNode BITOR() { return getToken(bashParser.BITOR, 0); }
		public PipeStdoutToStdinContext(PipeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterPipeStdoutToStdin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitPipeStdoutToStdin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitPipeStdoutToStdin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PipeContext pipe() throws RecognitionException {
		PipeContext _localctx = new PipeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pipe);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new PipeStdoutToStdinContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(BITOR);
				}
				break;
			case 2:
				_localctx = new PipeStdoutAndStderrToStdinContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(BITOR);
				setState(145);
				match(BITAND);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SublistJoinerContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(bashParser.AND, 0); }
		public TerminalNode OR() { return getToken(bashParser.OR, 0); }
		public SublistJoinerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sublistJoiner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterSublistJoiner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitSublistJoiner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitSublistJoiner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SublistJoinerContext sublistJoiner() throws RecognitionException {
		SublistJoinerContext _localctx = new SublistJoinerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sublistJoiner);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public List<ListTerminatorContext> listTerminator() {
			return getRuleContexts(ListTerminatorContext.class);
		}
		public ListTerminatorContext listTerminator(int i) {
			return getRuleContext(ListTerminatorContext.class,i);
		}
		public List<SublistContext> sublist() {
			return getRuleContexts(SublistContext.class);
		}
		public SublistContext sublist(int i) {
			return getRuleContext(SublistContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(bashParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(bashParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(bashParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(bashParser.RBRACE, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_list);
		int _la;
		try {
			int _alt;
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305861357308678398L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 11L) != 0)) {
					{
					setState(150);
					sublist();
					}
				}

				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(153);
						listTerminator();
						setState(154);
						sublist();
						}
						} 
					}
					setState(160);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(161);
				listTerminator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(LPAREN);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305861357308678398L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 11L) != 0)) {
					{
					setState(163);
					sublist();
					}
				}

				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(166);
						listTerminator();
						setState(167);
						sublist();
						}
						} 
					}
					setState(173);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & 4398054899713L) != 0)) {
					{
					{
					setState(174);
					listTerminator();
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(180);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(LBRACE);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305861357308678398L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 11L) != 0)) {
					{
					setState(182);
					sublist();
					}
				}

				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(185);
						listTerminator();
						setState(186);
						sublist();
						}
						} 
					}
					setState(192);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & 4398054899713L) != 0)) {
					{
					{
					setState(193);
					listTerminator();
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(199);
				match(RBRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListWithOptionalTerminatorContext extends ParserRuleContext {
		public List<SublistContext> sublist() {
			return getRuleContexts(SublistContext.class);
		}
		public SublistContext sublist(int i) {
			return getRuleContext(SublistContext.class,i);
		}
		public List<ListTerminatorContext> listTerminator() {
			return getRuleContexts(ListTerminatorContext.class);
		}
		public ListTerminatorContext listTerminator(int i) {
			return getRuleContext(ListTerminatorContext.class,i);
		}
		public ListWithOptionalTerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listWithOptionalTerminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterListWithOptionalTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitListWithOptionalTerminator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitListWithOptionalTerminator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListWithOptionalTerminatorContext listWithOptionalTerminator() throws RecognitionException {
		ListWithOptionalTerminatorContext _localctx = new ListWithOptionalTerminatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listWithOptionalTerminator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305861357308678398L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 11L) != 0)) {
				{
				setState(202);
				sublist();
				}
			}

			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(205);
					listTerminator();
					setState(206);
					sublist();
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & 4398054899713L) != 0)) {
				{
				{
				setState(213);
				listTerminator();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListTerminatorContext extends ParserRuleContext {
		public ListTerminatorWaitContext listTerminatorWait() {
			return getRuleContext(ListTerminatorWaitContext.class,0);
		}
		public ListTerminatorBackgroundContext listTerminatorBackground() {
			return getRuleContext(ListTerminatorBackgroundContext.class,0);
		}
		public ListTerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listTerminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterListTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitListTerminator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitListTerminator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTerminatorContext listTerminator() throws RecognitionException {
		ListTerminatorContext _localctx = new ListTerminatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listTerminator);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
			case NL:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				listTerminatorWait();
				}
				break;
			case BITAND:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				listTerminatorBackground();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListTerminatorWaitContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(bashParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(bashParser.SEMI, i);
		}
		public List<TerminalNode> NL() { return getTokens(bashParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(bashParser.NL, i);
		}
		public ListTerminatorWaitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listTerminatorWait; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterListTerminatorWait(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitListTerminatorWait(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitListTerminatorWait(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTerminatorWaitContext listTerminatorWait() throws RecognitionException {
		ListTerminatorWaitContext _localctx = new ListTerminatorWaitContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_listTerminatorWait);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(223);
					_la = _input.LA(1);
					if ( !(_la==SEMI || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(226); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListTerminatorBackgroundContext extends ParserRuleContext {
		public TerminalNode BITAND() { return getToken(bashParser.BITAND, 0); }
		public TerminalNode BITOR() { return getToken(bashParser.BITOR, 0); }
		public TerminalNode BANG() { return getToken(bashParser.BANG, 0); }
		public ListTerminatorBackgroundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listTerminatorBackground; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterListTerminatorBackground(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitListTerminatorBackground(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitListTerminatorBackground(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTerminatorBackgroundContext listTerminatorBackground() throws RecognitionException {
		ListTerminatorBackgroundContext _localctx = new ListTerminatorBackgroundContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_listTerminatorBackground);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(BITAND);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BANG || _la==BITOR) {
				{
				setState(229);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==BITOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComplexCommandsContext extends ParserRuleContext {
		public IfThenFiContext ifThenFi() {
			return getRuleContext(IfThenFiContext.class,0);
		}
		public IfElifElseContext ifElifElse() {
			return getRuleContext(IfElifElseContext.class,0);
		}
		public IfSingularContext ifSingular() {
			return getRuleContext(IfSingularContext.class,0);
		}
		public ForInDoDoneContext forInDoDone() {
			return getRuleContext(ForInDoDoneContext.class,0);
		}
		public ForLiteralsDoDoneContext forLiteralsDoDone() {
			return getRuleContext(ForLiteralsDoDoneContext.class,0);
		}
		public WhileDoDoneContext whileDoDone() {
			return getRuleContext(WhileDoDoneContext.class,0);
		}
		public UntilDoDoneContext untilDoDone() {
			return getRuleContext(UntilDoDoneContext.class,0);
		}
		public RepeatDoDoneContext repeatDoDone() {
			return getRuleContext(RepeatDoDoneContext.class,0);
		}
		public CaseInEsacContext caseInEsac() {
			return getRuleContext(CaseInEsacContext.class,0);
		}
		public SelectDoDoneContext selectDoDone() {
			return getRuleContext(SelectDoDoneContext.class,0);
		}
		public ForkProcessContext forkProcess() {
			return getRuleContext(ForkProcessContext.class,0);
		}
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public TryAlwaysContext tryAlways() {
			return getRuleContext(TryAlwaysContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public SimpleFunctionListDeclarationContext simpleFunctionListDeclaration() {
			return getRuleContext(SimpleFunctionListDeclarationContext.class,0);
		}
		public SimpleFunctionSingleDeclarationContext simpleFunctionSingleDeclaration() {
			return getRuleContext(SimpleFunctionSingleDeclarationContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ComplexCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterComplexCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitComplexCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitComplexCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexCommandsContext complexCommands() throws RecognitionException {
		ComplexCommandsContext _localctx = new ComplexCommandsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_complexCommands);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				ifThenFi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				ifElifElse();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				ifSingular();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				forInDoDone();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				forLiteralsDoDone();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(237);
				whileDoDone();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(238);
				untilDoDone();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(239);
				repeatDoDone();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(240);
				caseInEsac();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(241);
				selectDoDone();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(242);
				forkProcess();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(243);
				codeblock();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(244);
				tryAlways();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(245);
				functionDeclaration();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(246);
				simpleFunctionListDeclaration();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(247);
				simpleFunctionSingleDeclaration();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(248);
				conditionalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfThenFiContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(bashParser.IF, 0); }
		public List<ConditionalContext> conditional() {
			return getRuleContexts(ConditionalContext.class);
		}
		public ConditionalContext conditional(int i) {
			return getRuleContext(ConditionalContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(bashParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(bashParser.THEN, i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public TerminalNode FI() { return getToken(bashParser.FI, 0); }
		public List<TerminalNode> ELIF() { return getTokens(bashParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(bashParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(bashParser.ELSE, 0); }
		public IfThenFiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenFi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterIfThenFi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitIfThenFi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitIfThenFi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenFiContext ifThenFi() throws RecognitionException {
		IfThenFiContext _localctx = new IfThenFiContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifThenFi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(IF);
			setState(252);
			conditional();
			setState(253);
			match(THEN);
			setState(254);
			list();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(255);
				match(ELIF);
				setState(256);
				conditional();
				setState(257);
				match(THEN);
				setState(258);
				list();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(265);
				match(ELSE);
				setState(266);
				list();
				}
			}

			setState(269);
			match(FI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfElifElseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(bashParser.IF, 0); }
		public List<ConditionalContext> conditional() {
			return getRuleContexts(ConditionalContext.class);
		}
		public ConditionalContext conditional(int i) {
			return getRuleContext(ConditionalContext.class,i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(bashParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(bashParser.LBRACE, i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(bashParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(bashParser.RBRACE, i);
		}
		public List<TerminalNode> ELIF() { return getTokens(bashParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(bashParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(bashParser.ELSE, 0); }
		public IfElifElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElifElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterIfElifElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitIfElifElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitIfElifElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElifElseContext ifElifElse() throws RecognitionException {
		IfElifElseContext _localctx = new IfElifElseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifElifElse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(IF);
			setState(272);
			conditional();
			setState(273);
			match(LBRACE);
			setState(274);
			list();
			setState(275);
			match(RBRACE);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(276);
				match(ELIF);
				setState(277);
				conditional();
				setState(278);
				match(LBRACE);
				setState(279);
				list();
				setState(280);
				match(RBRACE);
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(287);
				match(ELSE);
				setState(288);
				match(LBRACE);
				setState(289);
				list();
				setState(290);
				match(RBRACE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfSingularContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(bashParser.IF, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public SublistContext sublist() {
			return getRuleContext(SublistContext.class,0);
		}
		public IfSingularContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifSingular; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterIfSingular(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitIfSingular(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitIfSingular(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfSingularContext ifSingular() throws RecognitionException {
		IfSingularContext _localctx = new IfSingularContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifSingular);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(IF);
			setState(295);
			conditional();
			setState(296);
			sublist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForInDoDoneContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(bashParser.FOR, 0); }
		public TerminalNode DO() { return getToken(bashParser.DO, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode DONE() { return getToken(bashParser.DONE, 0); }
		public TerminalNode IN() { return getToken(bashParser.IN, 0); }
		public TerminalNode LPAREN() { return getToken(bashParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(bashParser.RPAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(bashParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(bashParser.SEMI, i);
		}
		public List<TerminalNode> NL() { return getTokens(bashParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(bashParser.NL, i);
		}
		public ForInDoDoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInDoDone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterForInDoDone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitForInDoDone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitForInDoDone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInDoDoneContext forInDoDone() throws RecognitionException {
		ForInDoDoneContext _localctx = new ForInDoDoneContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forInDoDone);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(FOR);
			setState(300); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(299);
				identifier();
				}
				}
				setState(302); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2305843028541046846L) != 0) || _la==IDENTIFIER );
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
				{
				setState(304);
				match(IN);
				setState(306); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(305);
					literal();
					}
					}
					setState(308); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2305860635742699582L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 11L) != 0) );
				setState(311); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(310);
					_la = _input.LA(1);
					if ( !(_la==SEMI || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(313); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SEMI || _la==NL );
				}
				break;
			case LPAREN:
				{
				setState(315);
				match(LPAREN);
				setState(317); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(316);
					literal();
					}
					}
					setState(319); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2305860635742699582L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 11L) != 0) );
				setState(321);
				match(RPAREN);
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI || _la==NL) {
					{
					{
					setState(322);
					_la = _input.LA(1);
					if ( !(_la==SEMI || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(330);
			match(DO);
			setState(331);
			list();
			setState(332);
			match(DONE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForLiteralsDoDoneContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(bashParser.FOR, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(bashParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(bashParser.LPAREN, i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(bashParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(bashParser.SEMI, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(bashParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(bashParser.RPAREN, i);
		}
		public TerminalNode DO() { return getToken(bashParser.DO, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode DONE() { return getToken(bashParser.DONE, 0); }
		public ForLiteralsDoDoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLiteralsDoDone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterForLiteralsDoDone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitForLiteralsDoDone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitForLiteralsDoDone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLiteralsDoDoneContext forLiteralsDoDone() throws RecognitionException {
		ForLiteralsDoDoneContext _localctx = new ForLiteralsDoDoneContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forLiteralsDoDone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(FOR);
			setState(335);
			match(LPAREN);
			setState(336);
			match(LPAREN);
			setState(337);
			literal();
			setState(338);
			match(SEMI);
			setState(339);
			literal();
			setState(340);
			match(SEMI);
			setState(341);
			literal();
			setState(342);
			match(RPAREN);
			setState(343);
			match(RPAREN);
			setState(344);
			match(DO);
			setState(345);
			list();
			setState(346);
			match(DONE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileDoDoneContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(bashParser.WHILE, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public TerminalNode DO() { return getToken(bashParser.DO, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode DONE() { return getToken(bashParser.DONE, 0); }
		public WhileDoDoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileDoDone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterWhileDoDone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitWhileDoDone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitWhileDoDone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileDoDoneContext whileDoDone() throws RecognitionException {
		WhileDoDoneContext _localctx = new WhileDoDoneContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whileDoDone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(WHILE);
			setState(349);
			conditional();
			setState(350);
			match(DO);
			setState(351);
			list();
			setState(352);
			match(DONE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UntilDoDoneContext extends ParserRuleContext {
		public TerminalNode UNTIL() { return getToken(bashParser.UNTIL, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public TerminalNode DO() { return getToken(bashParser.DO, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode DONE() { return getToken(bashParser.DONE, 0); }
		public UntilDoDoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_untilDoDone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterUntilDoDone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitUntilDoDone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitUntilDoDone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UntilDoDoneContext untilDoDone() throws RecognitionException {
		UntilDoDoneContext _localctx = new UntilDoDoneContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_untilDoDone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(UNTIL);
			setState(355);
			conditional();
			setState(356);
			match(DO);
			setState(357);
			list();
			setState(358);
			match(DONE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RepeatDoDoneContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(bashParser.REPEAT, 0); }
		public ArithmeticStatementContext arithmeticStatement() {
			return getRuleContext(ArithmeticStatementContext.class,0);
		}
		public TerminalNode DO() { return getToken(bashParser.DO, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode DONE() { return getToken(bashParser.DONE, 0); }
		public RepeatDoDoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatDoDone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterRepeatDoDone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitRepeatDoDone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitRepeatDoDone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatDoDoneContext repeatDoDone() throws RecognitionException {
		RepeatDoDoneContext _localctx = new RepeatDoDoneContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_repeatDoDone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(REPEAT);
			setState(361);
			arithmeticStatement(0);
			setState(362);
			match(DO);
			setState(363);
			list();
			setState(364);
			match(DONE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseInEsacContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(bashParser.CASE, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IN() { return getToken(bashParser.IN, 0); }
		public TerminalNode ESAC() { return getToken(bashParser.ESAC, 0); }
		public List<CasePatternContext> casePattern() {
			return getRuleContexts(CasePatternContext.class);
		}
		public CasePatternContext casePattern(int i) {
			return getRuleContext(CasePatternContext.class,i);
		}
		public CaseInEsacContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseInEsac; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterCaseInEsac(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitCaseInEsac(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitCaseInEsac(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseInEsacContext caseInEsac() throws RecognitionException {
		CaseInEsacContext _localctx = new CaseInEsacContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_caseInEsac);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(CASE);
			setState(367);
			literal();
			setState(368);
			match(IN);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305860670102437950L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 11L) != 0)) {
				{
				{
				setState(369);
				casePattern();
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(375);
			match(ESAC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectDoDoneContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(bashParser.SELECT, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode DO() { return getToken(bashParser.DO, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode DONE() { return getToken(bashParser.DONE, 0); }
		public TerminalNode IN() { return getToken(bashParser.IN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(bashParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(bashParser.SEMI, i);
		}
		public List<TerminalNode> NL() { return getTokens(bashParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(bashParser.NL, i);
		}
		public SelectDoDoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectDoDone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterSelectDoDone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitSelectDoDone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitSelectDoDone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectDoDoneContext selectDoDone() throws RecognitionException {
		SelectDoDoneContext _localctx = new SelectDoDoneContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_selectDoDone);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(SELECT);
			setState(378);
			literal();
			{
			setState(379);
			match(IN);
			setState(381); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(380);
				literal();
				}
				}
				setState(383); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2305860635742699582L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 11L) != 0) );
			setState(386); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(385);
				_la = _input.LA(1);
				if ( !(_la==SEMI || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(388); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEMI || _la==NL );
			}
			setState(390);
			match(DO);
			setState(391);
			list();
			setState(392);
			match(DONE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CasePatternContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(bashParser.RPAREN, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public CaseTerminatorContext caseTerminator() {
			return getRuleContext(CaseTerminatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(bashParser.LPAREN, 0); }
		public List<TerminalNode> BITOR() { return getTokens(bashParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(bashParser.BITOR, i);
		}
		public CasePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterCasePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitCasePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitCasePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasePatternContext casePattern() throws RecognitionException {
		CasePatternContext _localctx = new CasePatternContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_casePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(394);
				match(LPAREN);
				}
			}

			setState(397);
			literal();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(398);
				match(BITOR);
				setState(399);
				literal();
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405);
			match(RPAREN);
			setState(406);
			list();
			setState(407);
			caseTerminator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseTerminatorContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(bashParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(bashParser.SEMI, i);
		}
		public TerminalNode BITAND() { return getToken(bashParser.BITAND, 0); }
		public TerminalNode BITOR() { return getToken(bashParser.BITOR, 0); }
		public CaseTerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseTerminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterCaseTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitCaseTerminator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitCaseTerminator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseTerminatorContext caseTerminator() throws RecognitionException {
		CaseTerminatorContext _localctx = new CaseTerminatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_caseTerminator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(409);
			match(SEMI);
			setState(410);
			_la = _input.LA(1);
			if ( !(((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & 25165825L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForkProcessContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(bashParser.LPAREN, 0); }
		public ListWithOptionalTerminatorContext listWithOptionalTerminator() {
			return getRuleContext(ListWithOptionalTerminatorContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(bashParser.RPAREN, 0); }
		public ForkProcessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forkProcess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterForkProcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitForkProcess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitForkProcess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForkProcessContext forkProcess() throws RecognitionException {
		ForkProcessContext _localctx = new ForkProcessContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_forkProcess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(LPAREN);
			setState(413);
			listWithOptionalTerminator();
			setState(414);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodeblockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(bashParser.LBRACE, 0); }
		public ListWithOptionalTerminatorContext listWithOptionalTerminator() {
			return getRuleContext(ListWithOptionalTerminatorContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(bashParser.RBRACE, 0); }
		public CodeblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterCodeblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitCodeblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitCodeblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeblockContext codeblock() throws RecognitionException {
		CodeblockContext _localctx = new CodeblockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_codeblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(LBRACE);
			setState(417);
			listWithOptionalTerminator();
			setState(418);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TryAlwaysContext extends ParserRuleContext {
		public ListContext tryList;
		public ListContext alwaysList;
		public List<TerminalNode> LBRACE() { return getTokens(bashParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(bashParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(bashParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(bashParser.RBRACE, i);
		}
		public TerminalNode ALWAYS() { return getToken(bashParser.ALWAYS, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(bashParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(bashParser.SEMI, i);
		}
		public List<TerminalNode> NL() { return getTokens(bashParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(bashParser.NL, i);
		}
		public TryAlwaysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryAlways; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterTryAlways(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitTryAlways(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitTryAlways(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryAlwaysContext tryAlways() throws RecognitionException {
		TryAlwaysContext _localctx = new TryAlwaysContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tryAlways);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(LBRACE);
			setState(421);
			((TryAlwaysContext)_localctx).tryList = list();
			setState(422);
			match(RBRACE);
			setState(423);
			match(ALWAYS);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==NL) {
				{
				{
				setState(424);
				_la = _input.LA(1);
				if ( !(_la==SEMI || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(430);
			match(LBRACE);
			setState(431);
			((TryAlwaysContext)_localctx).alwaysList = list();
			setState(432);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(bashParser.FUNCTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(bashParser.LBRACE, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(bashParser.RBRACE, 0); }
		public TerminalNode LPAREN() { return getToken(bashParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(bashParser.RPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(bashParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(bashParser.SEMI, i);
		}
		public List<TerminalNode> NL() { return getTokens(bashParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(bashParser.NL, i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(FUNCTION);
			setState(435);
			identifier();
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(436);
				match(LPAREN);
				setState(437);
				match(RPAREN);
				}
			}

			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==NL) {
				{
				{
				setState(440);
				_la = _input.LA(1);
				if ( !(_la==SEMI || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(446);
			match(LBRACE);
			setState(447);
			list();
			setState(448);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleFunctionListDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(bashParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(bashParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(bashParser.LBRACE, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(bashParser.RBRACE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(bashParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(bashParser.SEMI, i);
		}
		public List<TerminalNode> NL() { return getTokens(bashParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(bashParser.NL, i);
		}
		public SimpleFunctionListDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleFunctionListDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterSimpleFunctionListDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitSimpleFunctionListDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitSimpleFunctionListDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleFunctionListDeclarationContext simpleFunctionListDeclaration() throws RecognitionException {
		SimpleFunctionListDeclarationContext _localctx = new SimpleFunctionListDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_simpleFunctionListDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			identifier();
			setState(451);
			match(LPAREN);
			setState(452);
			match(RPAREN);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==NL) {
				{
				{
				setState(453);
				_la = _input.LA(1);
				if ( !(_la==SEMI || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(459);
			match(LBRACE);
			setState(460);
			list();
			setState(461);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleFunctionSingleDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(bashParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(bashParser.RPAREN, 0); }
		public SimpleOrComplexCommandContext simpleOrComplexCommand() {
			return getRuleContext(SimpleOrComplexCommandContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(bashParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(bashParser.SEMI, i);
		}
		public List<TerminalNode> NL() { return getTokens(bashParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(bashParser.NL, i);
		}
		public SimpleFunctionSingleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleFunctionSingleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterSimpleFunctionSingleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitSimpleFunctionSingleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitSimpleFunctionSingleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleFunctionSingleDeclarationContext simpleFunctionSingleDeclaration() throws RecognitionException {
		SimpleFunctionSingleDeclarationContext _localctx = new SimpleFunctionSingleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_simpleFunctionSingleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			identifier();
			setState(464);
			match(LPAREN);
			setState(465);
			match(RPAREN);
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==NL) {
				{
				{
				setState(466);
				_la = _input.LA(1);
				if ( !(_la==SEMI || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(472);
			simpleOrComplexCommand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_conditional);
		try {
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				conditionalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalExpressionContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(bashParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(bashParser.LBRACK, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> RBRACK() { return getTokens(bashParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(bashParser.RBRACK, i);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(LBRACK);
			setState(479);
			match(LBRACK);
			setState(480);
			expression(0);
			setState(481);
			match(RBRACK);
			setState(482);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionLiteralContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpressionLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterExpressionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitExpressionLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitExpressionLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStringEqualsContext extends ExpressionContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(bashParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(bashParser.ASSIGN, i);
		}
		public ExpressionStringEqualsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterExpressionStringEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitExpressionStringEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitExpressionStringEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStringGreaterThanContext extends ExpressionContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode RT() { return getToken(bashParser.RT, 0); }
		public ExpressionStringGreaterThanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterExpressionStringGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitExpressionStringGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitExpressionStringGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAndContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(bashParser.AND, 0); }
		public ExpressionAndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterExpressionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitExpressionAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitExpressionAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionShortFlagLiteralContext extends ExpressionContext {
		public ShortFlagGroupContext shortFlagGroup() {
			return getRuleContext(ShortFlagGroupContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpressionShortFlagLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterExpressionShortFlagLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitExpressionShortFlagLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitExpressionShortFlagLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionIsTrueContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(bashParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(bashParser.RPAREN, 0); }
		public ExpressionIsTrueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterExpressionIsTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitExpressionIsTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitExpressionIsTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStringLessThanContext extends ExpressionContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode LT() { return getToken(bashParser.LT, 0); }
		public ExpressionStringLessThanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterExpressionStringLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitExpressionStringLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitExpressionStringLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionShortFlagLiteralsContext extends ExpressionContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public ShortFlagGroupContext shortFlagGroup() {
			return getRuleContext(ShortFlagGroupContext.class,0);
		}
		public ExpressionShortFlagLiteralsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterExpressionShortFlagLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitExpressionShortFlagLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitExpressionShortFlagLiterals(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStringNotEqualsContext extends ExpressionContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode BANG() { return getToken(bashParser.BANG, 0); }
		public TerminalNode ASSIGN() { return getToken(bashParser.ASSIGN, 0); }
		public ExpressionStringNotEqualsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterExpressionStringNotEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitExpressionStringNotEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitExpressionStringNotEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionIsFalseContext extends ExpressionContext {
		public TerminalNode BANG() { return getToken(bashParser.BANG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionIsFalseContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterExpressionIsFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitExpressionIsFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitExpressionIsFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionOrContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(bashParser.OR, 0); }
		public ExpressionOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterExpressionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitExpressionOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitExpressionOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStringNotEqualsRegexpContext extends ExpressionContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(bashParser.ASSIGN, 0); }
		public TerminalNode TILDE() { return getToken(bashParser.TILDE, 0); }
		public ExpressionStringNotEqualsRegexpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterExpressionStringNotEqualsRegexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitExpressionStringNotEqualsRegexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitExpressionStringNotEqualsRegexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				_localctx = new ExpressionLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(485);
				literal();
				}
				break;
			case 2:
				{
				_localctx = new ExpressionShortFlagLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(486);
				shortFlagGroup();
				setState(487);
				literal();
				}
				break;
			case 3:
				{
				_localctx = new ExpressionShortFlagLiteralsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(489);
				literal();
				setState(490);
				shortFlagGroup();
				setState(491);
				literal();
				}
				break;
			case 4:
				{
				_localctx = new ExpressionStringEqualsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(493);
				literal();
				setState(494);
				match(ASSIGN);
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(495);
					match(ASSIGN);
					}
				}

				setState(498);
				literal();
				}
				break;
			case 5:
				{
				_localctx = new ExpressionStringNotEqualsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(500);
				literal();
				setState(501);
				match(BANG);
				setState(502);
				match(ASSIGN);
				setState(503);
				literal();
				}
				break;
			case 6:
				{
				_localctx = new ExpressionStringNotEqualsRegexpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(505);
				literal();
				setState(506);
				match(ASSIGN);
				setState(507);
				match(TILDE);
				setState(508);
				literal();
				}
				break;
			case 7:
				{
				_localctx = new ExpressionStringLessThanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(510);
				literal();
				setState(511);
				match(LT);
				setState(512);
				literal();
				}
				break;
			case 8:
				{
				_localctx = new ExpressionStringGreaterThanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(514);
				literal();
				setState(515);
				match(RT);
				setState(516);
				literal();
				}
				break;
			case 9:
				{
				_localctx = new ExpressionIsTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(518);
				match(LPAREN);
				setState(519);
				expression(0);
				setState(520);
				match(RPAREN);
				}
				break;
			case 10:
				{
				_localctx = new ExpressionIsFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(522);
				match(BANG);
				setState(523);
				expression(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(534);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(532);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(526);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(527);
						match(AND);
						setState(528);
						expression(3);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(529);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(530);
						match(OR);
						setState(531);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(536);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommandModifierContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(bashParser.SUB, 0); }
		public TerminalNode BUILTIN() { return getToken(bashParser.BUILTIN, 0); }
		public TerminalNode COMMAND() { return getToken(bashParser.COMMAND, 0); }
		public List<ShortFlagGroupContext> shortFlagGroup() {
			return getRuleContexts(ShortFlagGroupContext.class);
		}
		public ShortFlagGroupContext shortFlagGroup(int i) {
			return getRuleContext(ShortFlagGroupContext.class,i);
		}
		public TerminalNode EXEC() { return getToken(bashParser.EXEC, 0); }
		public List<ShortFlagGroupWithOptionalValueContext> shortFlagGroupWithOptionalValue() {
			return getRuleContexts(ShortFlagGroupWithOptionalValueContext.class);
		}
		public ShortFlagGroupWithOptionalValueContext shortFlagGroupWithOptionalValue(int i) {
			return getRuleContext(ShortFlagGroupWithOptionalValueContext.class,i);
		}
		public TerminalNode NOCORRECT() { return getToken(bashParser.NOCORRECT, 0); }
		public TerminalNode NOGLOB() { return getToken(bashParser.NOGLOB, 0); }
		public CommandModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterCommandModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitCommandModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitCommandModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandModifierContext commandModifier() throws RecognitionException {
		CommandModifierContext _localctx = new CommandModifierContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_commandModifier);
		try {
			int _alt;
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				match(SUB);
				}
				break;
			case BUILTIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
				match(BUILTIN);
				}
				break;
			case COMMAND:
				enterOuterAlt(_localctx, 3);
				{
				setState(539);
				match(COMMAND);
				setState(543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(540);
						shortFlagGroup();
						}
						} 
					}
					setState(545);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				}
				break;
			case EXEC:
				enterOuterAlt(_localctx, 4);
				{
				setState(546);
				match(EXEC);
				setState(550);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(547);
						shortFlagGroupWithOptionalValue();
						}
						} 
					}
					setState(552);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				}
				break;
			case NOCORRECT:
				enterOuterAlt(_localctx, 5);
				{
				setState(553);
				match(NOCORRECT);
				}
				break;
			case NOGLOB:
				enterOuterAlt(_localctx, 6);
				{
				setState(554);
				match(NOGLOB);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(bashParser.IDENTIFIER, 0); }
		public TerminalNode SUB() { return getToken(bashParser.SUB, 0); }
		public TerminalNode BUILTIN() { return getToken(bashParser.BUILTIN, 0); }
		public TerminalNode COMMAND() { return getToken(bashParser.COMMAND, 0); }
		public TerminalNode EXEC() { return getToken(bashParser.EXEC, 0); }
		public TerminalNode NOCORRECT() { return getToken(bashParser.NOCORRECT, 0); }
		public TerminalNode NOGLOB() { return getToken(bashParser.NOGLOB, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(bashParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(bashParser.NULL_LITERAL, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305843028541046846L) != 0) || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(bashParser.CHAR_LITERAL, 0); }
		public QuotedStringContext quotedString() {
			return getRuleContext(QuotedStringContext.class,0);
		}
		public TerminalNode BOOL_LITERAL() { return getToken(bashParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(bashParser.NULL_LITERAL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public CommandSubstitutionLiteralContext commandSubstitutionLiteral() {
			return getRuleContext(CommandSubstitutionLiteralContext.class,0);
		}
		public ArithmeticLiteralContext arithmeticLiteral() {
			return getRuleContext(ArithmeticLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_literal);
		try {
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(559);
				integerLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(560);
				floatLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(561);
				match(CHAR_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(562);
				quotedString();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(563);
				match(BOOL_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(564);
				match(NULL_LITERAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(565);
				identifier();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(566);
				variableReference();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(567);
				commandSubstitutionLiteral();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(568);
				arithmeticLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommandSubstitutionLiteralContext extends ParserRuleContext {
		public TerminalNode DOLLER() { return getToken(bashParser.DOLLER, 0); }
		public TerminalNode LPAREN() { return getToken(bashParser.LPAREN, 0); }
		public ListWithOptionalTerminatorContext listWithOptionalTerminator() {
			return getRuleContext(ListWithOptionalTerminatorContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(bashParser.RPAREN, 0); }
		public CommandSubstitutionLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandSubstitutionLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterCommandSubstitutionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitCommandSubstitutionLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitCommandSubstitutionLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandSubstitutionLiteralContext commandSubstitutionLiteral() throws RecognitionException {
		CommandSubstitutionLiteralContext _localctx = new CommandSubstitutionLiteralContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_commandSubstitutionLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(DOLLER);
			setState(572);
			match(LPAREN);
			setState(573);
			listWithOptionalTerminator();
			setState(574);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticLiteralContext extends ParserRuleContext {
		public TerminalNode ARITHMETIC_OPEN() { return getToken(bashParser.ARITHMETIC_OPEN, 0); }
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public TerminalNode ARITHMETIC_CLOSE() { return getToken(bashParser.ARITHMETIC_CLOSE, 0); }
		public ArithmeticLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterArithmeticLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitArithmeticLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitArithmeticLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticLiteralContext arithmeticLiteral() throws RecognitionException {
		ArithmeticLiteralContext _localctx = new ArithmeticLiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arithmeticLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(ARITHMETIC_OPEN);
			setState(577);
			arithmeticExpression();
			setState(578);
			match(ARITHMETIC_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(bashParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(bashParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(bashParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(bashParser.BINARY_LITERAL, 0); }
		public TerminalNode HASH_LITERAL() { return getToken(bashParser.HASH_LITERAL, 0); }
		public TerminalNode BRACKET_LITERAL() { return getToken(bashParser.BRACKET_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1056964608L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(bashParser.FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(FLOAT_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShortFlagGroupContext extends ParserRuleContext {
		public Token name;
		public TerminalNode SUB() { return getToken(bashParser.SUB, 0); }
		public TerminalNode IDENTIFIER() { return getToken(bashParser.IDENTIFIER, 0); }
		public ShortFlagGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortFlagGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterShortFlagGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitShortFlagGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitShortFlagGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortFlagGroupContext shortFlagGroup() throws RecognitionException {
		ShortFlagGroupContext _localctx = new ShortFlagGroupContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_shortFlagGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(SUB);
			setState(585);
			((ShortFlagGroupContext)_localctx).name = match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LongFlagGroupContext extends ParserRuleContext {
		public Token name;
		public TerminalNode DEC() { return getToken(bashParser.DEC, 0); }
		public TerminalNode IDENTIFIER() { return getToken(bashParser.IDENTIFIER, 0); }
		public LongFlagGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longFlagGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterLongFlagGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitLongFlagGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitLongFlagGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LongFlagGroupContext longFlagGroup() throws RecognitionException {
		LongFlagGroupContext _localctx = new LongFlagGroupContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_longFlagGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(DEC);
			setState(588);
			((LongFlagGroupContext)_localctx).name = match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShortFlagGroupWithOptionalValueContext extends ParserRuleContext {
		public LiteralContext value;
		public ShortFlagGroupContext shortFlagGroup() {
			return getRuleContext(ShortFlagGroupContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(bashParser.ASSIGN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ShortFlagGroupWithOptionalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortFlagGroupWithOptionalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterShortFlagGroupWithOptionalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitShortFlagGroupWithOptionalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitShortFlagGroupWithOptionalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortFlagGroupWithOptionalValueContext shortFlagGroupWithOptionalValue() throws RecognitionException {
		ShortFlagGroupWithOptionalValueContext _localctx = new ShortFlagGroupWithOptionalValueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_shortFlagGroupWithOptionalValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			shortFlagGroup();
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(591);
				match(ASSIGN);
				setState(592);
				((ShortFlagGroupWithOptionalValueContext)_localctx).value = literal();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LongFlagGroupWithOptionalValueContext extends ParserRuleContext {
		public LiteralContext value;
		public LongFlagGroupContext longFlagGroup() {
			return getRuleContext(LongFlagGroupContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(bashParser.ASSIGN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LongFlagGroupWithOptionalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longFlagGroupWithOptionalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterLongFlagGroupWithOptionalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitLongFlagGroupWithOptionalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitLongFlagGroupWithOptionalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LongFlagGroupWithOptionalValueContext longFlagGroupWithOptionalValue() throws RecognitionException {
		LongFlagGroupWithOptionalValueContext _localctx = new LongFlagGroupWithOptionalValueContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_longFlagGroupWithOptionalValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			longFlagGroup();
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(596);
				match(ASSIGN);
				setState(597);
				((LongFlagGroupWithOptionalValueContext)_localctx).value = literal();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuotedStringContext extends ParserRuleContext {
		public TerminalNode SUBSTITUTION_QUOTING() { return getToken(bashParser.SUBSTITUTION_QUOTING, 0); }
		public TerminalNode END_QUOTED_STRING() { return getToken(bashParser.END_QUOTED_STRING, 0); }
		public List<TerminalNode> ESCAPES() { return getTokens(bashParser.ESCAPES); }
		public TerminalNode ESCAPES(int i) {
			return getToken(bashParser.ESCAPES, i);
		}
		public List<TerminalNode> STRING_CHARACTERS() { return getTokens(bashParser.STRING_CHARACTERS); }
		public TerminalNode STRING_CHARACTERS(int i) {
			return getToken(bashParser.STRING_CHARACTERS, i);
		}
		public List<VariableReferenceContext> variableReference() {
			return getRuleContexts(VariableReferenceContext.class);
		}
		public VariableReferenceContext variableReference(int i) {
			return getRuleContext(VariableReferenceContext.class,i);
		}
		public List<CommandSubstitutionLiteralContext> commandSubstitutionLiteral() {
			return getRuleContexts(CommandSubstitutionLiteralContext.class);
		}
		public CommandSubstitutionLiteralContext commandSubstitutionLiteral(int i) {
			return getRuleContext(CommandSubstitutionLiteralContext.class,i);
		}
		public List<ArithmeticLiteralContext> arithmeticLiteral() {
			return getRuleContexts(ArithmeticLiteralContext.class);
		}
		public ArithmeticLiteralContext arithmeticLiteral(int i) {
			return getRuleContext(ArithmeticLiteralContext.class,i);
		}
		public QuotedStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterQuotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitQuotedString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitQuotedString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedStringContext quotedString() throws RecognitionException {
		QuotedStringContext _localctx = new QuotedStringContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_quotedString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(SUBSTITUTION_QUOTING);
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 932385860354049L) != 0)) {
				{
				setState(606);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ESCAPES:
					{
					setState(601);
					match(ESCAPES);
					}
					break;
				case STRING_CHARACTERS:
					{
					setState(602);
					match(STRING_CHARACTERS);
					}
					break;
				case VARIABLE_REFERENCE:
					{
					setState(603);
					variableReference();
					}
					break;
				case DOLLER:
					{
					setState(604);
					commandSubstitutionLiteral();
					}
					break;
				case ARITHMETIC_OPEN:
					{
					setState(605);
					arithmeticLiteral();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(611);
			match(END_QUOTED_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableReferenceContext extends ParserRuleContext {
		public TerminalNode VARIABLE_REFERENCE() { return getToken(bashParser.VARIABLE_REFERENCE, 0); }
		public VariableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterVariableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitVariableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitVariableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableReferenceContext variableReference() throws RecognitionException {
		VariableReferenceContext _localctx = new VariableReferenceContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(VARIABLE_REFERENCE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public List<ArithmeticStatementContext> arithmeticStatement() {
			return getRuleContexts(ArithmeticStatementContext.class);
		}
		public ArithmeticStatementContext arithmeticStatement(int i) {
			return getRuleContext(ArithmeticStatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(bashParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(bashParser.COMMA, i);
		}
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitArithmeticExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticExpressionContext arithmeticExpression() throws RecognitionException {
		ArithmeticExpressionContext _localctx = new ArithmeticExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_arithmeticExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4324300123023605822L) != 0) || _la==IDENTIFIER) {
				{
				setState(615);
				arithmeticStatement(0);
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(616);
					match(COMMA);
					setState(617);
					arithmeticStatement(0);
					}
					}
					setState(622);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticStatementContext extends ParserRuleContext {
		public ArithmeticStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticStatement; }
	 
		public ArithmeticStatementContext() { }
		public void copyFrom(ArithmeticStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticNumericalLiteralContext extends ArithmeticStatementContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public List<ArithmeticModifierContext> arithmeticModifier() {
			return getRuleContexts(ArithmeticModifierContext.class);
		}
		public ArithmeticModifierContext arithmeticModifier(int i) {
			return getRuleContext(ArithmeticModifierContext.class,i);
		}
		public ArithmeticNumericalLiteralContext(ArithmeticStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterArithmeticNumericalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitArithmeticNumericalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitArithmeticNumericalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticVariableReferenceContext extends ArithmeticStatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ArithmeticModifierContext> arithmeticModifier() {
			return getRuleContexts(ArithmeticModifierContext.class);
		}
		public ArithmeticModifierContext arithmeticModifier(int i) {
			return getRuleContext(ArithmeticModifierContext.class,i);
		}
		public List<TerminalNode> INC() { return getTokens(bashParser.INC); }
		public TerminalNode INC(int i) {
			return getToken(bashParser.INC, i);
		}
		public List<TerminalNode> DEC() { return getTokens(bashParser.DEC); }
		public TerminalNode DEC(int i) {
			return getToken(bashParser.DEC, i);
		}
		public ArithmeticVariableReferenceContext(ArithmeticStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterArithmeticVariableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitArithmeticVariableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitArithmeticVariableReference(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticAssignmentContext extends ArithmeticStatementContext {
		public TerminalNode IDENTIFIER() { return getToken(bashParser.IDENTIFIER, 0); }
		public ArithmeticAssignmentOperatorContext arithmeticAssignmentOperator() {
			return getRuleContext(ArithmeticAssignmentOperatorContext.class,0);
		}
		public ArithmeticStatementContext arithmeticStatement() {
			return getRuleContext(ArithmeticStatementContext.class,0);
		}
		public ArithmeticAssignmentContext(ArithmeticStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterArithmeticAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitArithmeticAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitArithmeticAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryArithmeticExpressionContext extends ArithmeticStatementContext {
		public List<ArithmeticStatementContext> arithmeticStatement() {
			return getRuleContexts(ArithmeticStatementContext.class);
		}
		public ArithmeticStatementContext arithmeticStatement(int i) {
			return getRuleContext(ArithmeticStatementContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(bashParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(bashParser.COLON, 0); }
		public TernaryArithmeticExpressionContext(ArithmeticStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterTernaryArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitTernaryArithmeticExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitTernaryArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GroupedArithmeticOperationContext extends ArithmeticStatementContext {
		public TerminalNode LPAREN() { return getToken(bashParser.LPAREN, 0); }
		public ArithmeticStatementContext arithmeticStatement() {
			return getRuleContext(ArithmeticStatementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(bashParser.RPAREN, 0); }
		public List<ArithmeticModifierContext> arithmeticModifier() {
			return getRuleContexts(ArithmeticModifierContext.class);
		}
		public ArithmeticModifierContext arithmeticModifier(int i) {
			return getRuleContext(ArithmeticModifierContext.class,i);
		}
		public GroupedArithmeticOperationContext(ArithmeticStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterGroupedArithmeticOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitGroupedArithmeticOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitGroupedArithmeticOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticOperationContext extends ArithmeticStatementContext {
		public List<ArithmeticStatementContext> arithmeticStatement() {
			return getRuleContexts(ArithmeticStatementContext.class);
		}
		public ArithmeticStatementContext arithmeticStatement(int i) {
			return getRuleContext(ArithmeticStatementContext.class,i);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public ArithmeticOperationContext(ArithmeticStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterArithmeticOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitArithmeticOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitArithmeticOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticStatementContext arithmeticStatement() throws RecognitionException {
		return arithmeticStatement(0);
	}

	private ArithmeticStatementContext arithmeticStatement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticStatementContext _localctx = new ArithmeticStatementContext(_ctx, _parentState);
		ArithmeticStatementContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_arithmeticStatement, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				_localctx = new GroupedArithmeticOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3459608938750672896L) != 0)) {
					{
					{
					setState(626);
					arithmeticModifier();
					}
					}
					setState(631);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(632);
				match(LPAREN);
				setState(633);
				arithmeticStatement(0);
				setState(634);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticAssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(636);
				match(IDENTIFIER);
				setState(637);
				arithmeticAssignmentOperator();
				setState(638);
				arithmeticStatement(4);
				}
				break;
			case 3:
				{
				_localctx = new ArithmeticVariableReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(643);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(640);
						arithmeticModifier();
						}
						} 
					}
					setState(645);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				}
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INC || _la==DEC) {
					{
					setState(646);
					_la = _input.LA(1);
					if ( !(_la==INC || _la==DEC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(649);
				identifier();
				setState(651);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(650);
					_la = _input.LA(1);
					if ( !(_la==INC || _la==DEC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new ArithmeticNumericalLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3459608938750672896L) != 0)) {
					{
					{
					setState(653);
					arithmeticModifier();
					}
					}
					setState(658);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(661);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DECIMAL_LITERAL:
				case HEX_LITERAL:
				case OCT_LITERAL:
				case BINARY_LITERAL:
				case HASH_LITERAL:
				case BRACKET_LITERAL:
					{
					setState(659);
					integerLiteral();
					}
					break;
				case FLOAT_LITERAL:
					{
					setState(660);
					floatLiteral();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(677);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(675);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						_localctx = new TernaryArithmeticExpressionContext(new ArithmeticStatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticStatement);
						setState(665);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(666);
						match(QUESTION);
						setState(667);
						arithmeticStatement(0);
						setState(668);
						match(COLON);
						setState(669);
						arithmeticStatement(6);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticOperationContext(new ArithmeticStatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticStatement);
						setState(671);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(672);
						arithmeticOperator();
						setState(673);
						arithmeticStatement(4);
						}
						break;
					}
					} 
				}
				setState(679);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticModifierContext extends ParserRuleContext {
		public TerminalNode BANG() { return getToken(bashParser.BANG, 0); }
		public TerminalNode TILDE() { return getToken(bashParser.TILDE, 0); }
		public TerminalNode ADD() { return getToken(bashParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(bashParser.SUB, 0); }
		public ArithmeticModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterArithmeticModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitArithmeticModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitArithmeticModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticModifierContext arithmeticModifier() throws RecognitionException {
		ArithmeticModifierContext _localctx = new ArithmeticModifierContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_arithmeticModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3459608938750672896L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticAssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(bashParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(bashParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(bashParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(bashParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(bashParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(bashParser.MOD_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(bashParser.XOR_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(bashParser.OR_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(bashParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(bashParser.RSHIFT_ASSIGN, 0); }
		public List<TerminalNode> BITAND() { return getTokens(bashParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(bashParser.BITAND, i);
		}
		public List<TerminalNode> BITOR() { return getTokens(bashParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(bashParser.BITOR, i);
		}
		public List<TerminalNode> CARET() { return getTokens(bashParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(bashParser.CARET, i);
		}
		public List<TerminalNode> MUL() { return getTokens(bashParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(bashParser.MUL, i);
		}
		public ArithmeticAssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticAssignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterArithmeticAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitArithmeticAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitArithmeticAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticAssignmentOperatorContext arithmeticAssignmentOperator() throws RecognitionException {
		ArithmeticAssignmentOperatorContext _localctx = new ArithmeticAssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_arithmeticAssignmentOperator);
		try {
			setState(704);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				match(ASSIGN);
				}
				break;
			case ADD_ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				match(ADD_ASSIGN);
				}
				break;
			case SUB_ASSIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(684);
				match(SUB_ASSIGN);
				}
				break;
			case MUL_ASSIGN:
				enterOuterAlt(_localctx, 4);
				{
				setState(685);
				match(MUL_ASSIGN);
				}
				break;
			case DIV_ASSIGN:
				enterOuterAlt(_localctx, 5);
				{
				setState(686);
				match(DIV_ASSIGN);
				}
				break;
			case MOD_ASSIGN:
				enterOuterAlt(_localctx, 6);
				{
				setState(687);
				match(MOD_ASSIGN);
				}
				break;
			case XOR_ASSIGN:
				enterOuterAlt(_localctx, 7);
				{
				setState(688);
				match(XOR_ASSIGN);
				}
				break;
			case OR_ASSIGN:
				enterOuterAlt(_localctx, 8);
				{
				setState(689);
				match(OR_ASSIGN);
				}
				break;
			case LSHIFT_ASSIGN:
				enterOuterAlt(_localctx, 9);
				{
				setState(690);
				match(LSHIFT_ASSIGN);
				}
				break;
			case RSHIFT_ASSIGN:
				enterOuterAlt(_localctx, 10);
				{
				setState(691);
				match(RSHIFT_ASSIGN);
				}
				break;
			case BITAND:
				enterOuterAlt(_localctx, 11);
				{
				setState(692);
				match(BITAND);
				setState(693);
				match(BITAND);
				setState(694);
				match(ASSIGN);
				}
				break;
			case BITOR:
				enterOuterAlt(_localctx, 12);
				{
				setState(695);
				match(BITOR);
				setState(696);
				match(BITOR);
				setState(697);
				match(ASSIGN);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 13);
				{
				setState(698);
				match(CARET);
				setState(699);
				match(CARET);
				setState(700);
				match(ASSIGN);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 14);
				{
				setState(701);
				match(MUL);
				setState(702);
				match(MUL);
				setState(703);
				match(ASSIGN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public List<TerminalNode> LT() { return getTokens(bashParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(bashParser.LT, i);
		}
		public List<TerminalNode> RT() { return getTokens(bashParser.RT); }
		public TerminalNode RT(int i) {
			return getToken(bashParser.RT, i);
		}
		public TerminalNode BITAND() { return getToken(bashParser.BITAND, 0); }
		public List<TerminalNode> CARET() { return getTokens(bashParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(bashParser.CARET, i);
		}
		public TerminalNode BITOR() { return getToken(bashParser.BITOR, 0); }
		public List<TerminalNode> MUL() { return getTokens(bashParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(bashParser.MUL, i);
		}
		public TerminalNode DIV() { return getToken(bashParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(bashParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(bashParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(bashParser.SUB, 0); }
		public TerminalNode LE() { return getToken(bashParser.LE, 0); }
		public TerminalNode GE() { return getToken(bashParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(bashParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(bashParser.NOTEQUAL, 0); }
		public TerminalNode AND() { return getToken(bashParser.AND, 0); }
		public TerminalNode OR() { return getToken(bashParser.OR, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashParserListener ) ((bashParserListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bashParserVisitor ) return ((bashParserVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_arithmeticOperator);
		try {
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(706);
				match(LT);
				setState(707);
				match(LT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
				match(RT);
				setState(709);
				match(RT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(710);
				match(BITAND);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(711);
				match(CARET);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(712);
				match(BITOR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(713);
				match(MUL);
				setState(714);
				match(MUL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(715);
				match(MUL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(716);
				match(DIV);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(717);
				match(MOD);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(718);
				match(ADD);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(719);
				match(SUB);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(720);
				match(LT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(721);
				match(RT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(722);
				match(LE);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(723);
				match(GE);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(724);
				match(EQUAL);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(725);
				match(NOTEQUAL);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(726);
				match(AND);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(727);
				match(OR);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(728);
				match(CARET);
				setState(729);
				match(CARET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 33:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 48:
			return arithmeticStatement_sempred((ArithmeticStatementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean arithmeticStatement_sempred(ArithmeticStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001_\u02dd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0003\u0001m\b\u0001\u0001\u0002\u0003\u0002p\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002v\b\u0002\n\u0002\f\u0002y\t"+
		"\u0002\u0001\u0003\u0003\u0003|\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003\u0082\b\u0003\n\u0003\f\u0003\u0085\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u008b\b\u0004"+
		"\n\u0004\f\u0004\u008e\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0093\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0003\u0007\u0098"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u009d\b\u0007"+
		"\n\u0007\f\u0007\u00a0\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00a5\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00aa"+
		"\b\u0007\n\u0007\f\u0007\u00ad\t\u0007\u0001\u0007\u0005\u0007\u00b0\b"+
		"\u0007\n\u0007\f\u0007\u00b3\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00b8\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u00bd\b\u0007\n\u0007\f\u0007\u00c0\t\u0007\u0001\u0007\u0005\u0007\u00c3"+
		"\b\u0007\n\u0007\f\u0007\u00c6\t\u0007\u0001\u0007\u0003\u0007\u00c9\b"+
		"\u0007\u0001\b\u0003\b\u00cc\b\b\u0001\b\u0001\b\u0001\b\u0005\b\u00d1"+
		"\b\b\n\b\f\b\u00d4\t\b\u0001\b\u0005\b\u00d7\b\b\n\b\f\b\u00da\t\b\u0001"+
		"\t\u0001\t\u0003\t\u00de\b\t\u0001\n\u0004\n\u00e1\b\n\u000b\n\f\n\u00e2"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00e7\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00fa\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0105"+
		"\b\r\n\r\f\r\u0108\t\r\u0001\r\u0001\r\u0003\r\u010c\b\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u011b\b\u000e\n\u000e\f\u000e\u011e\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0125\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0004\u0010\u012d"+
		"\b\u0010\u000b\u0010\f\u0010\u012e\u0001\u0010\u0001\u0010\u0004\u0010"+
		"\u0133\b\u0010\u000b\u0010\f\u0010\u0134\u0001\u0010\u0004\u0010\u0138"+
		"\b\u0010\u000b\u0010\f\u0010\u0139\u0001\u0010\u0001\u0010\u0004\u0010"+
		"\u013e\b\u0010\u000b\u0010\f\u0010\u013f\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u0144\b\u0010\n\u0010\f\u0010\u0147\t\u0010\u0003\u0010\u0149\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0173"+
		"\b\u0015\n\u0015\f\u0015\u0176\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0004\u0016\u017e\b\u0016\u000b\u0016"+
		"\f\u0016\u017f\u0001\u0016\u0004\u0016\u0183\b\u0016\u000b\u0016\f\u0016"+
		"\u0184\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0003"+
		"\u0017\u018c\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0191"+
		"\b\u0017\n\u0017\f\u0017\u0194\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b"+
		"\u01aa\b\u001b\n\u001b\f\u001b\u01ad\t\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u01b7\b\u001c\u0001\u001c\u0005\u001c\u01ba\b\u001c\n\u001c\f\u001c"+
		"\u01bd\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u01c7\b\u001d\n\u001d"+
		"\f\u001d\u01ca\t\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u01d4\b\u001e"+
		"\n\u001e\f\u001e\u01d7\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u01dd\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0003!\u01f1\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0003!\u020d\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u0215"+
		"\b!\n!\f!\u0218\t!\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u021e\b\"\n"+
		"\"\f\"\u0221\t\"\u0001\"\u0001\"\u0005\"\u0225\b\"\n\"\f\"\u0228\t\"\u0001"+
		"\"\u0001\"\u0003\"\u022c\b\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u023a\b$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0003+\u0252\b+\u0001,\u0001,\u0001,\u0003,\u0257\b,\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0005-\u025f\b-\n-\f-\u0262\t-\u0001-\u0001-\u0001"+
		".\u0001.\u0001/\u0001/\u0001/\u0005/\u026b\b/\n/\f/\u026e\t/\u0003/\u0270"+
		"\b/\u00010\u00010\u00050\u0274\b0\n0\f0\u0277\t0\u00010\u00010\u00010"+
		"\u00010\u00010\u00010\u00010\u00010\u00010\u00050\u0282\b0\n0\f0\u0285"+
		"\t0\u00010\u00030\u0288\b0\u00010\u00010\u00030\u028c\b0\u00010\u0005"+
		"0\u028f\b0\n0\f0\u0292\t0\u00010\u00010\u00030\u0296\b0\u00030\u0298\b"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00050\u02a4\b0\n0\f0\u02a7\t0\u00011\u00011\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u02c1"+
		"\b2\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00033\u02db\b3\u00013\u0000\u0002B`4\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdf\u0000\b\u0001\u000089\u0002"+
		"\u0000))SS\u0002\u000000AA\u0002\u0000))@A\u0005\u0000\u0001\u0005\u001f"+
		"\u001f\"\"==WW\u0001\u0000\u0018\u001d\u0001\u0000:;\u0002\u000001<=\u0336"+
		"\u0000h\u0001\u0000\u0000\u0000\u0002l\u0001\u0000\u0000\u0000\u0004o"+
		"\u0001\u0000\u0000\u0000\u0006{\u0001\u0000\u0000\u0000\b\u0086\u0001"+
		"\u0000\u0000\u0000\n\u0092\u0001\u0000\u0000\u0000\f\u0094\u0001\u0000"+
		"\u0000\u0000\u000e\u00c8\u0001\u0000\u0000\u0000\u0010\u00cb\u0001\u0000"+
		"\u0000\u0000\u0012\u00dd\u0001\u0000\u0000\u0000\u0014\u00e0\u0001\u0000"+
		"\u0000\u0000\u0016\u00e4\u0001\u0000\u0000\u0000\u0018\u00f9\u0001\u0000"+
		"\u0000\u0000\u001a\u00fb\u0001\u0000\u0000\u0000\u001c\u010f\u0001\u0000"+
		"\u0000\u0000\u001e\u0126\u0001\u0000\u0000\u0000 \u012a\u0001\u0000\u0000"+
		"\u0000\"\u014e\u0001\u0000\u0000\u0000$\u015c\u0001\u0000\u0000\u0000"+
		"&\u0162\u0001\u0000\u0000\u0000(\u0168\u0001\u0000\u0000\u0000*\u016e"+
		"\u0001\u0000\u0000\u0000,\u0179\u0001\u0000\u0000\u0000.\u018b\u0001\u0000"+
		"\u0000\u00000\u0199\u0001\u0000\u0000\u00002\u019c\u0001\u0000\u0000\u0000"+
		"4\u01a0\u0001\u0000\u0000\u00006\u01a4\u0001\u0000\u0000\u00008\u01b2"+
		"\u0001\u0000\u0000\u0000:\u01c2\u0001\u0000\u0000\u0000<\u01cf\u0001\u0000"+
		"\u0000\u0000>\u01dc\u0001\u0000\u0000\u0000@\u01de\u0001\u0000\u0000\u0000"+
		"B\u020c\u0001\u0000\u0000\u0000D\u022b\u0001\u0000\u0000\u0000F\u022d"+
		"\u0001\u0000\u0000\u0000H\u0239\u0001\u0000\u0000\u0000J\u023b\u0001\u0000"+
		"\u0000\u0000L\u0240\u0001\u0000\u0000\u0000N\u0244\u0001\u0000\u0000\u0000"+
		"P\u0246\u0001\u0000\u0000\u0000R\u0248\u0001\u0000\u0000\u0000T\u024b"+
		"\u0001\u0000\u0000\u0000V\u024e\u0001\u0000\u0000\u0000X\u0253\u0001\u0000"+
		"\u0000\u0000Z\u0258\u0001\u0000\u0000\u0000\\\u0265\u0001\u0000\u0000"+
		"\u0000^\u026f\u0001\u0000\u0000\u0000`\u0297\u0001\u0000\u0000\u0000b"+
		"\u02a8\u0001\u0000\u0000\u0000d\u02c0\u0001\u0000\u0000\u0000f\u02da\u0001"+
		"\u0000\u0000\u0000hi\u0003\u0010\b\u0000i\u0001\u0001\u0000\u0000\u0000"+
		"jm\u0003\u0004\u0002\u0000km\u0003\u0018\f\u0000lj\u0001\u0000\u0000\u0000"+
		"lk\u0001\u0000\u0000\u0000m\u0003\u0001\u0000\u0000\u0000np\u0003D\"\u0000"+
		"on\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000qw\u0003H$\u0000rv\u0003H$\u0000sv\u0003V+\u0000tv\u0003X,\u0000"+
		"ur\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000"+
		"\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000x\u0005\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000"+
		"z|\u0005\u0006\u0000\u0000{z\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}\u0083\u0003\u0002\u0001\u0000~\u007f"+
		"\u0003\n\u0005\u0000\u007f\u0080\u0003\u0002\u0001\u0000\u0080\u0082\u0001"+
		"\u0000\u0000\u0000\u0081~\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000"+
		"\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000"+
		"\u0000\u0000\u0084\u0007\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000"+
		"\u0000\u0000\u0086\u008c\u0003\u0006\u0003\u0000\u0087\u0088\u0003\f\u0006"+
		"\u0000\u0088\u0089\u0003\u0006\u0003\u0000\u0089\u008b\u0001\u0000\u0000"+
		"\u0000\u008a\u0087\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\t\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000"+
		"\u008f\u0093\u0005A\u0000\u0000\u0090\u0091\u0005A\u0000\u0000\u0091\u0093"+
		"\u0005@\u0000\u0000\u0092\u008f\u0001\u0000\u0000\u0000\u0092\u0090\u0001"+
		"\u0000\u0000\u0000\u0093\u000b\u0001\u0000\u0000\u0000\u0094\u0095\u0007"+
		"\u0000\u0000\u0000\u0095\r\u0001\u0000\u0000\u0000\u0096\u0098\u0003\b"+
		"\u0004\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000"+
		"\u0000\u0000\u0098\u009e\u0001\u0000\u0000\u0000\u0099\u009a\u0003\u0012"+
		"\t\u0000\u009a\u009b\u0003\b\u0004\u0000\u009b\u009d\u0001\u0000\u0000"+
		"\u0000\u009c\u0099\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000"+
		"\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000"+
		"\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000"+
		"\u0000\u00a1\u00c9\u0003\u0012\t\u0000\u00a2\u00a4\u0005#\u0000\u0000"+
		"\u00a3\u00a5\u0003\b\u0004\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a5\u00ab\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0003\u0012\t\u0000\u00a7\u00a8\u0003\b\u0004\u0000\u00a8\u00aa"+
		"\u0001\u0000\u0000\u0000\u00a9\u00a6\u0001\u0000\u0000\u0000\u00aa\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ac\u00b1\u0001\u0000\u0000\u0000\u00ad\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b0\u0003\u0012\t\u0000\u00af\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00c9\u0005"+
		"$\u0000\u0000\u00b5\u00b7\u0005%\u0000\u0000\u00b6\u00b8\u0003\b\u0004"+
		"\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b8\u00be\u0001\u0000\u0000\u0000\u00b9\u00ba\u0003\u0012\t\u0000"+
		"\u00ba\u00bb\u0003\b\u0004\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be"+
		"\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c3\u0003\u0012\t\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c9\u0005&\u0000\u0000\u00c8\u0097\u0001"+
		"\u0000\u0000\u0000\u00c8\u00a2\u0001\u0000\u0000\u0000\u00c8\u00b5\u0001"+
		"\u0000\u0000\u0000\u00c9\u000f\u0001\u0000\u0000\u0000\u00ca\u00cc\u0003"+
		"\b\u0004\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cc\u00d2\u0001\u0000\u0000\u0000\u00cd\u00ce\u0003\u0012"+
		"\t\u0000\u00ce\u00cf\u0003\b\u0004\u0000\u00cf\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d8\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d7\u0003\u0012\t\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u0011\u0001\u0000\u0000\u0000"+
		"\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00de\u0003\u0014\n\u0000\u00dc"+
		"\u00de\u0003\u0016\u000b\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd"+
		"\u00dc\u0001\u0000\u0000\u0000\u00de\u0013\u0001\u0000\u0000\u0000\u00df"+
		"\u00e1\u0007\u0001\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e3\u0015\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e6\u0005@\u0000\u0000\u00e5\u00e7\u0007\u0002\u0000\u0000\u00e6\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u0017"+
		"\u0001\u0000\u0000\u0000\u00e8\u00fa\u0003\u001a\r\u0000\u00e9\u00fa\u0003"+
		"\u001c\u000e\u0000\u00ea\u00fa\u0003\u001e\u000f\u0000\u00eb\u00fa\u0003"+
		" \u0010\u0000\u00ec\u00fa\u0003\"\u0011\u0000\u00ed\u00fa\u0003$\u0012"+
		"\u0000\u00ee\u00fa\u0003&\u0013\u0000\u00ef\u00fa\u0003(\u0014\u0000\u00f0"+
		"\u00fa\u0003*\u0015\u0000\u00f1\u00fa\u0003,\u0016\u0000\u00f2\u00fa\u0003"+
		"2\u0019\u0000\u00f3\u00fa\u00034\u001a\u0000\u00f4\u00fa\u00036\u001b"+
		"\u0000\u00f5\u00fa\u00038\u001c\u0000\u00f6\u00fa\u0003:\u001d\u0000\u00f7"+
		"\u00fa\u0003<\u001e\u0000\u00f8\u00fa\u0003@ \u0000\u00f9\u00e8\u0001"+
		"\u0000\u0000\u0000\u00f9\u00e9\u0001\u0000\u0000\u0000\u00f9\u00ea\u0001"+
		"\u0000\u0000\u0000\u00f9\u00eb\u0001\u0000\u0000\u0000\u00f9\u00ec\u0001"+
		"\u0000\u0000\u0000\u00f9\u00ed\u0001\u0000\u0000\u0000\u00f9\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f9\u00ef\u0001\u0000\u0000\u0000\u00f9\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f1\u0001\u0000\u0000\u0000\u00f9\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f3\u0001\u0000\u0000\u0000\u00f9\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f5\u0001\u0000\u0000\u0000\u00f9\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fa\u0019\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005"+
		"\u0007\u0000\u0000\u00fc\u00fd\u0003>\u001f\u0000\u00fd\u00fe\u0005\b"+
		"\u0000\u0000\u00fe\u0106\u0003\u000e\u0007\u0000\u00ff\u0100\u0005\t\u0000"+
		"\u0000\u0100\u0101\u0003>\u001f\u0000\u0101\u0102\u0005\b\u0000\u0000"+
		"\u0102\u0103\u0003\u000e\u0007\u0000\u0103\u0105\u0001\u0000\u0000\u0000"+
		"\u0104\u00ff\u0001\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000"+
		"\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000"+
		"\u0107\u010b\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\u0005\n\u0000\u0000\u010a\u010c\u0003\u000e\u0007\u0000\u010b"+
		"\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c"+
		"\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u000b\u0000\u0000\u010e"+
		"\u001b\u0001\u0000\u0000\u0000\u010f\u0110\u0005\u0007\u0000\u0000\u0110"+
		"\u0111\u0003>\u001f\u0000\u0111\u0112\u0005%\u0000\u0000\u0112\u0113\u0003"+
		"\u000e\u0007\u0000\u0113\u011c\u0005&\u0000\u0000\u0114\u0115\u0005\t"+
		"\u0000\u0000\u0115\u0116\u0003>\u001f\u0000\u0116\u0117\u0005%\u0000\u0000"+
		"\u0117\u0118\u0003\u000e\u0007\u0000\u0118\u0119\u0005&\u0000\u0000\u0119"+
		"\u011b\u0001\u0000\u0000\u0000\u011a\u0114\u0001\u0000\u0000\u0000\u011b"+
		"\u011e\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0001\u0000\u0000\u0000\u011d\u0124\u0001\u0000\u0000\u0000\u011e"+
		"\u011c\u0001\u0000\u0000\u0000\u011f\u0120\u0005\n\u0000\u0000\u0120\u0121"+
		"\u0005%\u0000\u0000\u0121\u0122\u0003\u000e\u0007\u0000\u0122\u0123\u0005"+
		"&\u0000\u0000\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u011f\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u001d\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0005\u0007\u0000\u0000\u0127\u0128\u0003>\u001f"+
		"\u0000\u0128\u0129\u0003\b\u0004\u0000\u0129\u001f\u0001\u0000\u0000\u0000"+
		"\u012a\u012c\u0005\f\u0000\u0000\u012b\u012d\u0003F#\u0000\u012c\u012b"+
		"\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u012c"+
		"\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0148"+
		"\u0001\u0000\u0000\u0000\u0130\u0132\u0005\r\u0000\u0000\u0131\u0133\u0003"+
		"H$\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000"+
		"\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000"+
		"\u0000\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u0138\u0007\u0001\u0000"+
		"\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000"+
		"\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000"+
		"\u0000\u013a\u0149\u0001\u0000\u0000\u0000\u013b\u013d\u0005#\u0000\u0000"+
		"\u013c\u013e\u0003H$\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013e\u013f"+
		"\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0145"+
		"\u0005$\u0000\u0000\u0142\u0144\u0007\u0001\u0000\u0000\u0143\u0142\u0001"+
		"\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0149\u0001"+
		"\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u0130\u0001"+
		"\u0000\u0000\u0000\u0148\u013b\u0001\u0000\u0000\u0000\u0149\u014a\u0001"+
		"\u0000\u0000\u0000\u014a\u014b\u0005\u000e\u0000\u0000\u014b\u014c\u0003"+
		"\u000e\u0007\u0000\u014c\u014d\u0005\u000f\u0000\u0000\u014d!\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0005\f\u0000\u0000\u014f\u0150\u0005#\u0000"+
		"\u0000\u0150\u0151\u0005#\u0000\u0000\u0151\u0152\u0003H$\u0000\u0152"+
		"\u0153\u0005)\u0000\u0000\u0153\u0154\u0003H$\u0000\u0154\u0155\u0005"+
		")\u0000\u0000\u0155\u0156\u0003H$\u0000\u0156\u0157\u0005$\u0000\u0000"+
		"\u0157\u0158\u0005$\u0000\u0000\u0158\u0159\u0005\u000e\u0000\u0000\u0159"+
		"\u015a\u0003\u000e\u0007\u0000\u015a\u015b\u0005\u000f\u0000\u0000\u015b"+
		"#\u0001\u0000\u0000\u0000\u015c\u015d\u0005\u0010\u0000\u0000\u015d\u015e"+
		"\u0003>\u001f\u0000\u015e\u015f\u0005\u000e\u0000\u0000\u015f\u0160\u0003"+
		"\u000e\u0007\u0000\u0160\u0161\u0005\u000f\u0000\u0000\u0161%\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0005\u0011\u0000\u0000\u0163\u0164\u0003>\u001f"+
		"\u0000\u0164\u0165\u0005\u000e\u0000\u0000\u0165\u0166\u0003\u000e\u0007"+
		"\u0000\u0166\u0167\u0005\u000f\u0000\u0000\u0167\'\u0001\u0000\u0000\u0000"+
		"\u0168\u0169\u0005\u0012\u0000\u0000\u0169\u016a\u0003`0\u0000\u016a\u016b"+
		"\u0005\u000e\u0000\u0000\u016b\u016c\u0003\u000e\u0007\u0000\u016c\u016d"+
		"\u0005\u000f\u0000\u0000\u016d)\u0001\u0000\u0000\u0000\u016e\u016f\u0005"+
		"\u0013\u0000\u0000\u016f\u0170\u0003H$\u0000\u0170\u0174\u0005\r\u0000"+
		"\u0000\u0171\u0173\u0003.\u0017\u0000\u0172\u0171\u0001\u0000\u0000\u0000"+
		"\u0173\u0176\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000"+
		"\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0177\u0001\u0000\u0000\u0000"+
		"\u0176\u0174\u0001\u0000\u0000\u0000\u0177\u0178\u0005\u0014\u0000\u0000"+
		"\u0178+\u0001\u0000\u0000\u0000\u0179\u017a\u0005\u0015\u0000\u0000\u017a"+
		"\u017b\u0003H$\u0000\u017b\u017d\u0005\r\u0000\u0000\u017c\u017e\u0003"+
		"H$\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000"+
		"\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000"+
		"\u0000\u0180\u0182\u0001\u0000\u0000\u0000\u0181\u0183\u0007\u0001\u0000"+
		"\u0000\u0182\u0181\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000"+
		"\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000"+
		"\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0187\u0005\u000e\u0000"+
		"\u0000\u0187\u0188\u0003\u000e\u0007\u0000\u0188\u0189\u0005\u000f\u0000"+
		"\u0000\u0189-\u0001\u0000\u0000\u0000\u018a\u018c\u0005#\u0000\u0000\u018b"+
		"\u018a\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c"+
		"\u018d\u0001\u0000\u0000\u0000\u018d\u0192\u0003H$\u0000\u018e\u018f\u0005"+
		"A\u0000\u0000\u018f\u0191\u0003H$\u0000\u0190\u018e\u0001\u0000\u0000"+
		"\u0000\u0191\u0194\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000"+
		"\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0195\u0001\u0000\u0000"+
		"\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0195\u0196\u0005$\u0000\u0000"+
		"\u0196\u0197\u0003\u000e\u0007\u0000\u0197\u0198\u00030\u0018\u0000\u0198"+
		"/\u0001\u0000\u0000\u0000\u0199\u019a\u0005)\u0000\u0000\u019a\u019b\u0007"+
		"\u0003\u0000\u0000\u019b1\u0001\u0000\u0000\u0000\u019c\u019d\u0005#\u0000"+
		"\u0000\u019d\u019e\u0003\u0010\b\u0000\u019e\u019f\u0005$\u0000\u0000"+
		"\u019f3\u0001\u0000\u0000\u0000\u01a0\u01a1\u0005%\u0000\u0000\u01a1\u01a2"+
		"\u0003\u0010\b\u0000\u01a2\u01a3\u0005&\u0000\u0000\u01a35\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a5\u0005%\u0000\u0000\u01a5\u01a6\u0003\u000e\u0007"+
		"\u0000\u01a6\u01a7\u0005&\u0000\u0000\u01a7\u01ab\u0005\u0016\u0000\u0000"+
		"\u01a8\u01aa\u0007\u0001\u0000\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000"+
		"\u01aa\u01ad\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000"+
		"\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ae\u0001\u0000\u0000\u0000"+
		"\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ae\u01af\u0005%\u0000\u0000\u01af"+
		"\u01b0\u0003\u000e\u0007\u0000\u01b0\u01b1\u0005&\u0000\u0000\u01b17\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b3\u0005\u0017\u0000\u0000\u01b3\u01b6\u0003"+
		"F#\u0000\u01b4\u01b5\u0005#\u0000\u0000\u01b5\u01b7\u0005$\u0000\u0000"+
		"\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b7\u01bb\u0001\u0000\u0000\u0000\u01b8\u01ba\u0007\u0001\u0000\u0000"+
		"\u01b9\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000"+
		"\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000"+
		"\u01bc\u01be\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000"+
		"\u01be\u01bf\u0005%\u0000\u0000\u01bf\u01c0\u0003\u000e\u0007\u0000\u01c0"+
		"\u01c1\u0005&\u0000\u0000\u01c19\u0001\u0000\u0000\u0000\u01c2\u01c3\u0003"+
		"F#\u0000\u01c3\u01c4\u0005#\u0000\u0000\u01c4\u01c8\u0005$\u0000\u0000"+
		"\u01c5\u01c7\u0007\u0001\u0000\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000"+
		"\u01c7\u01ca\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01cb\u0001\u0000\u0000\u0000"+
		"\u01ca\u01c8\u0001\u0000\u0000\u0000\u01cb\u01cc\u0005%\u0000\u0000\u01cc"+
		"\u01cd\u0003\u000e\u0007\u0000\u01cd\u01ce\u0005&\u0000\u0000\u01ce;\u0001"+
		"\u0000\u0000\u0000\u01cf\u01d0\u0003F#\u0000\u01d0\u01d1\u0005#\u0000"+
		"\u0000\u01d1\u01d5\u0005$\u0000\u0000\u01d2\u01d4\u0007\u0001\u0000\u0000"+
		"\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d7\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d8\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000"+
		"\u01d8\u01d9\u0003\u0002\u0001\u0000\u01d9=\u0001\u0000\u0000\u0000\u01da"+
		"\u01dd\u0003\u000e\u0007\u0000\u01db\u01dd\u0003@ \u0000\u01dc\u01da\u0001"+
		"\u0000\u0000\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dd?\u0001\u0000"+
		"\u0000\u0000\u01de\u01df\u0005\'\u0000\u0000\u01df\u01e0\u0005\'\u0000"+
		"\u0000\u01e0\u01e1\u0003B!\u0000\u01e1\u01e2\u0005(\u0000\u0000\u01e2"+
		"\u01e3\u0005(\u0000\u0000\u01e3A\u0001\u0000\u0000\u0000\u01e4\u01e5\u0006"+
		"!\uffff\uffff\u0000\u01e5\u020d\u0003H$\u0000\u01e6\u01e7\u0003R)\u0000"+
		"\u01e7\u01e8\u0003H$\u0000\u01e8\u020d\u0001\u0000\u0000\u0000\u01e9\u01ea"+
		"\u0003H$\u0000\u01ea\u01eb\u0003R)\u0000\u01eb\u01ec\u0003H$\u0000\u01ec"+
		"\u020d\u0001\u0000\u0000\u0000\u01ed\u01ee\u0003H$\u0000\u01ee\u01f0\u0005"+
		"-\u0000\u0000\u01ef\u01f1\u0005-\u0000\u0000\u01f0\u01ef\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f3\u0003H$\u0000\u01f3\u020d\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f5\u0003H$\u0000\u01f5\u01f6\u00050\u0000\u0000\u01f6\u01f7\u0005"+
		"-\u0000\u0000\u01f7\u01f8\u0003H$\u0000\u01f8\u020d\u0001\u0000\u0000"+
		"\u0000\u01f9\u01fa\u0003H$\u0000\u01fa\u01fb\u0005-\u0000\u0000\u01fb"+
		"\u01fc\u00051\u0000\u0000\u01fc\u01fd\u0003H$\u0000\u01fd\u020d\u0001"+
		"\u0000\u0000\u0000\u01fe\u01ff\u0003H$\u0000\u01ff\u0200\u0005/\u0000"+
		"\u0000\u0200\u0201\u0003H$\u0000\u0201\u020d\u0001\u0000\u0000\u0000\u0202"+
		"\u0203\u0003H$\u0000\u0203\u0204\u0005_\u0000\u0000\u0204\u0205\u0003"+
		"H$\u0000\u0205\u020d\u0001\u0000\u0000\u0000\u0206\u0207\u0005#\u0000"+
		"\u0000\u0207\u0208\u0003B!\u0000\u0208\u0209\u0005$\u0000\u0000\u0209"+
		"\u020d\u0001\u0000\u0000\u0000\u020a\u020b\u00050\u0000\u0000\u020b\u020d"+
		"\u0003B!\u0003\u020c\u01e4\u0001\u0000\u0000\u0000\u020c\u01e6\u0001\u0000"+
		"\u0000\u0000\u020c\u01e9\u0001\u0000\u0000\u0000\u020c\u01ed\u0001\u0000"+
		"\u0000\u0000\u020c\u01f4\u0001\u0000\u0000\u0000\u020c\u01f9\u0001\u0000"+
		"\u0000\u0000\u020c\u01fe\u0001\u0000\u0000\u0000\u020c\u0202\u0001\u0000"+
		"\u0000\u0000\u020c\u0206\u0001\u0000\u0000\u0000\u020c\u020a\u0001\u0000"+
		"\u0000\u0000\u020d\u0216\u0001\u0000\u0000\u0000\u020e\u020f\n\u0002\u0000"+
		"\u0000\u020f\u0210\u00058\u0000\u0000\u0210\u0215\u0003B!\u0003\u0211"+
		"\u0212\n\u0001\u0000\u0000\u0212\u0213\u00059\u0000\u0000\u0213\u0215"+
		"\u0003B!\u0002\u0214\u020e\u0001\u0000\u0000\u0000\u0214\u0211\u0001\u0000"+
		"\u0000\u0000\u0215\u0218\u0001\u0000\u0000\u0000\u0216\u0214\u0001\u0000"+
		"\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217C\u0001\u0000\u0000"+
		"\u0000\u0218\u0216\u0001\u0000\u0000\u0000\u0219\u022c\u0005=\u0000\u0000"+
		"\u021a\u022c\u0005\u0001\u0000\u0000\u021b\u021f\u0005\u0002\u0000\u0000"+
		"\u021c\u021e\u0003R)\u0000\u021d\u021c\u0001\u0000\u0000\u0000\u021e\u0221"+
		"\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u021f\u0220"+
		"\u0001\u0000\u0000\u0000\u0220\u022c\u0001\u0000\u0000\u0000\u0221\u021f"+
		"\u0001\u0000\u0000\u0000\u0222\u0226\u0005\u0003\u0000\u0000\u0223\u0225"+
		"\u0003V+\u0000\u0224\u0223\u0001\u0000\u0000\u0000\u0225\u0228\u0001\u0000"+
		"\u0000\u0000\u0226\u0224\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000"+
		"\u0000\u0000\u0227\u022c\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000"+
		"\u0000\u0000\u0229\u022c\u0005\u0004\u0000\u0000\u022a\u022c\u0005\u0005"+
		"\u0000\u0000\u022b\u0219\u0001\u0000\u0000\u0000\u022b\u021a\u0001\u0000"+
		"\u0000\u0000\u022b\u021b\u0001\u0000\u0000\u0000\u022b\u0222\u0001\u0000"+
		"\u0000\u0000\u022b\u0229\u0001\u0000\u0000\u0000\u022b\u022a\u0001\u0000"+
		"\u0000\u0000\u022cE\u0001\u0000\u0000\u0000\u022d\u022e\u0007\u0004\u0000"+
		"\u0000\u022eG\u0001\u0000\u0000\u0000\u022f\u023a\u0003N\'\u0000\u0230"+
		"\u023a\u0003P(\u0000\u0231\u023a\u0005 \u0000\u0000\u0232\u023a\u0003"+
		"Z-\u0000\u0233\u023a\u0005\u001f\u0000\u0000\u0234\u023a\u0005\"\u0000"+
		"\u0000\u0235\u023a\u0003F#\u0000\u0236\u023a\u0003\\.\u0000\u0237\u023a"+
		"\u0003J%\u0000\u0238\u023a\u0003L&\u0000\u0239\u022f\u0001\u0000\u0000"+
		"\u0000\u0239\u0230\u0001\u0000\u0000\u0000\u0239\u0231\u0001\u0000\u0000"+
		"\u0000\u0239\u0232\u0001\u0000\u0000\u0000\u0239\u0233\u0001\u0000\u0000"+
		"\u0000\u0239\u0234\u0001\u0000\u0000\u0000\u0239\u0235\u0001\u0000\u0000"+
		"\u0000\u0239\u0236\u0001\u0000\u0000\u0000\u0239\u0237\u0001\u0000\u0000"+
		"\u0000\u0239\u0238\u0001\u0000\u0000\u0000\u023aI\u0001\u0000\u0000\u0000"+
		"\u023b\u023c\u0005,\u0000\u0000\u023c\u023d\u0005#\u0000\u0000\u023d\u023e"+
		"\u0003\u0010\b\u0000\u023e\u023f\u0005$\u0000\u0000\u023fK\u0001\u0000"+
		"\u0000\u0000\u0240\u0241\u0005Z\u0000\u0000\u0241\u0242\u0003^/\u0000"+
		"\u0242\u0243\u0005[\u0000\u0000\u0243M\u0001\u0000\u0000\u0000\u0244\u0245"+
		"\u0007\u0005\u0000\u0000\u0245O\u0001\u0000\u0000\u0000\u0246\u0247\u0005"+
		"\u001e\u0000\u0000\u0247Q\u0001\u0000\u0000\u0000\u0248\u0249\u0005=\u0000"+
		"\u0000\u0249\u024a\u0005W\u0000\u0000\u024aS\u0001\u0000\u0000\u0000\u024b"+
		"\u024c\u0005;\u0000\u0000\u024c\u024d\u0005W\u0000\u0000\u024dU\u0001"+
		"\u0000\u0000\u0000\u024e\u0251\u0003R)\u0000\u024f\u0250\u0005-\u0000"+
		"\u0000\u0250\u0252\u0003H$\u0000\u0251\u024f\u0001\u0000\u0000\u0000\u0251"+
		"\u0252\u0001\u0000\u0000\u0000\u0252W\u0001\u0000\u0000\u0000\u0253\u0256"+
		"\u0003T*\u0000\u0254\u0255\u0005-\u0000\u0000\u0255\u0257\u0003H$\u0000"+
		"\u0256\u0254\u0001\u0000\u0000\u0000\u0256\u0257\u0001\u0000\u0000\u0000"+
		"\u0257Y\u0001\u0000\u0000\u0000\u0258\u0260\u0005!\u0000\u0000\u0259\u025f"+
		"\u0005\\\u0000\u0000\u025a\u025f\u0005]\u0000\u0000\u025b\u025f\u0003"+
		"\\.\u0000\u025c\u025f\u0003J%\u0000\u025d\u025f\u0003L&\u0000\u025e\u0259"+
		"\u0001\u0000\u0000\u0000\u025e\u025a\u0001\u0000\u0000\u0000\u025e\u025b"+
		"\u0001\u0000\u0000\u0000\u025e\u025c\u0001\u0000\u0000\u0000\u025e\u025d"+
		"\u0001\u0000\u0000\u0000\u025f\u0262\u0001\u0000\u0000\u0000\u0260\u025e"+
		"\u0001\u0000\u0000\u0000\u0260\u0261\u0001\u0000\u0000\u0000\u0261\u0263"+
		"\u0001\u0000\u0000\u0000\u0262\u0260\u0001\u0000\u0000\u0000\u0263\u0264"+
		"\u0005^\u0000\u0000\u0264[\u0001\u0000\u0000\u0000\u0265\u0266\u0005X"+
		"\u0000\u0000\u0266]\u0001\u0000\u0000\u0000\u0267\u026c\u0003`0\u0000"+
		"\u0268\u0269\u0005*\u0000\u0000\u0269\u026b\u0003`0\u0000\u026a\u0268"+
		"\u0001\u0000\u0000\u0000\u026b\u026e\u0001\u0000\u0000\u0000\u026c\u026a"+
		"\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000\u026d\u0270"+
		"\u0001\u0000\u0000\u0000\u026e\u026c\u0001\u0000\u0000\u0000\u026f\u0267"+
		"\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270_\u0001"+
		"\u0000\u0000\u0000\u0271\u0275\u00060\uffff\uffff\u0000\u0272\u0274\u0003"+
		"b1\u0000\u0273\u0272\u0001\u0000\u0000\u0000\u0274\u0277\u0001\u0000\u0000"+
		"\u0000\u0275\u0273\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000"+
		"\u0000\u0276\u0278\u0001\u0000\u0000\u0000\u0277\u0275\u0001\u0000\u0000"+
		"\u0000\u0278\u0279\u0005#\u0000\u0000\u0279\u027a\u0003`0\u0000\u027a"+
		"\u027b\u0005$\u0000\u0000\u027b\u0298\u0001\u0000\u0000\u0000\u027c\u027d"+
		"\u0005W\u0000\u0000\u027d\u027e\u0003d2\u0000\u027e\u027f\u0003`0\u0004"+
		"\u027f\u0298\u0001\u0000\u0000\u0000\u0280\u0282\u0003b1\u0000\u0281\u0280"+
		"\u0001\u0000\u0000\u0000\u0282\u0285\u0001\u0000\u0000\u0000\u0283\u0281"+
		"\u0001\u0000\u0000\u0000\u0283\u0284\u0001\u0000\u0000\u0000\u0284\u0287"+
		"\u0001\u0000\u0000\u0000\u0285\u0283\u0001\u0000\u0000\u0000\u0286\u0288"+
		"\u0007\u0006\u0000\u0000\u0287\u0286\u0001\u0000\u0000\u0000\u0287\u0288"+
		"\u0001\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289\u028b"+
		"\u0003F#\u0000\u028a\u028c\u0007\u0006\u0000\u0000\u028b\u028a\u0001\u0000"+
		"\u0000\u0000\u028b\u028c\u0001\u0000\u0000\u0000\u028c\u0298\u0001\u0000"+
		"\u0000\u0000\u028d\u028f\u0003b1\u0000\u028e\u028d\u0001\u0000\u0000\u0000"+
		"\u028f\u0292\u0001\u0000\u0000\u0000\u0290\u028e\u0001\u0000\u0000\u0000"+
		"\u0290\u0291\u0001\u0000\u0000\u0000\u0291\u0295\u0001\u0000\u0000\u0000"+
		"\u0292\u0290\u0001\u0000\u0000\u0000\u0293\u0296\u0003N\'\u0000\u0294"+
		"\u0296\u0003P(\u0000\u0295\u0293\u0001\u0000\u0000\u0000\u0295\u0294\u0001"+
		"\u0000\u0000\u0000\u0296\u0298\u0001\u0000\u0000\u0000\u0297\u0271\u0001"+
		"\u0000\u0000\u0000\u0297\u027c\u0001\u0000\u0000\u0000\u0297\u0283\u0001"+
		"\u0000\u0000\u0000\u0297\u0290\u0001\u0000\u0000\u0000\u0298\u02a5\u0001"+
		"\u0000\u0000\u0000\u0299\u029a\n\u0005\u0000\u0000\u029a\u029b\u00052"+
		"\u0000\u0000\u029b\u029c\u0003`0\u0000\u029c\u029d\u00053\u0000\u0000"+
		"\u029d\u029e\u0003`0\u0006\u029e\u02a4\u0001\u0000\u0000\u0000\u029f\u02a0"+
		"\n\u0003\u0000\u0000\u02a0\u02a1\u0003f3\u0000\u02a1\u02a2\u0003`0\u0004"+
		"\u02a2\u02a4\u0001\u0000\u0000\u0000\u02a3\u0299\u0001\u0000\u0000\u0000"+
		"\u02a3\u029f\u0001\u0000\u0000\u0000\u02a4\u02a7\u0001\u0000\u0000\u0000"+
		"\u02a5\u02a3\u0001\u0000\u0000\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000"+
		"\u02a6a\u0001\u0000\u0000\u0000\u02a7\u02a5\u0001\u0000\u0000\u0000\u02a8"+
		"\u02a9\u0007\u0007\u0000\u0000\u02a9c\u0001\u0000\u0000\u0000\u02aa\u02c1"+
		"\u0005-\u0000\u0000\u02ab\u02c1\u0005D\u0000\u0000\u02ac\u02c1\u0005E"+
		"\u0000\u0000\u02ad\u02c1\u0005F\u0000\u0000\u02ae\u02c1\u0005G\u0000\u0000"+
		"\u02af\u02c1\u0005K\u0000\u0000\u02b0\u02c1\u0005J\u0000\u0000\u02b1\u02c1"+
		"\u0005I\u0000\u0000\u02b2\u02c1\u0005L\u0000\u0000\u02b3\u02c1\u0005M"+
		"\u0000\u0000\u02b4\u02b5\u0005@\u0000\u0000\u02b5\u02b6\u0005@\u0000\u0000"+
		"\u02b6\u02c1\u0005-\u0000\u0000\u02b7\u02b8\u0005A\u0000\u0000\u02b8\u02b9"+
		"\u0005A\u0000\u0000\u02b9\u02c1\u0005-\u0000\u0000\u02ba\u02bb\u0005B"+
		"\u0000\u0000\u02bb\u02bc\u0005B\u0000\u0000\u02bc\u02c1\u0005-\u0000\u0000"+
		"\u02bd\u02be\u0005>\u0000\u0000\u02be\u02bf\u0005>\u0000\u0000\u02bf\u02c1"+
		"\u0005-\u0000\u0000\u02c0\u02aa\u0001\u0000\u0000\u0000\u02c0\u02ab\u0001"+
		"\u0000\u0000\u0000\u02c0\u02ac\u0001\u0000\u0000\u0000\u02c0\u02ad\u0001"+
		"\u0000\u0000\u0000\u02c0\u02ae\u0001\u0000\u0000\u0000\u02c0\u02af\u0001"+
		"\u0000\u0000\u0000\u02c0\u02b0\u0001\u0000\u0000\u0000\u02c0\u02b1\u0001"+
		"\u0000\u0000\u0000\u02c0\u02b2\u0001\u0000\u0000\u0000\u02c0\u02b3\u0001"+
		"\u0000\u0000\u0000\u02c0\u02b4\u0001\u0000\u0000\u0000\u02c0\u02b7\u0001"+
		"\u0000\u0000\u0000\u02c0\u02ba\u0001\u0000\u0000\u0000\u02c0\u02bd\u0001"+
		"\u0000\u0000\u0000\u02c1e\u0001\u0000\u0000\u0000\u02c2\u02c3\u0005/\u0000"+
		"\u0000\u02c3\u02db\u0005/\u0000\u0000\u02c4\u02c5\u0005_\u0000\u0000\u02c5"+
		"\u02db\u0005_\u0000\u0000\u02c6\u02db\u0005@\u0000\u0000\u02c7\u02db\u0005"+
		"B\u0000\u0000\u02c8\u02db\u0005A\u0000\u0000\u02c9\u02ca\u0005>\u0000"+
		"\u0000\u02ca\u02db\u0005>\u0000\u0000\u02cb\u02db\u0005>\u0000\u0000\u02cc"+
		"\u02db\u0005?\u0000\u0000\u02cd\u02db\u0005C\u0000\u0000\u02ce\u02db\u0005"+
		"<\u0000\u0000\u02cf\u02db\u0005=\u0000\u0000\u02d0\u02db\u0005/\u0000"+
		"\u0000\u02d1\u02db\u0005_\u0000\u0000\u02d2\u02db\u00055\u0000\u0000\u02d3"+
		"\u02db\u00056\u0000\u0000\u02d4\u02db\u00054\u0000\u0000\u02d5\u02db\u0005"+
		"7\u0000\u0000\u02d6\u02db\u00058\u0000\u0000\u02d7\u02db\u00059\u0000"+
		"\u0000\u02d8\u02d9\u0005B\u0000\u0000\u02d9\u02db\u0005B\u0000\u0000\u02da"+
		"\u02c2\u0001\u0000\u0000\u0000\u02da\u02c4\u0001\u0000\u0000\u0000\u02da"+
		"\u02c6\u0001\u0000\u0000\u0000\u02da\u02c7\u0001\u0000\u0000\u0000\u02da"+
		"\u02c8\u0001\u0000\u0000\u0000\u02da\u02c9\u0001\u0000\u0000\u0000\u02da"+
		"\u02cb\u0001\u0000\u0000\u0000\u02da\u02cc\u0001\u0000\u0000\u0000\u02da"+
		"\u02cd\u0001\u0000\u0000\u0000\u02da\u02ce\u0001\u0000\u0000\u0000\u02da"+
		"\u02cf\u0001\u0000\u0000\u0000\u02da\u02d0\u0001\u0000\u0000\u0000\u02da"+
		"\u02d1\u0001\u0000\u0000\u0000\u02da\u02d2\u0001\u0000\u0000\u0000\u02da"+
		"\u02d3\u0001\u0000\u0000\u0000\u02da\u02d4\u0001\u0000\u0000\u0000\u02da"+
		"\u02d5\u0001\u0000\u0000\u0000\u02da\u02d6\u0001\u0000\u0000\u0000\u02da"+
		"\u02d7\u0001\u0000\u0000\u0000\u02da\u02d8\u0001\u0000\u0000\u0000\u02db"+
		"g\u0001\u0000\u0000\u0000Flouw{\u0083\u008c\u0092\u0097\u009e\u00a4\u00ab"+
		"\u00b1\u00b7\u00be\u00c4\u00c8\u00cb\u00d2\u00d8\u00dd\u00e2\u00e6\u00f9"+
		"\u0106\u010b\u011c\u0124\u012e\u0134\u0139\u013f\u0145\u0148\u0174\u017f"+
		"\u0184\u018b\u0192\u01ab\u01b6\u01bb\u01c8\u01d5\u01dc\u01f0\u020c\u0214"+
		"\u0216\u021f\u0226\u022b\u0239\u0251\u0256\u025e\u0260\u026c\u026f\u0275"+
		"\u0283\u0287\u028b\u0290\u0295\u0297\u02a3\u02a5\u02c0\u02da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}