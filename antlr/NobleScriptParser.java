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
		T__0=1, T__1=2, T__2=3, T__3=4, READ=5, RETURN=6, WHILE=7, IF=8, ELIF=9, 
		ELSE=10, PAR_OPEN=11, PAR_CLOSE=12, BRACES_OPEN=13, BRACES_CLOSE=14, BRACKET_OPEN=15, 
		BRAKCET_CLOSE=16, NULL=17, INT_LITERAL=18, DOUBLE_LITERAL=19, BOOLEAN_LITERAL=20, 
		STRING_LITERAL=21, ARRAY_SIZE_LITERAL=22, BOOLEAN_TYPE=23, INT_TYPE=24, 
		DOUBLE_TYPE=25, STRING_TYPE=26, ID=27, SEMICOL=28, ASSIGN_OP=29, LESSER_THAN_OP=30, 
		GREATER_THAN_OP=31, EQUAL_OP=32, NOT_EQUAL_OP=33, PLUS_OP=34, MINUS_OP=35, 
		POW_OP=36, DIV_OP=37, MUL_OP=38, WHITESPACE=39, NEWLINE=40;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assign_statement = 2, RULE_return_statement = 3, 
		RULE_definition = 4, RULE_structure_definition = 5, RULE_function_definition = 6, 
		RULE_variable_definition = 7, RULE_expression = 8, RULE_value = 9, RULE_function_call_stm = 10, 
		RULE_print_stm = 11, RULE_literal = 12, RULE_primitive_literal = 13, RULE_array_literal = 14, 
		RULE_type = 15, RULE_array_type = 16, RULE_primitive_type = 17, RULE_operator = 18, 
		RULE_compound_statement = 19, RULE_loop_statement = 20, RULE_if_statement = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "assign_statement", "return_statement", "definition", 
			"structure_definition", "function_definition", "variable_definition", 
			"expression", "value", "function_call_stm", "print_stm", "literal", "primitive_literal", 
			"array_literal", "type", "array_type", "primitive_type", "operator", 
			"compound_statement", "loop_statement", "if_statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'struct'", "','", "'print'", "'[]'", "'read()'", "'return'", "'while'", 
			"'if'", "'elif'", "'else'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"'null'", null, null, null, null, null, "'boolean'", "'int'", "'double'", 
			"'string'", null, "';'", "'='", "'<'", "'>'", "'=='", "'!='", "'+'", 
			"'-'", "'^'", "'/'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "READ", "RETURN", "WHILE", "IF", "ELIF", 
			"ELSE", "PAR_OPEN", "PAR_CLOSE", "BRACES_OPEN", "BRACES_CLOSE", "BRACKET_OPEN", 
			"BRAKCET_CLOSE", "NULL", "INT_LITERAL", "DOUBLE_LITERAL", "BOOLEAN_LITERAL", 
			"STRING_LITERAL", "ARRAY_SIZE_LITERAL", "BOOLEAN_TYPE", "INT_TYPE", "DOUBLE_TYPE", 
			"STRING_TYPE", "ID", "SEMICOL", "ASSIGN_OP", "LESSER_THAN_OP", "GREATER_THAN_OP", 
			"EQUAL_OP", "NOT_EQUAL_OP", "PLUS_OP", "MINUS_OP", "POW_OP", "DIV_OP", 
			"MUL_OP", "WHITESPACE", "NEWLINE"
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
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << READ) | (1L << RETURN) | (1L << WHILE) | (1L << IF) | (1L << NULL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(44);
				statement();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
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
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				compound_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				function_call_stm();
				setState(55);
				match(SEMICOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				assign_statement();
				setState(58);
				match(SEMICOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				return_statement();
				setState(61);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(ID);
			setState(66);
			match(ASSIGN_OP);
			setState(67);
			expression(0);
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
			setState(69);
			match(RETURN);
			setState(70);
			expression(0);
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
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				variable_definition();
				setState(73);
				match(SEMICOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				structure_definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				function_definition();
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
			setState(79);
			match(T__0);
			setState(80);
			match(ID);
			setState(81);
			match(BRACES_OPEN);
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82);
				variable_definition();
				setState(83);
				match(SEMICOL);
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE))) != 0) );
			setState(89);
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
			setState(91);
			type();
			setState(92);
			match(ID);
			setState(93);
			match(PAR_OPEN);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE))) != 0)) {
				{
				setState(94);
				type();
				setState(95);
				match(ID);
				}
			}

			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(99);
				match(T__1);
				setState(100);
				type();
				setState(101);
				match(ID);
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(PAR_CLOSE);
			setState(109);
			match(BRACES_OPEN);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << READ) | (1L << RETURN) | (1L << WHILE) | (1L << IF) | (1L << NULL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(110);
				statement();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
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
		public Assign_statementContext assign_statement() {
			return getRuleContext(Assign_statementContext.class,0);
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
			setState(118);
			type();
			setState(119);
			assign_statement();
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode PAR_OPEN() { return getToken(NobleScriptParser.PAR_OPEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PAR_CLOSE() { return getToken(NobleScriptParser.PAR_CLOSE, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
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
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case READ:
			case NULL:
			case INT_LITERAL:
			case DOUBLE_LITERAL:
			case BOOLEAN_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_TYPE:
			case INT_TYPE:
			case DOUBLE_TYPE:
			case STRING_TYPE:
			case ID:
				{
				setState(122);
				value();
				}
				break;
			case PAR_OPEN:
				{
				setState(123);
				match(PAR_OPEN);
				setState(124);
				expression(0);
				setState(125);
				match(PAR_CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(129);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(130);
					operator();
					setState(131);
					expression(3);
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class ValueContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Function_call_stmContext function_call_stm() {
			return getRuleContext(Function_call_stmContext.class,0);
		}
		public TerminalNode ID() { return getToken(NobleScriptParser.ID, 0); }
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
		enterRule(_localctx, 18, RULE_value);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				function_call_stm();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(ID);
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
		enterRule(_localctx, 20, RULE_function_call_stm);
		int _la;
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(ID);
				setState(144);
				match(PAR_OPEN);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << READ) | (1L << PAR_OPEN) | (1L << NULL) | (1L << INT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
					{
					setState(145);
					expression(0);
					}
				}

				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(148);
					match(T__1);
					setState(149);
					expression(0);
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(155);
				match(PAR_CLOSE);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(READ);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
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
		public TerminalNode PAR_OPEN() { return getToken(NobleScriptParser.PAR_OPEN, 0); }
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
		enterRule(_localctx, 22, RULE_print_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__2);
			setState(161);
			match(PAR_OPEN);
			setState(162);
			expression(0);
			setState(163);
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
		public Array_literalContext array_literal() {
			return getRuleContext(Array_literalContext.class,0);
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
		enterRule(_localctx, 24, RULE_literal);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				primitive_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				array_literal();
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

	public static class Primitive_literalContext extends ParserRuleContext {
		public TerminalNode BOOLEAN_LITERAL() { return getToken(NobleScriptParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode INT_LITERAL() { return getToken(NobleScriptParser.INT_LITERAL, 0); }
		public TerminalNode DOUBLE_LITERAL() { return getToken(NobleScriptParser.DOUBLE_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(NobleScriptParser.STRING_LITERAL, 0); }
		public TerminalNode NULL() { return getToken(NobleScriptParser.NULL, 0); }
		public Primitive_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterPrimitive_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitPrimitive_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitPrimitive_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_literalContext primitive_literal() throws RecognitionException {
		Primitive_literalContext _localctx = new Primitive_literalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primitive_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << INT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL))) != 0)) ) {
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

	public static class Array_literalContext extends ParserRuleContext {
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public TerminalNode ARRAY_SIZE_LITERAL() { return getToken(NobleScriptParser.ARRAY_SIZE_LITERAL, 0); }
		public Array_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterArray_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitArray_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitArray_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_literalContext array_literal() throws RecognitionException {
		Array_literalContext _localctx = new Array_literalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_array_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			primitive_type();
			setState(172);
			match(ARRAY_SIZE_LITERAL);
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
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
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
		enterRule(_localctx, 30, RULE_type);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				primitive_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				array_type();
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

	public static class Array_typeContext extends ParserRuleContext {
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterArray_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitArray_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitArray_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			primitive_type();
			setState(179);
			match(T__3);
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
		enterRule(_localctx, 34, RULE_primitive_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode PLUS_OP() { return getToken(NobleScriptParser.PLUS_OP, 0); }
		public TerminalNode MINUS_OP() { return getToken(NobleScriptParser.MINUS_OP, 0); }
		public TerminalNode POW_OP() { return getToken(NobleScriptParser.POW_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(NobleScriptParser.DIV_OP, 0); }
		public TerminalNode MUL_OP() { return getToken(NobleScriptParser.MUL_OP, 0); }
		public TerminalNode LESSER_THAN_OP() { return getToken(NobleScriptParser.LESSER_THAN_OP, 0); }
		public TerminalNode GREATER_THAN_OP() { return getToken(NobleScriptParser.GREATER_THAN_OP, 0); }
		public TerminalNode EQUAL_OP() { return getToken(NobleScriptParser.EQUAL_OP, 0); }
		public TerminalNode NOT_EQUAL_OP() { return getToken(NobleScriptParser.NOT_EQUAL_OP, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESSER_THAN_OP) | (1L << GREATER_THAN_OP) | (1L << EQUAL_OP) | (1L << NOT_EQUAL_OP) | (1L << PLUS_OP) | (1L << MINUS_OP) | (1L << POW_OP) | (1L << DIV_OP) | (1L << MUL_OP))) != 0)) ) {
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
		enterRule(_localctx, 38, RULE_compound_statement);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				if_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
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
		enterRule(_localctx, 40, RULE_loop_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(WHILE);
			setState(190);
			match(PAR_OPEN);
			setState(191);
			expression(0);
			setState(192);
			match(PAR_CLOSE);
			setState(193);
			match(BRACES_OPEN);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << READ) | (1L << RETURN) | (1L << WHILE) | (1L << IF) | (1L << NULL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(194);
				statement();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
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
		enterRule(_localctx, 42, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(IF);
			setState(203);
			match(PAR_OPEN);
			setState(204);
			expression(0);
			setState(205);
			match(PAR_CLOSE);
			setState(206);
			match(BRACES_OPEN);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << READ) | (1L << RETURN) | (1L << WHILE) | (1L << IF) | (1L << NULL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(207);
				statement();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			match(BRACES_CLOSE);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(214);
				match(ELIF);
				setState(215);
				match(PAR_OPEN);
				setState(216);
				expression(0);
				setState(217);
				match(PAR_CLOSE);
				setState(218);
				match(BRACES_OPEN);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << READ) | (1L << RETURN) | (1L << WHILE) | (1L << IF) | (1L << NULL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
					{
					{
					setState(219);
					statement();
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(225);
				match(BRACES_CLOSE);
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(232);
				match(ELSE);
				setState(233);
				match(BRACES_OPEN);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << READ) | (1L << RETURN) | (1L << WHILE) | (1L << IF) | (1L << NULL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
					{
					{
					setState(234);
					statement();
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(240);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00f6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"B\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6P\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\6\7X\n\7\r\7\16\7Y\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\bd\n\b\3\b\3\b\3\b\3\b\7\bj\n\b\f\b\16\bm\13\b\3\b\3\b\3\b\7\br\n\b\f"+
		"\b\16\bu\13\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0082\n"+
		"\n\3\n\3\n\3\n\3\n\7\n\u0088\n\n\f\n\16\n\u008b\13\n\3\13\3\13\3\13\5"+
		"\13\u0090\n\13\3\f\3\f\3\f\5\f\u0095\n\f\3\f\3\f\7\f\u0099\n\f\f\f\16"+
		"\f\u009c\13\f\3\f\3\f\3\f\5\f\u00a1\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\5\16\u00aa\n\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\5\21\u00b3\n\21\3"+
		"\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\5\25\u00be\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\7\26\u00c6\n\26\f\26\16\26\u00c9\13\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u00d3\n\27\f\27\16\27\u00d6\13\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u00df\n\27\f\27\16\27\u00e2\13"+
		"\27\3\27\3\27\7\27\u00e6\n\27\f\27\16\27\u00e9\13\27\3\27\3\27\3\27\7"+
		"\27\u00ee\n\27\f\27\16\27\u00f1\13\27\3\27\5\27\u00f4\n\27\3\27\2\3\22"+
		"\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\5\3\2\23\27\4\2\23"+
		"\23\31\34\3\2 (\2\u00fb\2\61\3\2\2\2\4A\3\2\2\2\6C\3\2\2\2\bG\3\2\2\2"+
		"\nO\3\2\2\2\fQ\3\2\2\2\16]\3\2\2\2\20x\3\2\2\2\22\u0081\3\2\2\2\24\u008f"+
		"\3\2\2\2\26\u00a0\3\2\2\2\30\u00a2\3\2\2\2\32\u00a9\3\2\2\2\34\u00ab\3"+
		"\2\2\2\36\u00ad\3\2\2\2 \u00b2\3\2\2\2\"\u00b4\3\2\2\2$\u00b7\3\2\2\2"+
		"&\u00b9\3\2\2\2(\u00bd\3\2\2\2*\u00bf\3\2\2\2,\u00cc\3\2\2\2.\60\5\4\3"+
		"\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63"+
		"\61\3\2\2\2\64\65\7\2\2\3\65\3\3\2\2\2\66B\5(\25\2\67B\5\n\6\289\5\26"+
		"\f\29:\7\36\2\2:B\3\2\2\2;<\5\6\4\2<=\7\36\2\2=B\3\2\2\2>?\5\b\5\2?@\7"+
		"\36\2\2@B\3\2\2\2A\66\3\2\2\2A\67\3\2\2\2A8\3\2\2\2A;\3\2\2\2A>\3\2\2"+
		"\2B\5\3\2\2\2CD\7\35\2\2DE\7\37\2\2EF\5\22\n\2F\7\3\2\2\2GH\7\b\2\2HI"+
		"\5\22\n\2I\t\3\2\2\2JK\5\20\t\2KL\7\36\2\2LP\3\2\2\2MP\5\f\7\2NP\5\16"+
		"\b\2OJ\3\2\2\2OM\3\2\2\2ON\3\2\2\2P\13\3\2\2\2QR\7\3\2\2RS\7\35\2\2SW"+
		"\7\17\2\2TU\5\20\t\2UV\7\36\2\2VX\3\2\2\2WT\3\2\2\2XY\3\2\2\2YW\3\2\2"+
		"\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\20\2\2\\\r\3\2\2\2]^\5 \21\2^_\7\35\2\2_c"+
		"\7\r\2\2`a\5 \21\2ab\7\35\2\2bd\3\2\2\2c`\3\2\2\2cd\3\2\2\2dk\3\2\2\2"+
		"ef\7\4\2\2fg\5 \21\2gh\7\35\2\2hj\3\2\2\2ie\3\2\2\2jm\3\2\2\2ki\3\2\2"+
		"\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\16\2\2os\7\17\2\2pr\5\4\3\2qp\3\2"+
		"\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\20\2\2w\17"+
		"\3\2\2\2xy\5 \21\2yz\5\6\4\2z\21\3\2\2\2{|\b\n\1\2|\u0082\5\24\13\2}~"+
		"\7\r\2\2~\177\5\22\n\2\177\u0080\7\16\2\2\u0080\u0082\3\2\2\2\u0081{\3"+
		"\2\2\2\u0081}\3\2\2\2\u0082\u0089\3\2\2\2\u0083\u0084\f\4\2\2\u0084\u0085"+
		"\5&\24\2\u0085\u0086\5\22\n\5\u0086\u0088\3\2\2\2\u0087\u0083\3\2\2\2"+
		"\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\23"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u0090\5\32\16\2\u008d\u0090\5\26\f"+
		"\2\u008e\u0090\7\35\2\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\25\3\2\2\2\u0091\u0092\7\35\2\2\u0092\u0094\7\r\2"+
		"\2\u0093\u0095\5\22\n\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u009a\3\2\2\2\u0096\u0097\7\4\2\2\u0097\u0099\5\22\n\2\u0098\u0096\3"+
		"\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00a1\7\16\2\2\u009e\u00a1\7"+
		"\7\2\2\u009f\u00a1\5\30\r\2\u00a0\u0091\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\27\3\2\2\2\u00a2\u00a3\7\5\2\2\u00a3\u00a4\7\r\2"+
		"\2\u00a4\u00a5\5\22\n\2\u00a5\u00a6\7\16\2\2\u00a6\31\3\2\2\2\u00a7\u00aa"+
		"\5\34\17\2\u00a8\u00aa\5\36\20\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2"+
		"\2\u00aa\33\3\2\2\2\u00ab\u00ac\t\2\2\2\u00ac\35\3\2\2\2\u00ad\u00ae\5"+
		"$\23\2\u00ae\u00af\7\30\2\2\u00af\37\3\2\2\2\u00b0\u00b3\5$\23\2\u00b1"+
		"\u00b3\5\"\22\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3!\3\2\2\2"+
		"\u00b4\u00b5\5$\23\2\u00b5\u00b6\7\6\2\2\u00b6#\3\2\2\2\u00b7\u00b8\t"+
		"\3\2\2\u00b8%\3\2\2\2\u00b9\u00ba\t\4\2\2\u00ba\'\3\2\2\2\u00bb\u00be"+
		"\5,\27\2\u00bc\u00be\5*\26\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be"+
		")\3\2\2\2\u00bf\u00c0\7\t\2\2\u00c0\u00c1\7\r\2\2\u00c1\u00c2\5\22\n\2"+
		"\u00c2\u00c3\7\16\2\2\u00c3\u00c7\7\17\2\2\u00c4\u00c6\5\4\3\2\u00c5\u00c4"+
		"\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7\20\2\2\u00cb+\3\2\2\2"+
		"\u00cc\u00cd\7\n\2\2\u00cd\u00ce\7\r\2\2\u00ce\u00cf\5\22\n\2\u00cf\u00d0"+
		"\7\16\2\2\u00d0\u00d4\7\17\2\2\u00d1\u00d3\5\4\3\2\u00d2\u00d1\3\2\2\2"+
		"\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7"+
		"\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00e7\7\20\2\2\u00d8\u00d9\7\13\2\2"+
		"\u00d9\u00da\7\r\2\2\u00da\u00db\5\22\n\2\u00db\u00dc\7\16\2\2\u00dc\u00e0"+
		"\7\17\2\2\u00dd\u00df\5\4\3\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2"+
		"\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e3\u00e4\7\20\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00d8\3\2\2\2"+
		"\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00f3"+
		"\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7\f\2\2\u00eb\u00ef\7\17\2\2"+
		"\u00ec\u00ee\5\4\3\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f4\7\20\2\2\u00f3\u00ea\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4-\3\2\2\2"+
		"\30\61AOYcks\u0081\u0089\u008f\u0094\u009a\u00a0\u00a9\u00b2\u00bd\u00c7"+
		"\u00d4\u00e0\u00e7\u00ef\u00f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}