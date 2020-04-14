// Generated from c:\Users\Danil\Desktop\ENTREGA_FINAL\fuente\GjsonParser.g4 by ANTLR 4.7.1

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
public class GjsonParser extends Parser {
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
		RULE_archivo = 0, RULE_context = 1, RULE_grafo = 2, RULE_cuerpo_grafo = 3, 
		RULE_objeto = 4, RULE_lista = 5, RULE_identificador = 6, RULE_atributo = 7, 
		RULE_name = 8, RULE_reversename = 9, RULE_label = 10, RULE_reverselabel = 11, 
		RULE_gender = 12, RULE_number = 13, RULE_wordtype = 14, RULE_typeof = 15, 
		RULE_islist = 16, RULE_multiplicitymax = 17, RULE_multiplicitymin = 18, 
		RULE_usedby = 19, RULE_languagedata = 20, RULE_from = 21, RULE_to = 22, 
		RULE_inherits = 23, RULE_properties = 24, RULE_optional = 25, RULE_revidioma = 26, 
		RULE_idioma = 27, RULE_cadenaProperty = 28, RULE_cadenaUsedBy = 29, RULE_tipo_grafo = 30, 
		RULE_nombre_grafo = 31;
	public static final String[] ruleNames = {
		"archivo", "context", "grafo", "cuerpo_grafo", "objeto", "lista", "identificador", 
		"atributo", "name", "reversename", "label", "reverselabel", "gender", 
		"number", "wordtype", "typeof", "islist", "multiplicitymax", "multiplicitymin", 
		"usedby", "languagedata", "from", "to", "inherits", "properties", "optional", 
		"revidioma", "idioma", "cadenaProperty", "cadenaUsedBy", "tipo_grafo", 
		"nombre_grafo"
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

	@Override
	public String getGrammarFileName() { return "GjsonParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GjsonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ArchivoContext extends ParserRuleContext {
		public TerminalNode ABRE_LLAVE() { return getToken(GjsonParser.ABRE_LLAVE, 0); }
		public ContextContext context() {
			return getRuleContext(ContextContext.class,0);
		}
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public TerminalNode CIERRA_LLAVE() { return getToken(GjsonParser.CIERRA_LLAVE, 0); }
		public ArchivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_archivo; }
	}

	public final ArchivoContext archivo() throws RecognitionException {
		ArchivoContext _localctx = new ArchivoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_archivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(ABRE_LLAVE);
			setState(65);
			context();
			setState(66);
			lista();
			setState(67);
			match(CIERRA_LLAVE);
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

	public static class ContextContext extends ParserRuleContext {
		public TerminalNode CONTEXT() { return getToken(GjsonParser.CONTEXT, 0); }
		public TerminalNode CIERRA_CONTEXTO() { return getToken(GjsonParser.CIERRA_CONTEXTO, 0); }
		public ContextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context; }
	}

	public final ContextContext context() throws RecognitionException {
		ContextContext _localctx = new ContextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_context);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(CONTEXT);
			setState(70);
			match(CIERRA_CONTEXTO);
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

