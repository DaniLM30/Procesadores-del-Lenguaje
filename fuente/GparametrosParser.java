// Generated from .\fuente\GparametrosParser.g4 by ANTLR 4.7.1

	package fuente;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GparametrosParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, JSON=2, DOT=3, SVG=4, CSV=5, LEN=6, FONTCOLOR=7, FONTNAME=8, FONTSIZE=9, 
		ARROWSIZE=10, ARROWCOLOR=11, PENWIDTH=12, FILLCOLOR=13, STYLE=14, SHAPE=15, 
		EDGE=16, NODE=17, RELATIONSHIP=18, CLASS=19, PROPERTY=20, INHERITANCE=21, 
		INDERECT_USE=22, NUMERO=23, TEXTO=24, CADENA=25;
	public static final int
		RULE_entrada = 0, RULE_tipo_archivo = 1, RULE_textocsv = 2, RULE_textojson = 3, 
		RULE_textosvg = 4, RULE_textodot = 5, RULE_textoparam = 6, RULE_numeroparam = 7, 
		RULE_csv = 8, RULE_json = 9, RULE_svg = 10, RULE_dot = 11, RULE_parametro = 12, 
		RULE_len = 13, RULE_fontcolor = 14, RULE_fontname = 15, RULE_fontsize = 16, 
		RULE_arrowsize = 17, RULE_arrowcolor = 18, RULE_penwidth = 19, RULE_fillcolor = 20, 
		RULE_style = 21, RULE_shape = 22, RULE_len_name = 23, RULE_fontcolor_name = 24, 
		RULE_fontname_name = 25, RULE_fontsize_name = 26, RULE_arrowsize_name = 27, 
		RULE_arrowcolor_name = 28, RULE_penwidth_name = 29, RULE_fillcolor_name = 30, 
		RULE_style_name = 31, RULE_shape_name = 32, RULE_p_edge = 33, RULE_p_node = 34, 
		RULE_p_relationship = 35, RULE_p_class = 36, RULE_p_property = 37, RULE_p_inheritance = 38, 
		RULE_p_inderect_use = 39, RULE_p_len = 40, RULE_p_fontcolor = 41, RULE_p_fontname = 42, 
		RULE_p_fontsize = 43, RULE_p_arrowsize = 44, RULE_p_arrowcolor = 45, RULE_p_penwidth = 46, 
		RULE_p_fillcolor = 47, RULE_p_style = 48, RULE_p_shape = 49;
	public static final String[] ruleNames = {
		"entrada", "tipo_archivo", "textocsv", "textojson", "textosvg", "textodot", 
		"textoparam", "numeroparam", "csv", "json", "svg", "dot", "parametro", 
		"len", "fontcolor", "fontname", "fontsize", "arrowsize", "arrowcolor", 
		"penwidth", "fillcolor", "style", "shape", "len_name", "fontcolor_name", 
		"fontname_name", "fontsize_name", "arrowsize_name", "arrowcolor_name", 
		"penwidth_name", "fillcolor_name", "style_name", "shape_name", "p_edge", 
		"p_node", "p_relationship", "p_class", "p_property", "p_inheritance", 
		"p_inderect_use", "p_len", "p_fontcolor", "p_fontname", "p_fontsize", 
		"p_arrowsize", "p_arrowcolor", "p_penwidth", "p_fillcolor", "p_style", 
		"p_shape"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'-JSON='", "'-DOT='", "'-SVG='", "'-CSV='", "'-len'", "'-fontcolor'", 
		"'-fontname'", "'-fontsize'", "'-arrowsize'", "'-arrowcolor'", "'-penwidth'", 
		"'-fillcolor'", "'-style'", "'-shape'", "'_edge'", "'_node'", "'_relationship='", 
		"'_class='", "'_property='", "'_inheritance='", "'_indirect_use='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "JSON", "DOT", "SVG", "CSV", "LEN", "FONTCOLOR", "FONTNAME", 
		"FONTSIZE", "ARROWSIZE", "ARROWCOLOR", "PENWIDTH", "FILLCOLOR", "STYLE", 
		"SHAPE", "EDGE", "NODE", "RELATIONSHIP", "CLASS", "PROPERTY", "INHERITANCE", 
		"INDERECT_USE", "NUMERO", "TEXTO", "CADENA"
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

	@Override
	public String getGrammarFileName() { return "GparametrosParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GparametrosParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EntradaContext extends ParserRuleContext {
		public List<Tipo_archivoContext> tipo_archivo() {
			return getRuleContexts(Tipo_archivoContext.class);
		}
		public Tipo_archivoContext tipo_archivo(int i) {
			return getRuleContext(Tipo_archivoContext.class,i);
		}
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public EntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitEntrada(this);
		}
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_entrada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(102);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case JSON:
				case DOT:
				case SVG:
				case CSV:
					{
					setState(100);
					tipo_archivo();
					}
					break;
				case LEN:
				case FONTCOLOR:
				case FONTNAME:
				case FONTSIZE:
				case ARROWSIZE:
				case ARROWCOLOR:
				case PENWIDTH:
				case FILLCOLOR:
				case STYLE:
				case SHAPE:
					{
					setState(101);
					parametro();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JSON) | (1L << DOT) | (1L << SVG) | (1L << CSV) | (1L << LEN) | (1L << FONTCOLOR) | (1L << FONTNAME) | (1L << FONTSIZE) | (1L << ARROWSIZE) | (1L << ARROWCOLOR) | (1L << PENWIDTH) | (1L << FILLCOLOR) | (1L << STYLE) | (1L << SHAPE))) != 0) );
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

	public static class Tipo_archivoContext extends ParserRuleContext {
		public JsonContext json() {
			return getRuleContext(JsonContext.class,0);
		}
		public SvgContext svg() {
			return getRuleContext(SvgContext.class,0);
		}
		public DotContext dot() {
			return getRuleContext(DotContext.class,0);
		}
		public CsvContext csv() {
			return getRuleContext(CsvContext.class,0);
		}
		public Tipo_archivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_archivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterTipo_archivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitTipo_archivo(this);
		}
	}

	public final Tipo_archivoContext tipo_archivo() throws RecognitionException {
		Tipo_archivoContext _localctx = new Tipo_archivoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tipo_archivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JSON:
				{
				setState(106);
				json();
				}
				break;
			case SVG:
				{
				setState(107);
				svg();
				}
				break;
			case DOT:
				{
				setState(108);
				dot();
				}
				break;
			case CSV:
				{
				setState(109);
				csv();
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

	public static class TextocsvContext extends ParserRuleContext {
		public List<TerminalNode> TEXTO() { return getTokens(GparametrosParser.TEXTO); }
		public TerminalNode TEXTO(int i) {
			return getToken(GparametrosParser.TEXTO, i);
		}
		public List<TerminalNode> CADENA() { return getTokens(GparametrosParser.CADENA); }
		public TerminalNode CADENA(int i) {
			return getToken(GparametrosParser.CADENA, i);
		}
		public TextocsvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textocsv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterTextocsv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitTextocsv(this);
		}
	}

	public final TextocsvContext textocsv() throws RecognitionException {
		TextocsvContext _localctx = new TextocsvContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_textocsv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				_la = _input.LA(1);
				if ( !(_la==TEXTO || _la==CADENA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXTO || _la==CADENA );
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

	public static class TextojsonContext extends ParserRuleContext {
		public List<TerminalNode> TEXTO() { return getTokens(GparametrosParser.TEXTO); }
		public TerminalNode TEXTO(int i) {
			return getToken(GparametrosParser.TEXTO, i);
		}
		public List<TerminalNode> CADENA() { return getTokens(GparametrosParser.CADENA); }
		public TerminalNode CADENA(int i) {
			return getToken(GparametrosParser.CADENA, i);
		}
		public TextojsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textojson; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterTextojson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitTextojson(this);
		}
	}

	public final TextojsonContext textojson() throws RecognitionException {
		TextojsonContext _localctx = new TextojsonContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_textojson);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==TEXTO || _la==CADENA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXTO || _la==CADENA );
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

	public static class TextosvgContext extends ParserRuleContext {
		public List<TerminalNode> TEXTO() { return getTokens(GparametrosParser.TEXTO); }
		public TerminalNode TEXTO(int i) {
			return getToken(GparametrosParser.TEXTO, i);
		}
		public List<TerminalNode> CADENA() { return getTokens(GparametrosParser.CADENA); }
		public TerminalNode CADENA(int i) {
			return getToken(GparametrosParser.CADENA, i);
		}
		public TextosvgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textosvg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterTextosvg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitTextosvg(this);
		}
	}

	public final TextosvgContext textosvg() throws RecognitionException {
		TextosvgContext _localctx = new TextosvgContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_textosvg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				_la = _input.LA(1);
				if ( !(_la==TEXTO || _la==CADENA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXTO || _la==CADENA );
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

	public static class TextodotContext extends ParserRuleContext {
		public List<TerminalNode> TEXTO() { return getTokens(GparametrosParser.TEXTO); }
		public TerminalNode TEXTO(int i) {
			return getToken(GparametrosParser.TEXTO, i);
		}
		public List<TerminalNode> CADENA() { return getTokens(GparametrosParser.CADENA); }
		public TerminalNode CADENA(int i) {
			return getToken(GparametrosParser.CADENA, i);
		}
		public TextodotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textodot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterTextodot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitTextodot(this);
		}
	}

	public final TextodotContext textodot() throws RecognitionException {
		TextodotContext _localctx = new TextodotContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_textodot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(127);
				_la = _input.LA(1);
				if ( !(_la==TEXTO || _la==CADENA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXTO || _la==CADENA );
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

	public static class TextoparamContext extends ParserRuleContext {
		public List<TerminalNode> TEXTO() { return getTokens(GparametrosParser.TEXTO); }
		public TerminalNode TEXTO(int i) {
			return getToken(GparametrosParser.TEXTO, i);
		}
		public List<TerminalNode> CADENA() { return getTokens(GparametrosParser.CADENA); }
		public TerminalNode CADENA(int i) {
			return getToken(GparametrosParser.CADENA, i);
		}
		public TextoparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textoparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterTextoparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitTextoparam(this);
		}
	}

	public final TextoparamContext textoparam() throws RecognitionException {
		TextoparamContext _localctx = new TextoparamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_textoparam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(132);
				_la = _input.LA(1);
				if ( !(_la==TEXTO || _la==CADENA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXTO || _la==CADENA );
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

	public static class NumeroparamContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(GparametrosParser.NUMERO, 0); }
		public NumeroparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeroparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterNumeroparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitNumeroparam(this);
		}
	}

	public final NumeroparamContext numeroparam() throws RecognitionException {
		NumeroparamContext _localctx = new NumeroparamContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_numeroparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(NUMERO);
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

	public static class CsvContext extends ParserRuleContext {
		public TerminalNode CSV() { return getToken(GparametrosParser.CSV, 0); }
		public TextocsvContext textocsv() {
			return getRuleContext(TextocsvContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GparametrosParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GparametrosParser.WS, i);
		}
		public CsvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterCsv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitCsv(this);
		}
	}

	public final CsvContext csv() throws RecognitionException {
		CsvContext _localctx = new CsvContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_csv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(CSV);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(140);
				match(WS);
				}
			}

			setState(143);
			textocsv();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(144);
				match(WS);
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

	public static class JsonContext extends ParserRuleContext {
		public TerminalNode JSON() { return getToken(GparametrosParser.JSON, 0); }
		public TextojsonContext textojson() {
			return getRuleContext(TextojsonContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GparametrosParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GparametrosParser.WS, i);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitJson(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_json);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(JSON);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(148);
				match(WS);
				}
			}

			setState(151);
			textojson();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(152);
				match(WS);
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

	public static class SvgContext extends ParserRuleContext {
		public TerminalNode SVG() { return getToken(GparametrosParser.SVG, 0); }
		public TextosvgContext textosvg() {
			return getRuleContext(TextosvgContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GparametrosParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GparametrosParser.WS, i);
		}
		public SvgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_svg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterSvg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitSvg(this);
		}
	}

	public final SvgContext svg() throws RecognitionException {
		SvgContext _localctx = new SvgContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_svg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(SVG);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(156);
				match(WS);
				}
			}

			setState(159);
			textosvg();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(160);
				match(WS);
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

	public static class DotContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(GparametrosParser.DOT, 0); }
		public TextodotContext textodot() {
			return getRuleContext(TextodotContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GparametrosParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GparametrosParser.WS, i);
		}
		public DotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitDot(this);
		}
	}

	public final DotContext dot() throws RecognitionException {
		DotContext _localctx = new DotContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(DOT);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(164);
				match(WS);
				}
			}

			setState(167);
			textodot();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(168);
				match(WS);
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

	public static class ParametroContext extends ParserRuleContext {
		public LenContext len() {
			return getRuleContext(LenContext.class,0);
		}
		public FontcolorContext fontcolor() {
			return getRuleContext(FontcolorContext.class,0);
		}
		public FontnameContext fontname() {
			return getRuleContext(FontnameContext.class,0);
		}
		public FontsizeContext fontsize() {
			return getRuleContext(FontsizeContext.class,0);
		}
		public ArrowsizeContext arrowsize() {
			return getRuleContext(ArrowsizeContext.class,0);
		}
		public ArrowcolorContext arrowcolor() {
			return getRuleContext(ArrowcolorContext.class,0);
		}
		public PenwidthContext penwidth() {
			return getRuleContext(PenwidthContext.class,0);
		}
		public FillcolorContext fillcolor() {
			return getRuleContext(FillcolorContext.class,0);
		}
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public ShapeContext shape() {
			return getRuleContext(ShapeContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEN:
				{
				setState(171);
				len();
				}
				break;
			case FONTCOLOR:
				{
				setState(172);
				fontcolor();
				}
				break;
			case FONTNAME:
				{
				setState(173);
				fontname();
				}
				break;
			case FONTSIZE:
				{
				setState(174);
				fontsize();
				}
				break;
			case ARROWSIZE:
				{
				setState(175);
				arrowsize();
				}
				break;
			case ARROWCOLOR:
				{
				setState(176);
				arrowcolor();
				}
				break;
			case PENWIDTH:
				{
				setState(177);
				penwidth();
				}
				break;
			case FILLCOLOR:
				{
				setState(178);
				fillcolor();
				}
				break;
			case STYLE:
				{
				setState(179);
				style();
				}
				break;
			case SHAPE:
				{
				setState(180);
				shape();
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

	public static class LenContext extends ParserRuleContext {
		public Len_nameContext len_name() {
			return getRuleContext(Len_nameContext.class,0);
		}
		public NumeroparamContext numeroparam() {
			return getRuleContext(NumeroparamContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GparametrosParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GparametrosParser.WS, i);
		}
		public LenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterLen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitLen(this);
		}
	}

	public final LenContext len() throws RecognitionException {
		LenContext _localctx = new LenContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_len);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			len_name();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(184);
				match(WS);
				}
			}

			setState(187);
			numeroparam();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(188);
				match(WS);
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

	public static class FontcolorContext extends ParserRuleContext {
		public Fontcolor_nameContext fontcolor_name() {
			return getRuleContext(Fontcolor_nameContext.class,0);
		}
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GparametrosParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GparametrosParser.WS, i);
		}
		public FontcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterFontcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitFontcolor(this);
		}
	}

	public final FontcolorContext fontcolor() throws RecognitionException {
		FontcolorContext _localctx = new FontcolorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fontcolor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			fontcolor_name();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(192);
				match(WS);
				}
			}

			setState(195);
			textoparam();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(196);
				match(WS);
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

	public static class FontnameContext extends ParserRuleContext {
		public Fontname_nameContext fontname_name() {
			return getRuleContext(Fontname_nameContext.class,0);
		}
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GparametrosParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GparametrosParser.WS, i);
		}
		public FontnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterFontname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitFontname(this);
		}
	}

	public final FontnameContext fontname() throws RecognitionException {
		FontnameContext _localctx = new FontnameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fontname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			fontname_name();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(200);
				match(WS);
				}
			}

			setState(203);
			textoparam();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(204);
				match(WS);
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

	public static class FontsizeContext extends ParserRuleContext {
		public Fontsize_nameContext fontsize_name() {
			return getRuleContext(Fontsize_nameContext.class,0);
		}
		public NumeroparamContext numeroparam() {
			return getRuleContext(NumeroparamContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GparametrosParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GparametrosParser.WS, i);
		}
		public FontsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontsize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterFontsize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitFontsize(this);
		}
	}

	public final FontsizeContext fontsize() throws RecognitionException {
		FontsizeContext _localctx = new FontsizeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fontsize);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			fontsize_name();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(208);
				match(WS);
				}
			}

			setState(211);
			numeroparam();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(212);
				match(WS);
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

	public static class ArrowsizeContext extends ParserRuleContext {
		public Arrowsize_nameContext arrowsize_name() {
			return getRuleContext(Arrowsize_nameContext.class,0);
		}
		public NumeroparamContext numeroparam() {
			return getRuleContext(NumeroparamContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GparametrosParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GparametrosParser.WS, i);
		}
		public ArrowsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowsize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterArrowsize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitArrowsize(this);
		}
	}

	public final ArrowsizeContext arrowsize() throws RecognitionException {
		ArrowsizeContext _localctx = new ArrowsizeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrowsize);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			arrowsize_name();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(216);
				match(WS);
				}
			}

			setState(219);
			numeroparam();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(220);
				match(WS);
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

	public static class ArrowcolorContext extends ParserRuleContext {
		public Arrowcolor_nameContext arrowcolor_name() {
			return getRuleContext(Arrowcolor_nameContext.class,0);
		}
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GparametrosParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GparametrosParser.WS, i);
		}
		public ArrowcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterArrowcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitArrowcolor(this);
		}
	}

	public final ArrowcolorContext arrowcolor() throws RecognitionException {
		ArrowcolorContext _localctx = new ArrowcolorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arrowcolor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			arrowcolor_name();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(224);
				match(WS);
				}
			}

			setState(227);
			textoparam();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(228);
				match(WS);
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

	public static class PenwidthContext extends ParserRuleContext {
		public Penwidth_nameContext penwidth_name() {
			return getRuleContext(Penwidth_nameContext.class,0);
		}
		public NumeroparamContext numeroparam() {
			return getRuleContext(NumeroparamContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GparametrosParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GparametrosParser.WS, i);
		}
		public PenwidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penwidth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterPenwidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitPenwidth(this);
		}
	}

	public final PenwidthContext penwidth() throws RecognitionException {
		PenwidthContext _localctx = new PenwidthContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_penwidth);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			penwidth_name();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(232);
				match(WS);
				}
			}

			setState(235);
			numeroparam();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(236);
				match(WS);
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

	public static class FillcolorContext extends ParserRuleContext {
		public Fillcolor_nameContext fillcolor_name() {
			return getRuleContext(Fillcolor_nameContext.class,0);
		}
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GparametrosParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GparametrosParser.WS, i);
		}
		public FillcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fillcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterFillcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitFillcolor(this);
		}
	}

	public final FillcolorContext fillcolor() throws RecognitionException {
		FillcolorContext _localctx = new FillcolorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fillcolor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			fillcolor_name();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(240);
				match(WS);
				}
			}

			setState(243);
			textoparam();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(244);
				match(WS);
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

	public static class StyleContext extends ParserRuleContext {
		public Style_nameContext style_name() {
			return getRuleContext(Style_nameContext.class,0);
		}
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GparametrosParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GparametrosParser.WS, i);
		}
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitStyle(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_style);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			style_name();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(248);
				match(WS);
				}
			}

			setState(251);
			textoparam();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(252);
				match(WS);
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

	public static class ShapeContext extends ParserRuleContext {
		public Shape_nameContext shape_name() {
			return getRuleContext(Shape_nameContext.class,0);
		}
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GparametrosParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GparametrosParser.WS, i);
		}
		public ShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterShape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitShape(this);
		}
	}

	public final ShapeContext shape() throws RecognitionException {
		ShapeContext _localctx = new ShapeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_shape);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			shape_name();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(256);
				match(WS);
				}
			}

			setState(259);
			textoparam();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(260);
				match(WS);
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

	public static class Len_nameContext extends ParserRuleContext {
		public P_lenContext p_len() {
			return getRuleContext(P_lenContext.class,0);
		}
		public P_relationshipContext p_relationship() {
			return getRuleContext(P_relationshipContext.class,0);
		}
		public P_classContext p_class() {
			return getRuleContext(P_classContext.class,0);
		}
		public P_propertyContext p_property() {
			return getRuleContext(P_propertyContext.class,0);
		}
		public P_inheritanceContext p_inheritance() {
			return getRuleContext(P_inheritanceContext.class,0);
		}
		public P_inderect_useContext p_inderect_use() {
			return getRuleContext(P_inderect_useContext.class,0);
		}
		public Len_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_len_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterLen_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitLen_name(this);
		}
	}

	public final Len_nameContext len_name() throws RecognitionException {
		Len_nameContext _localctx = new Len_nameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_len_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			p_len();
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(264);
				p_relationship();
				}
				break;
			case CLASS:
				{
				setState(265);
				p_class();
				}
				break;
			case PROPERTY:
				{
				setState(266);
				p_property();
				}
				break;
			case INHERITANCE:
				{
				setState(267);
				p_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(268);
				p_inderect_use();
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

	public static class Fontcolor_nameContext extends ParserRuleContext {
		public P_fontcolorContext p_fontcolor() {
			return getRuleContext(P_fontcolorContext.class,0);
		}
		public P_edgeContext p_edge() {
			return getRuleContext(P_edgeContext.class,0);
		}
		public P_nodeContext p_node() {
			return getRuleContext(P_nodeContext.class,0);
		}
		public P_relationshipContext p_relationship() {
			return getRuleContext(P_relationshipContext.class,0);
		}
		public P_classContext p_class() {
			return getRuleContext(P_classContext.class,0);
		}
		public P_propertyContext p_property() {
			return getRuleContext(P_propertyContext.class,0);
		}
		public P_inheritanceContext p_inheritance() {
			return getRuleContext(P_inheritanceContext.class,0);
		}
		public P_inderect_useContext p_inderect_use() {
			return getRuleContext(P_inderect_useContext.class,0);
		}
		public Fontcolor_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontcolor_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterFontcolor_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitFontcolor_name(this);
		}
	}

	public final Fontcolor_nameContext fontcolor_name() throws RecognitionException {
		Fontcolor_nameContext _localctx = new Fontcolor_nameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fontcolor_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			p_fontcolor();
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(272);
				p_edge();
				}
				break;
			case NODE:
				{
				setState(273);
				p_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(276);
				p_relationship();
				}
				break;
			case CLASS:
				{
				setState(277);
				p_class();
				}
				break;
			case PROPERTY:
				{
				setState(278);
				p_property();
				}
				break;
			case INHERITANCE:
				{
				setState(279);
				p_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(280);
				p_inderect_use();
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

	public static class Fontname_nameContext extends ParserRuleContext {
		public P_fontnameContext p_fontname() {
			return getRuleContext(P_fontnameContext.class,0);
		}
		public P_edgeContext p_edge() {
			return getRuleContext(P_edgeContext.class,0);
		}
		public P_nodeContext p_node() {
			return getRuleContext(P_nodeContext.class,0);
		}
		public P_relationshipContext p_relationship() {
			return getRuleContext(P_relationshipContext.class,0);
		}
		public P_classContext p_class() {
			return getRuleContext(P_classContext.class,0);
		}
		public P_propertyContext p_property() {
			return getRuleContext(P_propertyContext.class,0);
		}
		public P_inheritanceContext p_inheritance() {
			return getRuleContext(P_inheritanceContext.class,0);
		}
		public P_inderect_useContext p_inderect_use() {
			return getRuleContext(P_inderect_useContext.class,0);
		}
		public Fontname_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontname_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterFontname_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitFontname_name(this);
		}
	}

	public final Fontname_nameContext fontname_name() throws RecognitionException {
		Fontname_nameContext _localctx = new Fontname_nameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fontname_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			p_fontname();
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(284);
				p_edge();
				}
				break;
			case NODE:
				{
				setState(285);
				p_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(288);
				p_relationship();
				}
				break;
			case CLASS:
				{
				setState(289);
				p_class();
				}
				break;
			case PROPERTY:
				{
				setState(290);
				p_property();
				}
				break;
			case INHERITANCE:
				{
				setState(291);
				p_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(292);
				p_inderect_use();
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

	public static class Fontsize_nameContext extends ParserRuleContext {
		public P_fontsizeContext p_fontsize() {
			return getRuleContext(P_fontsizeContext.class,0);
		}
		public P_edgeContext p_edge() {
			return getRuleContext(P_edgeContext.class,0);
		}
		public P_nodeContext p_node() {
			return getRuleContext(P_nodeContext.class,0);
		}
		public P_relationshipContext p_relationship() {
			return getRuleContext(P_relationshipContext.class,0);
		}
		public P_classContext p_class() {
			return getRuleContext(P_classContext.class,0);
		}
		public P_propertyContext p_property() {
			return getRuleContext(P_propertyContext.class,0);
		}
		public P_inheritanceContext p_inheritance() {
			return getRuleContext(P_inheritanceContext.class,0);
		}
		public P_inderect_useContext p_inderect_use() {
			return getRuleContext(P_inderect_useContext.class,0);
		}
		public Fontsize_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontsize_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterFontsize_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitFontsize_name(this);
		}
	}

	public final Fontsize_nameContext fontsize_name() throws RecognitionException {
		Fontsize_nameContext _localctx = new Fontsize_nameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fontsize_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			p_fontsize();
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(296);
				p_edge();
				}
				break;
			case NODE:
				{
				setState(297);
				p_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(300);
				p_relationship();
				}
				break;
			case CLASS:
				{
				setState(301);
				p_class();
				}
				break;
			case PROPERTY:
				{
				setState(302);
				p_property();
				}
				break;
			case INHERITANCE:
				{
				setState(303);
				p_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(304);
				p_inderect_use();
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

	public static class Arrowsize_nameContext extends ParserRuleContext {
		public P_arrowsizeContext p_arrowsize() {
			return getRuleContext(P_arrowsizeContext.class,0);
		}
		public P_edgeContext p_edge() {
			return getRuleContext(P_edgeContext.class,0);
		}
		public P_nodeContext p_node() {
			return getRuleContext(P_nodeContext.class,0);
		}
		public P_relationshipContext p_relationship() {
			return getRuleContext(P_relationshipContext.class,0);
		}
		public P_classContext p_class() {
			return getRuleContext(P_classContext.class,0);
		}
		public P_propertyContext p_property() {
			return getRuleContext(P_propertyContext.class,0);
		}
		public P_inheritanceContext p_inheritance() {
			return getRuleContext(P_inheritanceContext.class,0);
		}
		public P_inderect_useContext p_inderect_use() {
			return getRuleContext(P_inderect_useContext.class,0);
		}
		public Arrowsize_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowsize_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterArrowsize_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitArrowsize_name(this);
		}
	}

	public final Arrowsize_nameContext arrowsize_name() throws RecognitionException {
		Arrowsize_nameContext _localctx = new Arrowsize_nameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arrowsize_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			p_arrowsize();
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(308);
				p_edge();
				}
				break;
			case NODE:
				{
				setState(309);
				p_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(312);
				p_relationship();
				}
				break;
			case CLASS:
				{
				setState(313);
				p_class();
				}
				break;
			case PROPERTY:
				{
				setState(314);
				p_property();
				}
				break;
			case INHERITANCE:
				{
				setState(315);
				p_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(316);
				p_inderect_use();
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

	public static class Arrowcolor_nameContext extends ParserRuleContext {
		public P_arrowcolorContext p_arrowcolor() {
			return getRuleContext(P_arrowcolorContext.class,0);
		}
		public P_edgeContext p_edge() {
			return getRuleContext(P_edgeContext.class,0);
		}
		public P_nodeContext p_node() {
			return getRuleContext(P_nodeContext.class,0);
		}
		public P_relationshipContext p_relationship() {
			return getRuleContext(P_relationshipContext.class,0);
		}
		public P_classContext p_class() {
			return getRuleContext(P_classContext.class,0);
		}
		public P_propertyContext p_property() {
			return getRuleContext(P_propertyContext.class,0);
		}
		public P_inheritanceContext p_inheritance() {
			return getRuleContext(P_inheritanceContext.class,0);
		}
		public P_inderect_useContext p_inderect_use() {
			return getRuleContext(P_inderect_useContext.class,0);
		}
		public Arrowcolor_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowcolor_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterArrowcolor_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitArrowcolor_name(this);
		}
	}

	public final Arrowcolor_nameContext arrowcolor_name() throws RecognitionException {
		Arrowcolor_nameContext _localctx = new Arrowcolor_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arrowcolor_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			p_arrowcolor();
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(320);
				p_edge();
				}
				break;
			case NODE:
				{
				setState(321);
				p_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(324);
				p_relationship();
				}
				break;
			case CLASS:
				{
				setState(325);
				p_class();
				}
				break;
			case PROPERTY:
				{
				setState(326);
				p_property();
				}
				break;
			case INHERITANCE:
				{
				setState(327);
				p_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(328);
				p_inderect_use();
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

	public static class Penwidth_nameContext extends ParserRuleContext {
		public P_penwidthContext p_penwidth() {
			return getRuleContext(P_penwidthContext.class,0);
		}
		public P_edgeContext p_edge() {
			return getRuleContext(P_edgeContext.class,0);
		}
		public P_nodeContext p_node() {
			return getRuleContext(P_nodeContext.class,0);
		}
		public P_relationshipContext p_relationship() {
			return getRuleContext(P_relationshipContext.class,0);
		}
		public P_classContext p_class() {
			return getRuleContext(P_classContext.class,0);
		}
		public P_propertyContext p_property() {
			return getRuleContext(P_propertyContext.class,0);
		}
		public P_inheritanceContext p_inheritance() {
			return getRuleContext(P_inheritanceContext.class,0);
		}
		public P_inderect_useContext p_inderect_use() {
			return getRuleContext(P_inderect_useContext.class,0);
		}
		public Penwidth_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penwidth_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterPenwidth_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitPenwidth_name(this);
		}
	}

	public final Penwidth_nameContext penwidth_name() throws RecognitionException {
		Penwidth_nameContext _localctx = new Penwidth_nameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_penwidth_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			p_penwidth();
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(332);
				p_edge();
				}
				break;
			case NODE:
				{
				setState(333);
				p_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(336);
				p_relationship();
				}
				break;
			case CLASS:
				{
				setState(337);
				p_class();
				}
				break;
			case PROPERTY:
				{
				setState(338);
				p_property();
				}
				break;
			case INHERITANCE:
				{
				setState(339);
				p_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(340);
				p_inderect_use();
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

	public static class Fillcolor_nameContext extends ParserRuleContext {
		public P_fillcolorContext p_fillcolor() {
			return getRuleContext(P_fillcolorContext.class,0);
		}
		public P_edgeContext p_edge() {
			return getRuleContext(P_edgeContext.class,0);
		}
		public P_nodeContext p_node() {
			return getRuleContext(P_nodeContext.class,0);
		}
		public P_relationshipContext p_relationship() {
			return getRuleContext(P_relationshipContext.class,0);
		}
		public P_classContext p_class() {
			return getRuleContext(P_classContext.class,0);
		}
		public P_propertyContext p_property() {
			return getRuleContext(P_propertyContext.class,0);
		}
		public P_inheritanceContext p_inheritance() {
			return getRuleContext(P_inheritanceContext.class,0);
		}
		public P_inderect_useContext p_inderect_use() {
			return getRuleContext(P_inderect_useContext.class,0);
		}
		public Fillcolor_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fillcolor_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterFillcolor_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitFillcolor_name(this);
		}
	}

	public final Fillcolor_nameContext fillcolor_name() throws RecognitionException {
		Fillcolor_nameContext _localctx = new Fillcolor_nameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_fillcolor_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			p_fillcolor();
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(344);
				p_edge();
				}
				break;
			case NODE:
				{
				setState(345);
				p_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(348);
				p_relationship();
				}
				break;
			case CLASS:
				{
				setState(349);
				p_class();
				}
				break;
			case PROPERTY:
				{
				setState(350);
				p_property();
				}
				break;
			case INHERITANCE:
				{
				setState(351);
				p_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(352);
				p_inderect_use();
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

	public static class Style_nameContext extends ParserRuleContext {
		public P_styleContext p_style() {
			return getRuleContext(P_styleContext.class,0);
		}
		public P_edgeContext p_edge() {
			return getRuleContext(P_edgeContext.class,0);
		}
		public P_nodeContext p_node() {
			return getRuleContext(P_nodeContext.class,0);
		}
		public P_relationshipContext p_relationship() {
			return getRuleContext(P_relationshipContext.class,0);
		}
		public P_classContext p_class() {
			return getRuleContext(P_classContext.class,0);
		}
		public P_propertyContext p_property() {
			return getRuleContext(P_propertyContext.class,0);
		}
		public P_inheritanceContext p_inheritance() {
			return getRuleContext(P_inheritanceContext.class,0);
		}
		public P_inderect_useContext p_inderect_use() {
			return getRuleContext(P_inderect_useContext.class,0);
		}
		public Style_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterStyle_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitStyle_name(this);
		}
	}

	public final Style_nameContext style_name() throws RecognitionException {
		Style_nameContext _localctx = new Style_nameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_style_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			p_style();
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(356);
				p_edge();
				}
				break;
			case NODE:
				{
				setState(357);
				p_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(360);
				p_relationship();
				}
				break;
			case CLASS:
				{
				setState(361);
				p_class();
				}
				break;
			case PROPERTY:
				{
				setState(362);
				p_property();
				}
				break;
			case INHERITANCE:
				{
				setState(363);
				p_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(364);
				p_inderect_use();
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

	public static class Shape_nameContext extends ParserRuleContext {
		public P_shapeContext p_shape() {
			return getRuleContext(P_shapeContext.class,0);
		}
		public P_edgeContext p_edge() {
			return getRuleContext(P_edgeContext.class,0);
		}
		public P_nodeContext p_node() {
			return getRuleContext(P_nodeContext.class,0);
		}
		public P_relationshipContext p_relationship() {
			return getRuleContext(P_relationshipContext.class,0);
		}
		public P_classContext p_class() {
			return getRuleContext(P_classContext.class,0);
		}
		public P_propertyContext p_property() {
			return getRuleContext(P_propertyContext.class,0);
		}
		public P_inheritanceContext p_inheritance() {
			return getRuleContext(P_inheritanceContext.class,0);
		}
		public P_inderect_useContext p_inderect_use() {
			return getRuleContext(P_inderect_useContext.class,0);
		}
		public Shape_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterShape_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitShape_name(this);
		}
	}

	public final Shape_nameContext shape_name() throws RecognitionException {
		Shape_nameContext _localctx = new Shape_nameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_shape_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			p_shape();
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(368);
				p_edge();
				}
				break;
			case NODE:
				{
				setState(369);
				p_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(372);
				p_relationship();
				}
				break;
			case CLASS:
				{
				setState(373);
				p_class();
				}
				break;
			case PROPERTY:
				{
				setState(374);
				p_property();
				}
				break;
			case INHERITANCE:
				{
				setState(375);
				p_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(376);
				p_inderect_use();
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

	public static class P_edgeContext extends ParserRuleContext {
		public TerminalNode EDGE() { return getToken(GparametrosParser.EDGE, 0); }
		public P_edgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_edge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterP_edge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitP_edge(this);
		}
	}

	public final P_edgeContext p_edge() throws RecognitionException {
		P_edgeContext _localctx = new P_edgeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_p_edge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(EDGE);
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

	public static class P_nodeContext extends ParserRuleContext {
		public TerminalNode NODE() { return getToken(GparametrosParser.NODE, 0); }
		public P_nodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterP_node(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitP_node(this);
		}
	}

	public final P_nodeContext p_node() throws RecognitionException {
		P_nodeContext _localctx = new P_nodeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_p_node);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(NODE);
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

	public static class P_relationshipContext extends ParserRuleContext {
		public TerminalNode RELATIONSHIP() { return getToken(GparametrosParser.RELATIONSHIP, 0); }
		public P_relationshipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_relationship; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterP_relationship(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitP_relationship(this);
		}
	}

	public final P_relationshipContext p_relationship() throws RecognitionException {
		P_relationshipContext _localctx = new P_relationshipContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_p_relationship);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(RELATIONSHIP);
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

	public static class P_classContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(GparametrosParser.CLASS, 0); }
		public P_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterP_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitP_class(this);
		}
	}

	public final P_classContext p_class() throws RecognitionException {
		P_classContext _localctx = new P_classContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_p_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(CLASS);
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

	public static class P_propertyContext extends ParserRuleContext {
		public TerminalNode PROPERTY() { return getToken(GparametrosParser.PROPERTY, 0); }
		public P_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterP_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitP_property(this);
		}
	}

	public final P_propertyContext p_property() throws RecognitionException {
		P_propertyContext _localctx = new P_propertyContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_p_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(PROPERTY);
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

	public static class P_inheritanceContext extends ParserRuleContext {
		public TerminalNode INHERITANCE() { return getToken(GparametrosParser.INHERITANCE, 0); }
		public P_inheritanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_inheritance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterP_inheritance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitP_inheritance(this);
		}
	}

	public final P_inheritanceContext p_inheritance() throws RecognitionException {
		P_inheritanceContext _localctx = new P_inheritanceContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_p_inheritance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(INHERITANCE);
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

	public static class P_inderect_useContext extends ParserRuleContext {
		public TerminalNode INDERECT_USE() { return getToken(GparametrosParser.INDERECT_USE, 0); }
		public P_inderect_useContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_inderect_use; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterP_inderect_use(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitP_inderect_use(this);
		}
	}

	public final P_inderect_useContext p_inderect_use() throws RecognitionException {
		P_inderect_useContext _localctx = new P_inderect_useContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_p_inderect_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(INDERECT_USE);
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

	public static class P_lenContext extends ParserRuleContext {
		public TerminalNode LEN() { return getToken(GparametrosParser.LEN, 0); }
		public P_lenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterP_len(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitP_len(this);
		}
	}

	public final P_lenContext p_len() throws RecognitionException {
		P_lenContext _localctx = new P_lenContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_p_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(LEN);
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

	public static class P_fontcolorContext extends ParserRuleContext {
		public TerminalNode FONTCOLOR() { return getToken(GparametrosParser.FONTCOLOR, 0); }
		public P_fontcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_fontcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterP_fontcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitP_fontcolor(this);
		}
	}

	public final P_fontcolorContext p_fontcolor() throws RecognitionException {
		P_fontcolorContext _localctx = new P_fontcolorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_p_fontcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(FONTCOLOR);
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

	public static class P_fontnameContext extends ParserRuleContext {
		public TerminalNode FONTNAME() { return getToken(GparametrosParser.FONTNAME, 0); }
		public P_fontnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_fontname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterP_fontname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitP_fontname(this);
		}
	}

	public final P_fontnameContext p_fontname() throws RecognitionException {
		P_fontnameContext _localctx = new P_fontnameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_p_fontname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(FONTNAME);
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

	public static class P_fontsizeContext extends ParserRuleContext {
		public TerminalNode FONTSIZE() { return getToken(GparametrosParser.FONTSIZE, 0); }
		public P_fontsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_fontsize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterP_fontsize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitP_fontsize(this);
		}
	}

	public final P_fontsizeContext p_fontsize() throws RecognitionException {
		P_fontsizeContext _localctx = new P_fontsizeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_p_fontsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(FONTSIZE);
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

	public static class P_arrowsizeContext extends ParserRuleContext {
		public TerminalNode ARROWSIZE() { return getToken(GparametrosParser.ARROWSIZE, 0); }
		public P_arrowsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_arrowsize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterP_arrowsize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitP_arrowsize(this);
		}
	}

	public final P_arrowsizeContext p_arrowsize() throws RecognitionException {
		P_arrowsizeContext _localctx = new P_arrowsizeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_p_arrowsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(ARROWSIZE);
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

	public static class P_arrowcolorContext extends ParserRuleContext {
		public TerminalNode ARROWCOLOR() { return getToken(GparametrosParser.ARROWCOLOR, 0); }
		public P_arrowcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_arrowcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterP_arrowcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitP_arrowcolor(this);
		}
	}

	public final P_arrowcolorContext p_arrowcolor() throws RecognitionException {
		P_arrowcolorContext _localctx = new P_arrowcolorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_p_arrowcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(ARROWCOLOR);
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

	public static class P_penwidthContext extends ParserRuleContext {
		public TerminalNode PENWIDTH() { return getToken(GparametrosParser.PENWIDTH, 0); }
		public P_penwidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_penwidth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterP_penwidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitP_penwidth(this);
		}
	}

	public final P_penwidthContext p_penwidth() throws RecognitionException {
		P_penwidthContext _localctx = new P_penwidthContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_p_penwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(PENWIDTH);
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

	public static class P_fillcolorContext extends ParserRuleContext {
		public TerminalNode FILLCOLOR() { return getToken(GparametrosParser.FILLCOLOR, 0); }
		public P_fillcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_fillcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterP_fillcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitP_fillcolor(this);
		}
	}

	public final P_fillcolorContext p_fillcolor() throws RecognitionException {
		P_fillcolorContext _localctx = new P_fillcolorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_p_fillcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(FILLCOLOR);
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

	public static class P_styleContext extends ParserRuleContext {
		public TerminalNode STYLE() { return getToken(GparametrosParser.STYLE, 0); }
		public P_styleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterP_style(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitP_style(this);
		}
	}

	public final P_styleContext p_style() throws RecognitionException {
		P_styleContext _localctx = new P_styleContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_p_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(STYLE);
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

	public static class P_shapeContext extends ParserRuleContext {
		public TerminalNode SHAPE() { return getToken(GparametrosParser.SHAPE, 0); }
		public P_shapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_shape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).enterP_shape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GparametrosParserListener ) ((GparametrosParserListener)listener).exitP_shape(this);
		}
	}

	public final P_shapeContext p_shape() throws RecognitionException {
		P_shapeContext _localctx = new P_shapeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_p_shape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(SHAPE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u01a0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\6\2i\n\2\r\2\16\2j\3\3\3\3\3\3\3\3\5\3q\n\3\3\4\6\4t\n\4\r\4\16\4u\3"+
		"\5\6\5y\n\5\r\5\16\5z\3\6\6\6~\n\6\r\6\16\6\177\3\7\6\7\u0083\n\7\r\7"+
		"\16\7\u0084\3\b\6\b\u0088\n\b\r\b\16\b\u0089\3\t\3\t\3\n\3\n\5\n\u0090"+
		"\n\n\3\n\3\n\5\n\u0094\n\n\3\13\3\13\5\13\u0098\n\13\3\13\3\13\5\13\u009c"+
		"\n\13\3\f\3\f\5\f\u00a0\n\f\3\f\3\f\5\f\u00a4\n\f\3\r\3\r\5\r\u00a8\n"+
		"\r\3\r\3\r\5\r\u00ac\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00b8\n\16\3\17\3\17\5\17\u00bc\n\17\3\17\3\17\5\17\u00c0\n"+
		"\17\3\20\3\20\5\20\u00c4\n\20\3\20\3\20\5\20\u00c8\n\20\3\21\3\21\5\21"+
		"\u00cc\n\21\3\21\3\21\5\21\u00d0\n\21\3\22\3\22\5\22\u00d4\n\22\3\22\3"+
		"\22\5\22\u00d8\n\22\3\23\3\23\5\23\u00dc\n\23\3\23\3\23\5\23\u00e0\n\23"+
		"\3\24\3\24\5\24\u00e4\n\24\3\24\3\24\5\24\u00e8\n\24\3\25\3\25\5\25\u00ec"+
		"\n\25\3\25\3\25\5\25\u00f0\n\25\3\26\3\26\5\26\u00f4\n\26\3\26\3\26\5"+
		"\26\u00f8\n\26\3\27\3\27\5\27\u00fc\n\27\3\27\3\27\5\27\u0100\n\27\3\30"+
		"\3\30\5\30\u0104\n\30\3\30\3\30\5\30\u0108\n\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\5\31\u0110\n\31\3\32\3\32\3\32\5\32\u0115\n\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u011c\n\32\3\33\3\33\3\33\5\33\u0121\n\33\3\33\3\33\3"+
		"\33\3\33\3\33\5\33\u0128\n\33\3\34\3\34\3\34\5\34\u012d\n\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u0134\n\34\3\35\3\35\3\35\5\35\u0139\n\35\3\35\3"+
		"\35\3\35\3\35\3\35\5\35\u0140\n\35\3\36\3\36\3\36\5\36\u0145\n\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u014c\n\36\3\37\3\37\3\37\5\37\u0151\n\37\3"+
		"\37\3\37\3\37\3\37\3\37\5\37\u0158\n\37\3 \3 \3 \5 \u015d\n \3 \3 \3 "+
		"\3 \3 \5 \u0164\n \3!\3!\3!\5!\u0169\n!\3!\3!\3!\3!\3!\5!\u0170\n!\3\""+
		"\3\"\3\"\5\"\u0175\n\"\3\"\3\"\3\"\3\"\3\"\5\"\u017c\n\"\3#\3#\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60"+
		"\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\2\2\64\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd\2\3\3\2\32"+
		"\33\2\u01cd\2h\3\2\2\2\4p\3\2\2\2\6s\3\2\2\2\bx\3\2\2\2\n}\3\2\2\2\f\u0082"+
		"\3\2\2\2\16\u0087\3\2\2\2\20\u008b\3\2\2\2\22\u008d\3\2\2\2\24\u0095\3"+
		"\2\2\2\26\u009d\3\2\2\2\30\u00a5\3\2\2\2\32\u00b7\3\2\2\2\34\u00b9\3\2"+
		"\2\2\36\u00c1\3\2\2\2 \u00c9\3\2\2\2\"\u00d1\3\2\2\2$\u00d9\3\2\2\2&\u00e1"+
		"\3\2\2\2(\u00e9\3\2\2\2*\u00f1\3\2\2\2,\u00f9\3\2\2\2.\u0101\3\2\2\2\60"+
		"\u0109\3\2\2\2\62\u0111\3\2\2\2\64\u011d\3\2\2\2\66\u0129\3\2\2\28\u0135"+
		"\3\2\2\2:\u0141\3\2\2\2<\u014d\3\2\2\2>\u0159\3\2\2\2@\u0165\3\2\2\2B"+
		"\u0171\3\2\2\2D\u017d\3\2\2\2F\u017f\3\2\2\2H\u0181\3\2\2\2J\u0183\3\2"+
		"\2\2L\u0185\3\2\2\2N\u0187\3\2\2\2P\u0189\3\2\2\2R\u018b\3\2\2\2T\u018d"+
		"\3\2\2\2V\u018f\3\2\2\2X\u0191\3\2\2\2Z\u0193\3\2\2\2\\\u0195\3\2\2\2"+
		"^\u0197\3\2\2\2`\u0199\3\2\2\2b\u019b\3\2\2\2d\u019d\3\2\2\2fi\5\4\3\2"+
		"gi\5\32\16\2hf\3\2\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\3\3\2"+
		"\2\2lq\5\24\13\2mq\5\26\f\2nq\5\30\r\2oq\5\22\n\2pl\3\2\2\2pm\3\2\2\2"+
		"pn\3\2\2\2po\3\2\2\2q\5\3\2\2\2rt\t\2\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2"+
		"\2uv\3\2\2\2v\7\3\2\2\2wy\t\2\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2"+
		"\2\2{\t\3\2\2\2|~\t\2\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\13\3\2\2\2\u0081\u0083\t\2\2\2\u0082\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\r\3\2\2\2"+
		"\u0086\u0088\t\2\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\17\3\2\2\2\u008b\u008c\7\31\2\2\u008c"+
		"\21\3\2\2\2\u008d\u008f\7\7\2\2\u008e\u0090\7\3\2\2\u008f\u008e\3\2\2"+
		"\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\5\6\4\2\u0092\u0094"+
		"\7\3\2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\23\3\2\2\2\u0095"+
		"\u0097\7\4\2\2\u0096\u0098\7\3\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009b\5\b\5\2\u009a\u009c\7\3\2\2\u009b"+
		"\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\25\3\2\2\2\u009d\u009f\7\6\2"+
		"\2\u009e\u00a0\7\3\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u00a3\5\n\6\2\u00a2\u00a4\7\3\2\2\u00a3\u00a2\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\27\3\2\2\2\u00a5\u00a7\7\5\2\2\u00a6\u00a8\7\3\2"+
		"\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab"+
		"\5\f\7\2\u00aa\u00ac\7\3\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\31\3\2\2\2\u00ad\u00b8\5\34\17\2\u00ae\u00b8\5\36\20\2\u00af\u00b8\5"+
		" \21\2\u00b0\u00b8\5\"\22\2\u00b1\u00b8\5$\23\2\u00b2\u00b8\5&\24\2\u00b3"+
		"\u00b8\5(\25\2\u00b4\u00b8\5*\26\2\u00b5\u00b8\5,\27\2\u00b6\u00b8\5."+
		"\30\2\u00b7\u00ad\3\2\2\2\u00b7\u00ae\3\2\2\2\u00b7\u00af\3\2\2\2\u00b7"+
		"\u00b0\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b7\u00b3\3\2"+
		"\2\2\u00b7\u00b4\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8"+
		"\33\3\2\2\2\u00b9\u00bb\5\60\31\2\u00ba\u00bc\7\3\2\2\u00bb\u00ba\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\5\20\t\2\u00be"+
		"\u00c0\7\3\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\35\3\2\2"+
		"\2\u00c1\u00c3\5\62\32\2\u00c2\u00c4\7\3\2\2\u00c3\u00c2\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\5\16\b\2\u00c6\u00c8\7"+
		"\3\2\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\37\3\2\2\2\u00c9"+
		"\u00cb\5\64\33\2\u00ca\u00cc\7\3\2\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3"+
		"\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\5\16\b\2\u00ce\u00d0\7\3\2\2\u00cf"+
		"\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0!\3\2\2\2\u00d1\u00d3\5\66\34"+
		"\2\u00d2\u00d4\7\3\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d7\5\20\t\2\u00d6\u00d8\7\3\2\2\u00d7\u00d6\3\2\2\2"+
		"\u00d7\u00d8\3\2\2\2\u00d8#\3\2\2\2\u00d9\u00db\58\35\2\u00da\u00dc\7"+
		"\3\2\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00df\5\20\t\2\u00de\u00e0\7\3\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3"+
		"\2\2\2\u00e0%\3\2\2\2\u00e1\u00e3\5:\36\2\u00e2\u00e4\7\3\2\2\u00e3\u00e2"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\5\16\b\2"+
		"\u00e6\u00e8\7\3\2\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\'\3"+
		"\2\2\2\u00e9\u00eb\5<\37\2\u00ea\u00ec\7\3\2\2\u00eb\u00ea\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\5\20\t\2\u00ee\u00f0\7"+
		"\3\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0)\3\2\2\2\u00f1\u00f3"+
		"\5> \2\u00f2\u00f4\7\3\2\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f7\5\16\b\2\u00f6\u00f8\7\3\2\2\u00f7\u00f6\3"+
		"\2\2\2\u00f7\u00f8\3\2\2\2\u00f8+\3\2\2\2\u00f9\u00fb\5@!\2\u00fa\u00fc"+
		"\7\3\2\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00ff\5\16\b\2\u00fe\u0100\7\3\2\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3"+
		"\2\2\2\u0100-\3\2\2\2\u0101\u0103\5B\"\2\u0102\u0104\7\3\2\2\u0103\u0102"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\5\16\b\2"+
		"\u0106\u0108\7\3\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108/\3"+
		"\2\2\2\u0109\u010f\5R*\2\u010a\u0110\5H%\2\u010b\u0110\5J&\2\u010c\u0110"+
		"\5L\'\2\u010d\u0110\5N(\2\u010e\u0110\5P)\2\u010f\u010a\3\2\2\2\u010f"+
		"\u010b\3\2\2\2\u010f\u010c\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2"+
		"\2\2\u0110\61\3\2\2\2\u0111\u0114\5T+\2\u0112\u0115\5D#\2\u0113\u0115"+
		"\5F$\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115\u011b\3\2\2\2\u0116"+
		"\u011c\5H%\2\u0117\u011c\5J&\2\u0118\u011c\5L\'\2\u0119\u011c\5N(\2\u011a"+
		"\u011c\5P)\2\u011b\u0116\3\2\2\2\u011b\u0117\3\2\2\2\u011b\u0118\3\2\2"+
		"\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c\63\3\2\2\2\u011d\u0120"+
		"\5V,\2\u011e\u0121\5D#\2\u011f\u0121\5F$\2\u0120\u011e\3\2\2\2\u0120\u011f"+
		"\3\2\2\2\u0121\u0127\3\2\2\2\u0122\u0128\5H%\2\u0123\u0128\5J&\2\u0124"+
		"\u0128\5L\'\2\u0125\u0128\5N(\2\u0126\u0128\5P)\2\u0127\u0122\3\2\2\2"+
		"\u0127\u0123\3\2\2\2\u0127\u0124\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0126"+
		"\3\2\2\2\u0128\65\3\2\2\2\u0129\u012c\5X-\2\u012a\u012d\5D#\2\u012b\u012d"+
		"\5F$\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d\u0133\3\2\2\2\u012e"+
		"\u0134\5H%\2\u012f\u0134\5J&\2\u0130\u0134\5L\'\2\u0131\u0134\5N(\2\u0132"+
		"\u0134\5P)\2\u0133\u012e\3\2\2\2\u0133\u012f\3\2\2\2\u0133\u0130\3\2\2"+
		"\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134\67\3\2\2\2\u0135\u0138"+
		"\5Z.\2\u0136\u0139\5D#\2\u0137\u0139\5F$\2\u0138\u0136\3\2\2\2\u0138\u0137"+
		"\3\2\2\2\u0139\u013f\3\2\2\2\u013a\u0140\5H%\2\u013b\u0140\5J&\2\u013c"+
		"\u0140\5L\'\2\u013d\u0140\5N(\2\u013e\u0140\5P)\2\u013f\u013a\3\2\2\2"+
		"\u013f\u013b\3\2\2\2\u013f\u013c\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u013e"+
		"\3\2\2\2\u01409\3\2\2\2\u0141\u0144\5\\/\2\u0142\u0145\5D#\2\u0143\u0145"+
		"\5F$\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145\u014b\3\2\2\2\u0146"+
		"\u014c\5H%\2\u0147\u014c\5J&\2\u0148\u014c\5L\'\2\u0149\u014c\5N(\2\u014a"+
		"\u014c\5P)\2\u014b\u0146\3\2\2\2\u014b\u0147\3\2\2\2\u014b\u0148\3\2\2"+
		"\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c;\3\2\2\2\u014d\u0150"+
		"\5^\60\2\u014e\u0151\5D#\2\u014f\u0151\5F$\2\u0150\u014e\3\2\2\2\u0150"+
		"\u014f\3\2\2\2\u0151\u0157\3\2\2\2\u0152\u0158\5H%\2\u0153\u0158\5J&\2"+
		"\u0154\u0158\5L\'\2\u0155\u0158\5N(\2\u0156\u0158\5P)\2\u0157\u0152\3"+
		"\2\2\2\u0157\u0153\3\2\2\2\u0157\u0154\3\2\2\2\u0157\u0155\3\2\2\2\u0157"+
		"\u0156\3\2\2\2\u0158=\3\2\2\2\u0159\u015c\5`\61\2\u015a\u015d\5D#\2\u015b"+
		"\u015d\5F$\2\u015c\u015a\3\2\2\2\u015c\u015b\3\2\2\2\u015d\u0163\3\2\2"+
		"\2\u015e\u0164\5H%\2\u015f\u0164\5J&\2\u0160\u0164\5L\'\2\u0161\u0164"+
		"\5N(\2\u0162\u0164\5P)\2\u0163\u015e\3\2\2\2\u0163\u015f\3\2\2\2\u0163"+
		"\u0160\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0164?\3\2\2\2"+
		"\u0165\u0168\5b\62\2\u0166\u0169\5D#\2\u0167\u0169\5F$\2\u0168\u0166\3"+
		"\2\2\2\u0168\u0167\3\2\2\2\u0169\u016f\3\2\2\2\u016a\u0170\5H%\2\u016b"+
		"\u0170\5J&\2\u016c\u0170\5L\'\2\u016d\u0170\5N(\2\u016e\u0170\5P)\2\u016f"+
		"\u016a\3\2\2\2\u016f\u016b\3\2\2\2\u016f\u016c\3\2\2\2\u016f\u016d\3\2"+
		"\2\2\u016f\u016e\3\2\2\2\u0170A\3\2\2\2\u0171\u0174\5d\63\2\u0172\u0175"+
		"\5D#\2\u0173\u0175\5F$\2\u0174\u0172\3\2\2\2\u0174\u0173\3\2\2\2\u0175"+
		"\u017b\3\2\2\2\u0176\u017c\5H%\2\u0177\u017c\5J&\2\u0178\u017c\5L\'\2"+
		"\u0179\u017c\5N(\2\u017a\u017c\5P)\2\u017b\u0176\3\2\2\2\u017b\u0177\3"+
		"\2\2\2\u017b\u0178\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017a\3\2\2\2\u017c"+
		"C\3\2\2\2\u017d\u017e\7\22\2\2\u017eE\3\2\2\2\u017f\u0180\7\23\2\2\u0180"+
		"G\3\2\2\2\u0181\u0182\7\24\2\2\u0182I\3\2\2\2\u0183\u0184\7\25\2\2\u0184"+
		"K\3\2\2\2\u0185\u0186\7\26\2\2\u0186M\3\2\2\2\u0187\u0188\7\27\2\2\u0188"+
		"O\3\2\2\2\u0189\u018a\7\30\2\2\u018aQ\3\2\2\2\u018b\u018c\7\b\2\2\u018c"+
		"S\3\2\2\2\u018d\u018e\7\t\2\2\u018eU\3\2\2\2\u018f\u0190\7\n\2\2\u0190"+
		"W\3\2\2\2\u0191\u0192\7\13\2\2\u0192Y\3\2\2\2\u0193\u0194\7\f\2\2\u0194"+
		"[\3\2\2\2\u0195\u0196\7\r\2\2\u0196]\3\2\2\2\u0197\u0198\7\16\2\2\u0198"+
		"_\3\2\2\2\u0199\u019a\7\17\2\2\u019aa\3\2\2\2\u019b\u019c\7\20\2\2\u019c"+
		"c\3\2\2\2\u019d\u019e\7\21\2\2\u019ee\3\2\2\2:hjpuz\177\u0084\u0089\u008f"+
		"\u0093\u0097\u009b\u009f\u00a3\u00a7\u00ab\u00b7\u00bb\u00bf\u00c3\u00c7"+
		"\u00cb\u00cf\u00d3\u00d7\u00db\u00df\u00e3\u00e7\u00eb\u00ef\u00f3\u00f7"+
		"\u00fb\u00ff\u0103\u0107\u010f\u0114\u011b\u0120\u0127\u012c\u0133\u0138"+
		"\u013f\u0144\u014b\u0150\u0157\u015c\u0163\u0168\u016f\u0174\u017b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}