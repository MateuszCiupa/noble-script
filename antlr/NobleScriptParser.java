// Generated from //wsl$/Ubuntu-20.04/home/ciupam/repos/noble-script/src\NobleScript.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NobleScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, READ=4, RETURN=5, WHILE=6, IF=7, ELIF=8, ELSE=9, 
		PAR_OPEN=10, PAR_CLOSE=11, BRACES_OPEN=12, BRACES_CLOSE=13, BRACKET_OPEN=14, 
		BRACKET_CLOSE=15, NULL=16, INT_LITERAL=17, DOUBLE_LITERAL=18, BOOLEAN_LITERAL=19, 
		STRING_LITERAL=20, BOOLEAN_TYPE=21, INT_TYPE=22, DOUBLE_TYPE=23, STRING_TYPE=24, 
		ID=25, SEMICOL=26, ASSIGN_OP=27, LESSER_THAN_OP=28, GREATER_THAN_OP=29, 
		EQUAL_OP=30, NOT_EQUAL_OP=31, PLUS_OP=32, MINUS_OP=33, POW_OP=34, DIV_OP=35, 
		MUL_OP=36, WHITESPACE=37, NEWLINE=38;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assign_statement = 2, RULE_return_statement = 3, 
		RULE_definition = 4, RULE_structure_definition = 5, RULE_function_definition = 6, 
		RULE_variable_definition = 7, RULE_array_definition = 8, RULE_expression = 9, 
		RULE_expression0 = 10, RULE_expression1 = 11, RULE_expression2 = 12, RULE_expression3 = 13, 
		RULE_value = 14, RULE_array_index = 15, RULE_function_call_stm = 16, RULE_print_stm = 17, 
		RULE_literal = 18, RULE_primitive_literal = 19, RULE_type = 20, RULE_primitive_type = 21, 
		RULE_operator2 = 22, RULE_operator1 = 23, RULE_operator0 = 24, RULE_compound_statement = 25, 
		RULE_loop_statement = 26, RULE_if_statement = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "assign_statement", "return_statement", "definition", 
			"structure_definition", "function_definition", "variable_definition", 
			"array_definition", "expression", "expression0", "expression1", "expression2", 
			"expression3", "value", "array_index", "function_call_stm", "print_stm", 
			"literal", "primitive_literal", "type", "primitive_type", "operator2", 
			"operator1", "operator0", "compound_statement", "loop_statement", "if_statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'struct'", "','", "'print('", "'read()'", "'return'", "'while'", 
			"'if'", "'elif'", "'else'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"'null'", null, null, null, null, "'boolean'", "'int'", "'double'", "'string'", 
			null, "';'", "'='", "'<'", "'>'", "'=='", "'!='", "'+'", "'-'", "'^'", 
			"'/'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "READ", "RETURN", "WHILE", "IF", "ELIF", "ELSE", 
			"PAR_OPEN", "PAR_CLOSE", "BRACES_OPEN", "BRACES_CLOSE", "BRACKET_OPEN", 
			"BRACKET_CLOSE", "NULL", "INT_LITERAL", "DOUBLE_LITERAL", "BOOLEAN_LITERAL", 
			"STRING_LITERAL", "BOOLEAN_TYPE", "INT_TYPE", "DOUBLE_TYPE", "STRING_TYPE", 
			"ID", "SEMICOL", "ASSIGN_OP", "LESSER_THAN_OP", "GREATER_THAN_OP", "EQUAL_OP", 
			"NOT_EQUAL_OP", "PLUS_OP", "MINUS_OP", "POW_OP", "DIV_OP", "MUL_OP", 
			"WHITESPACE", "NEWLINE"
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
	public String getGrammarFileName() { return "NobleScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NobleScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(NobleScriptParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << READ) | (1L << RETURN) | (1L << WHILE) | (1L << IF) | (1L << NULL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(56);
				statement();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
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

	public static class StatementContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public Function_call_stmContext function_call_stm() {
			return getRuleContext(Function_call_stmContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(NobleScriptParser.SEMICOL, 0); }
		public Assign_statementContext assign_statement() {
			return getRuleContext(Assign_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				compound_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				function_call_stm();
				setState(67);
				match(SEMICOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				assign_statement();
				setState(70);
				match(SEMICOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				return_statement();
				setState(73);
				match(SEMICOL);
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

	public static class Assign_statementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NobleScriptParser.ID, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(NobleScriptParser.ASSIGN_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BRACKET_OPEN() { return getToken(NobleScriptParser.BRACKET_OPEN, 0); }
		public TerminalNode INT_LITERAL() { return getToken(NobleScriptParser.INT_LITERAL, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(NobleScriptParser.BRACKET_CLOSE, 0); }
		public Assign_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterAssign_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitAssign_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitAssign_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_statementContext assign_statement() throws RecognitionException {
		Assign_statementContext _localctx = new Assign_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assign_statement);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(ID);
				setState(78);
				match(ASSIGN_OP);
				setState(79);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(ID);
				setState(81);
				match(BRACKET_OPEN);
				setState(82);
				match(INT_LITERAL);
				setState(83);
				match(BRACKET_CLOSE);
				setState(84);
				match(ASSIGN_OP);
				setState(85);
				expression();
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(NobleScriptParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(RETURN);
			setState(89);
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

	public static class DefinitionContext extends ParserRuleContext {
		public Variable_definitionContext variable_definition() {
			return getRuleContext(Variable_definitionContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(NobleScriptParser.SEMICOL, 0); }
		public Structure_definitionContext structure_definition() {
			return getRuleContext(Structure_definitionContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Array_definitionContext array_definition() {
			return getRuleContext(Array_definitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_definition);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				variable_definition();
				setState(92);
				match(SEMICOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				structure_definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				function_definition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				array_definition();
				setState(97);
				match(SEMICOL);
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

	public static class Structure_definitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NobleScriptParser.ID, 0); }
		public TerminalNode BRACES_OPEN() { return getToken(NobleScriptParser.BRACES_OPEN, 0); }
		public TerminalNode BRACES_CLOSE() { return getToken(NobleScriptParser.BRACES_CLOSE, 0); }
		public List<Variable_definitionContext> variable_definition() {
			return getRuleContexts(Variable_definitionContext.class);
		}
		public Variable_definitionContext variable_definition(int i) {
			return getRuleContext(Variable_definitionContext.class,i);
		}
		public List<TerminalNode> SEMICOL() { return getTokens(NobleScriptParser.SEMICOL); }
		public TerminalNode SEMICOL(int i) {
			return getToken(NobleScriptParser.SEMICOL, i);
		}
		public Structure_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterStructure_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitStructure_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitStructure_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Structure_definitionContext structure_definition() throws RecognitionException {
		Structure_definitionContext _localctx = new Structure_definitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_structure_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__0);
			setState(102);
			match(ID);
			setState(103);
			match(BRACES_OPEN);
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				variable_definition();
				setState(105);
				match(SEMICOL);
				}
				}
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE))) != 0) );
			setState(111);
			match(BRACES_CLOSE);
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

	public static class Function_definitionContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(NobleScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(NobleScriptParser.ID, i);
		}
		public TerminalNode PAR_OPEN() { return getToken(NobleScriptParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(NobleScriptParser.PAR_CLOSE, 0); }
		public TerminalNode BRACES_OPEN() { return getToken(NobleScriptParser.BRACES_OPEN, 0); }
		public TerminalNode BRACES_CLOSE() { return getToken(NobleScriptParser.BRACES_CLOSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitFunction_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitFunction_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			type();
			setState(114);
			match(ID);
			setState(115);
			match(PAR_OPEN);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE))) != 0)) {
				{
				setState(116);
				type();
				setState(117);
				match(ID);
				}
			}

			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(121);
				match(T__1);
				setState(122);
				type();
				setState(123);
				match(ID);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			match(PAR_CLOSE);
			setState(131);
			match(BRACES_OPEN);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << READ) | (1L << RETURN) | (1L << WHILE) | (1L << IF) | (1L << NULL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(132);
				statement();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(BRACES_CLOSE);
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

	public static class Variable_definitionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(NobleScriptParser.ID, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(NobleScriptParser.ASSIGN_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterVariable_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitVariable_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitVariable_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_definitionContext variable_definition() throws RecognitionException {
		Variable_definitionContext _localctx = new Variable_definitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			type();
			setState(141);
			match(ID);
			setState(142);
			match(ASSIGN_OP);
			setState(143);
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

	public static class Array_definitionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(NobleScriptParser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(NobleScriptParser.BRACKET_OPEN, 0); }
		public TerminalNode INT_LITERAL() { return getToken(NobleScriptParser.INT_LITERAL, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(NobleScriptParser.BRACKET_CLOSE, 0); }
		public Array_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterArray_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitArray_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitArray_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_definitionContext array_definition() throws RecognitionException {
		Array_definitionContext _localctx = new Array_definitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			type();
			setState(146);
			match(ID);
			setState(147);
			match(BRACKET_OPEN);
			setState(148);
			match(INT_LITERAL);
			setState(149);
			match(BRACKET_CLOSE);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			expression0();
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

	public static class Expression0Context extends ParserRuleContext {
		public List<Expression1Context> expression1() {
			return getRuleContexts(Expression1Context.class);
		}
		public Expression1Context expression1(int i) {
			return getRuleContext(Expression1Context.class,i);
		}
		public Operator0Context operator0() {
			return getRuleContext(Operator0Context.class,0);
		}
		public Expression0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterExpression0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitExpression0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitExpression0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression0Context expression0() throws RecognitionException {
		Expression0Context _localctx = new Expression0Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression0);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				expression1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				expression1();
				setState(155);
				operator0();
				setState(156);
				expression1();
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

	public static class Expression1Context extends ParserRuleContext {
		public List<Expression2Context> expression2() {
			return getRuleContexts(Expression2Context.class);
		}
		public Expression2Context expression2(int i) {
			return getRuleContext(Expression2Context.class,i);
		}
		public Operator1Context operator1() {
			return getRuleContext(Operator1Context.class,0);
		}
		public Expression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitExpression1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitExpression1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression1Context expression1() throws RecognitionException {
		Expression1Context _localctx = new Expression1Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression1);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				expression2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				expression2();
				setState(162);
				operator1();
				setState(163);
				expression2();
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

	public static class Expression2Context extends ParserRuleContext {
		public List<Expression3Context> expression3() {
			return getRuleContexts(Expression3Context.class);
		}
		public Expression3Context expression3(int i) {
			return getRuleContext(Expression3Context.class,i);
		}
		public Operator2Context operator2() {
			return getRuleContext(Operator2Context.class,0);
		}
		public Expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitExpression2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitExpression2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression2Context expression2() throws RecognitionException {
		Expression2Context _localctx = new Expression2Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression2);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				expression3();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				expression3();
				setState(169);
				operator2();
				setState(170);
				expression3();
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

	public static class Expression3Context extends ParserRuleContext {
		public TerminalNode PAR_OPEN() { return getToken(NobleScriptParser.PAR_OPEN, 0); }
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(NobleScriptParser.PAR_CLOSE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Expression3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterExpression3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitExpression3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitExpression3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression3Context expression3() throws RecognitionException {
		Expression3Context _localctx = new Expression3Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression3);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAR_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(PAR_OPEN);
				setState(175);
				expression0();
				setState(176);
				match(PAR_CLOSE);
				}
				break;
			case T__2:
			case READ:
			case NULL:
			case INT_LITERAL:
			case DOUBLE_LITERAL:
			case BOOLEAN_LITERAL:
			case STRING_LITERAL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				value();
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

	public static class ValueContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Function_call_stmContext function_call_stm() {
			return getRuleContext(Function_call_stmContext.class,0);
		}
		public TerminalNode ID() { return getToken(NobleScriptParser.ID, 0); }
		public Array_indexContext array_index() {
			return getRuleContext(Array_indexContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_value);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				function_call_stm();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				array_index();
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

	public static class Array_indexContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NobleScriptParser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(NobleScriptParser.BRACKET_OPEN, 0); }
		public TerminalNode INT_LITERAL() { return getToken(NobleScriptParser.INT_LITERAL, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(NobleScriptParser.BRACKET_CLOSE, 0); }
		public Array_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterArray_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitArray_index(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitArray_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_indexContext array_index() throws RecognitionException {
		Array_indexContext _localctx = new Array_indexContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_array_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(ID);
			setState(188);
			match(BRACKET_OPEN);
			setState(189);
			match(INT_LITERAL);
			setState(190);
			match(BRACKET_CLOSE);
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

	public static class Function_call_stmContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NobleScriptParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(NobleScriptParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(NobleScriptParser.PAR_CLOSE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode READ() { return getToken(NobleScriptParser.READ, 0); }
		public Print_stmContext print_stm() {
			return getRuleContext(Print_stmContext.class,0);
		}
		public Function_call_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterFunction_call_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitFunction_call_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitFunction_call_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_stmContext function_call_stm() throws RecognitionException {
		Function_call_stmContext _localctx = new Function_call_stmContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_call_stm);
		int _la;
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(ID);
				setState(193);
				match(PAR_OPEN);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << READ) | (1L << PAR_OPEN) | (1L << NULL) | (1L << INT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
					{
					setState(194);
					expression();
					}
				}

				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(197);
					match(T__1);
					setState(198);
					expression();
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				match(PAR_CLOSE);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(READ);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				print_stm();
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

	public static class Print_stmContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(NobleScriptParser.PAR_CLOSE, 0); }
		public Print_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterPrint_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitPrint_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitPrint_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmContext print_stm() throws RecognitionException {
		Print_stmContext _localctx = new Print_stmContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_print_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__2);
			setState(210);
			expression();
			setState(211);
			match(PAR_CLOSE);
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

	public static class LiteralContext extends ParserRuleContext {
		public Primitive_literalContext primitive_literal() {
			return getRuleContext(Primitive_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			primitive_literal();
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

	public static class Primitive_literalContext extends ParserRuleContext {
		public Primitive_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_literal; }
	 
		public Primitive_literalContext() { }
		public void copyFrom(Primitive_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanContext extends Primitive_literalContext {
		public TerminalNode BOOLEAN_LITERAL() { return getToken(NobleScriptParser.BOOLEAN_LITERAL, 0); }
		public BooleanContext(Primitive_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends Primitive_literalContext {
		public TerminalNode STRING_LITERAL() { return getToken(NobleScriptParser.STRING_LITERAL, 0); }
		public StringContext(Primitive_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullContext extends Primitive_literalContext {
		public TerminalNode NULL() { return getToken(NobleScriptParser.NULL, 0); }
		public NullContext(Primitive_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleContext extends Primitive_literalContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(NobleScriptParser.DOUBLE_LITERAL, 0); }
		public DoubleContext(Primitive_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends Primitive_literalContext {
		public TerminalNode INT_LITERAL() { return getToken(NobleScriptParser.INT_LITERAL, 0); }
		public IntContext(Primitive_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_literalContext primitive_literal() throws RecognitionException {
		Primitive_literalContext _localctx = new Primitive_literalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_primitive_literal);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN_LITERAL:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(BOOLEAN_LITERAL);
				}
				break;
			case INT_LITERAL:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(INT_LITERAL);
				}
				break;
			case DOUBLE_LITERAL:
				_localctx = new DoubleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(DOUBLE_LITERAL);
				}
				break;
			case STRING_LITERAL:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				match(STRING_LITERAL);
				}
				break;
			case NULL:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
				match(NULL);
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

	public static class TypeContext extends ParserRuleContext {
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			primitive_type();
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

	public static class Primitive_typeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN_TYPE() { return getToken(NobleScriptParser.BOOLEAN_TYPE, 0); }
		public TerminalNode INT_TYPE() { return getToken(NobleScriptParser.INT_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(NobleScriptParser.DOUBLE_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(NobleScriptParser.STRING_TYPE, 0); }
		public TerminalNode NULL() { return getToken(NobleScriptParser.NULL, 0); }
		public Primitive_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterPrimitive_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitPrimitive_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitPrimitive_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_typeContext primitive_type() throws RecognitionException {
		Primitive_typeContext _localctx = new Primitive_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_primitive_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE))) != 0)) ) {
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

	public static class Operator2Context extends ParserRuleContext {
		public TerminalNode DIV_OP() { return getToken(NobleScriptParser.DIV_OP, 0); }
		public TerminalNode MUL_OP() { return getToken(NobleScriptParser.MUL_OP, 0); }
		public Operator2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterOperator2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitOperator2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitOperator2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator2Context operator2() throws RecognitionException {
		Operator2Context _localctx = new Operator2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_operator2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_la = _input.LA(1);
			if ( !(_la==DIV_OP || _la==MUL_OP) ) {
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

	public static class Operator1Context extends ParserRuleContext {
		public TerminalNode PLUS_OP() { return getToken(NobleScriptParser.PLUS_OP, 0); }
		public TerminalNode MINUS_OP() { return getToken(NobleScriptParser.MINUS_OP, 0); }
		public Operator1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterOperator1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitOperator1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitOperator1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator1Context operator1() throws RecognitionException {
		Operator1Context _localctx = new Operator1Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_operator1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if ( !(_la==PLUS_OP || _la==MINUS_OP) ) {
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

	public static class Operator0Context extends ParserRuleContext {
		public TerminalNode LESSER_THAN_OP() { return getToken(NobleScriptParser.LESSER_THAN_OP, 0); }
		public TerminalNode GREATER_THAN_OP() { return getToken(NobleScriptParser.GREATER_THAN_OP, 0); }
		public TerminalNode EQUAL_OP() { return getToken(NobleScriptParser.EQUAL_OP, 0); }
		public TerminalNode NOT_EQUAL_OP() { return getToken(NobleScriptParser.NOT_EQUAL_OP, 0); }
		public Operator0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterOperator0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitOperator0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitOperator0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator0Context operator0() throws RecognitionException {
		Operator0Context _localctx = new Operator0Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_operator0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESSER_THAN_OP) | (1L << GREATER_THAN_OP) | (1L << EQUAL_OP) | (1L << NOT_EQUAL_OP))) != 0)) ) {
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

	public static class Compound_statementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitCompound_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitCompound_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_compound_statement);
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				if_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				loop_statement();
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

	public static class Loop_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(NobleScriptParser.WHILE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(NobleScriptParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(NobleScriptParser.PAR_CLOSE, 0); }
		public TerminalNode BRACES_OPEN() { return getToken(NobleScriptParser.BRACES_OPEN, 0); }
		public TerminalNode BRACES_CLOSE() { return getToken(NobleScriptParser.BRACES_CLOSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterLoop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitLoop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitLoop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_loop_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(WHILE);
			setState(237);
			match(PAR_OPEN);
			setState(238);
			expression();
			setState(239);
			match(PAR_CLOSE);
			setState(240);
			match(BRACES_OPEN);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << READ) | (1L << RETURN) | (1L << WHILE) | (1L << IF) | (1L << NULL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(241);
				statement();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			match(BRACES_CLOSE);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(NobleScriptParser.IF, 0); }
		public List<TerminalNode> PAR_OPEN() { return getTokens(NobleScriptParser.PAR_OPEN); }
		public TerminalNode PAR_OPEN(int i) {
			return getToken(NobleScriptParser.PAR_OPEN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> PAR_CLOSE() { return getTokens(NobleScriptParser.PAR_CLOSE); }
		public TerminalNode PAR_CLOSE(int i) {
			return getToken(NobleScriptParser.PAR_CLOSE, i);
		}
		public List<TerminalNode> BRACES_OPEN() { return getTokens(NobleScriptParser.BRACES_OPEN); }
		public TerminalNode BRACES_OPEN(int i) {
			return getToken(NobleScriptParser.BRACES_OPEN, i);
		}
		public List<TerminalNode> BRACES_CLOSE() { return getTokens(NobleScriptParser.BRACES_CLOSE); }
		public TerminalNode BRACES_CLOSE(int i) {
			return getToken(NobleScriptParser.BRACES_CLOSE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(NobleScriptParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(NobleScriptParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(NobleScriptParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(IF);
			setState(250);
			match(PAR_OPEN);
			setState(251);
			expression();
			setState(252);
			match(PAR_CLOSE);
			setState(253);
			match(BRACES_OPEN);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << READ) | (1L << RETURN) | (1L << WHILE) | (1L << IF) | (1L << NULL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(254);
				statement();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			match(BRACES_CLOSE);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(261);
				match(ELIF);
				setState(262);
				match(PAR_OPEN);
				setState(263);
				expression();
				setState(264);
				match(PAR_CLOSE);
				setState(265);
				match(BRACES_OPEN);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << READ) | (1L << RETURN) | (1L << WHILE) | (1L << IF) | (1L << NULL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
					{
					{
					setState(266);
					statement();
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(272);
				match(BRACES_CLOSE);
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(279);
				match(ELSE);
				setState(280);
				match(BRACES_OPEN);
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << READ) | (1L << RETURN) | (1L << WHILE) | (1L << IF) | (1L << NULL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
					{
					{
					setState(281);
					statement();
					}
					}
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(287);
				match(BRACES_CLOSE);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0125\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3N\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Y\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6f\n\6\3\7\3\7\3\7\3\7\3\7\3\7\6\7n\n\7\r\7\16\7o\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\bz\n\b\3\b\3\b\3\b\3\b\7\b\u0080\n\b\f\b\16"+
		"\b\u0083\13\b\3\b\3\b\3\b\7\b\u0088\n\b\f\b\16\b\u008b\13\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u00a1\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00a8\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00af\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u00b6\n\17\3\20\3"+
		"\20\3\20\3\20\5\20\u00bc\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\5\22\u00c6\n\22\3\22\3\22\7\22\u00ca\n\22\f\22\16\22\u00cd\13\22\3\22"+
		"\3\22\3\22\5\22\u00d2\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u00df\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\5\33\u00ed\n\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u00f5"+
		"\n\34\f\34\16\34\u00f8\13\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\7"+
		"\35\u0102\n\35\f\35\16\35\u0105\13\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\7\35\u010e\n\35\f\35\16\35\u0111\13\35\3\35\3\35\7\35\u0115\n\35\f"+
		"\35\16\35\u0118\13\35\3\35\3\35\3\35\7\35\u011d\n\35\f\35\16\35\u0120"+
		"\13\35\3\35\5\35\u0123\n\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668\2\6\4\2\22\22\27\32\3\2%&\3\2\"#\3\2\36"+
		"!\2\u012b\2=\3\2\2\2\4M\3\2\2\2\6X\3\2\2\2\bZ\3\2\2\2\ne\3\2\2\2\fg\3"+
		"\2\2\2\16s\3\2\2\2\20\u008e\3\2\2\2\22\u0093\3\2\2\2\24\u0099\3\2\2\2"+
		"\26\u00a0\3\2\2\2\30\u00a7\3\2\2\2\32\u00ae\3\2\2\2\34\u00b5\3\2\2\2\36"+
		"\u00bb\3\2\2\2 \u00bd\3\2\2\2\"\u00d1\3\2\2\2$\u00d3\3\2\2\2&\u00d7\3"+
		"\2\2\2(\u00de\3\2\2\2*\u00e0\3\2\2\2,\u00e2\3\2\2\2.\u00e4\3\2\2\2\60"+
		"\u00e6\3\2\2\2\62\u00e8\3\2\2\2\64\u00ec\3\2\2\2\66\u00ee\3\2\2\28\u00fb"+
		"\3\2\2\2:<\5\4\3\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?"+
		"=\3\2\2\2@A\7\2\2\3A\3\3\2\2\2BN\5\64\33\2CN\5\n\6\2DE\5\"\22\2EF\7\34"+
		"\2\2FN\3\2\2\2GH\5\6\4\2HI\7\34\2\2IN\3\2\2\2JK\5\b\5\2KL\7\34\2\2LN\3"+
		"\2\2\2MB\3\2\2\2MC\3\2\2\2MD\3\2\2\2MG\3\2\2\2MJ\3\2\2\2N\5\3\2\2\2OP"+
		"\7\33\2\2PQ\7\35\2\2QY\5\24\13\2RS\7\33\2\2ST\7\20\2\2TU\7\23\2\2UV\7"+
		"\21\2\2VW\7\35\2\2WY\5\24\13\2XO\3\2\2\2XR\3\2\2\2Y\7\3\2\2\2Z[\7\7\2"+
		"\2[\\\5\24\13\2\\\t\3\2\2\2]^\5\20\t\2^_\7\34\2\2_f\3\2\2\2`f\5\f\7\2"+
		"af\5\16\b\2bc\5\22\n\2cd\7\34\2\2df\3\2\2\2e]\3\2\2\2e`\3\2\2\2ea\3\2"+
		"\2\2eb\3\2\2\2f\13\3\2\2\2gh\7\3\2\2hi\7\33\2\2im\7\16\2\2jk\5\20\t\2"+
		"kl\7\34\2\2ln\3\2\2\2mj\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2"+
		"\2qr\7\17\2\2r\r\3\2\2\2st\5*\26\2tu\7\33\2\2uy\7\f\2\2vw\5*\26\2wx\7"+
		"\33\2\2xz\3\2\2\2yv\3\2\2\2yz\3\2\2\2z\u0081\3\2\2\2{|\7\4\2\2|}\5*\26"+
		"\2}~\7\33\2\2~\u0080\3\2\2\2\177{\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084"+
		"\u0085\7\r\2\2\u0085\u0089\7\16\2\2\u0086\u0088\5\4\3\2\u0087\u0086\3"+
		"\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7\17\2\2\u008d\17\3\2\2"+
		"\2\u008e\u008f\5*\26\2\u008f\u0090\7\33\2\2\u0090\u0091\7\35\2\2\u0091"+
		"\u0092\5\24\13\2\u0092\21\3\2\2\2\u0093\u0094\5*\26\2\u0094\u0095\7\33"+
		"\2\2\u0095\u0096\7\20\2\2\u0096\u0097\7\23\2\2\u0097\u0098\7\21\2\2\u0098"+
		"\23\3\2\2\2\u0099\u009a\5\26\f\2\u009a\25\3\2\2\2\u009b\u00a1\5\30\r\2"+
		"\u009c\u009d\5\30\r\2\u009d\u009e\5\62\32\2\u009e\u009f\5\30\r\2\u009f"+
		"\u00a1\3\2\2\2\u00a0\u009b\3\2\2\2\u00a0\u009c\3\2\2\2\u00a1\27\3\2\2"+
		"\2\u00a2\u00a8\5\32\16\2\u00a3\u00a4\5\32\16\2\u00a4\u00a5\5\60\31\2\u00a5"+
		"\u00a6\5\32\16\2\u00a6\u00a8\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a7\u00a3\3"+
		"\2\2\2\u00a8\31\3\2\2\2\u00a9\u00af\5\34\17\2\u00aa\u00ab\5\34\17\2\u00ab"+
		"\u00ac\5.\30\2\u00ac\u00ad\5\34\17\2\u00ad\u00af\3\2\2\2\u00ae\u00a9\3"+
		"\2\2\2\u00ae\u00aa\3\2\2\2\u00af\33\3\2\2\2\u00b0\u00b1\7\f\2\2\u00b1"+
		"\u00b2\5\26\f\2\u00b2\u00b3\7\r\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b6\5"+
		"\36\20\2\u00b5\u00b0\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\35\3\2\2\2\u00b7"+
		"\u00bc\5&\24\2\u00b8\u00bc\5\"\22\2\u00b9\u00bc\7\33\2\2\u00ba\u00bc\5"+
		" \21\2\u00bb\u00b7\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc\37\3\2\2\2\u00bd\u00be\7\33\2\2\u00be\u00bf\7\20"+
		"\2\2\u00bf\u00c0\7\23\2\2\u00c0\u00c1\7\21\2\2\u00c1!\3\2\2\2\u00c2\u00c3"+
		"\7\33\2\2\u00c3\u00c5\7\f\2\2\u00c4\u00c6\5\24\13\2\u00c5\u00c4\3\2\2"+
		"\2\u00c5\u00c6\3\2\2\2\u00c6\u00cb\3\2\2\2\u00c7\u00c8\7\4\2\2\u00c8\u00ca"+
		"\5\24\13\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2"+
		"\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d2"+
		"\7\r\2\2\u00cf\u00d2\7\6\2\2\u00d0\u00d2\5$\23\2\u00d1\u00c2\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2#\3\2\2\2\u00d3\u00d4\7\5\2\2"+
		"\u00d4\u00d5\5\24\13\2\u00d5\u00d6\7\r\2\2\u00d6%\3\2\2\2\u00d7\u00d8"+
		"\5(\25\2\u00d8\'\3\2\2\2\u00d9\u00df\7\25\2\2\u00da\u00df\7\23\2\2\u00db"+
		"\u00df\7\24\2\2\u00dc\u00df\7\26\2\2\u00dd\u00df\7\22\2\2\u00de\u00d9"+
		"\3\2\2\2\u00de\u00da\3\2\2\2\u00de\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00dd\3\2\2\2\u00df)\3\2\2\2\u00e0\u00e1\5,\27\2\u00e1+\3\2\2\2\u00e2"+
		"\u00e3\t\2\2\2\u00e3-\3\2\2\2\u00e4\u00e5\t\3\2\2\u00e5/\3\2\2\2\u00e6"+
		"\u00e7\t\4\2\2\u00e7\61\3\2\2\2\u00e8\u00e9\t\5\2\2\u00e9\63\3\2\2\2\u00ea"+
		"\u00ed\58\35\2\u00eb\u00ed\5\66\34\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3"+
		"\2\2\2\u00ed\65\3\2\2\2\u00ee\u00ef\7\b\2\2\u00ef\u00f0\7\f\2\2\u00f0"+
		"\u00f1\5\24\13\2\u00f1\u00f2\7\r\2\2\u00f2\u00f6\7\16\2\2\u00f3\u00f5"+
		"\5\4\3\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7\17"+
		"\2\2\u00fa\67\3\2\2\2\u00fb\u00fc\7\t\2\2\u00fc\u00fd\7\f\2\2\u00fd\u00fe"+
		"\5\24\13\2\u00fe\u00ff\7\r\2\2\u00ff\u0103\7\16\2\2\u0100\u0102\5\4\3"+
		"\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0116\7\17\2\2"+
		"\u0107\u0108\7\n\2\2\u0108\u0109\7\f\2\2\u0109\u010a\5\24\13\2\u010a\u010b"+
		"\7\r\2\2\u010b\u010f\7\16\2\2\u010c\u010e\5\4\3\2\u010d\u010c\3\2\2\2"+
		"\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112"+
		"\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\7\17\2\2\u0113\u0115\3\2\2\2"+
		"\u0114\u0107\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\u0122\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7\13\2\2"+
		"\u011a\u011e\7\16\2\2\u011b\u011d\5\4\3\2\u011c\u011b\3\2\2\2\u011d\u0120"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0121\u0123\7\17\2\2\u0122\u0119\3\2\2\2\u0122\u0123\3"+
		"\2\2\2\u01239\3\2\2\2\32=MXeoy\u0081\u0089\u00a0\u00a7\u00ae\u00b5\u00bb"+
		"\u00c5\u00cb\u00d1\u00de\u00ec\u00f6\u0103\u010f\u0116\u011e\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}