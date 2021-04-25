// Generated from C:/Users/Danie/Desktop/noble-script/src\NobleScript.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NobleScriptLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "READ", "RETURN", "WHILE", "IF", "ELIF", "ELSE", 
			"PAR_OPEN", "PAR_CLOSE", "BRACES_OPEN", "BRACES_CLOSE", "BRACKET_OPEN", 
			"BRACKET_CLOSE", "NULL", "INT_LITERAL", "DOUBLE_LITERAL", "BOOLEAN_LITERAL", 
			"STRING_LITERAL", "BOOLEAN_TYPE", "INT_TYPE", "DOUBLE_TYPE", "STRING_TYPE", 
			"ID", "SEMICOL", "ASSIGN_OP", "LESSER_THAN_OP", "GREATER_THAN_OP", "EQUAL_OP", 
			"NOT_EQUAL_OP", "PLUS_OP", "MINUS_OP", "POW_OP", "DIV_OP", "MUL_OP", 
			"WHITESPACE", "NEWLINE"
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


	public NobleScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NobleScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0108\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\5\22\u0093\n\22\3\22\6\22"+
		"\u0096\n\22\r\22\16\22\u0097\3\22\7\22\u009b\n\22\f\22\16\22\u009e\13"+
		"\22\3\23\5\23\u00a1\n\23\3\23\6\23\u00a4\n\23\r\23\16\23\u00a5\3\23\7"+
		"\23\u00a9\n\23\f\23\16\23\u00ac\13\23\3\23\3\23\6\23\u00b0\n\23\r\23\16"+
		"\23\u00b1\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00bd\n\24"+
		"\3\25\3\25\7\25\u00c1\n\25\f\25\16\25\u00c4\13\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\7\32\u00e4"+
		"\n\32\f\32\16\32\u00e7\13\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3\'"+
		"\3\'\3\'\3\'\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(\3\2\t\3\2\63;\3\2\62;\4\2$$``\4"+
		"\2C\\c|\7\2//\62;C\\aac|\4\2\13\13\"\"\4\2\f\f\17\17\2\u0111\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5V\3\2\2\2\7X\3\2\2\2\t_\3\2\2\2\13"+
		"f\3\2\2\2\rm\3\2\2\2\17s\3\2\2\2\21v\3\2\2\2\23{\3\2\2\2\25\u0080\3\2"+
		"\2\2\27\u0082\3\2\2\2\31\u0084\3\2\2\2\33\u0086\3\2\2\2\35\u0088\3\2\2"+
		"\2\37\u008a\3\2\2\2!\u008c\3\2\2\2#\u0092\3\2\2\2%\u00a0\3\2\2\2\'\u00bc"+
		"\3\2\2\2)\u00be\3\2\2\2+\u00c7\3\2\2\2-\u00cf\3\2\2\2/\u00d3\3\2\2\2\61"+
		"\u00da\3\2\2\2\63\u00e1\3\2\2\2\65\u00e8\3\2\2\2\67\u00ea\3\2\2\29\u00ec"+
		"\3\2\2\2;\u00ee\3\2\2\2=\u00f0\3\2\2\2?\u00f3\3\2\2\2A\u00f6\3\2\2\2C"+
		"\u00f8\3\2\2\2E\u00fa\3\2\2\2G\u00fc\3\2\2\2I\u00fe\3\2\2\2K\u0100\3\2"+
		"\2\2M\u0104\3\2\2\2OP\7u\2\2PQ\7v\2\2QR\7t\2\2RS\7w\2\2ST\7e\2\2TU\7v"+
		"\2\2U\4\3\2\2\2VW\7.\2\2W\6\3\2\2\2XY\7r\2\2YZ\7t\2\2Z[\7k\2\2[\\\7p\2"+
		"\2\\]\7v\2\2]^\7*\2\2^\b\3\2\2\2_`\7t\2\2`a\7g\2\2ab\7c\2\2bc\7f\2\2c"+
		"d\7*\2\2de\7+\2\2e\n\3\2\2\2fg\7t\2\2gh\7g\2\2hi\7v\2\2ij\7w\2\2jk\7t"+
		"\2\2kl\7p\2\2l\f\3\2\2\2mn\7y\2\2no\7j\2\2op\7k\2\2pq\7n\2\2qr\7g\2\2"+
		"r\16\3\2\2\2st\7k\2\2tu\7h\2\2u\20\3\2\2\2vw\7g\2\2wx\7n\2\2xy\7k\2\2"+
		"yz\7h\2\2z\22\3\2\2\2{|\7g\2\2|}\7n\2\2}~\7u\2\2~\177\7g\2\2\177\24\3"+
		"\2\2\2\u0080\u0081\7*\2\2\u0081\26\3\2\2\2\u0082\u0083\7+\2\2\u0083\30"+
		"\3\2\2\2\u0084\u0085\7}\2\2\u0085\32\3\2\2\2\u0086\u0087\7\177\2\2\u0087"+
		"\34\3\2\2\2\u0088\u0089\7]\2\2\u0089\36\3\2\2\2\u008a\u008b\7_\2\2\u008b"+
		" \3\2\2\2\u008c\u008d\7p\2\2\u008d\u008e\7w\2\2\u008e\u008f\7n\2\2\u008f"+
		"\u0090\7n\2\2\u0090\"\3\2\2\2\u0091\u0093\7/\2\2\u0092\u0091\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0096\t\2\2\2\u0095\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u009c\3\2\2\2\u0099\u009b\t\3\2\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d$\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009f\u00a1\7/\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2\u00a4\t\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00aa\3\2\2\2\u00a7"+
		"\u00a9\t\3\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00af\7\60\2\2\u00ae\u00b0\t\3\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3"+
		"\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2&\3\2\2\2\u00b3\u00b4"+
		"\7v\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7w\2\2\u00b6\u00bd\7g\2\2\u00b7"+
		"\u00b8\7h\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7u\2\2"+
		"\u00bb\u00bd\7g\2\2\u00bc\u00b3\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bd(\3\2"+
		"\2\2\u00be\u00c2\7$\2\2\u00bf\u00c1\t\4\2\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7$\2\2\u00c6*\3\2\2\2\u00c7\u00c8"+
		"\7d\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7n\2\2\u00cb"+
		"\u00cc\7g\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7p\2\2\u00ce,\3\2\2\2\u00cf"+
		"\u00d0\7k\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7v\2\2\u00d2.\3\2\2\2\u00d3"+
		"\u00d4\7f\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7w\2\2\u00d6\u00d7\7d\2\2"+
		"\u00d7\u00d8\7n\2\2\u00d8\u00d9\7g\2\2\u00d9\60\3\2\2\2\u00da\u00db\7"+
		"u\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7k\2\2\u00de\u00df"+
		"\7p\2\2\u00df\u00e0\7i\2\2\u00e0\62\3\2\2\2\u00e1\u00e5\t\5\2\2\u00e2"+
		"\u00e4\t\6\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\64\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9"+
		"\7=\2\2\u00e9\66\3\2\2\2\u00ea\u00eb\7?\2\2\u00eb8\3\2\2\2\u00ec\u00ed"+
		"\7>\2\2\u00ed:\3\2\2\2\u00ee\u00ef\7@\2\2\u00ef<\3\2\2\2\u00f0\u00f1\7"+
		"?\2\2\u00f1\u00f2\7?\2\2\u00f2>\3\2\2\2\u00f3\u00f4\7#\2\2\u00f4\u00f5"+
		"\7?\2\2\u00f5@\3\2\2\2\u00f6\u00f7\7-\2\2\u00f7B\3\2\2\2\u00f8\u00f9\7"+
		"/\2\2\u00f9D\3\2\2\2\u00fa\u00fb\7`\2\2\u00fbF\3\2\2\2\u00fc\u00fd\7\61"+
		"\2\2\u00fdH\3\2\2\2\u00fe\u00ff\7,\2\2\u00ffJ\3\2\2\2\u0100\u0101\t\7"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\u0103\b&\2\2\u0103L\3\2\2\2\u0104\u0105"+
		"\t\b\2\2\u0105\u0106\3\2\2\2\u0106\u0107\b\'\2\2\u0107N\3\2\2\2\r\2\u0092"+
		"\u0097\u009c\u00a0\u00a5\u00aa\u00b1\u00bc\u00c2\u00e5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}