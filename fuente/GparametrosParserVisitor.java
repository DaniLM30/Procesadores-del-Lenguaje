// Generated from C:/Users/Danil/eclipse-workspace/EstrategiasCSV/src/gramaticaParametros/GparametrosParser.g4 by ANTLR 4.7

	package fuente;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GparametrosParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GparametrosParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#entrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntrada(GparametrosParser.EntradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#tipo_archivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_archivo(GparametrosParser.Tipo_archivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#textocsv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextocsv(GparametrosParser.TextocsvContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#textojson}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextojson(GparametrosParser.TextojsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#textosvg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextosvg(GparametrosParser.TextosvgContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#textodot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextodot(GparametrosParser.TextodotContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#textoparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextoparam(GparametrosParser.TextoparamContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#numeroparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeroparam(GparametrosParser.NumeroparamContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#csv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCsv(GparametrosParser.CsvContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(GparametrosParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#svg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSvg(GparametrosParser.SvgContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#dot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot(GparametrosParser.DotContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(GparametrosParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLen(GparametrosParser.LenContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#fontcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontcolor(GparametrosParser.FontcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#fontname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontname(GparametrosParser.FontnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#fontsize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontsize(GparametrosParser.FontsizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#arrowsize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowsize(GparametrosParser.ArrowsizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#arrowcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowcolor(GparametrosParser.ArrowcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#penwidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPenwidth(GparametrosParser.PenwidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#fillcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFillcolor(GparametrosParser.FillcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(GparametrosParser.StyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#shape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShape(GparametrosParser.ShapeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#len_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLen_name(GparametrosParser.Len_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#fontcolor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontcolor_name(GparametrosParser.Fontcolor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#fontname_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontname_name(GparametrosParser.Fontname_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#fontsize_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontsize_name(GparametrosParser.Fontsize_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#arrowsize_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowsize_name(GparametrosParser.Arrowsize_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#arrowcolor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowcolor_name(GparametrosParser.Arrowcolor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#penwidth_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPenwidth_name(GparametrosParser.Penwidth_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#fillcolor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFillcolor_name(GparametrosParser.Fillcolor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#style_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle_name(GparametrosParser.Style_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#shape_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShape_name(GparametrosParser.Shape_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#p_edge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_edge(GparametrosParser.P_edgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#p_node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_node(GparametrosParser.P_nodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#p_relationship}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_relationship(GparametrosParser.P_relationshipContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#p_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_class(GparametrosParser.P_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#p_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_property(GparametrosParser.P_propertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#p_inheritance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_inheritance(GparametrosParser.P_inheritanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#p_inderect_use}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_inderect_use(GparametrosParser.P_inderect_useContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#p_len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_len(GparametrosParser.P_lenContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#p_fontcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_fontcolor(GparametrosParser.P_fontcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#p_fontname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_fontname(GparametrosParser.P_fontnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#p_fontsize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_fontsize(GparametrosParser.P_fontsizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#p_arrowsize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_arrowsize(GparametrosParser.P_arrowsizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#p_arrowcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_arrowcolor(GparametrosParser.P_arrowcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#p_penwidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_penwidth(GparametrosParser.P_penwidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#p_fillcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_fillcolor(GparametrosParser.P_fillcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#p_style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_style(GparametrosParser.P_styleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GparametrosParser#p_shape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_shape(GparametrosParser.P_shapeContext ctx);
}