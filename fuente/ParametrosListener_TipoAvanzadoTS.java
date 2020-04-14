package fuente; 

import fuente.GparametrosParser.ArrowsizeContext;
import fuente.GparametrosParser.FillcolorContext;
import fuente.GparametrosParser.FontcolorContext;
import fuente.GparametrosParser.ArrowcolorContext;
import fuente.GparametrosParser.FontnameContext;
import fuente.GparametrosParser.FontsizeContext;
import fuente.GparametrosParser.LenContext;
import fuente.GparametrosParser.PenwidthContext;
import fuente.GparametrosParser.ShapeContext;
import fuente.GparametrosParser.StyleContext;
import fuente.GparametrosParser.TextocsvContext;
import fuente.GparametrosParser.TextodotContext;
import fuente.GparametrosParser.TextojsonContext;
import fuente.GparametrosParser.TextosvgContext;

public class ParametrosListener_TipoAvanzadoTS extends GparametrosParserBaseListener {

	public static final String CAMPO_VACIO = "";
	
	private TSimb_Parametros_Avanzado _tablasimbolos;
	
	@SuppressWarnings("unused")
	private ParametrosListener_TipoAvanzadoTS() {
	     super();
	 }

	 public ParametrosListener_TipoAvanzadoTS(TSimb_Parametros_Avanzado p_ts) {
	     super();
	     _tablasimbolos = p_ts;
	 }
	 
	 @Override
	 public void exitTextocsv(TextocsvContext ctx) {
		_tablasimbolos.addCSV(ctx.getText());
	 }
	
	 @Override
	 public void exitTextojson(TextojsonContext ctx) {
		_tablasimbolos.addJSON(ctx.getText());
	 }
	 
	 @Override
	 public void exitTextodot(TextodotContext ctx) {
		_tablasimbolos.addDOT(ctx.getText());
	 }
	 
	 @Override
	 public void exitTextosvg(TextosvgContext ctx) {
		_tablasimbolos.addSVG(ctx.getText());
	 }
	 
	 @Override
	 public void exitLen(LenContext ctx) {
		_tablasimbolos.addParameters(ctx.len_name().getText(), ctx.numeroparam().getText());
	 }
	 
	 @Override
	 public void exitFontcolor(FontcolorContext ctx) {
		_tablasimbolos.addParameters(ctx.fontcolor_name().getText(),ctx.textoparam().getText());
	 }
	 
	 @Override
	 public void exitFontname(FontnameContext ctx) {
		 _tablasimbolos.addParameters(ctx.fontname_name().getText(),ctx.textoparam().getText());
	 }
	 
	 @Override
	 public void exitFontsize(FontsizeContext ctx) {
		 _tablasimbolos.addParameters(ctx.fontsize_name().getText(),ctx.numeroparam().getText());
	 }
	 
	 @Override
	 public void exitArrowsize(ArrowsizeContext ctx) {
		 _tablasimbolos.addParameters(ctx.arrowsize_name().getText(),ctx.numeroparam().getText());
	 }
	 
	 @Override
	 public void exitArrowcolor(ArrowcolorContext ctx) {
		 _tablasimbolos.addParameters(ctx.arrowcolor_name().getText(),ctx.textoparam().getText());
	 }
	 
	 @Override
	 public void exitPenwidth(PenwidthContext ctx) {
		 _tablasimbolos.addParameters(ctx.penwidth_name().getText(),ctx.numeroparam().getText());
	 }
	 
	 @Override
	 public void exitFillcolor(FillcolorContext ctx) {
		 _tablasimbolos.addParameters(ctx.fillcolor_name().getText(),ctx.textoparam().getText());
	 }
	 
	 @Override
	 public void exitStyle(StyleContext ctx) {
		 _tablasimbolos.addParameters(ctx.style_name().getText(),ctx.textoparam().getText());
	 }
	 
	 @Override
	 public void exitShape(ShapeContext ctx) {
		 _tablasimbolos.addParameters(ctx.shape_name().getText(),ctx.textoparam().getText());
	 }
	 
}
