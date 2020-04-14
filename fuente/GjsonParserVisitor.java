// Generated from C:/Users/Danil/eclipse-workspace/EstrategiasCSV/src/gramaticaJSON/GjsonParser.g4 by ANTLR 4.7

	package fuente;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GjsonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GjsonParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GjsonParser#archivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchivo(GjsonParser.ArchivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext(GjsonParser.ContextContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#grafo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrafo(GjsonParser.GrafoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#cuerpo_grafo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo_grafo(GjsonParser.Cuerpo_grafoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#objeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjeto(GjsonParser.ObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista(GjsonParser.ListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(GjsonParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#atributo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributo(GjsonParser.AtributoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(GjsonParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#reversename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReversename(GjsonParser.ReversenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(GjsonParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#reverselabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReverselabel(GjsonParser.ReverselabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#gender}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGender(GjsonParser.GenderContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(GjsonParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#wordtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWordtype(GjsonParser.WordtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#typeof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeof(GjsonParser.TypeofContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#islist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIslist(GjsonParser.IslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#multiplicitymax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicitymax(GjsonParser.MultiplicitymaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#multiplicitymin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicitymin(GjsonParser.MultiplicityminContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#usedby}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsedby(GjsonParser.UsedbyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#languagedata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguagedata(GjsonParser.LanguagedataContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom(GjsonParser.FromContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTo(GjsonParser.ToContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#inherits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInherits(GjsonParser.InheritsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(GjsonParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#optional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional(GjsonParser.OptionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#revidioma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevidioma(GjsonParser.RevidiomaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#idioma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdioma(GjsonParser.IdiomaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#cadenaProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadenaProperty(GjsonParser.CadenaPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#cadenaUsedBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadenaUsedBy(GjsonParser.CadenaUsedByContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#tipo_grafo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_grafo(GjsonParser.Tipo_grafoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GjsonParser#nombre_grafo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombre_grafo(GjsonParser.Nombre_grafoContext ctx);
}