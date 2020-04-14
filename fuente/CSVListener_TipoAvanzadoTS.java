package fuente;

import fuente.GestrategiacsvParser.CampoVacioContext;
import fuente.GestrategiacsvParser.ColumnaConComillasContext;
import fuente.GestrategiacsvParser.ColumnaSinComillasContext;
import fuente.GestrategiacsvParser.ColumnaVacioContext;
import fuente.GestrategiacsvParser.LineaContext;
import fuente.GestrategiacsvParser.StringConComillasContext;
import fuente.GestrategiacsvParser.TextoSinComillasContext;

public class CSVListener_TipoAvanzadoTS extends GestrategiacsvParserBaseListener { 
	public static final String CAMPO_VACIO="";
	
	private TSimb_CSV_Avanzado _tablasimbolos;
	
	@SuppressWarnings("unused")
	private CSVListener_TipoAvanzadoTS() {
		super();
	}
	
	public CSVListener_TipoAvanzadoTS(TSimb_CSV_Avanzado p_ts) {
		super();
		_tablasimbolos = p_ts;
	}
	
	@Override
	public void exitColumnaConComillas(ColumnaConComillasContext ctx) {
		_tablasimbolos.addColumn(ctx.CADENA().getText());
	}
	
	@Override
	public void exitColumnaSinComillas(ColumnaSinComillasContext ctx) {
		_tablasimbolos.addColumn(ctx.TEXTO().getText());
	}
	
	@Override
	public void exitColumnaVacio(ColumnaVacioContext ctx) {
		_tablasimbolos.addColumn(CSVListener_TipoAvanzadoTS.CAMPO_VACIO);
	}
	
	@Override
	public void enterLinea(LineaContext ctx) {
		_tablasimbolos.newRow();
	}
	
	@Override
	public void exitTextoSinComillas(TextoSinComillasContext ctx) {
		_tablasimbolos.addValue(ctx.TEXTO().getText());
	}
	
	@Override
	public void exitStringConComillas(StringConComillasContext ctx) {
		_tablasimbolos.addValue(ctx.CADENA().getText());
	}
	
	@Override
	public void exitCampoVacio(CampoVacioContext ctx) {
		_tablasimbolos.addValue(CSVListener_TipoAvanzadoTS.CAMPO_VACIO);
	}
	
	
	
	
	
	
}
