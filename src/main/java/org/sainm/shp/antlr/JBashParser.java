// Generated from D:/github/shp/src/main/resources/org/sainm/shp/antlr/JBashParser.g4 by ANTLR 4.13.1
package org.sainm.shp.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JBashParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SKIP0=1, SKIP1=2, SKIP2=3, SKIP3=4, SEMICOLON=5, DOUBLESEMICOLON=6, CRLF=7, 
		PIPE=8, AND=9, DOUBLEAND=10, DOUBLEPIPE=11, EQUAL=12, DOUBLEEQUAL=13, 
		DIFFERENT=14, MINOR=15, MAJOR=16, MINEQ=17, MAJEQ=18, DOUBLEMIN=19, DOUBLEMAJ=20, 
		PRODUCT=21, DIVISION=22, MODULE=23, PLUS=24, MIN=25, BILL=26, ESCL=27, 
		LBRACE=28, RBRACE=29, LTON=30, RTON=31, DLTON=32, DRTON=33, APOS=34, DOT=35, 
		IF=36, ELIF=37, ELSE=38, FI=39, FOR=40, DO=41, DONE=42, WHILE=43, UNTIL=44, 
		SELECT=45, IN=46, CASE=47, ESAC=48, FUNCTION=49, RETURN=50, THEN=51, BASH_VERSION=52, 
		ALIAS=53, BREAK=54, CD=55, COMMAND=56, DECLARE=57, TYPESET=58, ECHO=59, 
		EXEC=60, EXIT=61, EXPORT=62, HELP=63, KILL=64, SPTP=65, SUSPEND=66, TEST=67, 
		TIMES=68, ULIMIT=69, UMASK=70, UNALIAS=71, UNSET=72, WAIT=73, NUMERO=74, 
		NOME_VALIDO=75, STRINGA=76, DIRECTORY=77, ZERO=78, PARAM=79, SKIP4=80;
	public static final int
		RULE_script = 0, RULE_list = 1, RULE_in = 2, RULE_unitaryList = 3, RULE_control_block = 4, 
		RULE_separator = 5, RULE_expr_concat = 6, RULE_test_param = 7, RULE_op_conf = 8, 
		RULE_redirection_op = 9, RULE_operatore_alta_priorita = 10, RULE_expression = 11, 
		RULE_conditional_expr = 12, RULE_arithmetic_eval = 13, RULE_sub = 14, 
		RULE_formula = 15, RULE_alg = 16, RULE_terminale_alta_priorita = 17, RULE_select_statement = 18, 
		RULE_case_statement = 19, RULE_case_block = 20, RULE_case_tail = 21, RULE_if_statement = 22, 
		RULE_elif_substatement = 23, RULE_for_statement = 24, RULE_while_statement = 25, 
		RULE_until_statement = 26, RULE_statement_di_assegnamento = 27, RULE_function = 28, 
		RULE_redirection = 29, RULE_return_stm = 30, RULE_built_in_commands = 31, 
		RULE_bash_version = 32, RULE_alias_stm = 33, RULE_break_stm = 34, RULE_changedir_stm = 35, 
		RULE_command = 36, RULE_declare_stm = 37, RULE_echo_stm = 38, RULE_exec_stm = 39, 
		RULE_exit_stm = 40, RULE_export_stm = 41, RULE_help_stm = 42, RULE_kill_stm = 43, 
		RULE_suspend_stm = 44, RULE_test_expr_stm = 45, RULE_times_stm = 46, RULE_ulimit_stm = 47, 
		RULE_umask_stm = 48, RULE_unalias_stm = 49, RULE_unset_stm = 50, RULE_wait_stm = 51, 
		RULE_sptp_stm = 52;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "list", "in", "unitaryList", "control_block", "separator", 
			"expr_concat", "test_param", "op_conf", "redirection_op", "operatore_alta_priorita", 
			"expression", "conditional_expr", "arithmetic_eval", "sub", "formula", 
			"alg", "terminale_alta_priorita", "select_statement", "case_statement", 
			"case_block", "case_tail", "if_statement", "elif_substatement", "for_statement", 
			"while_statement", "until_statement", "statement_di_assegnamento", "function", 
			"redirection", "return_stm", "built_in_commands", "bash_version", "alias_stm", 
			"break_stm", "changedir_stm", "command", "declare_stm", "echo_stm", "exec_stm", 
			"exit_stm", "export_stm", "help_stm", "kill_stm", "suspend_stm", "test_expr_stm", 
			"times_stm", "ulimit_stm", "umask_stm", "unalias_stm", "unset_stm", "wait_stm", 
			"sptp_stm"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\\t'", "'\\r'", "'#'", "';'", "';;'", null, "'|'", "'&'", 
			"'&&'", "'||'", "'='", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", 
			"'<<'", "'>>'", "'*'", "'/'", "'%'", "'+'", "'-'", "'$'", "'!'", "'{'", 
			"'}'", "'('", "')'", "'(('", "'))'", "'''", "'.'", "'if'", "'elif'", 
			"'else'", "'fi'", "'for'", "'do'", "'done'", "'while'", "'until'", "'select'", 
			"'in'", "'case'", "'esac'", "'function'", "'return'", "'then'", "'BASH_VERSION'", 
			"'alias'", "'break'", "'cd'", "'command'", "'declare'", "'typeset'", 
			"'echo'", "'exec'", "'exit'", "'export'", "'help'", "'kill'", "'sptp'", 
			"'suspend'", "'test'", "'times'", "'ulimit'", "'umask'", "'unalias'", 
			"'unset'", "'wait'", null, null, null, null, "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SKIP0", "SKIP1", "SKIP2", "SKIP3", "SEMICOLON", "DOUBLESEMICOLON", 
			"CRLF", "PIPE", "AND", "DOUBLEAND", "DOUBLEPIPE", "EQUAL", "DOUBLEEQUAL", 
			"DIFFERENT", "MINOR", "MAJOR", "MINEQ", "MAJEQ", "DOUBLEMIN", "DOUBLEMAJ", 
			"PRODUCT", "DIVISION", "MODULE", "PLUS", "MIN", "BILL", "ESCL", "LBRACE", 
			"RBRACE", "LTON", "RTON", "DLTON", "DRTON", "APOS", "DOT", "IF", "ELIF", 
			"ELSE", "FI", "FOR", "DO", "DONE", "WHILE", "UNTIL", "SELECT", "IN", 
			"CASE", "ESAC", "FUNCTION", "RETURN", "THEN", "BASH_VERSION", "ALIAS", 
			"BREAK", "CD", "COMMAND", "DECLARE", "TYPESET", "ECHO", "EXEC", "EXIT", 
			"EXPORT", "HELP", "KILL", "SPTP", "SUSPEND", "TEST", "TIMES", "ULIMIT", 
			"UMASK", "UNALIAS", "UNSET", "WAIT", "NUMERO", "NOME_VALIDO", "STRINGA", 
			"DIRECTORY", "ZERO", "PARAM", "SKIP4"
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
	public String getGrammarFileName() { return "JBashParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JBashParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JBashParser.EOF, 0); }
		public List<TerminalNode> CRLF() { return getTokens(JBashParser.CRLF); }
		public TerminalNode CRLF(int i) {
			return getToken(JBashParser.CRLF, i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CRLF) {
				{
				{
				setState(106);
				match(CRLF);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			list();
			setState(113);
			match(EOF);
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
		public TerminalNode LBRACE() { return getToken(JBashParser.LBRACE, 0); }
		public InContext in() {
			return getRuleContext(InContext.class,0);
		}
		public TerminalNode LTON() { return getToken(JBashParser.LTON, 0); }
		public UnitaryListContext unitaryList() {
			return getRuleContext(UnitaryListContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(JBashParser.RBRACE, 0); }
		public TerminalNode RTON() { return getToken(JBashParser.RTON, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(115);
				match(LBRACE);
				setState(116);
				in();
				setState(118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(117);
					match(RBRACE);
					}
					break;
				}
				}
				break;
			case LTON:
				{
				setState(120);
				match(LTON);
				setState(121);
				in();
				setState(123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(122);
					match(RTON);
					}
					break;
				}
				}
				break;
			case EOF:
			case EQUAL:
			case DIFFERENT:
			case ESCL:
			case DLTON:
			case IF:
			case FOR:
			case WHILE:
			case UNTIL:
			case SELECT:
			case CASE:
			case FUNCTION:
			case RETURN:
			case BASH_VERSION:
			case ALIAS:
			case BREAK:
			case CD:
			case COMMAND:
			case DECLARE:
			case ECHO:
			case EXEC:
			case EXIT:
			case EXPORT:
			case HELP:
			case KILL:
			case SPTP:
			case SUSPEND:
			case TEST:
			case TIMES:
			case ULIMIT:
			case UMASK:
			case UNALIAS:
			case UNSET:
			case WAIT:
			case NOME_VALIDO:
			case STRINGA:
			case DIRECTORY:
			case PARAM:
				{
				setState(125);
				unitaryList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(128);
					separator();
					setState(129);
					list();
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
	public static class InContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JBashParser.EOF, 0); }
		public List<Built_in_commandsContext> built_in_commands() {
			return getRuleContexts(Built_in_commandsContext.class);
		}
		public Built_in_commandsContext built_in_commands(int i) {
			return getRuleContext(Built_in_commandsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Control_blockContext> control_block() {
			return getRuleContexts(Control_blockContext.class);
		}
		public Control_blockContext control_block(int i) {
			return getRuleContext(Control_blockContext.class,i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(JBashParser.SEMICOLON, 0); }
		public InContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InContext in() throws RecognitionException {
		InContext _localctx = new InContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_in);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
			case DIFFERENT:
			case ESCL:
			case DLTON:
			case IF:
			case FOR:
			case WHILE:
			case UNTIL:
			case SELECT:
			case CASE:
			case FUNCTION:
			case RETURN:
			case BASH_VERSION:
			case ALIAS:
			case BREAK:
			case CD:
			case COMMAND:
			case DECLARE:
			case ECHO:
			case EXEC:
			case EXIT:
			case EXPORT:
			case HELP:
			case KILL:
			case SPTP:
			case SUSPEND:
			case TEST:
			case TIMES:
			case ULIMIT:
			case UMASK:
			case UNALIAS:
			case UNSET:
			case WAIT:
			case NOME_VALIDO:
			case STRINGA:
			case DIRECTORY:
			case PARAM:
				{
				setState(139);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BASH_VERSION:
				case ALIAS:
				case BREAK:
				case CD:
				case COMMAND:
				case DECLARE:
				case ECHO:
				case EXEC:
				case EXIT:
				case EXPORT:
				case HELP:
				case KILL:
				case SPTP:
				case SUSPEND:
				case TEST:
				case TIMES:
				case ULIMIT:
				case UMASK:
				case UNALIAS:
				case UNSET:
				case WAIT:
					{
					setState(136);
					built_in_commands();
					}
					break;
				case EQUAL:
				case DIFFERENT:
				case ESCL:
				case DLTON:
				case STRINGA:
				case DIRECTORY:
				case PARAM:
					{
					setState(137);
					expression();
					}
					break;
				case IF:
				case FOR:
				case WHILE:
				case UNTIL:
				case SELECT:
				case CASE:
				case FUNCTION:
				case RETURN:
				case NOME_VALIDO:
					{
					setState(138);
					control_block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(141);
						separator();
						setState(145);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case BASH_VERSION:
						case ALIAS:
						case BREAK:
						case CD:
						case COMMAND:
						case DECLARE:
						case ECHO:
						case EXEC:
						case EXIT:
						case EXPORT:
						case HELP:
						case KILL:
						case SPTP:
						case SUSPEND:
						case TEST:
						case TIMES:
						case ULIMIT:
						case UMASK:
						case UNALIAS:
						case UNSET:
						case WAIT:
							{
							setState(142);
							built_in_commands();
							}
							break;
						case EQUAL:
						case DIFFERENT:
						case ESCL:
						case DLTON:
						case STRINGA:
						case DIRECTORY:
						case PARAM:
							{
							setState(143);
							expression();
							}
							break;
						case IF:
						case FOR:
						case WHILE:
						case UNTIL:
						case SELECT:
						case CASE:
						case FUNCTION:
						case RETURN:
						case NOME_VALIDO:
							{
							setState(144);
							control_block();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(151);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(152);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case EOF:
				{
				setState(155);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class UnitaryListContext extends ParserRuleContext {
		public Built_in_commandsContext built_in_commands() {
			return getRuleContext(Built_in_commandsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Control_blockContext control_block() {
			return getRuleContext(Control_blockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JBashParser.EOF, 0); }
		public UnitaryListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitaryList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterUnitaryList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitUnitaryList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitUnitaryList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitaryListContext unitaryList() throws RecognitionException {
		UnitaryListContext _localctx = new UnitaryListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unitaryList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASH_VERSION:
			case ALIAS:
			case BREAK:
			case CD:
			case COMMAND:
			case DECLARE:
			case ECHO:
			case EXEC:
			case EXIT:
			case EXPORT:
			case HELP:
			case KILL:
			case SPTP:
			case SUSPEND:
			case TEST:
			case TIMES:
			case ULIMIT:
			case UMASK:
			case UNALIAS:
			case UNSET:
			case WAIT:
				{
				setState(158);
				built_in_commands();
				}
				break;
			case EQUAL:
			case DIFFERENT:
			case ESCL:
			case DLTON:
			case STRINGA:
			case DIRECTORY:
			case PARAM:
				{
				setState(159);
				expression();
				}
				break;
			case IF:
			case FOR:
			case WHILE:
			case UNTIL:
			case SELECT:
			case CASE:
			case FUNCTION:
			case RETURN:
			case NOME_VALIDO:
				{
				setState(160);
				control_block();
				}
				break;
			case EOF:
				{
				setState(161);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Control_blockContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Until_statementContext until_statement() {
			return getRuleContext(Until_statementContext.class,0);
		}
		public Return_stmContext return_stm() {
			return getRuleContext(Return_stmContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Case_statementContext case_statement() {
			return getRuleContext(Case_statementContext.class,0);
		}
		public Control_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterControl_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitControl_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitControl_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Control_blockContext control_block() throws RecognitionException {
		Control_blockContext _localctx = new Control_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_control_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				{
				setState(164);
				if_statement();
				}
				break;
			case FOR:
				{
				setState(165);
				for_statement();
				}
				break;
			case WHILE:
				{
				setState(166);
				while_statement();
				}
				break;
			case UNTIL:
				{
				setState(167);
				until_statement();
				}
				break;
			case RETURN:
				{
				setState(168);
				return_stm();
				}
				break;
			case FUNCTION:
			case NOME_VALIDO:
				{
				setState(169);
				function();
				}
				break;
			case SELECT:
				{
				setState(170);
				select_statement();
				}
				break;
			case CASE:
				{
				setState(171);
				case_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class SeparatorContext extends ParserRuleContext {
		public TerminalNode PIPE() { return getToken(JBashParser.PIPE, 0); }
		public TerminalNode AND() { return getToken(JBashParser.AND, 0); }
		public TerminalNode DOUBLEPIPE() { return getToken(JBashParser.DOUBLEPIPE, 0); }
		public TerminalNode DOUBLEAND() { return getToken(JBashParser.DOUBLEAND, 0); }
		public TerminalNode SEMICOLON() { return getToken(JBashParser.SEMICOLON, 0); }
		public List<TerminalNode> CRLF() { return getTokens(JBashParser.CRLF); }
		public TerminalNode CRLF(int i) {
			return getToken(JBashParser.CRLF, i);
		}
		public SeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitSeparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitSeparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeparatorContext separator() throws RecognitionException {
		SeparatorContext _localctx = new SeparatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_separator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIPE:
				{
				setState(174);
				match(PIPE);
				}
				break;
			case AND:
				{
				setState(175);
				match(AND);
				}
				break;
			case DOUBLEPIPE:
				{
				setState(176);
				match(DOUBLEPIPE);
				}
				break;
			case DOUBLEAND:
				{
				setState(177);
				match(DOUBLEAND);
				}
				break;
			case SEMICOLON:
				{
				setState(178);
				match(SEMICOLON);
				}
				break;
			case CRLF:
				{
				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(179);
					match(CRLF);
					}
					}
					setState(182); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CRLF );
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Expr_concatContext extends ParserRuleContext {
		public TerminalNode DOUBLEPIPE() { return getToken(JBashParser.DOUBLEPIPE, 0); }
		public TerminalNode DOUBLEAND() { return getToken(JBashParser.DOUBLEAND, 0); }
		public Expr_concatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterExpr_concat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitExpr_concat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitExpr_concat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_concatContext expr_concat() throws RecognitionException {
		Expr_concatContext _localctx = new Expr_concatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr_concat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !(_la==DOUBLEAND || _la==DOUBLEPIPE) ) {
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
	public static class Test_paramContext extends ParserRuleContext {
		public TerminalNode ESCL() { return getToken(JBashParser.ESCL, 0); }
		public TerminalNode PARAM() { return getToken(JBashParser.PARAM, 0); }
		public Test_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterTest_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitTest_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitTest_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Test_paramContext test_param() throws RecognitionException {
		Test_paramContext _localctx = new Test_paramContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_test_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !(_la==ESCL || _la==PARAM) ) {
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
	public static class Op_confContext extends ParserRuleContext {
		public TerminalNode DOUBLEEQUAL() { return getToken(JBashParser.DOUBLEEQUAL, 0); }
		public TerminalNode DIFFERENT() { return getToken(JBashParser.DIFFERENT, 0); }
		public TerminalNode MINOR() { return getToken(JBashParser.MINOR, 0); }
		public TerminalNode MAJOR() { return getToken(JBashParser.MAJOR, 0); }
		public TerminalNode MINEQ() { return getToken(JBashParser.MINEQ, 0); }
		public TerminalNode MAJEQ() { return getToken(JBashParser.MAJEQ, 0); }
		public Op_confContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_conf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterOp_conf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitOp_conf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitOp_conf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_confContext op_conf() throws RecognitionException {
		Op_confContext _localctx = new Op_confContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_op_conf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 516096L) != 0)) ) {
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
	public static class Redirection_opContext extends ParserRuleContext {
		public TerminalNode MINOR() { return getToken(JBashParser.MINOR, 0); }
		public TerminalNode DOUBLEMIN() { return getToken(JBashParser.DOUBLEMIN, 0); }
		public TerminalNode MAJOR() { return getToken(JBashParser.MAJOR, 0); }
		public TerminalNode DOUBLEMAJ() { return getToken(JBashParser.DOUBLEMAJ, 0); }
		public Redirection_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redirection_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterRedirection_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitRedirection_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitRedirection_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Redirection_opContext redirection_op() throws RecognitionException {
		Redirection_opContext _localctx = new Redirection_opContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_redirection_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1671168L) != 0)) ) {
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
	public static class Operatore_alta_prioritaContext extends ParserRuleContext {
		public TerminalNode PRODUCT() { return getToken(JBashParser.PRODUCT, 0); }
		public TerminalNode DIVISION() { return getToken(JBashParser.DIVISION, 0); }
		public TerminalNode MODULE() { return getToken(JBashParser.MODULE, 0); }
		public Operatore_alta_prioritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatore_alta_priorita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterOperatore_alta_priorita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitOperatore_alta_priorita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitOperatore_alta_priorita(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operatore_alta_prioritaContext operatore_alta_priorita() throws RecognitionException {
		Operatore_alta_prioritaContext _localctx = new Operatore_alta_prioritaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operatore_alta_priorita);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) ) {
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
	public static class ExpressionContext extends ParserRuleContext {
		public Arithmetic_evalContext arithmetic_eval() {
			return getRuleContext(Arithmetic_evalContext.class,0);
		}
		public Conditional_exprContext conditional_expr() {
			return getRuleContext(Conditional_exprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DLTON:
				{
				setState(196);
				arithmetic_eval();
				}
				break;
			case EQUAL:
			case DIFFERENT:
			case ESCL:
			case STRINGA:
			case DIRECTORY:
			case PARAM:
				{
				setState(197);
				conditional_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Conditional_exprContext extends ParserRuleContext {
		public List<TerminalNode> STRINGA() { return getTokens(JBashParser.STRINGA); }
		public TerminalNode STRINGA(int i) {
			return getToken(JBashParser.STRINGA, i);
		}
		public Test_paramContext test_param() {
			return getRuleContext(Test_paramContext.class,0);
		}
		public List<TerminalNode> DIRECTORY() { return getTokens(JBashParser.DIRECTORY); }
		public TerminalNode DIRECTORY(int i) {
			return getToken(JBashParser.DIRECTORY, i);
		}
		public TerminalNode DIFFERENT() { return getToken(JBashParser.DIFFERENT, 0); }
		public TerminalNode EQUAL() { return getToken(JBashParser.EQUAL, 0); }
		public Conditional_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterConditional_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitConditional_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitConditional_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_exprContext conditional_expr() throws RecognitionException {
		Conditional_exprContext _localctx = new Conditional_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conditional_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRINGA) {
					{
					setState(200);
					match(STRINGA);
					}
				}

				setState(206);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ESCL:
				case PARAM:
					{
					setState(203);
					test_param();
					}
					break;
				case DIFFERENT:
					{
					setState(204);
					match(DIFFERENT);
					}
					break;
				case EQUAL:
					{
					setState(205);
					match(EQUAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(208);
				match(STRINGA);
				}
				break;
			case 2:
				{
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DIRECTORY) {
					{
					setState(209);
					match(DIRECTORY);
					}
				}

				setState(212);
				test_param();
				setState(213);
				match(DIRECTORY);
				}
				break;
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
	public static class Arithmetic_evalContext extends ParserRuleContext {
		public TerminalNode DLTON() { return getToken(JBashParser.DLTON, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public TerminalNode DRTON() { return getToken(JBashParser.DRTON, 0); }
		public Arithmetic_evalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterArithmetic_eval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitArithmetic_eval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitArithmetic_eval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_evalContext arithmetic_eval() throws RecognitionException {
		Arithmetic_evalContext _localctx = new Arithmetic_evalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arithmetic_eval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(DLTON);
			setState(218);
			formula();
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(219);
				sub();
				}
				break;
			}
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(222);
				match(DRTON);
				}
				break;
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
	public static class SubContext extends ParserRuleContext {
		public Expr_concatContext expr_concat() {
			return getRuleContext(Expr_concatContext.class,0);
		}
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			expr_concat();
			setState(226);
			formula();
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(227);
				sub();
				}
				break;
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
	public static class FormulaContext extends ParserRuleContext {
		public List<AlgContext> alg() {
			return getRuleContexts(AlgContext.class);
		}
		public AlgContext alg(int i) {
			return getRuleContext(AlgContext.class,i);
		}
		public List<TerminalNode> ESCL() { return getTokens(JBashParser.ESCL); }
		public TerminalNode ESCL(int i) {
			return getToken(JBashParser.ESCL, i);
		}
		public Op_confContext op_conf() {
			return getRuleContext(Op_confContext.class,0);
		}
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitFormula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(230);
				alg();
				}
				break;
			case 2:
				{
				setState(231);
				match(ESCL);
				setState(232);
				alg();
				}
				break;
			}
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(235);
				op_conf();
				setState(239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(236);
					alg();
					}
					break;
				case 2:
					{
					setState(237);
					match(ESCL);
					setState(238);
					alg();
					}
					break;
				}
				}
				break;
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
	public static class AlgContext extends ParserRuleContext {
		public List<Terminale_alta_prioritaContext> terminale_alta_priorita() {
			return getRuleContexts(Terminale_alta_prioritaContext.class);
		}
		public Terminale_alta_prioritaContext terminale_alta_priorita(int i) {
			return getRuleContext(Terminale_alta_prioritaContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(JBashParser.PLUS, 0); }
		public TerminalNode MIN() { return getToken(JBashParser.MIN, 0); }
		public AlgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterAlg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitAlg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitAlg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgContext alg() throws RecognitionException {
		AlgContext _localctx = new AlgContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_alg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			terminale_alta_priorita();
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(244);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MIN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(245);
				terminale_alta_priorita();
				}
				break;
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
	public static class Terminale_alta_prioritaContext extends ParserRuleContext {
		public TerminalNode MIN() { return getToken(JBashParser.MIN, 0); }
		public List<AlgContext> alg() {
			return getRuleContexts(AlgContext.class);
		}
		public AlgContext alg(int i) {
			return getRuleContext(AlgContext.class,i);
		}
		public TerminalNode LTON() { return getToken(JBashParser.LTON, 0); }
		public TerminalNode RTON() { return getToken(JBashParser.RTON, 0); }
		public Operatore_alta_prioritaContext operatore_alta_priorita() {
			return getRuleContext(Operatore_alta_prioritaContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(JBashParser.NUMERO, 0); }
		public Terminale_alta_prioritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminale_alta_priorita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterTerminale_alta_priorita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitTerminale_alta_priorita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitTerminale_alta_priorita(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Terminale_alta_prioritaContext terminale_alta_priorita() throws RecognitionException {
		Terminale_alta_prioritaContext _localctx = new Terminale_alta_prioritaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_terminale_alta_priorita);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(248);
				match(MIN);
				setState(249);
				alg();
				}
				break;
			case 2:
				{
				setState(250);
				match(LTON);
				setState(251);
				alg();
				setState(253);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(252);
					match(RTON);
					}
					break;
				}
				setState(258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(255);
					operatore_alta_priorita();
					setState(256);
					alg();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMERO) {
					{
					setState(260);
					match(NUMERO);
					}
				}

				setState(266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(263);
					operatore_alta_priorita();
					setState(264);
					alg();
					}
					break;
				}
				}
				break;
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
	public static class Select_statementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(JBashParser.SELECT, 0); }
		public List<TerminalNode> NOME_VALIDO() { return getTokens(JBashParser.NOME_VALIDO); }
		public TerminalNode NOME_VALIDO(int i) {
			return getToken(JBashParser.NOME_VALIDO, i);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode IN() { return getToken(JBashParser.IN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(JBashParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(JBashParser.SEMICOLON, i);
		}
		public TerminalNode DO() { return getToken(JBashParser.DO, 0); }
		public TerminalNode DONE() { return getToken(JBashParser.DONE, 0); }
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterSelect_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitSelect_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitSelect_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_select_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(SELECT);
			setState(271);
			match(NOME_VALIDO);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(272);
				match(IN);
				setState(274); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(273);
						match(NOME_VALIDO);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(276); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(280);
				match(SEMICOLON);
				}
			}

			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DO) {
				{
				setState(283);
				match(DO);
				}
			}

			setState(286);
			list();
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(287);
				match(SEMICOLON);
				}
				break;
			}
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(290);
				match(DONE);
				}
				break;
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
	public static class Case_statementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(JBashParser.CASE, 0); }
		public TerminalNode BILL() { return getToken(JBashParser.BILL, 0); }
		public TerminalNode NOME_VALIDO() { return getToken(JBashParser.NOME_VALIDO, 0); }
		public TerminalNode IN() { return getToken(JBashParser.IN, 0); }
		public List<Case_blockContext> case_block() {
			return getRuleContexts(Case_blockContext.class);
		}
		public Case_blockContext case_block(int i) {
			return getRuleContext(Case_blockContext.class,i);
		}
		public TerminalNode ESAC() { return getToken(JBashParser.ESAC, 0); }
		public Case_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterCase_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitCase_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitCase_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_statementContext case_statement() throws RecognitionException {
		Case_statementContext _localctx = new Case_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_case_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(CASE);
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BILL:
				{
				setState(294);
				match(BILL);
				setState(295);
				match(NOME_VALIDO);
				}
				break;
			case NOME_VALIDO:
				{
				setState(296);
				match(NOME_VALIDO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(299);
				match(IN);
				}
			}

			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(302);
					case_block();
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(308);
				match(ESAC);
				}
				break;
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
	public static class Case_blockContext extends ParserRuleContext {
		public TerminalNode NOME_VALIDO() { return getToken(JBashParser.NOME_VALIDO, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode LTON() { return getToken(JBashParser.LTON, 0); }
		public Case_tailContext case_tail() {
			return getRuleContext(Case_tailContext.class,0);
		}
		public TerminalNode RTON() { return getToken(JBashParser.RTON, 0); }
		public TerminalNode DOUBLESEMICOLON() { return getToken(JBashParser.DOUBLESEMICOLON, 0); }
		public Case_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterCase_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitCase_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitCase_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_blockContext case_block() throws RecognitionException {
		Case_blockContext _localctx = new Case_blockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_case_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LTON) {
				{
				setState(311);
				match(LTON);
				}
			}

			setState(314);
			match(NOME_VALIDO);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PIPE) {
				{
				setState(315);
				case_tail();
				}
			}

			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RTON) {
				{
				setState(318);
				match(RTON);
				}
			}

			setState(321);
			list();
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(322);
				match(DOUBLESEMICOLON);
				}
				break;
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
	public static class Case_tailContext extends ParserRuleContext {
		public TerminalNode PIPE() { return getToken(JBashParser.PIPE, 0); }
		public TerminalNode NOME_VALIDO() { return getToken(JBashParser.NOME_VALIDO, 0); }
		public Case_tailContext case_tail() {
			return getRuleContext(Case_tailContext.class,0);
		}
		public Case_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterCase_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitCase_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitCase_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_tailContext case_tail() throws RecognitionException {
		Case_tailContext _localctx = new Case_tailContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_case_tail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(PIPE);
			setState(326);
			match(NOME_VALIDO);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PIPE) {
				{
				setState(327);
				case_tail();
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
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JBashParser.IF, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public TerminalNode THEN() { return getToken(JBashParser.THEN, 0); }
		public Elif_substatementContext elif_substatement() {
			return getRuleContext(Elif_substatementContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(JBashParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(JBashParser.FI, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(IF);
			setState(331);
			list();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(332);
				match(THEN);
				}
			}

			setState(335);
			list();
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(336);
				elif_substatement();
				}
				break;
			}
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(339);
				match(ELSE);
				setState(340);
				list();
				}
				break;
			}
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(343);
				match(FI);
				}
				break;
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
	public static class Elif_substatementContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(JBashParser.ELIF, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public TerminalNode THEN() { return getToken(JBashParser.THEN, 0); }
		public Elif_substatementContext elif_substatement() {
			return getRuleContext(Elif_substatementContext.class,0);
		}
		public Elif_substatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_substatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterElif_substatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitElif_substatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitElif_substatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_substatementContext elif_substatement() throws RecognitionException {
		Elif_substatementContext _localctx = new Elif_substatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_elif_substatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(ELIF);
			setState(347);
			list();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(348);
				match(THEN);
				}
			}

			setState(351);
			list();
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(352);
				elif_substatement();
				}
				break;
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
	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JBashParser.FOR, 0); }
		public TerminalNode DLTON() { return getToken(JBashParser.DLTON, 0); }
		public TerminalNode DRTON() { return getToken(JBashParser.DRTON, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(JBashParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(JBashParser.SEMICOLON, i);
		}
		public TerminalNode DO() { return getToken(JBashParser.DO, 0); }
		public TerminalNode DONE() { return getToken(JBashParser.DONE, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(FOR);
			setState(356);
			match(DLTON);
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(357);
				expression();
				}
				break;
			}
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(360);
				match(SEMICOLON);
				}
				break;
			}
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(363);
				expression();
				}
				break;
			}
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(366);
				match(SEMICOLON);
				}
			}

			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4429205504L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 11L) != 0)) {
				{
				setState(369);
				expression();
				}
			}

			setState(372);
			match(DRTON);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DO) {
				{
				setState(373);
				match(DO);
				}
			}

			setState(376);
			list();
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(377);
				match(DONE);
				}
				break;
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
	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JBashParser.WHILE, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public TerminalNode DO() { return getToken(JBashParser.DO, 0); }
		public TerminalNode DONE() { return getToken(JBashParser.DONE, 0); }
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(WHILE);
			setState(381);
			list();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DO) {
				{
				setState(382);
				match(DO);
				}
			}

			setState(385);
			list();
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(386);
				match(DONE);
				}
				break;
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
	public static class Until_statementContext extends ParserRuleContext {
		public TerminalNode UNTIL() { return getToken(JBashParser.UNTIL, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public TerminalNode DO() { return getToken(JBashParser.DO, 0); }
		public TerminalNode DONE() { return getToken(JBashParser.DONE, 0); }
		public Until_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_until_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterUntil_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitUntil_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitUntil_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Until_statementContext until_statement() throws RecognitionException {
		Until_statementContext _localctx = new Until_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_until_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(UNTIL);
			setState(390);
			list();
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DO) {
				{
				setState(391);
				match(DO);
				}
			}

			setState(394);
			list();
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(395);
				match(DONE);
				}
				break;
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
	public static class Statement_di_assegnamentoContext extends ParserRuleContext {
		public List<TerminalNode> NOME_VALIDO() { return getTokens(JBashParser.NOME_VALIDO); }
		public TerminalNode NOME_VALIDO(int i) {
			return getToken(JBashParser.NOME_VALIDO, i);
		}
		public TerminalNode EQUAL() { return getToken(JBashParser.EQUAL, 0); }
		public Arithmetic_evalContext arithmetic_eval() {
			return getRuleContext(Arithmetic_evalContext.class,0);
		}
		public TerminalNode STRINGA() { return getToken(JBashParser.STRINGA, 0); }
		public TerminalNode BILL() { return getToken(JBashParser.BILL, 0); }
		public Statement_di_assegnamentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_di_assegnamento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterStatement_di_assegnamento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitStatement_di_assegnamento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitStatement_di_assegnamento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_di_assegnamentoContext statement_di_assegnamento() throws RecognitionException {
		Statement_di_assegnamentoContext _localctx = new Statement_di_assegnamentoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statement_di_assegnamento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(NOME_VALIDO);
			setState(399);
			match(EQUAL);
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(400);
				match(NOME_VALIDO);
				}
				break;
			case 2:
				{
				setState(401);
				arithmetic_eval();
				}
				break;
			case 3:
				{
				setState(402);
				match(STRINGA);
				}
				break;
			case 4:
				{
				setState(403);
				match(BILL);
				setState(404);
				match(NOME_VALIDO);
				}
				break;
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode NOME_VALIDO() { return getToken(JBashParser.NOME_VALIDO, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(JBashParser.FUNCTION, 0); }
		public TerminalNode LTON() { return getToken(JBashParser.LTON, 0); }
		public TerminalNode RTON() { return getToken(JBashParser.RTON, 0); }
		public RedirectionContext redirection() {
			return getRuleContext(RedirectionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(407);
				match(FUNCTION);
				}
			}

			setState(410);
			match(NOME_VALIDO);
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(411);
				match(LTON);
				}
				break;
			}
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RTON) {
				{
				setState(414);
				match(RTON);
				}
			}

			setState(417);
			list();
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(418);
				redirection();
				}
				break;
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
	public static class RedirectionContext extends ParserRuleContext {
		public Redirection_opContext redirection_op() {
			return getRuleContext(Redirection_opContext.class,0);
		}
		public TerminalNode DIRECTORY() { return getToken(JBashParser.DIRECTORY, 0); }
		public RedirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redirection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterRedirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitRedirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitRedirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RedirectionContext redirection() throws RecognitionException {
		RedirectionContext _localctx = new RedirectionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_redirection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			redirection_op();
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(422);
				match(DIRECTORY);
				}
				break;
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
	public static class Return_stmContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JBashParser.RETURN, 0); }
		public TerminalNode NUMERO() { return getToken(JBashParser.NUMERO, 0); }
		public TerminalNode ZERO() { return getToken(JBashParser.ZERO, 0); }
		public Return_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterReturn_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitReturn_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitReturn_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmContext return_stm() throws RecognitionException {
		Return_stmContext _localctx = new Return_stmContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_return_stm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(RETURN);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMERO || _la==ZERO) {
				{
				setState(426);
				_la = _input.LA(1);
				if ( !(_la==NUMERO || _la==ZERO) ) {
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
	public static class Built_in_commandsContext extends ParserRuleContext {
		public Bash_versionContext bash_version() {
			return getRuleContext(Bash_versionContext.class,0);
		}
		public Alias_stmContext alias_stm() {
			return getRuleContext(Alias_stmContext.class,0);
		}
		public Break_stmContext break_stm() {
			return getRuleContext(Break_stmContext.class,0);
		}
		public Changedir_stmContext changedir_stm() {
			return getRuleContext(Changedir_stmContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public Declare_stmContext declare_stm() {
			return getRuleContext(Declare_stmContext.class,0);
		}
		public Echo_stmContext echo_stm() {
			return getRuleContext(Echo_stmContext.class,0);
		}
		public Exec_stmContext exec_stm() {
			return getRuleContext(Exec_stmContext.class,0);
		}
		public Exit_stmContext exit_stm() {
			return getRuleContext(Exit_stmContext.class,0);
		}
		public Export_stmContext export_stm() {
			return getRuleContext(Export_stmContext.class,0);
		}
		public Help_stmContext help_stm() {
			return getRuleContext(Help_stmContext.class,0);
		}
		public Kill_stmContext kill_stm() {
			return getRuleContext(Kill_stmContext.class,0);
		}
		public Suspend_stmContext suspend_stm() {
			return getRuleContext(Suspend_stmContext.class,0);
		}
		public Test_expr_stmContext test_expr_stm() {
			return getRuleContext(Test_expr_stmContext.class,0);
		}
		public Times_stmContext times_stm() {
			return getRuleContext(Times_stmContext.class,0);
		}
		public Ulimit_stmContext ulimit_stm() {
			return getRuleContext(Ulimit_stmContext.class,0);
		}
		public Umask_stmContext umask_stm() {
			return getRuleContext(Umask_stmContext.class,0);
		}
		public Unalias_stmContext unalias_stm() {
			return getRuleContext(Unalias_stmContext.class,0);
		}
		public Unset_stmContext unset_stm() {
			return getRuleContext(Unset_stmContext.class,0);
		}
		public Wait_stmContext wait_stm() {
			return getRuleContext(Wait_stmContext.class,0);
		}
		public Sptp_stmContext sptp_stm() {
			return getRuleContext(Sptp_stmContext.class,0);
		}
		public Built_in_commandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_built_in_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterBuilt_in_commands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitBuilt_in_commands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitBuilt_in_commands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Built_in_commandsContext built_in_commands() throws RecognitionException {
		Built_in_commandsContext _localctx = new Built_in_commandsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_built_in_commands);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASH_VERSION:
				{
				setState(429);
				bash_version();
				}
				break;
			case ALIAS:
				{
				setState(430);
				alias_stm();
				}
				break;
			case BREAK:
				{
				setState(431);
				break_stm();
				}
				break;
			case CD:
				{
				setState(432);
				changedir_stm();
				}
				break;
			case COMMAND:
				{
				setState(433);
				command();
				}
				break;
			case DECLARE:
				{
				setState(434);
				declare_stm();
				}
				break;
			case ECHO:
				{
				setState(435);
				echo_stm();
				}
				break;
			case EXEC:
				{
				setState(436);
				exec_stm();
				}
				break;
			case EXIT:
				{
				setState(437);
				exit_stm();
				}
				break;
			case EXPORT:
				{
				setState(438);
				export_stm();
				}
				break;
			case HELP:
				{
				setState(439);
				help_stm();
				}
				break;
			case KILL:
				{
				setState(440);
				kill_stm();
				}
				break;
			case SUSPEND:
				{
				setState(441);
				suspend_stm();
				}
				break;
			case TEST:
				{
				setState(442);
				test_expr_stm();
				}
				break;
			case TIMES:
				{
				setState(443);
				times_stm();
				}
				break;
			case ULIMIT:
				{
				setState(444);
				ulimit_stm();
				}
				break;
			case UMASK:
				{
				setState(445);
				umask_stm();
				}
				break;
			case UNALIAS:
				{
				setState(446);
				unalias_stm();
				}
				break;
			case UNSET:
				{
				setState(447);
				unset_stm();
				}
				break;
			case WAIT:
				{
				setState(448);
				wait_stm();
				}
				break;
			case SPTP:
				{
				setState(449);
				sptp_stm();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Bash_versionContext extends ParserRuleContext {
		public TerminalNode BASH_VERSION() { return getToken(JBashParser.BASH_VERSION, 0); }
		public Bash_versionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bash_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterBash_version(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitBash_version(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitBash_version(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bash_versionContext bash_version() throws RecognitionException {
		Bash_versionContext _localctx = new Bash_versionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_bash_version);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(BASH_VERSION);
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
	public static class Alias_stmContext extends ParserRuleContext {
		public TerminalNode ALIAS() { return getToken(JBashParser.ALIAS, 0); }
		public TerminalNode PARAM() { return getToken(JBashParser.PARAM, 0); }
		public Statement_di_assegnamentoContext statement_di_assegnamento() {
			return getRuleContext(Statement_di_assegnamentoContext.class,0);
		}
		public Alias_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterAlias_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitAlias_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitAlias_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alias_stmContext alias_stm() throws RecognitionException {
		Alias_stmContext _localctx = new Alias_stmContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_alias_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(ALIAS);
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(455);
				match(PARAM);
				}
				break;
			}
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(458);
				statement_di_assegnamento();
				}
				break;
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
	public static class Break_stmContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(JBashParser.BREAK, 0); }
		public TerminalNode NUMERO() { return getToken(JBashParser.NUMERO, 0); }
		public TerminalNode ZERO() { return getToken(JBashParser.ZERO, 0); }
		public Break_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterBreak_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitBreak_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitBreak_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmContext break_stm() throws RecognitionException {
		Break_stmContext _localctx = new Break_stmContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_break_stm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(BREAK);
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMERO || _la==ZERO) {
				{
				setState(462);
				_la = _input.LA(1);
				if ( !(_la==NUMERO || _la==ZERO) ) {
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
	public static class Changedir_stmContext extends ParserRuleContext {
		public TerminalNode CD() { return getToken(JBashParser.CD, 0); }
		public TerminalNode PARAM() { return getToken(JBashParser.PARAM, 0); }
		public TerminalNode DIRECTORY() { return getToken(JBashParser.DIRECTORY, 0); }
		public Changedir_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changedir_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterChangedir_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitChangedir_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitChangedir_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Changedir_stmContext changedir_stm() throws RecognitionException {
		Changedir_stmContext _localctx = new Changedir_stmContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_changedir_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(CD);
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(466);
				match(PARAM);
				}
				break;
			}
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(469);
				match(DIRECTORY);
				}
				break;
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
	public static class CommandContext extends ParserRuleContext {
		public TerminalNode COMMAND() { return getToken(JBashParser.COMMAND, 0); }
		public List<TerminalNode> PARAM() { return getTokens(JBashParser.PARAM); }
		public TerminalNode PARAM(int i) {
			return getToken(JBashParser.PARAM, i);
		}
		public Built_in_commandsContext built_in_commands() {
			return getRuleContext(Built_in_commandsContext.class,0);
		}
		public TerminalNode NOME_VALIDO() { return getToken(JBashParser.NOME_VALIDO, 0); }
		public TerminalNode DIRECTORY() { return getToken(JBashParser.DIRECTORY, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_command);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(COMMAND);
			setState(476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(473);
					match(PARAM);
					}
					} 
				}
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(479);
				built_in_commands();
				}
				break;
			case 2:
				{
				setState(480);
				match(NOME_VALIDO);
				}
				break;
			case 3:
				{
				setState(481);
				match(DIRECTORY);
				}
				break;
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
	public static class Declare_stmContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(JBashParser.DECLARE, 0); }
		public List<TerminalNode> PARAM() { return getTokens(JBashParser.PARAM); }
		public TerminalNode PARAM(int i) {
			return getToken(JBashParser.PARAM, i);
		}
		public Statement_di_assegnamentoContext statement_di_assegnamento() {
			return getRuleContext(Statement_di_assegnamentoContext.class,0);
		}
		public Declare_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterDeclare_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitDeclare_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitDeclare_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_stmContext declare_stm() throws RecognitionException {
		Declare_stmContext _localctx = new Declare_stmContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_declare_stm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(DECLARE);
			setState(488);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(485);
					match(PARAM);
					}
					} 
				}
				setState(490);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(491);
				statement_di_assegnamento();
				}
				break;
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
	public static class Echo_stmContext extends ParserRuleContext {
		public TerminalNode ECHO() { return getToken(JBashParser.ECHO, 0); }
		public List<TerminalNode> PARAM() { return getTokens(JBashParser.PARAM); }
		public TerminalNode PARAM(int i) {
			return getToken(JBashParser.PARAM, i);
		}
		public TerminalNode STRINGA() { return getToken(JBashParser.STRINGA, 0); }
		public TerminalNode BILL() { return getToken(JBashParser.BILL, 0); }
		public TerminalNode NOME_VALIDO() { return getToken(JBashParser.NOME_VALIDO, 0); }
		public Echo_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_echo_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterEcho_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitEcho_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitEcho_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Echo_stmContext echo_stm() throws RecognitionException {
		Echo_stmContext _localctx = new Echo_stmContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_echo_stm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(ECHO);
			setState(498);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(495);
					match(PARAM);
					}
					} 
				}
				setState(500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(501);
				match(STRINGA);
				}
				break;
			case 2:
				{
				setState(502);
				match(BILL);
				setState(503);
				match(NOME_VALIDO);
				}
				break;
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
	public static class Exec_stmContext extends ParserRuleContext {
		public TerminalNode EXEC() { return getToken(JBashParser.EXEC, 0); }
		public List<TerminalNode> PARAM() { return getTokens(JBashParser.PARAM); }
		public TerminalNode PARAM(int i) {
			return getToken(JBashParser.PARAM, i);
		}
		public List<TerminalNode> NOME_VALIDO() { return getTokens(JBashParser.NOME_VALIDO); }
		public TerminalNode NOME_VALIDO(int i) {
			return getToken(JBashParser.NOME_VALIDO, i);
		}
		public Built_in_commandsContext built_in_commands() {
			return getRuleContext(Built_in_commandsContext.class,0);
		}
		public TerminalNode DIRECTORY() { return getToken(JBashParser.DIRECTORY, 0); }
		public Exec_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exec_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterExec_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitExec_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitExec_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exec_stmContext exec_stm() throws RecognitionException {
		Exec_stmContext _localctx = new Exec_stmContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_exec_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(EXEC);
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(507);
				match(PARAM);
				}
				break;
			}
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(510);
				match(PARAM);
				setState(511);
				match(NOME_VALIDO);
				}
				break;
			}
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(514);
				built_in_commands();
				}
				break;
			case 2:
				{
				setState(515);
				match(NOME_VALIDO);
				}
				break;
			case 3:
				{
				setState(516);
				match(DIRECTORY);
				}
				break;
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
	public static class Exit_stmContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(JBashParser.EXIT, 0); }
		public TerminalNode NUMERO() { return getToken(JBashParser.NUMERO, 0); }
		public TerminalNode ZERO() { return getToken(JBashParser.ZERO, 0); }
		public Exit_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterExit_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitExit_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitExit_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exit_stmContext exit_stm() throws RecognitionException {
		Exit_stmContext _localctx = new Exit_stmContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_exit_stm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(EXIT);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMERO || _la==ZERO) {
				{
				setState(520);
				_la = _input.LA(1);
				if ( !(_la==NUMERO || _la==ZERO) ) {
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
	public static class Export_stmContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(JBashParser.EXPORT, 0); }
		public TerminalNode NOME_VALIDO() { return getToken(JBashParser.NOME_VALIDO, 0); }
		public List<TerminalNode> PARAM() { return getTokens(JBashParser.PARAM); }
		public TerminalNode PARAM(int i) {
			return getToken(JBashParser.PARAM, i);
		}
		public TerminalNode EQUAL() { return getToken(JBashParser.EQUAL, 0); }
		public TerminalNode STRINGA() { return getToken(JBashParser.STRINGA, 0); }
		public TerminalNode DIRECTORY() { return getToken(JBashParser.DIRECTORY, 0); }
		public Export_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterExport_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitExport_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitExport_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Export_stmContext export_stm() throws RecognitionException {
		Export_stmContext _localctx = new Export_stmContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_export_stm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(EXPORT);
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PARAM) {
				{
				{
				setState(524);
				match(PARAM);
				}
				}
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(530);
			match(NOME_VALIDO);
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(531);
				match(EQUAL);
				setState(532);
				_la = _input.LA(1);
				if ( !(_la==STRINGA || _la==DIRECTORY) ) {
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
	public static class Help_stmContext extends ParserRuleContext {
		public TerminalNode HELP() { return getToken(JBashParser.HELP, 0); }
		public TerminalNode PARAM() { return getToken(JBashParser.PARAM, 0); }
		public Built_in_commandsContext built_in_commands() {
			return getRuleContext(Built_in_commandsContext.class,0);
		}
		public TerminalNode NOME_VALIDO() { return getToken(JBashParser.NOME_VALIDO, 0); }
		public Help_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_help_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterHelp_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitHelp_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitHelp_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Help_stmContext help_stm() throws RecognitionException {
		Help_stmContext _localctx = new Help_stmContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_help_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(HELP);
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(536);
				match(PARAM);
				}
				break;
			}
			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(539);
				built_in_commands();
				}
				break;
			case 2:
				{
				setState(540);
				match(NOME_VALIDO);
				}
				break;
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
	public static class Kill_stmContext extends ParserRuleContext {
		public TerminalNode KILL() { return getToken(JBashParser.KILL, 0); }
		public TerminalNode PARAM() { return getToken(JBashParser.PARAM, 0); }
		public List<TerminalNode> NUMERO() { return getTokens(JBashParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(JBashParser.NUMERO, i);
		}
		public TerminalNode ZERO() { return getToken(JBashParser.ZERO, 0); }
		public Kill_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kill_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterKill_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitKill_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitKill_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kill_stmContext kill_stm() throws RecognitionException {
		Kill_stmContext _localctx = new Kill_stmContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_kill_stm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(KILL);
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(544);
				match(PARAM);
				setState(545);
				match(NUMERO);
				}
				break;
			}
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMERO || _la==ZERO) {
				{
				setState(548);
				_la = _input.LA(1);
				if ( !(_la==NUMERO || _la==ZERO) ) {
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
	public static class Suspend_stmContext extends ParserRuleContext {
		public TerminalNode SUSPEND() { return getToken(JBashParser.SUSPEND, 0); }
		public TerminalNode PARAM() { return getToken(JBashParser.PARAM, 0); }
		public Suspend_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suspend_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterSuspend_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitSuspend_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitSuspend_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Suspend_stmContext suspend_stm() throws RecognitionException {
		Suspend_stmContext _localctx = new Suspend_stmContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_suspend_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(SUSPEND);
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(552);
				match(PARAM);
				}
				break;
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
	public static class Test_expr_stmContext extends ParserRuleContext {
		public TerminalNode TEST() { return getToken(JBashParser.TEST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Test_expr_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test_expr_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterTest_expr_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitTest_expr_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitTest_expr_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Test_expr_stmContext test_expr_stm() throws RecognitionException {
		Test_expr_stmContext _localctx = new Test_expr_stmContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_test_expr_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(TEST);
			setState(556);
			expression();
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
	public static class Times_stmContext extends ParserRuleContext {
		public TerminalNode TIMES() { return getToken(JBashParser.TIMES, 0); }
		public Times_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_times_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterTimes_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitTimes_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitTimes_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Times_stmContext times_stm() throws RecognitionException {
		Times_stmContext _localctx = new Times_stmContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_times_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(TIMES);
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
	public static class Ulimit_stmContext extends ParserRuleContext {
		public TerminalNode ULIMIT() { return getToken(JBashParser.ULIMIT, 0); }
		public TerminalNode PARAM() { return getToken(JBashParser.PARAM, 0); }
		public TerminalNode NUMERO() { return getToken(JBashParser.NUMERO, 0); }
		public TerminalNode ZERO() { return getToken(JBashParser.ZERO, 0); }
		public Ulimit_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ulimit_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterUlimit_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitUlimit_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitUlimit_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ulimit_stmContext ulimit_stm() throws RecognitionException {
		Ulimit_stmContext _localctx = new Ulimit_stmContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_ulimit_stm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(ULIMIT);
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(561);
				match(PARAM);
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMERO || _la==ZERO) {
					{
					setState(562);
					_la = _input.LA(1);
					if ( !(_la==NUMERO || _la==ZERO) ) {
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
				break;
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
	public static class Umask_stmContext extends ParserRuleContext {
		public TerminalNode UMASK() { return getToken(JBashParser.UMASK, 0); }
		public TerminalNode PARAM() { return getToken(JBashParser.PARAM, 0); }
		public TerminalNode NUMERO() { return getToken(JBashParser.NUMERO, 0); }
		public TerminalNode ZERO() { return getToken(JBashParser.ZERO, 0); }
		public Umask_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_umask_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterUmask_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitUmask_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitUmask_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Umask_stmContext umask_stm() throws RecognitionException {
		Umask_stmContext _localctx = new Umask_stmContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_umask_stm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(UMASK);
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(568);
				match(PARAM);
				}
				break;
			}
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMERO || _la==ZERO) {
				{
				setState(571);
				_la = _input.LA(1);
				if ( !(_la==NUMERO || _la==ZERO) ) {
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
	public static class Unalias_stmContext extends ParserRuleContext {
		public TerminalNode UNALIAS() { return getToken(JBashParser.UNALIAS, 0); }
		public TerminalNode PARAM() { return getToken(JBashParser.PARAM, 0); }
		public TerminalNode NOME_VALIDO() { return getToken(JBashParser.NOME_VALIDO, 0); }
		public Unalias_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unalias_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterUnalias_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitUnalias_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitUnalias_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unalias_stmContext unalias_stm() throws RecognitionException {
		Unalias_stmContext _localctx = new Unalias_stmContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_unalias_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(UNALIAS);
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(575);
				match(PARAM);
				}
				break;
			}
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(578);
				match(NOME_VALIDO);
				}
				break;
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
	public static class Unset_stmContext extends ParserRuleContext {
		public TerminalNode UNSET() { return getToken(JBashParser.UNSET, 0); }
		public TerminalNode PARAM() { return getToken(JBashParser.PARAM, 0); }
		public TerminalNode NOME_VALIDO() { return getToken(JBashParser.NOME_VALIDO, 0); }
		public Unset_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unset_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterUnset_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitUnset_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitUnset_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unset_stmContext unset_stm() throws RecognitionException {
		Unset_stmContext _localctx = new Unset_stmContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_unset_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(UNSET);
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(582);
				match(PARAM);
				}
				break;
			}
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(585);
				match(NOME_VALIDO);
				}
				break;
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
	public static class Wait_stmContext extends ParserRuleContext {
		public TerminalNode WAIT() { return getToken(JBashParser.WAIT, 0); }
		public TerminalNode NUMERO() { return getToken(JBashParser.NUMERO, 0); }
		public TerminalNode ZERO() { return getToken(JBashParser.ZERO, 0); }
		public Wait_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wait_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterWait_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitWait_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitWait_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wait_stmContext wait_stm() throws RecognitionException {
		Wait_stmContext _localctx = new Wait_stmContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_wait_stm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(WAIT);
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMERO || _la==ZERO) {
				{
				setState(589);
				_la = _input.LA(1);
				if ( !(_la==NUMERO || _la==ZERO) ) {
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
	public static class Sptp_stmContext extends ParserRuleContext {
		public TerminalNode SPTP() { return getToken(JBashParser.SPTP, 0); }
		public TerminalNode PARAM() { return getToken(JBashParser.PARAM, 0); }
		public TerminalNode NUMERO() { return getToken(JBashParser.NUMERO, 0); }
		public List<TerminalNode> STRINGA() { return getTokens(JBashParser.STRINGA); }
		public TerminalNode STRINGA(int i) {
			return getToken(JBashParser.STRINGA, i);
		}
		public Sptp_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sptp_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).enterSptp_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JBashParserListener ) ((JBashParserListener)listener).exitSptp_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBashParserVisitor ) return ((JBashParserVisitor<? extends T>)visitor).visitSptp_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sptp_stmContext sptp_stm() throws RecognitionException {
		Sptp_stmContext _localctx = new Sptp_stmContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_sptp_stm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(SPTP);
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(593);
				match(PARAM);
				}
				break;
			}
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMERO) {
				{
				setState(596);
				match(NUMERO);
				}
			}

			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(599);
				match(STRINGA);
				}
				break;
			}
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(602);
				match(STRINGA);
				}
				break;
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

	public static final String _serializedATN =
		"\u0004\u0001P\u025e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u00023\u00073\u00024\u00074\u0001\u0000\u0005\u0000l\b\u0000"+
		"\n\u0000\f\u0000o\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001w\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001|\b\u0001\u0001\u0001\u0003\u0001\u007f\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0084\b\u0001\n\u0001"+
		"\f\u0001\u0087\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u008c\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u0092\b\u0002\u0005\u0002\u0094\b\u0002\n\u0002\f\u0002\u0097\t\u0002"+
		"\u0001\u0002\u0003\u0002\u009a\b\u0002\u0001\u0002\u0003\u0002\u009d\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00a3"+
		"\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00ad\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u00b5"+
		"\b\u0005\u000b\u0005\f\u0005\u00b6\u0003\u0005\u00b9\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b\u00c7\b\u000b\u0001\f\u0003"+
		"\f\u00ca\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u00cf\b\f\u0001\f\u0001\f"+
		"\u0003\f\u00d3\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u00d8\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00dd\b\r\u0001\r\u0003\r\u00e0\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00e5\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00ea\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00f0\b\u000f\u0003\u000f\u00f2\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u00f7\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00fe\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u0103\b\u0011\u0001\u0011\u0003\u0011"+
		"\u0106\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u010b\b"+
		"\u0011\u0003\u0011\u010d\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0004\u0012\u0113\b\u0012\u000b\u0012\f\u0012\u0114\u0003\u0012"+
		"\u0117\b\u0012\u0001\u0012\u0003\u0012\u011a\b\u0012\u0001\u0012\u0003"+
		"\u0012\u011d\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0121\b\u0012"+
		"\u0001\u0012\u0003\u0012\u0124\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u012a\b\u0013\u0001\u0013\u0003\u0013\u012d\b"+
		"\u0013\u0001\u0013\u0005\u0013\u0130\b\u0013\n\u0013\f\u0013\u0133\t\u0013"+
		"\u0001\u0013\u0003\u0013\u0136\b\u0013\u0001\u0014\u0003\u0014\u0139\b"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u013d\b\u0014\u0001\u0014\u0003"+
		"\u0014\u0140\b\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0144\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0149\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u014e\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u0152\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0156\b"+
		"\u0016\u0001\u0016\u0003\u0016\u0159\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u015e\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0162"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0167\b\u0018"+
		"\u0001\u0018\u0003\u0018\u016a\b\u0018\u0001\u0018\u0003\u0018\u016d\b"+
		"\u0018\u0001\u0018\u0003\u0018\u0170\b\u0018\u0001\u0018\u0003\u0018\u0173"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0177\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u017b\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u0180\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0184\b"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0189\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u018d\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0196"+
		"\b\u001b\u0001\u001c\u0003\u001c\u0199\b\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u019d\b\u001c\u0001\u001c\u0003\u001c\u01a0\b\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u01a4\b\u001c\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u01a8\b\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u01ac\b\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01c3\b\u001f\u0001 "+
		"\u0001 \u0001!\u0001!\u0003!\u01c9\b!\u0001!\u0003!\u01cc\b!\u0001\"\u0001"+
		"\"\u0003\"\u01d0\b\"\u0001#\u0001#\u0003#\u01d4\b#\u0001#\u0003#\u01d7"+
		"\b#\u0001$\u0001$\u0005$\u01db\b$\n$\f$\u01de\t$\u0001$\u0001$\u0001$"+
		"\u0003$\u01e3\b$\u0001%\u0001%\u0005%\u01e7\b%\n%\f%\u01ea\t%\u0001%\u0003"+
		"%\u01ed\b%\u0001&\u0001&\u0005&\u01f1\b&\n&\f&\u01f4\t&\u0001&\u0001&"+
		"\u0001&\u0003&\u01f9\b&\u0001\'\u0001\'\u0003\'\u01fd\b\'\u0001\'\u0001"+
		"\'\u0003\'\u0201\b\'\u0001\'\u0001\'\u0001\'\u0003\'\u0206\b\'\u0001("+
		"\u0001(\u0003(\u020a\b(\u0001)\u0001)\u0005)\u020e\b)\n)\f)\u0211\t)\u0001"+
		")\u0001)\u0001)\u0003)\u0216\b)\u0001*\u0001*\u0003*\u021a\b*\u0001*\u0001"+
		"*\u0003*\u021e\b*\u0001+\u0001+\u0001+\u0003+\u0223\b+\u0001+\u0003+\u0226"+
		"\b+\u0001,\u0001,\u0003,\u022a\b,\u0001-\u0001-\u0001-\u0001.\u0001.\u0001"+
		"/\u0001/\u0001/\u0003/\u0234\b/\u0003/\u0236\b/\u00010\u00010\u00030\u023a"+
		"\b0\u00010\u00030\u023d\b0\u00011\u00011\u00031\u0241\b1\u00011\u0003"+
		"1\u0244\b1\u00012\u00012\u00032\u0248\b2\u00012\u00032\u024b\b2\u0001"+
		"3\u00013\u00033\u024f\b3\u00014\u00014\u00034\u0253\b4\u00014\u00034\u0256"+
		"\b4\u00014\u00034\u0259\b4\u00014\u00034\u025c\b4\u00014\u0000\u00005"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh\u0000\b\u0001\u0000"+
		"\n\u000b\u0002\u0000\u001b\u001bOO\u0001\u0000\r\u0012\u0002\u0000\u000f"+
		"\u0010\u0013\u0014\u0001\u0000\u0015\u0017\u0001\u0000\u0018\u0019\u0002"+
		"\u0000JJNN\u0001\u0000LM\u02bf\u0000m\u0001\u0000\u0000\u0000\u0002~\u0001"+
		"\u0000\u0000\u0000\u0004\u009c\u0001\u0000\u0000\u0000\u0006\u00a2\u0001"+
		"\u0000\u0000\u0000\b\u00ac\u0001\u0000\u0000\u0000\n\u00b8\u0001\u0000"+
		"\u0000\u0000\f\u00ba\u0001\u0000\u0000\u0000\u000e\u00bc\u0001\u0000\u0000"+
		"\u0000\u0010\u00be\u0001\u0000\u0000\u0000\u0012\u00c0\u0001\u0000\u0000"+
		"\u0000\u0014\u00c2\u0001\u0000\u0000\u0000\u0016\u00c6\u0001\u0000\u0000"+
		"\u0000\u0018\u00d7\u0001\u0000\u0000\u0000\u001a\u00d9\u0001\u0000\u0000"+
		"\u0000\u001c\u00e1\u0001\u0000\u0000\u0000\u001e\u00e9\u0001\u0000\u0000"+
		"\u0000 \u00f3\u0001\u0000\u0000\u0000\"\u010c\u0001\u0000\u0000\u0000"+
		"$\u010e\u0001\u0000\u0000\u0000&\u0125\u0001\u0000\u0000\u0000(\u0138"+
		"\u0001\u0000\u0000\u0000*\u0145\u0001\u0000\u0000\u0000,\u014a\u0001\u0000"+
		"\u0000\u0000.\u015a\u0001\u0000\u0000\u00000\u0163\u0001\u0000\u0000\u0000"+
		"2\u017c\u0001\u0000\u0000\u00004\u0185\u0001\u0000\u0000\u00006\u018e"+
		"\u0001\u0000\u0000\u00008\u0198\u0001\u0000\u0000\u0000:\u01a5\u0001\u0000"+
		"\u0000\u0000<\u01a9\u0001\u0000\u0000\u0000>\u01c2\u0001\u0000\u0000\u0000"+
		"@\u01c4\u0001\u0000\u0000\u0000B\u01c6\u0001\u0000\u0000\u0000D\u01cd"+
		"\u0001\u0000\u0000\u0000F\u01d1\u0001\u0000\u0000\u0000H\u01d8\u0001\u0000"+
		"\u0000\u0000J\u01e4\u0001\u0000\u0000\u0000L\u01ee\u0001\u0000\u0000\u0000"+
		"N\u01fa\u0001\u0000\u0000\u0000P\u0207\u0001\u0000\u0000\u0000R\u020b"+
		"\u0001\u0000\u0000\u0000T\u0217\u0001\u0000\u0000\u0000V\u021f\u0001\u0000"+
		"\u0000\u0000X\u0227\u0001\u0000\u0000\u0000Z\u022b\u0001\u0000\u0000\u0000"+
		"\\\u022e\u0001\u0000\u0000\u0000^\u0230\u0001\u0000\u0000\u0000`\u0237"+
		"\u0001\u0000\u0000\u0000b\u023e\u0001\u0000\u0000\u0000d\u0245\u0001\u0000"+
		"\u0000\u0000f\u024c\u0001\u0000\u0000\u0000h\u0250\u0001\u0000\u0000\u0000"+
		"jl\u0005\u0007\u0000\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0003\u0002\u0001\u0000qr\u0005"+
		"\u0000\u0000\u0001r\u0001\u0001\u0000\u0000\u0000st\u0005\u001c\u0000"+
		"\u0000tv\u0003\u0004\u0002\u0000uw\u0005\u001d\u0000\u0000vu\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000w\u007f\u0001\u0000\u0000\u0000"+
		"xy\u0005\u001e\u0000\u0000y{\u0003\u0004\u0002\u0000z|\u0005\u001f\u0000"+
		"\u0000{z\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u007f\u0001"+
		"\u0000\u0000\u0000}\u007f\u0003\u0006\u0003\u0000~s\u0001\u0000\u0000"+
		"\u0000~x\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0085"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0003\n\u0005\u0000\u0081\u0082\u0003"+
		"\u0002\u0001\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u0080\u0001"+
		"\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0003\u0001"+
		"\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u008c\u0003"+
		">\u001f\u0000\u0089\u008c\u0003\u0016\u000b\u0000\u008a\u008c\u0003\b"+
		"\u0004\u0000\u008b\u0088\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u0095\u0001\u0000"+
		"\u0000\u0000\u008d\u0091\u0003\n\u0005\u0000\u008e\u0092\u0003>\u001f"+
		"\u0000\u008f\u0092\u0003\u0016\u000b\u0000\u0090\u0092\u0003\b\u0004\u0000"+
		"\u0091\u008e\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000"+
		"\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000"+
		"\u0093\u008d\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000"+
		"\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000"+
		"\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000"+
		"\u0098\u009a\u0005\u0005\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000"+
		"\u009b\u009d\u0005\u0000\u0000\u0001\u009c\u008b\u0001\u0000\u0000\u0000"+
		"\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u0005\u0001\u0000\u0000\u0000"+
		"\u009e\u00a3\u0003>\u001f\u0000\u009f\u00a3\u0003\u0016\u000b\u0000\u00a0"+
		"\u00a3\u0003\b\u0004\u0000\u00a1\u00a3\u0005\u0000\u0000\u0001\u00a2\u009e"+
		"\u0001\u0000\u0000\u0000\u00a2\u009f\u0001\u0000\u0000\u0000\u00a2\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u0007"+
		"\u0001\u0000\u0000\u0000\u00a4\u00ad\u0003,\u0016\u0000\u00a5\u00ad\u0003"+
		"0\u0018\u0000\u00a6\u00ad\u00032\u0019\u0000\u00a7\u00ad\u00034\u001a"+
		"\u0000\u00a8\u00ad\u0003<\u001e\u0000\u00a9\u00ad\u00038\u001c\u0000\u00aa"+
		"\u00ad\u0003$\u0012\u0000\u00ab\u00ad\u0003&\u0013\u0000\u00ac\u00a4\u0001"+
		"\u0000\u0000\u0000\u00ac\u00a5\u0001\u0000\u0000\u0000\u00ac\u00a6\u0001"+
		"\u0000\u0000\u0000\u00ac\u00a7\u0001\u0000\u0000\u0000\u00ac\u00a8\u0001"+
		"\u0000\u0000\u0000\u00ac\u00a9\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\t\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b9\u0005\b\u0000\u0000\u00af\u00b9\u0005\t\u0000"+
		"\u0000\u00b0\u00b9\u0005\u000b\u0000\u0000\u00b1\u00b9\u0005\n\u0000\u0000"+
		"\u00b2\u00b9\u0005\u0005\u0000\u0000\u00b3\u00b5\u0005\u0007\u0000\u0000"+
		"\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b8\u00af\u0001\u0000\u0000\u0000\u00b8\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b1\u0001\u0000\u0000\u0000\u00b8\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b4\u0001\u0000\u0000\u0000\u00b9\u000b\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0007\u0000\u0000\u0000\u00bb\r\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0007\u0001\u0000\u0000\u00bd\u000f\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0007\u0002\u0000\u0000\u00bf\u0011\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0007\u0003\u0000\u0000\u00c1\u0013\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0007\u0004\u0000\u0000\u00c3\u0015\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c7\u0003\u001a\r\u0000\u00c5\u00c7\u0003\u0018\f\u0000\u00c6\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u0017"+
		"\u0001\u0000\u0000\u0000\u00c8\u00ca\u0005L\u0000\u0000\u00c9\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00ce\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cf\u0003\u000e\u0007\u0000\u00cc\u00cf\u0005"+
		"\u000e\u0000\u0000\u00cd\u00cf\u0005\f\u0000\u0000\u00ce\u00cb\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d8\u0005L\u0000"+
		"\u0000\u00d1\u00d3\u0005M\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\u0003\u000e\u0007\u0000\u00d5\u00d6\u0005M\u0000\u0000\u00d6"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d7\u00c9\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d8\u0019\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0005 \u0000\u0000\u00da\u00dc\u0003\u001e\u000f\u0000\u00db\u00dd"+
		"\u0003\u001c\u000e\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00e0"+
		"\u0005!\u0000\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00df\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e0\u001b\u0001\u0000\u0000\u0000\u00e1\u00e2\u0003"+
		"\f\u0006\u0000\u00e2\u00e4\u0003\u001e\u000f\u0000\u00e3\u00e5\u0003\u001c"+
		"\u000e\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e5\u001d\u0001\u0000\u0000\u0000\u00e6\u00ea\u0003 \u0010"+
		"\u0000\u00e7\u00e8\u0005\u001b\u0000\u0000\u00e8\u00ea\u0003 \u0010\u0000"+
		"\u00e9\u00e6\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000"+
		"\u00ea\u00f1\u0001\u0000\u0000\u0000\u00eb\u00ef\u0003\u0010\b\u0000\u00ec"+
		"\u00f0\u0003 \u0010\u0000\u00ed\u00ee\u0005\u001b\u0000\u0000\u00ee\u00f0"+
		"\u0003 \u0010\u0000\u00ef\u00ec\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00eb\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u001f\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f6\u0003\"\u0011\u0000\u00f4\u00f5\u0007\u0005"+
		"\u0000\u0000\u00f5\u00f7\u0003\"\u0011\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7!\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0005\u0019\u0000\u0000\u00f9\u010d\u0003 \u0010\u0000\u00fa"+
		"\u00fb\u0005\u001e\u0000\u0000\u00fb\u00fd\u0003 \u0010\u0000\u00fc\u00fe"+
		"\u0005\u001f\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fe\u0102\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0003\u0014\n\u0000\u0100\u0101\u0003 \u0010\u0000\u0101\u0103\u0001"+
		"\u0000\u0000\u0000\u0102\u00ff\u0001\u0000\u0000\u0000\u0102\u0103\u0001"+
		"\u0000\u0000\u0000\u0103\u010d\u0001\u0000\u0000\u0000\u0104\u0106\u0005"+
		"J\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000"+
		"\u0000\u0000\u0106\u010a\u0001\u0000\u0000\u0000\u0107\u0108\u0003\u0014"+
		"\n\u0000\u0108\u0109\u0003 \u0010\u0000\u0109\u010b\u0001\u0000\u0000"+
		"\u0000\u010a\u0107\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000"+
		"\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c\u00f8\u0001\u0000\u0000"+
		"\u0000\u010c\u00fa\u0001\u0000\u0000\u0000\u010c\u0105\u0001\u0000\u0000"+
		"\u0000\u010d#\u0001\u0000\u0000\u0000\u010e\u010f\u0005-\u0000\u0000\u010f"+
		"\u0116\u0005K\u0000\u0000\u0110\u0112\u0005.\u0000\u0000\u0111\u0113\u0005"+
		"K\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000"+
		"\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000"+
		"\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u0110\u0001\u0000"+
		"\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0119\u0001\u0000"+
		"\u0000\u0000\u0118\u011a\u0005\u0005\u0000\u0000\u0119\u0118\u0001\u0000"+
		"\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011c\u0001\u0000"+
		"\u0000\u0000\u011b\u011d\u0005)\u0000\u0000\u011c\u011b\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000"+
		"\u0000\u011e\u0120\u0003\u0002\u0001\u0000\u011f\u0121\u0005\u0005\u0000"+
		"\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000"+
		"\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u0124\u0005*\u0000\u0000"+
		"\u0123\u0122\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000"+
		"\u0124%\u0001\u0000\u0000\u0000\u0125\u0129\u0005/\u0000\u0000\u0126\u0127"+
		"\u0005\u001a\u0000\u0000\u0127\u012a\u0005K\u0000\u0000\u0128\u012a\u0005"+
		"K\u0000\u0000\u0129\u0126\u0001\u0000\u0000\u0000\u0129\u0128\u0001\u0000"+
		"\u0000\u0000\u012a\u012c\u0001\u0000\u0000\u0000\u012b\u012d\u0005.\u0000"+
		"\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000"+
		"\u0000\u012d\u0131\u0001\u0000\u0000\u0000\u012e\u0130\u0003(\u0014\u0000"+
		"\u012f\u012e\u0001\u0000\u0000\u0000\u0130\u0133\u0001\u0000\u0000\u0000"+
		"\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000"+
		"\u0132\u0135\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000"+
		"\u0134\u0136\u00050\u0000\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0135"+
		"\u0136\u0001\u0000\u0000\u0000\u0136\'\u0001\u0000\u0000\u0000\u0137\u0139"+
		"\u0005\u001e\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013c"+
		"\u0005K\u0000\u0000\u013b\u013d\u0003*\u0015\u0000\u013c\u013b\u0001\u0000"+
		"\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013f\u0001\u0000"+
		"\u0000\u0000\u013e\u0140\u0005\u001f\u0000\u0000\u013f\u013e\u0001\u0000"+
		"\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000"+
		"\u0000\u0000\u0141\u0143\u0003\u0002\u0001\u0000\u0142\u0144\u0005\u0006"+
		"\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000"+
		"\u0000\u0000\u0144)\u0001\u0000\u0000\u0000\u0145\u0146\u0005\b\u0000"+
		"\u0000\u0146\u0148\u0005K\u0000\u0000\u0147\u0149\u0003*\u0015\u0000\u0148"+
		"\u0147\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149"+
		"+\u0001\u0000\u0000\u0000\u014a\u014b\u0005$\u0000\u0000\u014b\u014d\u0003"+
		"\u0002\u0001\u0000\u014c\u014e\u00053\u0000\u0000\u014d\u014c\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000"+
		"\u0000\u0000\u014f\u0151\u0003\u0002\u0001\u0000\u0150\u0152\u0003.\u0017"+
		"\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000"+
		"\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153\u0154\u0005&\u0000\u0000"+
		"\u0154\u0156\u0003\u0002\u0001\u0000\u0155\u0153\u0001\u0000\u0000\u0000"+
		"\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0158\u0001\u0000\u0000\u0000"+
		"\u0157\u0159\u0005\'\u0000\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0158"+
		"\u0159\u0001\u0000\u0000\u0000\u0159-\u0001\u0000\u0000\u0000\u015a\u015b"+
		"\u0005%\u0000\u0000\u015b\u015d\u0003\u0002\u0001\u0000\u015c\u015e\u0005"+
		"3\u0000\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000"+
		"\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0161\u0003\u0002"+
		"\u0001\u0000\u0160\u0162\u0003.\u0017\u0000\u0161\u0160\u0001\u0000\u0000"+
		"\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162/\u0001\u0000\u0000\u0000"+
		"\u0163\u0164\u0005(\u0000\u0000\u0164\u0166\u0005 \u0000\u0000\u0165\u0167"+
		"\u0003\u0016\u000b\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0166\u0167"+
		"\u0001\u0000\u0000\u0000\u0167\u0169\u0001\u0000\u0000\u0000\u0168\u016a"+
		"\u0005\u0005\u0000\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u0169\u016a"+
		"\u0001\u0000\u0000\u0000\u016a\u016c\u0001\u0000\u0000\u0000\u016b\u016d"+
		"\u0003\u0016\u000b\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016c\u016d"+
		"\u0001\u0000\u0000\u0000\u016d\u016f\u0001\u0000\u0000\u0000\u016e\u0170"+
		"\u0005\u0005\u0000\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u016f\u0170"+
		"\u0001\u0000\u0000\u0000\u0170\u0172\u0001\u0000\u0000\u0000\u0171\u0173"+
		"\u0003\u0016\u000b\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0172\u0173"+
		"\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0176"+
		"\u0005!\u0000\u0000\u0175\u0177\u0005)\u0000\u0000\u0176\u0175\u0001\u0000"+
		"\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000"+
		"\u0000\u0000\u0178\u017a\u0003\u0002\u0001\u0000\u0179\u017b\u0005*\u0000"+
		"\u0000\u017a\u0179\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000"+
		"\u0000\u017b1\u0001\u0000\u0000\u0000\u017c\u017d\u0005+\u0000\u0000\u017d"+
		"\u017f\u0003\u0002\u0001\u0000\u017e\u0180\u0005)\u0000\u0000\u017f\u017e"+
		"\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0181"+
		"\u0001\u0000\u0000\u0000\u0181\u0183\u0003\u0002\u0001\u0000\u0182\u0184"+
		"\u0005*\u0000\u0000\u0183\u0182\u0001\u0000\u0000\u0000\u0183\u0184\u0001"+
		"\u0000\u0000\u0000\u01843\u0001\u0000\u0000\u0000\u0185\u0186\u0005,\u0000"+
		"\u0000\u0186\u0188\u0003\u0002\u0001\u0000\u0187\u0189\u0005)\u0000\u0000"+
		"\u0188\u0187\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000"+
		"\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018c\u0003\u0002\u0001\u0000"+
		"\u018b\u018d\u0005*\u0000\u0000\u018c\u018b\u0001\u0000\u0000\u0000\u018c"+
		"\u018d\u0001\u0000\u0000\u0000\u018d5\u0001\u0000\u0000\u0000\u018e\u018f"+
		"\u0005K\u0000\u0000\u018f\u0195\u0005\f\u0000\u0000\u0190\u0196\u0005"+
		"K\u0000\u0000\u0191\u0196\u0003\u001a\r\u0000\u0192\u0196\u0005L\u0000"+
		"\u0000\u0193\u0194\u0005\u001a\u0000\u0000\u0194\u0196\u0005K\u0000\u0000"+
		"\u0195\u0190\u0001\u0000\u0000\u0000\u0195\u0191\u0001\u0000\u0000\u0000"+
		"\u0195\u0192\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000"+
		"\u0195\u0196\u0001\u0000\u0000\u0000\u01967\u0001\u0000\u0000\u0000\u0197"+
		"\u0199\u00051\u0000\u0000\u0198\u0197\u0001\u0000\u0000\u0000\u0198\u0199"+
		"\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019c"+
		"\u0005K\u0000\u0000\u019b\u019d\u0005\u001e\u0000\u0000\u019c\u019b\u0001"+
		"\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u019f\u0001"+
		"\u0000\u0000\u0000\u019e\u01a0\u0005\u001f\u0000\u0000\u019f\u019e\u0001"+
		"\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001"+
		"\u0000\u0000\u0000\u01a1\u01a3\u0003\u0002\u0001\u0000\u01a2\u01a4\u0003"+
		":\u001d\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a49\u0001\u0000\u0000\u0000\u01a5\u01a7\u0003\u0012\t"+
		"\u0000\u01a6\u01a8\u0005M\u0000\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8;\u0001\u0000\u0000\u0000\u01a9"+
		"\u01ab\u00052\u0000\u0000\u01aa\u01ac\u0007\u0006\u0000\u0000\u01ab\u01aa"+
		"\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac=\u0001"+
		"\u0000\u0000\u0000\u01ad\u01c3\u0003@ \u0000\u01ae\u01c3\u0003B!\u0000"+
		"\u01af\u01c3\u0003D\"\u0000\u01b0\u01c3\u0003F#\u0000\u01b1\u01c3\u0003"+
		"H$\u0000\u01b2\u01c3\u0003J%\u0000\u01b3\u01c3\u0003L&\u0000\u01b4\u01c3"+
		"\u0003N\'\u0000\u01b5\u01c3\u0003P(\u0000\u01b6\u01c3\u0003R)\u0000\u01b7"+
		"\u01c3\u0003T*\u0000\u01b8\u01c3\u0003V+\u0000\u01b9\u01c3\u0003X,\u0000"+
		"\u01ba\u01c3\u0003Z-\u0000\u01bb\u01c3\u0003\\.\u0000\u01bc\u01c3\u0003"+
		"^/\u0000\u01bd\u01c3\u0003`0\u0000\u01be\u01c3\u0003b1\u0000\u01bf\u01c3"+
		"\u0003d2\u0000\u01c0\u01c3\u0003f3\u0000\u01c1\u01c3\u0003h4\u0000\u01c2"+
		"\u01ad\u0001\u0000\u0000\u0000\u01c2\u01ae\u0001\u0000\u0000\u0000\u01c2"+
		"\u01af\u0001\u0000\u0000\u0000\u01c2\u01b0\u0001\u0000\u0000\u0000\u01c2"+
		"\u01b1\u0001\u0000\u0000\u0000\u01c2\u01b2\u0001\u0000\u0000\u0000\u01c2"+
		"\u01b3\u0001\u0000\u0000\u0000\u01c2\u01b4\u0001\u0000\u0000\u0000\u01c2"+
		"\u01b5\u0001\u0000\u0000\u0000\u01c2\u01b6\u0001\u0000\u0000\u0000\u01c2"+
		"\u01b7\u0001\u0000\u0000\u0000\u01c2\u01b8\u0001\u0000\u0000\u0000\u01c2"+
		"\u01b9\u0001\u0000\u0000\u0000\u01c2\u01ba\u0001\u0000\u0000\u0000\u01c2"+
		"\u01bb\u0001\u0000\u0000\u0000\u01c2\u01bc\u0001\u0000\u0000\u0000\u01c2"+
		"\u01bd\u0001\u0000\u0000\u0000\u01c2\u01be\u0001\u0000\u0000\u0000\u01c2"+
		"\u01bf\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c1\u0001\u0000\u0000\u0000\u01c3?\u0001\u0000\u0000\u0000\u01c4\u01c5"+
		"\u00054\u0000\u0000\u01c5A\u0001\u0000\u0000\u0000\u01c6\u01c8\u00055"+
		"\u0000\u0000\u01c7\u01c9\u0005O\u0000\u0000\u01c8\u01c7\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01cb\u0001\u0000\u0000"+
		"\u0000\u01ca\u01cc\u00036\u001b\u0000\u01cb\u01ca\u0001\u0000\u0000\u0000"+
		"\u01cb\u01cc\u0001\u0000\u0000\u0000\u01ccC\u0001\u0000\u0000\u0000\u01cd"+
		"\u01cf\u00056\u0000\u0000\u01ce\u01d0\u0007\u0006\u0000\u0000\u01cf\u01ce"+
		"\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0E\u0001"+
		"\u0000\u0000\u0000\u01d1\u01d3\u00057\u0000\u0000\u01d2\u01d4\u0005O\u0000"+
		"\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d6\u0001\u0000\u0000\u0000\u01d5\u01d7\u0005M\u0000\u0000"+
		"\u01d6\u01d5\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000"+
		"\u01d7G\u0001\u0000\u0000\u0000\u01d8\u01dc\u00058\u0000\u0000\u01d9\u01db"+
		"\u0005O\u0000\u0000\u01da\u01d9\u0001\u0000\u0000\u0000\u01db\u01de\u0001"+
		"\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001"+
		"\u0000\u0000\u0000\u01dd\u01e2\u0001\u0000\u0000\u0000\u01de\u01dc\u0001"+
		"\u0000\u0000\u0000\u01df\u01e3\u0003>\u001f\u0000\u01e0\u01e3\u0005K\u0000"+
		"\u0000\u01e1\u01e3\u0005M\u0000\u0000\u01e2\u01df\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3I\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e8\u00059\u0000\u0000\u01e5\u01e7\u0005O\u0000\u0000\u01e6\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e7\u01ea\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001"+
		"\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01ec\u0001"+
		"\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01eb\u01ed\u0003"+
		"6\u001b\u0000\u01ec\u01eb\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000"+
		"\u0000\u0000\u01edK\u0001\u0000\u0000\u0000\u01ee\u01f2\u0005;\u0000\u0000"+
		"\u01ef\u01f1\u0005O\u0000\u0000\u01f0\u01ef\u0001\u0000\u0000\u0000\u01f1"+
		"\u01f4\u0001\u0000\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f2"+
		"\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f8\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f2\u0001\u0000\u0000\u0000\u01f5\u01f9\u0005L\u0000\u0000\u01f6\u01f7"+
		"\u0005\u001a\u0000\u0000\u01f7\u01f9\u0005K\u0000\u0000\u01f8\u01f5\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001"+
		"\u0000\u0000\u0000\u01f9M\u0001\u0000\u0000\u0000\u01fa\u01fc\u0005<\u0000"+
		"\u0000\u01fb\u01fd\u0005O\u0000\u0000\u01fc\u01fb\u0001\u0000\u0000\u0000"+
		"\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u0200\u0001\u0000\u0000\u0000"+
		"\u01fe\u01ff\u0005O\u0000\u0000\u01ff\u0201\u0005K\u0000\u0000\u0200\u01fe"+
		"\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201\u0205"+
		"\u0001\u0000\u0000\u0000\u0202\u0206\u0003>\u001f\u0000\u0203\u0206\u0005"+
		"K\u0000\u0000\u0204\u0206\u0005M\u0000\u0000\u0205\u0202\u0001\u0000\u0000"+
		"\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0205\u0204\u0001\u0000\u0000"+
		"\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206O\u0001\u0000\u0000\u0000"+
		"\u0207\u0209\u0005=\u0000\u0000\u0208\u020a\u0007\u0006\u0000\u0000\u0209"+
		"\u0208\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a"+
		"Q\u0001\u0000\u0000\u0000\u020b\u020f\u0005>\u0000\u0000\u020c\u020e\u0005"+
		"O\u0000\u0000\u020d\u020c\u0001\u0000\u0000\u0000\u020e\u0211\u0001\u0000"+
		"\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000"+
		"\u0000\u0000\u0210\u0212\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000"+
		"\u0000\u0000\u0212\u0215\u0005K\u0000\u0000\u0213\u0214\u0005\f\u0000"+
		"\u0000\u0214\u0216\u0007\u0007\u0000\u0000\u0215\u0213\u0001\u0000\u0000"+
		"\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216S\u0001\u0000\u0000\u0000"+
		"\u0217\u0219\u0005?\u0000\u0000\u0218\u021a\u0005O\u0000\u0000\u0219\u0218"+
		"\u0001\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021d"+
		"\u0001\u0000\u0000\u0000\u021b\u021e\u0003>\u001f\u0000\u021c\u021e\u0005"+
		"K\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021d\u021c\u0001\u0000"+
		"\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021eU\u0001\u0000\u0000"+
		"\u0000\u021f\u0222\u0005@\u0000\u0000\u0220\u0221\u0005O\u0000\u0000\u0221"+
		"\u0223\u0005J\u0000\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0222\u0223"+
		"\u0001\u0000\u0000\u0000\u0223\u0225\u0001\u0000\u0000\u0000\u0224\u0226"+
		"\u0007\u0006\u0000\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0225\u0226"+
		"\u0001\u0000\u0000\u0000\u0226W\u0001\u0000\u0000\u0000\u0227\u0229\u0005"+
		"B\u0000\u0000\u0228\u022a\u0005O\u0000\u0000\u0229\u0228\u0001\u0000\u0000"+
		"\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022aY\u0001\u0000\u0000\u0000"+
		"\u022b\u022c\u0005C\u0000\u0000\u022c\u022d\u0003\u0016\u000b\u0000\u022d"+
		"[\u0001\u0000\u0000\u0000\u022e\u022f\u0005D\u0000\u0000\u022f]\u0001"+
		"\u0000\u0000\u0000\u0230\u0235\u0005E\u0000\u0000\u0231\u0233\u0005O\u0000"+
		"\u0000\u0232\u0234\u0007\u0006\u0000\u0000\u0233\u0232\u0001\u0000\u0000"+
		"\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234\u0236\u0001\u0000\u0000"+
		"\u0000\u0235\u0231\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000"+
		"\u0000\u0236_\u0001\u0000\u0000\u0000\u0237\u0239\u0005F\u0000\u0000\u0238"+
		"\u023a\u0005O\u0000\u0000\u0239\u0238\u0001\u0000\u0000\u0000\u0239\u023a"+
		"\u0001\u0000\u0000\u0000\u023a\u023c\u0001\u0000\u0000\u0000\u023b\u023d"+
		"\u0007\u0006\u0000\u0000\u023c\u023b\u0001\u0000\u0000\u0000\u023c\u023d"+
		"\u0001\u0000\u0000\u0000\u023da\u0001\u0000\u0000\u0000\u023e\u0240\u0005"+
		"G\u0000\u0000\u023f\u0241\u0005O\u0000\u0000\u0240\u023f\u0001\u0000\u0000"+
		"\u0000\u0240\u0241\u0001\u0000\u0000\u0000\u0241\u0243\u0001\u0000\u0000"+
		"\u0000\u0242\u0244\u0005K\u0000\u0000\u0243\u0242\u0001\u0000\u0000\u0000"+
		"\u0243\u0244\u0001\u0000\u0000\u0000\u0244c\u0001\u0000\u0000\u0000\u0245"+
		"\u0247\u0005H\u0000\u0000\u0246\u0248\u0005O\u0000\u0000\u0247\u0246\u0001"+
		"\u0000\u0000\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248\u024a\u0001"+
		"\u0000\u0000\u0000\u0249\u024b\u0005K\u0000\u0000\u024a\u0249\u0001\u0000"+
		"\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024be\u0001\u0000\u0000"+
		"\u0000\u024c\u024e\u0005I\u0000\u0000\u024d\u024f\u0007\u0006\u0000\u0000"+
		"\u024e\u024d\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000\u0000"+
		"\u024fg\u0001\u0000\u0000\u0000\u0250\u0252\u0005A\u0000\u0000\u0251\u0253"+
		"\u0005O\u0000\u0000\u0252\u0251\u0001\u0000\u0000\u0000\u0252\u0253\u0001"+
		"\u0000\u0000\u0000\u0253\u0255\u0001\u0000\u0000\u0000\u0254\u0256\u0005"+
		"J\u0000\u0000\u0255\u0254\u0001\u0000\u0000\u0000\u0255\u0256\u0001\u0000"+
		"\u0000\u0000\u0256\u0258\u0001\u0000\u0000\u0000\u0257\u0259\u0005L\u0000"+
		"\u0000\u0258\u0257\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000"+
		"\u0000\u0259\u025b\u0001\u0000\u0000\u0000\u025a\u025c\u0005L\u0000\u0000"+
		"\u025b\u025a\u0001\u0000\u0000\u0000\u025b\u025c\u0001\u0000\u0000\u0000"+
		"\u025ci\u0001\u0000\u0000\u0000jmv{~\u0085\u008b\u0091\u0095\u0099\u009c"+
		"\u00a2\u00ac\u00b6\u00b8\u00c6\u00c9\u00ce\u00d2\u00d7\u00dc\u00df\u00e4"+
		"\u00e9\u00ef\u00f1\u00f6\u00fd\u0102\u0105\u010a\u010c\u0114\u0116\u0119"+
		"\u011c\u0120\u0123\u0129\u012c\u0131\u0135\u0138\u013c\u013f\u0143\u0148"+
		"\u014d\u0151\u0155\u0158\u015d\u0161\u0166\u0169\u016c\u016f\u0172\u0176"+
		"\u017a\u017f\u0183\u0188\u018c\u0195\u0198\u019c\u019f\u01a3\u01a7\u01ab"+
		"\u01c2\u01c8\u01cb\u01cf\u01d3\u01d6\u01dc\u01e2\u01e8\u01ec\u01f2\u01f8"+
		"\u01fc\u0200\u0205\u0209\u020f\u0215\u0219\u021d\u0222\u0225\u0229\u0233"+
		"\u0235\u0239\u023c\u0240\u0243\u0247\u024a\u024e\u0252\u0255\u0258\u025b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}