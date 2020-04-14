// Generated from c:\Users\Danil\Desktop\ENTREGA_FINAL\fuente\GjsonLexer.g4 by ANTLR 4.7.1

	package fuente;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GjsonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TIPO_GRAFO=1, IDENTIFICADOR=2, NAME=3, GENDER=4, NUMBER=5, WORDTYPE=6, 
		TYPEOF=7, ISLIST=8, OPTIONAL=9, MULTIPLICITYMAX=10, MULTIPLICITYMIN=11, 
		REVERSENAME=12, FROM=13, TO=14, INHERITS=15, PROPERTIES=16, USEDBY=17, 
		LANGUAGEDATA=18, LABEL=19, REVERSELABEL=20, IDIOMA=21, CONTEXT=22, ABRE_LLAVE=23, 
		CIERRA_LLAVE=24, ABRE_CORCHETE=25, CIERRA_CORCHETE=26, COMA=27, DOSPUNTOS=28, 
		BOOLEAN=29, CADENA=30, WS=31, INTRO=32, CIERRA_CONTEXTO=33, INFO_CONTEXT=34;
	public static final int
		CONTEXT_MODE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "CONTEXT_MODE"
	};

	public static final String[] ruleNames = {
		"TIPO_GRAFO", "IDENTIFICADOR", "NAME", "GENDER", "NUMBER", "WORDTYPE", 
		"TYPEOF", "ISLIST", "OPTIONAL", "MULTIPLICITYMAX", "MULTIPLICITYMIN", 
		"REVERSENAME", "FROM", "TO", "INHERITS", "PROPERTIES", "USEDBY", "LANGUAGEDATA", 
		"LABEL", "REVERSELABEL", "IDIOMA", "CONTEXT", "ABRE_LLAVE", "CIERRA_LLAVE", 
		"ABRE_CORCHETE", "CIERRA_CORCHETE", "COMA", "DOSPUNTOS", "BOOLEAN", "CADENA", 
		"WS", "INTRO", "CIERRA_CONTEXTO", "INFO_CONTEXT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "'\"@context\"'", 
		"'{'", "'}'", "'['", "']'", "','", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TIPO_GRAFO", "IDENTIFICADOR", "NAME", "GENDER", "NUMBER", "WORDTYPE", 
		"TYPEOF", "ISLIST", "OPTIONAL", "MULTIPLICITYMAX", "MULTIPLICITYMIN", 
		"REVERSENAME", "FROM", "TO", "INHERITS", "PROPERTIES", "USEDBY", "LANGUAGEDATA", 
		"LABEL", "REVERSELABEL", "IDIOMA", "CONTEXT", "ABRE_LLAVE", "CIERRA_LLAVE", 
		"ABRE_CORCHETE", "CIERRA_CORCHETE", "COMA", "DOSPUNTOS", "BOOLEAN", "CADENA", 
		"WS", "INTRO", "CIERRA_CONTEXTO", "INFO_CONTEXT"
	};
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


	public GjsonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GjsonLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 29:
			CADENA_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void CADENA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			setText(getText().substring(1, getText().length()-1).replaceAll("\\\\(-)", "$1"));
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u01ef\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\5\2X\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3a\n\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4m\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5{\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u0089\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7\u0099\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u00a7\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b5\n"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00d9\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f0\n\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0103"+
		"\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u010f\n\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0119\n\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0129\n\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u013c\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u014a\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u015e\n\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u016b\n\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0183\n\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0194"+
		"\n\26\3\26\5\26\u0197\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u01bd\n\36\3\37\3\37\3\37\3\37\7\37\u01c3\n\37\f\37\16\37\u01c6\13\37"+
		"\3\37\3\37\3\37\3 \6 \u01cc\n \r \16 \u01cd\3 \3 \3!\6!\u01d3\n!\r!\16"+
		"!\u01d4\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01e3\n\"\3"+
		"\"\3\"\3\"\3\"\3#\6#\u01ea\n#\r#\16#\u01eb\3#\3#\3\u01eb\2$\4\3\6\4\b"+
		"\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32\16\34\17\36\20 \21\"\22$"+
		"\23&\24(\25*\26,\27.\30\60\31\62\32\64\33\66\348\35:\36<\37> @!B\"D#F"+
		"$\4\2\3\4\3\2$$\4\2\f\f\17\17\2\u020a\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2"+
		"\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2"+
		"\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3"+
		"\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2"+
		"\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66"+
		"\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2"+
		"\2\2\3D\3\2\2\2\3F\3\2\2\2\4W\3\2\2\2\6Y\3\2\2\2\bd\3\2\2\2\np\3\2\2\2"+
		"\f~\3\2\2\2\16\u008c\3\2\2\2\20\u009c\3\2\2\2\22\u00aa\3\2\2\2\24\u00b8"+
		"\3\2\2\2\26\u00c5\3\2\2\2\30\u00dc\3\2\2\2\32\u00f3\3\2\2\2\34\u0106\3"+
		"\2\2\2\36\u0112\3\2\2\2 \u011c\3\2\2\2\"\u012c\3\2\2\2$\u013f\3\2\2\2"+
		"&\u014d\3\2\2\2(\u0161\3\2\2\2*\u016e\3\2\2\2,\u0193\3\2\2\2.\u019a\3"+
		"\2\2\2\60\u01a7\3\2\2\2\62\u01a9\3\2\2\2\64\u01ab\3\2\2\2\66\u01ad\3\2"+
		"\2\28\u01af\3\2\2\2:\u01b1\3\2\2\2<\u01bc\3\2\2\2>\u01be\3\2\2\2@\u01cb"+
		"\3\2\2\2B\u01d2\3\2\2\2D\u01d8\3\2\2\2F\u01e9\3\2\2\2HI\7$\2\2IJ\7B\2"+
		"\2JK\7i\2\2KL\7t\2\2LM\7c\2\2MN\7r\2\2NO\7j\2\2OX\7$\2\2PQ\7$\2\2QR\7"+
		"B\2\2RS\7v\2\2ST\7t\2\2TU\7g\2\2UV\7g\2\2VX\7$\2\2WH\3\2\2\2WP\3\2\2\2"+
		"X\5\3\2\2\2YZ\7$\2\2Z[\7B\2\2[\\\7k\2\2\\]\7f\2\2]^\7$\2\2^`\3\2\2\2_"+
		"a\5@ \2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\5:\35\2c\7\3\2\2\2de\7$\2\2ef"+
		"\7p\2\2fg\7c\2\2gh\7o\2\2hi\7g\2\2ij\7$\2\2jl\3\2\2\2km\5@ \2lk\3\2\2"+
		"\2lm\3\2\2\2mn\3\2\2\2no\5:\35\2o\t\3\2\2\2pq\7$\2\2qr\7i\2\2rs\7g\2\2"+
		"st\7p\2\2tu\7f\2\2uv\7g\2\2vw\7t\2\2wx\7$\2\2xz\3\2\2\2y{\5@ \2zy\3\2"+
		"\2\2z{\3\2\2\2{|\3\2\2\2|}\5:\35\2}\13\3\2\2\2~\177\7$\2\2\177\u0080\7"+
		"p\2\2\u0080\u0081\7w\2\2\u0081\u0082\7o\2\2\u0082\u0083\7d\2\2\u0083\u0084"+
		"\7g\2\2\u0084\u0085\7t\2\2\u0085\u0086\7$\2\2\u0086\u0088\3\2\2\2\u0087"+
		"\u0089\5@ \2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2"+
		"\2\u008a\u008b\5:\35\2\u008b\r\3\2\2\2\u008c\u008d\7$\2\2\u008d\u008e"+
		"\7y\2\2\u008e\u008f\7q\2\2\u008f\u0090\7t\2\2\u0090\u0091\7f\2\2\u0091"+
		"\u0092\7V\2\2\u0092\u0093\7{\2\2\u0093\u0094\7r\2\2\u0094\u0095\7g\2\2"+
		"\u0095\u0096\7$\2\2\u0096\u0098\3\2\2\2\u0097\u0099\5@ \2\u0098\u0097"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\5:\35\2\u009b"+
		"\17\3\2\2\2\u009c\u009d\7$\2\2\u009d\u009e\7v\2\2\u009e\u009f\7{\2\2\u009f"+
		"\u00a0\7r\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7Q\2\2\u00a2\u00a3\7h\2\2"+
		"\u00a3\u00a4\7$\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a7\5@ \2\u00a6\u00a5"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\5:\35\2\u00a9"+
		"\21\3\2\2\2\u00aa\u00ab\7$\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7u\2\2\u00ad"+
		"\u00ae\7N\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7v\2\2"+
		"\u00b1\u00b2\7$\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b5\5@ \2\u00b4\u00b3"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\5:\35\2\u00b7"+
		"\23\3\2\2\2\u00b8\u00b9\7$\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7r\2\2\u00bb"+
		"\u00bc\7v\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7p\2\2"+
		"\u00bf\u00c0\7c\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2\7$\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c4\5:\35\2\u00c4\25\3\2\2\2\u00c5\u00c6\7$\2\2\u00c6"+
		"\u00c7\7o\2\2\u00c7\u00c8\7w\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7v\2\2"+
		"\u00ca\u00cb\7k\2\2\u00cb\u00cc\7r\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce"+
		"\7k\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7v\2\2\u00d1"+
		"\u00d2\7{\2\2\u00d2\u00d3\7O\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7z\2\2"+
		"\u00d5\u00d6\7$\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d9\5@ \2\u00d8\u00d7"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\5:\35\2\u00db"+
		"\27\3\2\2\2\u00dc\u00dd\7$\2\2\u00dd\u00de\7o\2\2\u00de\u00df\7w\2\2\u00df"+
		"\u00e0\7n\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7r\2\2"+
		"\u00e3\u00e4\7n\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7e\2\2\u00e6\u00e7"+
		"\7k\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7{\2\2\u00e9\u00ea\7O\2\2\u00ea"+
		"\u00eb\7k\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7$\2\2\u00ed\u00ef\3\2\2"+
		"\2\u00ee\u00f0\5@ \2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00f2\5:\35\2\u00f2\31\3\2\2\2\u00f3\u00f4\7$\2\2\u00f4"+
		"\u00f5\7t\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7x\2\2\u00f7\u00f8\7g\2\2"+
		"\u00f8\u00f9\7t\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc"+
		"\7P\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7o\2\2\u00fe\u00ff\7g\2\2\u00ff"+
		"\u0100\7$\2\2\u0100\u0102\3\2\2\2\u0101\u0103\5@ \2\u0102\u0101\3\2\2"+
		"\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\5:\35\2\u0105\33"+
		"\3\2\2\2\u0106\u0107\7$\2\2\u0107\u0108\7h\2\2\u0108\u0109\7t\2\2\u0109"+
		"\u010a\7q\2\2\u010a\u010b\7o\2\2\u010b\u010c\7$\2\2\u010c\u010e\3\2\2"+
		"\2\u010d\u010f\5@ \2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u0111\5:\35\2\u0111\35\3\2\2\2\u0112\u0113\7$\2\2\u0113"+
		"\u0114\7v\2\2\u0114\u0115\7q\2\2\u0115\u0116\7$\2\2\u0116\u0118\3\2\2"+
		"\2\u0117\u0119\5@ \2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011a\u011b\5:\35\2\u011b\37\3\2\2\2\u011c\u011d\7$\2\2\u011d"+
		"\u011e\7k\2\2\u011e\u011f\7p\2\2\u011f\u0120\7j\2\2\u0120\u0121\7g\2\2"+
		"\u0121\u0122\7t\2\2\u0122\u0123\7k\2\2\u0123\u0124\7v\2\2\u0124\u0125"+
		"\7u\2\2\u0125\u0126\7$\2\2\u0126\u0128\3\2\2\2\u0127\u0129\5@ \2\u0128"+
		"\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\5:"+
		"\35\2\u012b!\3\2\2\2\u012c\u012d\7$\2\2\u012d\u012e\7r\2\2\u012e\u012f"+
		"\7t\2\2\u012f\u0130\7q\2\2\u0130\u0131\7r\2\2\u0131\u0132\7g\2\2\u0132"+
		"\u0133\7t\2\2\u0133\u0134\7v\2\2\u0134\u0135\7k\2\2\u0135\u0136\7g\2\2"+
		"\u0136\u0137\7u\2\2\u0137\u0138\7$\2\2\u0138\u0139\3\2\2\2\u0139\u013b"+
		"\5:\35\2\u013a\u013c\5@ \2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013e\5\64\32\2\u013e#\3\2\2\2\u013f\u0140\7$\2\2"+
		"\u0140\u0141\7w\2\2\u0141\u0142\7u\2\2\u0142\u0143\7g\2\2\u0143\u0144"+
		"\7f\2\2\u0144\u0145\7d\2\2\u0145\u0146\7{\2\2\u0146\u0147\7$\2\2\u0147"+
		"\u0149\3\2\2\2\u0148\u014a\5@ \2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2"+
		"\2\u014a\u014b\3\2\2\2\u014b\u014c\5:\35\2\u014c%\3\2\2\2\u014d\u014e"+
		"\7$\2\2\u014e\u014f\7n\2\2\u014f\u0150\7c\2\2\u0150\u0151\7p\2\2\u0151"+
		"\u0152\7i\2\2\u0152\u0153\7w\2\2\u0153\u0154\7c\2\2\u0154\u0155\7i\2\2"+
		"\u0155\u0156\7g\2\2\u0156\u0157\7F\2\2\u0157\u0158\7c\2\2\u0158\u0159"+
		"\7v\2\2\u0159\u015a\7c\2\2\u015a\u015b\7$\2\2\u015b\u015d\3\2\2\2\u015c"+
		"\u015e\5@ \2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2"+
		"\2\u015f\u0160\5:\35\2\u0160\'\3\2\2\2\u0161\u0162\7$\2\2\u0162\u0163"+
		"\7n\2\2\u0163\u0164\7c\2\2\u0164\u0165\7d\2\2\u0165\u0166\7g\2\2\u0166"+
		"\u0167\7n\2\2\u0167\u0168\7$\2\2\u0168\u016a\3\2\2\2\u0169\u016b\5@ \2"+
		"\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d"+
		"\5:\35\2\u016d)\3\2\2\2\u016e\u016f\7$\2\2\u016f\u0170\7n\2\2\u0170\u0171"+
		"\7c\2\2\u0171\u0172\7d\2\2\u0172\u0173\7g\2\2\u0173\u0174\7n\2\2\u0174"+
		"\u0175\7T\2\2\u0175\u0176\7g\2\2\u0176\u0177\7x\2\2\u0177\u0178\7g\2\2"+
		"\u0178\u0179\7t\2\2\u0179\u017a\7u\2\2\u017a\u017b\7g\2\2\u017b\u017c"+
		"\7P\2\2\u017c\u017d\7c\2\2\u017d\u017e\7o\2\2\u017e\u017f\7g\2\2\u017f"+
		"\u0180\7$\2\2\u0180\u0182\3\2\2\2\u0181\u0183\5@ \2\u0182\u0181\3\2\2"+
		"\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\5:\35\2\u0185+"+
		"\3\2\2\2\u0186\u0187\7$\2\2\u0187\u0188\7g\2\2\u0188\u0189\7u\2\2\u0189"+
		"\u0194\7$\2\2\u018a\u018b\7$\2\2\u018b\u018c\7g\2\2\u018c\u018d\7p\2\2"+
		"\u018d\u018e\7i\2\2\u018e\u0194\7$\2\2\u018f\u0190\7$\2\2\u0190\u0191"+
		"\7g\2\2\u0191\u0192\7p\2\2\u0192\u0194\7$\2\2\u0193\u0186\3\2\2\2\u0193"+
		"\u018a\3\2\2\2\u0193\u018f\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0197\5@"+
		" \2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u0199\5:\35\2\u0199-\3\2\2\2\u019a\u019b\7$\2\2\u019b\u019c\7B\2\2\u019c"+
		"\u019d\7e\2\2\u019d\u019e\7q\2\2\u019e\u019f\7p\2\2\u019f\u01a0\7v\2\2"+
		"\u01a0\u01a1\7g\2\2\u01a1\u01a2\7z\2\2\u01a2\u01a3\7v\2\2\u01a3\u01a4"+
		"\7$\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\b\27\2\2\u01a6/\3\2\2\2\u01a7"+
		"\u01a8\7}\2\2\u01a8\61\3\2\2\2\u01a9\u01aa\7\177\2\2\u01aa\63\3\2\2\2"+
		"\u01ab\u01ac\7]\2\2\u01ac\65\3\2\2\2\u01ad\u01ae\7_\2\2\u01ae\67\3\2\2"+
		"\2\u01af\u01b0\7.\2\2\u01b09\3\2\2\2\u01b1\u01b2\7<\2\2\u01b2;\3\2\2\2"+
		"\u01b3\u01b4\7v\2\2\u01b4\u01b5\7t\2\2\u01b5\u01b6\7w\2\2\u01b6\u01bd"+
		"\7g\2\2\u01b7\u01b8\7h\2\2\u01b8\u01b9\7c\2\2\u01b9\u01ba\7n\2\2\u01ba"+
		"\u01bb\7u\2\2\u01bb\u01bd\7g\2\2\u01bc\u01b3\3\2\2\2\u01bc\u01b7\3\2\2"+
		"\2\u01bd=\3\2\2\2\u01be\u01c4\7$\2\2\u01bf\u01c0\7$\2\2\u01c0\u01c3\7"+
		"$\2\2\u01c1\u01c3\n\2\2\2\u01c2\u01bf\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3"+
		"\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2"+
		"\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c8\7$\2\2\u01c8\u01c9\b\37\3\2\u01c9"+
		"?\3\2\2\2\u01ca\u01cc\7\"\2\2\u01cb\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2"+
		"\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0"+
		"\b \4\2\u01d0A\3\2\2\2\u01d1\u01d3\t\3\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d4"+
		"\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"+
		"\u01d7\b!\4\2\u01d7C\3\2\2\2\u01d8\u01d9\7$\2\2\u01d9\u01da\7i\2\2\u01da"+
		"\u01db\7t\2\2\u01db\u01dc\7c\2\2\u01dc\u01dd\7r\2\2\u01dd\u01de\7j\2\2"+
		"\u01de\u01df\7u\2\2\u01df\u01e0\7$\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01e3"+
		"\5@ \2\u01e2\u01e1\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e5\7<\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\b\"\5\2\u01e7E\3\2\2\2\u01e8"+
		"\u01ea\13\2\2\2\u01e9\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3"+
		"\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\b#\4\2\u01ee"+
		"G\3\2\2\2 \2\3W`lz\u0088\u0098\u00a6\u00b4\u00d8\u00ef\u0102\u010e\u0118"+
		"\u0128\u013b\u0149\u015d\u016a\u0182\u0193\u0196\u01bc\u01c2\u01c4\u01cd"+
		"\u01d4\u01e2\u01eb\6\7\3\2\3\37\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}