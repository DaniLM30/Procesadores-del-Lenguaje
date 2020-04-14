// Generated from C:/Users/Danil/eclipse-workspace/EstrategiasCSV/src/gramaticaCSV/GestrategiacsvParser.g4 by ANTLR 4.7

	package fuente;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GestrategiacsvParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GestrategiacsvParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GestrategiacsvParser#csv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCsv(GestrategiacsvParser.CsvContext ctx);
	/**
	 * Visit a parse tree produced by {@link GestrategiacsvParser#cabecera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCabecera(GestrategiacsvParser.CabeceraContext ctx);
	/**
	 * Visit a parse tree produced by {@link GestrategiacsvParser#linea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinea(GestrategiacsvParser.LineaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnaSinComillas}
	 * labeled alternative in {@link GestrategiacsvParser#columna}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnaSinComillas(GestrategiacsvParser.ColumnaSinComillasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnaConComillas}
	 * labeled alternative in {@link GestrategiacsvParser#columna}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnaConComillas(GestrategiacsvParser.ColumnaConComillasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnaVacio}
	 * labeled alternative in {@link GestrategiacsvParser#columna}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnaVacio(GestrategiacsvParser.ColumnaVacioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textoSinComillas}
	 * labeled alternative in {@link GestrategiacsvParser#campo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextoSinComillas(GestrategiacsvParser.TextoSinComillasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringConComillas}
	 * labeled alternative in {@link GestrategiacsvParser#campo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConComillas(GestrategiacsvParser.StringConComillasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code campoVacio}
	 * labeled alternative in {@link GestrategiacsvParser#campo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampoVacio(GestrategiacsvParser.CampoVacioContext ctx);
}