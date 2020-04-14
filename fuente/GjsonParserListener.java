// Generated from .\fuente\GjsonParser.g4 by ANTLR 4.7.1

	package fuente;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GjsonParser}.
 */
public interface GjsonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GjsonParser#archivo}.
	 * @param ctx the parse tree
	 */
	void enterArchivo(GjsonParser.ArchivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#archivo}.
	 * @param ctx the parse tree
	 */
	void exitArchivo(GjsonParser.ArchivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#context}.
	 * @param ctx the parse tree
	 */
	void enterContext(GjsonParser.ContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#context}.
	 * @param ctx the parse tree
	 */
	void exitContext(GjsonParser.ContextContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#grafo}.
	 * @param ctx the parse tree
	 */
	void enterGrafo(GjsonParser.GrafoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#grafo}.
	 * @param ctx the parse tree
	 */
	void exitGrafo(GjsonParser.GrafoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#cuerpo_grafo}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo_grafo(GjsonParser.Cuerpo_grafoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#cuerpo_grafo}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo_grafo(GjsonParser.Cuerpo_grafoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#objeto}.
	 * @param ctx the parse tree
	 */
	void enterObjeto(GjsonParser.ObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#objeto}.
	 * @param ctx the parse tree
	 */
	void exitObjeto(GjsonParser.ObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#lista}.
	 * @param ctx the parse tree
	 */
	void enterLista(GjsonParser.ListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#lista}.
	 * @param ctx the parse tree
	 */
	void exitLista(GjsonParser.ListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(GjsonParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(GjsonParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#atributo}.
	 * @param ctx the parse tree
	 */
	void enterAtributo(GjsonParser.AtributoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#atributo}.
	 * @param ctx the parse tree
	 */
	void exitAtributo(GjsonParser.AtributoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(GjsonParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(GjsonParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#reversename}.
	 * @param ctx the parse tree
	 */
	void enterReversename(GjsonParser.ReversenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#reversename}.
	 * @param ctx the parse tree
	 */
	void exitReversename(GjsonParser.ReversenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(GjsonParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(GjsonParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#reverselabel}.
	 * @param ctx the parse tree
	 */
	void enterReverselabel(GjsonParser.ReverselabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#reverselabel}.
	 * @param ctx the parse tree
	 */
	void exitReverselabel(GjsonParser.ReverselabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#gender}.
	 * @param ctx the parse tree
	 */
	void enterGender(GjsonParser.GenderContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#gender}.
	 * @param ctx the parse tree
	 */
	void exitGender(GjsonParser.GenderContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(GjsonParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(GjsonParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#wordtype}.
	 * @param ctx the parse tree
	 */
	void enterWordtype(GjsonParser.WordtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#wordtype}.
	 * @param ctx the parse tree
	 */
	void exitWordtype(GjsonParser.WordtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#typeof}.
	 * @param ctx the parse tree
	 */
	void enterTypeof(GjsonParser.TypeofContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#typeof}.
	 * @param ctx the parse tree
	 */
	void exitTypeof(GjsonParser.TypeofContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#islist}.
	 * @param ctx the parse tree
	 */
	void enterIslist(GjsonParser.IslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#islist}.
	 * @param ctx the parse tree
	 */
	void exitIslist(GjsonParser.IslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#multiplicitymax}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicitymax(GjsonParser.MultiplicitymaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#multiplicitymax}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicitymax(GjsonParser.MultiplicitymaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#multiplicitymin}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicitymin(GjsonParser.MultiplicityminContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#multiplicitymin}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicitymin(GjsonParser.MultiplicityminContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#usedby}.
	 * @param ctx the parse tree
	 */
	void enterUsedby(GjsonParser.UsedbyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#usedby}.
	 * @param ctx the parse tree
	 */
	void exitUsedby(GjsonParser.UsedbyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#languagedata}.
	 * @param ctx the parse tree
	 */
	void enterLanguagedata(GjsonParser.LanguagedataContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#languagedata}.
	 * @param ctx the parse tree
	 */
	void exitLanguagedata(GjsonParser.LanguagedataContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(GjsonParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(GjsonParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#to}.
	 * @param ctx the parse tree
	 */
	void enterTo(GjsonParser.ToContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#to}.
	 * @param ctx the parse tree
	 */
	void exitTo(GjsonParser.ToContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#inherits}.
	 * @param ctx the parse tree
	 */
	void enterInherits(GjsonParser.InheritsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#inherits}.
	 * @param ctx the parse tree
	 */
	void exitInherits(GjsonParser.InheritsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(GjsonParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(GjsonParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#optional}.
	 * @param ctx the parse tree
	 */
	void enterOptional(GjsonParser.OptionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#optional}.
	 * @param ctx the parse tree
	 */
	void exitOptional(GjsonParser.OptionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#revidioma}.
	 * @param ctx the parse tree
	 */
	void enterRevidioma(GjsonParser.RevidiomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#revidioma}.
	 * @param ctx the parse tree
	 */
	void exitRevidioma(GjsonParser.RevidiomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#idioma}.
	 * @param ctx the parse tree
	 */
	void enterIdioma(GjsonParser.IdiomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#idioma}.
	 * @param ctx the parse tree
	 */
	void exitIdioma(GjsonParser.IdiomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#cadenaProperty}.
	 * @param ctx the parse tree
	 */
	void enterCadenaProperty(GjsonParser.CadenaPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#cadenaProperty}.
	 * @param ctx the parse tree
	 */
	void exitCadenaProperty(GjsonParser.CadenaPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#cadenaUsedBy}.
	 * @param ctx the parse tree
	 */
	void enterCadenaUsedBy(GjsonParser.CadenaUsedByContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#cadenaUsedBy}.
	 * @param ctx the parse tree
	 */
	void exitCadenaUsedBy(GjsonParser.CadenaUsedByContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#tipo_grafo}.
	 * @param ctx the parse tree
	 */
	void enterTipo_grafo(GjsonParser.Tipo_grafoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#tipo_grafo}.
	 * @param ctx the parse tree
	 */
	void exitTipo_grafo(GjsonParser.Tipo_grafoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GjsonParser#nombre_grafo}.
	 * @param ctx the parse tree
	 */
	void enterNombre_grafo(GjsonParser.Nombre_grafoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GjsonParser#nombre_grafo}.
	 * @param ctx the parse tree
	 */
	void exitNombre_grafo(GjsonParser.Nombre_grafoContext ctx);
}