	public static class GrafoContext extends ParserRuleContext {
		public TerminalNode ABRE_LLAVE() { return getToken(GjsonParser.ABRE_LLAVE, 0); }
		public Nombre_grafoContext nombre_grafo() {
			return getRuleContext(Nombre_grafoContext.class,0);
		}
		public Cuerpo_grafoContext cuerpo_grafo() {
			return getRuleContext(Cuerpo_grafoContext.class,0);
		}
		public TerminalNode CIERRA_LLAVE() { return getToken(GjsonParser.CIERRA_LLAVE, 0); }
		public GrafoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grafo; }
	}

	public final GrafoContext grafo() throws RecognitionException {
		GrafoContext _localctx = new GrafoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_grafo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(ABRE_LLAVE);
			setState(73);
			nombre_grafo();
			setState(74);
			cuerpo_grafo();
			setState(75);
			match(CIERRA_LLAVE);
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

	public static class Cuerpo_grafoContext extends ParserRuleContext {
		public TerminalNode ABRE_LLAVE() { return getToken(GjsonParser.ABRE_LLAVE, 0); }
		public Tipo_grafoContext tipo_grafo() {
			return getRuleContext(Tipo_grafoContext.class,0);
		}
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public TerminalNode CIERRA_LLAVE() { return getToken(GjsonParser.CIERRA_LLAVE, 0); }
		public Cuerpo_grafoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_grafo; }
	}

	public final Cuerpo_grafoContext cuerpo_grafo() throws RecognitionException {
		Cuerpo_grafoContext _localctx = new Cuerpo_grafoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cuerpo_grafo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(ABRE_LLAVE);
			setState(78);
			tipo_grafo();
			setState(79);
			lista();
			setState(80);
			match(CIERRA_LLAVE);
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

	public static class ObjetoContext extends ParserRuleContext {
		public TerminalNode ABRE_LLAVE() { return getToken(GjsonParser.ABRE_LLAVE, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode CIERRA_LLAVE() { return getToken(GjsonParser.CIERRA_LLAVE, 0); }
		public List<TerminalNode> COMA() { return getTokens(GjsonParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(GjsonParser.COMA, i);
		}
		public List<AtributoContext> atributo() {
			return getRuleContexts(AtributoContext.class);
		}
		public AtributoContext atributo(int i) {
			return getRuleContext(AtributoContext.class,i);
		}
		public ObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objeto; }
	}

	public final ObjetoContext objeto() throws RecognitionException {
		ObjetoContext _localctx = new ObjetoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_objeto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(ABRE_LLAVE);
			setState(83);
			identificador();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(84);
				match(COMA);
				setState(85);
				atributo();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(CIERRA_LLAVE);
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

	public static class ListaContext extends ParserRuleContext {
		public TerminalNode ABRE_CORCHETE() { return getToken(GjsonParser.ABRE_CORCHETE, 0); }
		public TerminalNode CIERRA_CORCHETE() { return getToken(GjsonParser.CIERRA_CORCHETE, 0); }
		public List<GrafoContext> grafo() {
			return getRuleContexts(GrafoContext.class);
		}
		public GrafoContext grafo(int i) {
			return getRuleContext(GrafoContext.class,i);
		}
		public List<ObjetoContext> objeto() {
			return getRuleContexts(ObjetoContext.class);
		}
		public ObjetoContext objeto(int i) {
			return getRuleContext(ObjetoContext.class,i);
		}
		public List<CadenaUsedByContext> cadenaUsedBy() {
			return getRuleContexts(CadenaUsedByContext.class);
		}
		public CadenaUsedByContext cadenaUsedBy(int i) {
			return getRuleContext(CadenaUsedByContext.class,i);
		}
		public List<TerminalNode> CADENA() { return getTokens(GjsonParser.CADENA); }
		public TerminalNode CADENA(int i) {
			return getToken(GjsonParser.CADENA, i);
		}
		public List<TerminalNode> COMA() { return getTokens(GjsonParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(GjsonParser.COMA, i);
		}
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(ABRE_CORCHETE);
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(94);
				grafo();
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(95);
					match(COMA);
					setState(96);
					grafo();
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(102);
				objeto();
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(103);
					match(COMA);
					setState(104);
					objeto();
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(110);
				cadenaUsedBy();
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(111);
					match(COMA);
					setState(112);
					cadenaUsedBy();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				{
				setState(118);
				match(CADENA);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(119);
					match(COMA);
					setState(120);
					match(CADENA);
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(128);
			match(CIERRA_CORCHETE);
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

	public static class IdentificadorContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(GjsonParser.IDENTIFICADOR, 0); }
		public TerminalNode CADENA() { return getToken(GjsonParser.CADENA, 0); }
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(IDENTIFICADOR);
			setState(131);
			match(CADENA);
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

	public static class AtributoContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ReversenameContext reversename() {
			return getRuleContext(ReversenameContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public ReverselabelContext reverselabel() {
			return getRuleContext(ReverselabelContext.class,0);
		}
		public GenderContext gender() {
			return getRuleContext(GenderContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public WordtypeContext wordtype() {
			return getRuleContext(WordtypeContext.class,0);
		}
		public TypeofContext typeof() {
			return getRuleContext(TypeofContext.class,0);
		}
		public IslistContext islist() {
			return getRuleContext(IslistContext.class,0);
		}
		public MultiplicitymaxContext multiplicitymax() {
			return getRuleContext(MultiplicitymaxContext.class,0);
		}
		public MultiplicityminContext multiplicitymin() {
			return getRuleContext(MultiplicityminContext.class,0);
		}
		public UsedbyContext usedby() {
			return getRuleContext(UsedbyContext.class,0);
		}
		public LanguagedataContext languagedata() {
			return getRuleContext(LanguagedataContext.class,0);
		}
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public ToContext to() {
			return getRuleContext(ToContext.class,0);
		}
		public InheritsContext inherits() {
			return getRuleContext(InheritsContext.class,0);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public OptionalContext optional() {
			return getRuleContext(OptionalContext.class,0);
		}
		public AtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributo; }
	}

	public final AtributoContext atributo() throws RecognitionException {
		AtributoContext _localctx = new AtributoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atributo);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CIERRA_LLAVE:
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				name();
				}
				break;
			case REVERSENAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				reversename();
				}
				break;
			case LABEL:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				label();
				}
				break;
			case REVERSELABEL:
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				reverselabel();
				}
				break;
			case GENDER:
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				gender();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 7);
				{
				setState(139);
				number();
				}
				break;
			case WORDTYPE:
				enterOuterAlt(_localctx, 8);
				{
				setState(140);
				wordtype();
				}
				break;
			case TYPEOF:
				enterOuterAlt(_localctx, 9);
				{
				setState(141);
				typeof();
				}
				break;
			case ISLIST:
				enterOuterAlt(_localctx, 10);
				{
				setState(142);
				islist();
				}
				break;
			case MULTIPLICITYMAX:
				enterOuterAlt(_localctx, 11);
				{
				setState(143);
				multiplicitymax();
				}
				break;
			case MULTIPLICITYMIN:
				enterOuterAlt(_localctx, 12);
				{
				setState(144);
				multiplicitymin();
				}
				break;
			case USEDBY:
				enterOuterAlt(_localctx, 13);
				{
				setState(145);
				usedby();
				}
				break;
			case LANGUAGEDATA:
				enterOuterAlt(_localctx, 14);
				{
				setState(146);
				languagedata();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 15);
				{
				setState(147);
				from();
				}
				break;
			case TO:
				enterOuterAlt(_localctx, 16);
				{
				setState(148);
				to();
				}
				break;
			case INHERITS:
				enterOuterAlt(_localctx, 17);
				{
				setState(149);
				inherits();
				}
				break;
			case PROPERTIES:
				enterOuterAlt(_localctx, 18);
				{
				setState(150);
				properties();
				}
				break;
			case OPTIONAL:
				enterOuterAlt(_localctx, 19);
				{
				setState(151);
				optional();
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GjsonParser.NAME, 0); }
		public TerminalNode CADENA() { return getToken(GjsonParser.CADENA, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(NAME);
			setState(155);
			match(CADENA);
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

	public static class ReversenameContext extends ParserRuleContext {
		public TerminalNode REVERSENAME() { return getToken(GjsonParser.REVERSENAME, 0); }
		public TerminalNode CADENA() { return getToken(GjsonParser.CADENA, 0); }
		public ReversenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reversename; }
	}

	public final ReversenameContext reversename() throws RecognitionException {
		ReversenameContext _localctx = new ReversenameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_reversename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(REVERSENAME);
			setState(158);
			match(CADENA);
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(GjsonParser.LABEL, 0); }
		public TerminalNode ABRE_LLAVE() { return getToken(GjsonParser.ABRE_LLAVE, 0); }
		public List<IdiomaContext> idioma() {
			return getRuleContexts(IdiomaContext.class);
		}
		public IdiomaContext idioma(int i) {
			return getRuleContext(IdiomaContext.class,i);
		}
		public TerminalNode CIERRA_LLAVE() { return getToken(GjsonParser.CIERRA_LLAVE, 0); }
		public List<TerminalNode> COMA() { return getTokens(GjsonParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(GjsonParser.COMA, i);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(LABEL);
			setState(161);
			match(ABRE_LLAVE);
			setState(162);
			idioma();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(163);
				match(COMA);
				setState(164);
				idioma();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(CIERRA_LLAVE);
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

	public static class ReverselabelContext extends ParserRuleContext {
		public TerminalNode REVERSELABEL() { return getToken(GjsonParser.REVERSELABEL, 0); }
		public TerminalNode ABRE_LLAVE() { return getToken(GjsonParser.ABRE_LLAVE, 0); }
		public List<RevidiomaContext> revidioma() {
			return getRuleContexts(RevidiomaContext.class);
		}
		public RevidiomaContext revidioma(int i) {
			return getRuleContext(RevidiomaContext.class,i);
		}
		public TerminalNode CIERRA_LLAVE() { return getToken(GjsonParser.CIERRA_LLAVE, 0); }
		public List<TerminalNode> COMA() { return getTokens(GjsonParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(GjsonParser.COMA, i);
		}
		public ReverselabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reverselabel; }
	}

	public final ReverselabelContext reverselabel() throws RecognitionException {
		ReverselabelContext _localctx = new ReverselabelContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_reverselabel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(REVERSELABEL);
			setState(173);
			match(ABRE_LLAVE);
			setState(174);
			revidioma();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(175);
				match(COMA);
				setState(176);
				revidioma();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(CIERRA_LLAVE);
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

	public static class GenderContext extends ParserRuleContext {
		public TerminalNode GENDER() { return getToken(GjsonParser.GENDER, 0); }
		public TerminalNode CADENA() { return getToken(GjsonParser.CADENA, 0); }
		public GenderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gender; }
	}

	public final GenderContext gender() throws RecognitionException {
		GenderContext _localctx = new GenderContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_gender);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(GENDER);
			setState(185);
			match(CADENA);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(GjsonParser.NUMBER, 0); }
		public TerminalNode CADENA() { return getToken(GjsonParser.CADENA, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(NUMBER);
			setState(188);
			match(CADENA);
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

	public static class WordtypeContext extends ParserRuleContext {
		public TerminalNode WORDTYPE() { return getToken(GjsonParser.WORDTYPE, 0); }
		public TerminalNode CADENA() { return getToken(GjsonParser.CADENA, 0); }
		public WordtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wordtype; }
	}

	public final WordtypeContext wordtype() throws RecognitionException {
		WordtypeContext _localctx = new WordtypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_wordtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(WORDTYPE);
			setState(191);
			match(CADENA);
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

	public static class TypeofContext extends ParserRuleContext {
		public TerminalNode TYPEOF() { return getToken(GjsonParser.TYPEOF, 0); }
		public TerminalNode CADENA() { return getToken(GjsonParser.CADENA, 0); }
		public TypeofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeof; }
	}

	public final TypeofContext typeof() throws RecognitionException {
		TypeofContext _localctx = new TypeofContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(TYPEOF);
			setState(194);
			match(CADENA);
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

	public static class IslistContext extends ParserRuleContext {
		public TerminalNode ISLIST() { return getToken(GjsonParser.ISLIST, 0); }
		public TerminalNode BOOLEAN() { return getToken(GjsonParser.BOOLEAN, 0); }
		public IslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_islist; }
	}

	public final IslistContext islist() throws RecognitionException {
		IslistContext _localctx = new IslistContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_islist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(ISLIST);
			setState(197);
			match(BOOLEAN);
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

	public static class MultiplicitymaxContext extends ParserRuleContext {
		public TerminalNode MULTIPLICITYMAX() { return getToken(GjsonParser.MULTIPLICITYMAX, 0); }
		public TerminalNode CADENA() { return getToken(GjsonParser.CADENA, 0); }
		public MultiplicitymaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicitymax; }
	}

	public final MultiplicitymaxContext multiplicitymax() throws RecognitionException {
		MultiplicitymaxContext _localctx = new MultiplicitymaxContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_multiplicitymax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(MULTIPLICITYMAX);
			setState(200);
			match(CADENA);
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

	public static class MultiplicityminContext extends ParserRuleContext {
		public TerminalNode MULTIPLICITYMIN() { return getToken(GjsonParser.MULTIPLICITYMIN, 0); }
		public TerminalNode CADENA() { return getToken(GjsonParser.CADENA, 0); }
		public MultiplicityminContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicitymin; }
	}

	public final MultiplicityminContext multiplicitymin() throws RecognitionException {
		MultiplicityminContext _localctx = new MultiplicityminContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multiplicitymin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(MULTIPLICITYMIN);
			setState(203);
			match(CADENA);
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

	public static class UsedbyContext extends ParserRuleContext {
		public TerminalNode USEDBY() { return getToken(GjsonParser.USEDBY, 0); }
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public UsedbyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usedby; }
	}

	public final UsedbyContext usedby() throws RecognitionException {
		UsedbyContext _localctx = new UsedbyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_usedby);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(USEDBY);
			setState(206);
			lista();
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

	public static class LanguagedataContext extends ParserRuleContext {
		public TerminalNode LANGUAGEDATA() { return getToken(GjsonParser.LANGUAGEDATA, 0); }
		public TerminalNode CADENA() { return getToken(GjsonParser.CADENA, 0); }
		public LanguagedataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_languagedata; }
	}

	public final LanguagedataContext languagedata() throws RecognitionException {
		LanguagedataContext _localctx = new LanguagedataContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_languagedata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(LANGUAGEDATA);
			setState(209);
			match(CADENA);
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

	public static class FromContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(GjsonParser.FROM, 0); }
		public TerminalNode CADENA() { return getToken(GjsonParser.CADENA, 0); }
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(FROM);
			setState(212);
			match(CADENA);
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

	public static class ToContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(GjsonParser.TO, 0); }
		public TerminalNode CADENA() { return getToken(GjsonParser.CADENA, 0); }
		public ToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to; }
	}

	public final ToContext to() throws RecognitionException {
		ToContext _localctx = new ToContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(TO);
			setState(215);
			match(CADENA);
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

	public static class InheritsContext extends ParserRuleContext {
		public TerminalNode INHERITS() { return getToken(GjsonParser.INHERITS, 0); }
		public TerminalNode CADENA() { return getToken(GjsonParser.CADENA, 0); }
		public InheritsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherits; }
	}

	public final InheritsContext inherits() throws RecognitionException {
		InheritsContext _localctx = new InheritsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_inherits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(INHERITS);
			setState(218);
			match(CADENA);
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

	public static class PropertiesContext extends ParserRuleContext {
		public TerminalNode PROPERTIES() { return getToken(GjsonParser.PROPERTIES, 0); }
		public List<CadenaPropertyContext> cadenaProperty() {
			return getRuleContexts(CadenaPropertyContext.class);
		}
		public CadenaPropertyContext cadenaProperty(int i) {
			return getRuleContext(CadenaPropertyContext.class,i);
		}
		public TerminalNode CIERRA_CORCHETE() { return getToken(GjsonParser.CIERRA_CORCHETE, 0); }
		public List<TerminalNode> COMA() { return getTokens(GjsonParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(GjsonParser.COMA, i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(PROPERTIES);
			setState(221);
			cadenaProperty();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(222);
				match(COMA);
				setState(223);
				cadenaProperty();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			match(CIERRA_CORCHETE);
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

	public static class OptionalContext extends ParserRuleContext {
		public TerminalNode OPTIONAL() { return getToken(GjsonParser.OPTIONAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(GjsonParser.BOOLEAN, 0); }
		public OptionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional; }
	}

	public final OptionalContext optional() throws RecognitionException {
		OptionalContext _localctx = new OptionalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_optional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(OPTIONAL);
			setState(232);
			match(BOOLEAN);
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

	public static class RevidiomaContext extends ParserRuleContext {
		public TerminalNode IDIOMA() { return getToken(GjsonParser.IDIOMA, 0); }
		public TerminalNode CADENA() { return getToken(GjsonParser.CADENA, 0); }
		public RevidiomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revidioma; }
	}

	public final RevidiomaContext revidioma() throws RecognitionException {
		RevidiomaContext _localctx = new RevidiomaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_revidioma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(IDIOMA);
			setState(235);
			match(CADENA);
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

	public static class IdiomaContext extends ParserRuleContext {
		public TerminalNode IDIOMA() { return getToken(GjsonParser.IDIOMA, 0); }
		public TerminalNode CADENA() { return getToken(GjsonParser.CADENA, 0); }
		public IdiomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idioma; }
	}

	public final IdiomaContext idioma() throws RecognitionException {
		IdiomaContext _localctx = new IdiomaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_idioma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(IDIOMA);
			setState(238);
			match(CADENA);
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

	public static class CadenaPropertyContext extends ParserRuleContext {
		public TerminalNode CADENA() { return getToken(GjsonParser.CADENA, 0); }
		public CadenaPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadenaProperty; }
	}

	public final CadenaPropertyContext cadenaProperty() throws RecognitionException {
		CadenaPropertyContext _localctx = new CadenaPropertyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cadenaProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(CADENA);
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

	public static class CadenaUsedByContext extends ParserRuleContext {
		public TerminalNode CADENA() { return getToken(GjsonParser.CADENA, 0); }
		public CadenaUsedByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadenaUsedBy; }
	}

	public final CadenaUsedByContext cadenaUsedBy() throws RecognitionException {
		CadenaUsedByContext _localctx = new CadenaUsedByContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cadenaUsedBy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(CADENA);
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

	public static class Tipo_grafoContext extends ParserRuleContext {
		public TerminalNode TIPO_GRAFO() { return getToken(GjsonParser.TIPO_GRAFO, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(GjsonParser.DOSPUNTOS, 0); }
		public Tipo_grafoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_grafo; }
	}

	public final Tipo_grafoContext tipo_grafo() throws RecognitionException {
		Tipo_grafoContext _localctx = new Tipo_grafoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tipo_grafo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(TIPO_GRAFO);
			setState(245);
			match(DOSPUNTOS);
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

	public static class Nombre_grafoContext extends ParserRuleContext {
		public TerminalNode CADENA() { return getToken(GjsonParser.CADENA, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(GjsonParser.DOSPUNTOS, 0); }
		public Nombre_grafoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre_grafo; }
	}

	public final Nombre_grafoContext nombre_grafo() throws RecognitionException {
		Nombre_grafoContext _localctx = new Nombre_grafoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_nombre_grafo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(CADENA);
			setState(248);
			match(DOSPUNTOS);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00fd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\7\7d\n\7\f\7\16\7g\13\7\3\7\3\7\3\7\7\7l\n\7\f\7\16\7o\13\7\3\7\3\7"+
		"\3\7\7\7t\n\7\f\7\16\7w\13\7\3\7\3\7\3\7\7\7|\n\7\f\7\16\7\177\13\7\5"+
		"\7\u0081\n\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009b\n\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u00a8\n\f\f\f\16\f\u00ab\13\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\7\r\u00b4\n\r\f\r\16\r\u00b7\13\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u00e3\n\32"+
		"\f\32\16\32\u00e6\13\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\2\2\"\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\2\2\u00f9\2B\3\2"+
		"\2\2\4G\3\2\2\2\6J\3\2\2\2\bO\3\2\2\2\nT\3\2\2\2\f_\3\2\2\2\16\u0084\3"+
		"\2\2\2\20\u009a\3\2\2\2\22\u009c\3\2\2\2\24\u009f\3\2\2\2\26\u00a2\3\2"+
		"\2\2\30\u00ae\3\2\2\2\32\u00ba\3\2\2\2\34\u00bd\3\2\2\2\36\u00c0\3\2\2"+
		"\2 \u00c3\3\2\2\2\"\u00c6\3\2\2\2$\u00c9\3\2\2\2&\u00cc\3\2\2\2(\u00cf"+
		"\3\2\2\2*\u00d2\3\2\2\2,\u00d5\3\2\2\2.\u00d8\3\2\2\2\60\u00db\3\2\2\2"+
		"\62\u00de\3\2\2\2\64\u00e9\3\2\2\2\66\u00ec\3\2\2\28\u00ef\3\2\2\2:\u00f2"+
		"\3\2\2\2<\u00f4\3\2\2\2>\u00f6\3\2\2\2@\u00f9\3\2\2\2BC\7\31\2\2CD\5\4"+
		"\3\2DE\5\f\7\2EF\7\32\2\2F\3\3\2\2\2GH\7\30\2\2HI\7#\2\2I\5\3\2\2\2JK"+
		"\7\31\2\2KL\5@!\2LM\5\b\5\2MN\7\32\2\2N\7\3\2\2\2OP\7\31\2\2PQ\5> \2Q"+
		"R\5\f\7\2RS\7\32\2\2S\t\3\2\2\2TU\7\31\2\2UZ\5\16\b\2VW\7\35\2\2WY\5\20"+
		"\t\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7"+
		"\32\2\2^\13\3\2\2\2_\u0080\7\33\2\2`e\5\6\4\2ab\7\35\2\2bd\5\6\4\2ca\3"+
		"\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\u0081\3\2\2\2ge\3\2\2\2hm\5\n\6"+
		"\2ij\7\35\2\2jl\5\n\6\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\u0081"+
		"\3\2\2\2om\3\2\2\2pu\5<\37\2qr\7\35\2\2rt\5<\37\2sq\3\2\2\2tw\3\2\2\2"+
		"us\3\2\2\2uv\3\2\2\2v\u0081\3\2\2\2wu\3\2\2\2x}\7 \2\2yz\7\35\2\2z|\7"+
		" \2\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0081\3\2\2\2\177}\3"+
		"\2\2\2\u0080`\3\2\2\2\u0080h\3\2\2\2\u0080p\3\2\2\2\u0080x\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0083\7\34\2\2\u0083\r\3\2\2\2\u0084\u0085\7\4\2"+
		"\2\u0085\u0086\7 \2\2\u0086\17\3\2\2\2\u0087\u009b\3\2\2\2\u0088\u009b"+
		"\5\22\n\2\u0089\u009b\5\24\13\2\u008a\u009b\5\26\f\2\u008b\u009b\5\30"+
		"\r\2\u008c\u009b\5\32\16\2\u008d\u009b\5\34\17\2\u008e\u009b\5\36\20\2"+
		"\u008f\u009b\5 \21\2\u0090\u009b\5\"\22\2\u0091\u009b\5$\23\2\u0092\u009b"+
		"\5&\24\2\u0093\u009b\5(\25\2\u0094\u009b\5*\26\2\u0095\u009b\5,\27\2\u0096"+
		"\u009b\5.\30\2\u0097\u009b\5\60\31\2\u0098\u009b\5\62\32\2\u0099\u009b"+
		"\5\64\33\2\u009a\u0087\3\2\2\2\u009a\u0088\3\2\2\2\u009a\u0089\3\2\2\2"+
		"\u009a\u008a\3\2\2\2\u009a\u008b\3\2\2\2\u009a\u008c\3\2\2\2\u009a\u008d"+
		"\3\2\2\2\u009a\u008e\3\2\2\2\u009a\u008f\3\2\2\2\u009a\u0090\3\2\2\2\u009a"+
		"\u0091\3\2\2\2\u009a\u0092\3\2\2\2\u009a\u0093\3\2\2\2\u009a\u0094\3\2"+
		"\2\2\u009a\u0095\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u0097\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\21\3\2\2\2\u009c\u009d\7\5\2"+
		"\2\u009d\u009e\7 \2\2\u009e\23\3\2\2\2\u009f\u00a0\7\16\2\2\u00a0\u00a1"+
		"\7 \2\2\u00a1\25\3\2\2\2\u00a2\u00a3\7\25\2\2\u00a3\u00a4\7\31\2\2\u00a4"+
		"\u00a9\58\35\2\u00a5\u00a6\7\35\2\2\u00a6\u00a8\58\35\2\u00a7\u00a5\3"+
		"\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7\32\2\2\u00ad\27\3\2\2"+
		"\2\u00ae\u00af\7\26\2\2\u00af\u00b0\7\31\2\2\u00b0\u00b5\5\66\34\2\u00b1"+
		"\u00b2\7\35\2\2\u00b2\u00b4\5\66\34\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00b9\7\32\2\2\u00b9\31\3\2\2\2\u00ba\u00bb\7\6\2"+
		"\2\u00bb\u00bc\7 \2\2\u00bc\33\3\2\2\2\u00bd\u00be\7\7\2\2\u00be\u00bf"+
		"\7 \2\2\u00bf\35\3\2\2\2\u00c0\u00c1\7\b\2\2\u00c1\u00c2\7 \2\2\u00c2"+
		"\37\3\2\2\2\u00c3\u00c4\7\t\2\2\u00c4\u00c5\7 \2\2\u00c5!\3\2\2\2\u00c6"+
		"\u00c7\7\n\2\2\u00c7\u00c8\7\37\2\2\u00c8#\3\2\2\2\u00c9\u00ca\7\f\2\2"+
		"\u00ca\u00cb\7 \2\2\u00cb%\3\2\2\2\u00cc\u00cd\7\r\2\2\u00cd\u00ce\7 "+
		"\2\2\u00ce\'\3\2\2\2\u00cf\u00d0\7\23\2\2\u00d0\u00d1\5\f\7\2\u00d1)\3"+
		"\2\2\2\u00d2\u00d3\7\24\2\2\u00d3\u00d4\7 \2\2\u00d4+\3\2\2\2\u00d5\u00d6"+
		"\7\17\2\2\u00d6\u00d7\7 \2\2\u00d7-\3\2\2\2\u00d8\u00d9\7\20\2\2\u00d9"+
		"\u00da\7 \2\2\u00da/\3\2\2\2\u00db\u00dc\7\21\2\2\u00dc\u00dd\7 \2\2\u00dd"+
		"\61\3\2\2\2\u00de\u00df\7\22\2\2\u00df\u00e4\5:\36\2\u00e0\u00e1\7\35"+
		"\2\2\u00e1\u00e3\5:\36\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e7\u00e8\7\34\2\2\u00e8\63\3\2\2\2\u00e9\u00ea\7\13\2\2\u00ea"+
		"\u00eb\7\37\2\2\u00eb\65\3\2\2\2\u00ec\u00ed\7\27\2\2\u00ed\u00ee\7 \2"+
		"\2\u00ee\67\3\2\2\2\u00ef\u00f0\7\27\2\2\u00f0\u00f1\7 \2\2\u00f19\3\2"+
		"\2\2\u00f2\u00f3\7 \2\2\u00f3;\3\2\2\2\u00f4\u00f5\7 \2\2\u00f5=\3\2\2"+
		"\2\u00f6\u00f7\7\3\2\2\u00f7\u00f8\7\36\2\2\u00f8?\3\2\2\2\u00f9\u00fa"+
		"\7 \2\2\u00fa\u00fb\7\36\2\2\u00fbA\3\2\2\2\fZemu}\u0080\u009a\u00a9\u00b5"+
		"\u00e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}