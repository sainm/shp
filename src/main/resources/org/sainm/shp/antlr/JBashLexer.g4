lexer grammar JBashLexer;

SKIP0 : ' ' -> skip ;
SKIP1 : '\t' -> skip ;
SKIP2 : '\r' -> skip ;
SKIP3 : '#' -> skip, mode(IN_LINE_COMMENT) ;
SEMICOLON : ';'  ;
DOUBLESEMICOLON : ';;'  ;
CRLF : '\n'  ;
PIPE : '|'  ;
AND : '&'  ;
DOUBLEAND : '&&'  ;
DOUBLEPIPE : '||'  ;
EQUAL : '='  ;
DOUBLEEQUAL : '=='  ;
DIFFERENT : '!='  ;
MINOR : '<'  ;
MAJOR : '>'  ;
MINEQ : '<='  ;
MAJEQ : '>='  ;
DOUBLEMIN : '<<'  ;
DOUBLEMAJ : '>>'  ;
PRODUCT : '*'  ;
DIVISION : '/'  ;
MODULE : '%'  ;
PLUS : '+'  ;
MIN : '-'  ;
BILL : '$'  ;
ESCL : '!'  ;
LBRACE : '{'  ;
RBRACE : '}'  ;
LTON : '('  ;
RTON : ')'  ;
DLTON : '(('  ;
DRTON : '))'  ;
APOS : '\''  ;
DOT : '.'  ;
IF : 'if'  ;
ELIF : 'elif'  ;
ELSE : 'else'  ;
FI : 'fi'  ;
FOR : 'for'  ;
DO : 'do'  ;
DONE : 'done'  ;
WHILE : 'while'  ;
UNTIL : 'until'  ;
SELECT : 'select'  ;
IN : 'in'  ;
CASE : 'case'  ;
ESAC : 'esac'  ;
FUNCTION : 'function'  ;
RETURN : 'return'  ;
THEN : 'then'  ;
BASH_VERSION : 'BASH_VERSION'  ;
ALIAS : 'alias'  ;
BREAK : 'break'  ;
CD : 'cd'  ;
COMMAND : 'command'  ;
DECLARE : 'declare'  ;
TYPESET : 'typeset'  ;
ECHO : 'echo'  ;
EXEC : 'exec'  ;
EXIT : 'exit'  ;
EXPORT : 'export'  ;
HELP : 'help'  ;
KILL : 'kill'  ;
SPTP : 'sptp'  ;
SUSPEND : 'suspend'  ;
TEST : 'test'  ;
TIMES : 'times'  ;
ULIMIT : 'ulimit'  ;
UMASK : 'umask'  ;
UNALIAS : 'unalias'  ;
UNSET : 'unset'  ;
WAIT : 'wait'  ;
NUMERO : [1-9] ([0-9])*  ;
NOME_VALIDO : LETTERA ((LETTERA | DIGIT))*  ;
fragment LETTERA : [_A-Za-z]  ;
fragment DIGIT : [0-9]  ;
STRINGA : APOS (~["\\\n\r'])* APOS  ;
DIRECTORY : (DIVISION | DOT) ([a-zA-Z0-9+\-/$_:@.])*  ;
ZERO : '0'  ;
PARAM : MIN ((P2 | P3 | P4 | P5 | P6 | P7 | P8 | P9 | P10 | P11 | P12 | P13 | P14 | P15 | P16 | P17 | P18 | P19 | P20 | P21 | P22 | P23 | P24 | P25 | P26 | P27 | P28 | P29 | P30 | P31 | P32 | P33 | P34 | P35 | P36 | P37 | P38 | P39 | P40 | P41))+  ;
fragment P2 : 'a'  ;
fragment P3 : 'o'  ;
fragment P4 : 'n'  ;
fragment P5 : 'z'  ;
fragment P6 : 'eq'  ;
fragment P7 : 'ge'  ;
fragment P8 : 'gt'  ;
fragment P9 : 'le'  ;
fragment P10 : 'ne'  ;
fragment P11 : 'ef'  ;
fragment P12 : 'nt'  ;
fragment P13 : 'ot'  ;
fragment P14 : 'b'  ;
fragment P15 : 'c'  ;
fragment P16 : 'd'  ;
fragment P17 : 'e'  ;
fragment P18 : 'f'  ;
fragment P19 : 'g'  ;
fragment P20 : 'h'  ;
fragment P21 : 'k'  ;
fragment P22 : 'L'  ;
fragment P23 : 'p'  ;
fragment P24 : 'r'  ;
fragment P25 : 's'  ;
fragment P26 : 'S'  ;
fragment P27 : 't'  ;
fragment P28 : 'u'  ;
fragment P29 : 'w'  ;
fragment P30 : 'x'  ;
fragment P31 : 'P'  ;
fragment P32 : 'v'  ;
fragment P33 : 'V'  ;
fragment P34 : 'F'  ;
fragment P35 : 'i'  ;
fragment P36 : 'E'  ;
fragment P37 : 'cl'  ;
fragment P38 : 'l'  ;
fragment P39 : 'H'  ;
fragment P40 : 'm'  ;
fragment P41 : 'q'  ;

mode IN_LINE_COMMENT;
SKIP4 : '\n' -> skip, mode(DEFAULT_MODE) ;
MORE0 : . -> more ;
