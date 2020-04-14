package fuente;

import fuente.GjsonParser.CadenaPropertyContext;
import fuente.GjsonParser.CadenaUsedByContext;
import fuente.GjsonParser.FromContext;
import fuente.GjsonParser.GrafoContext;
import fuente.GjsonParser.IdiomaContext;
import fuente.GjsonParser.InheritsContext;
import fuente.GjsonParser.IslistContext;
import fuente.GjsonParser.LanguagedataContext;
import fuente.GjsonParser.MultiplicitymaxContext;
import fuente.GjsonParser.MultiplicityminContext;
import fuente.GjsonParser.NameContext;
import fuente.GjsonParser.Nombre_grafoContext;
import fuente.GjsonParser.ObjetoContext;
import fuente.GjsonParser.OptionalContext;
import fuente.GjsonParser.ReversenameContext;
import fuente.GjsonParser.RevidiomaContext;
import fuente.GjsonParser.Tipo_grafoContext;
import fuente.GjsonParser.ToContext;
import fuente.GjsonParser.TypeofContext;

public class JSONListener_TipoAvanzadoTS extends GjsonParserBaseListener {

	 public static final String CAMPO_VACIO = "";
	 public int ultimo_introducido=0;
	 private TSimb_JSON_Avanzado _tablasimbolos;

	 @SuppressWarnings("unused")
	private JSONListener_TipoAvanzadoTS() {
	     super();
	 }

	 public JSONListener_TipoAvanzadoTS(TSimb_JSON_Avanzado p_ts) {
	     super();
	     _tablasimbolos = p_ts;
	 }
	   
	@Override
	public void enterGrafo(GrafoContext ctx) {
		GrafoJSON grafo=new GrafoJSON();
		_tablasimbolos.insertaGrafo(grafo);
	}
	@Override
	public void enterNombre_grafo(Nombre_grafoContext ctx) {
		GrafoJSON grafo= _tablasimbolos.getGrafos().get(_tablasimbolos.getGrafos().size()-1);
		grafo.setNombre(ctx.CADENA().getText());
	}
	
	@Override
	public void enterTipo_grafo(Tipo_grafoContext ctx) {
		GrafoJSON grafo= _tablasimbolos.getGrafos().get(_tablasimbolos.getGrafos().size()-1);
		grafo.setTipo(ctx.TIPO_GRAFO().getText());
	}
	
	@Override
	public void enterObjeto(ObjetoContext ctx) {
		GrafoJSON grafo= _tablasimbolos.getGrafos().get(_tablasimbolos.getGrafos().size()-1);
		if(ctx.identificador().CADENA().getText().contains("class#")) {
			ClaseJSON clase=new ClaseJSON();
			grafo.addClase(clase);
			ultimo_introducido=1;
			
		}
		else if(ctx.identificador().CADENA().getText().contains("relationship#")) {
			RelacionJSON relacion=new RelacionJSON();
			grafo.addRelacion(relacion);
			ultimo_introducido=2;
		}
		else if(ctx.identificador().CADENA().getText().contains("property#")) {
			PropiedadJSON propiedad=new PropiedadJSON();
			grafo.addPropiedad(propiedad);
			ultimo_introducido=3;
		}
	}
	
	@Override
	public void enterName(NameContext ctx) {
		GrafoJSON grafo= _tablasimbolos.getGrafos().get(_tablasimbolos.getGrafos().size()-1);
		if(ultimo_introducido==1) {
			grafo.getClases().get(grafo.getClases().size()-1).setNombre(ctx.CADENA().getText());
		}
		else if(ultimo_introducido==2){
			grafo.getRelaciones().get(grafo.getRelaciones().size()-1).setNombre(ctx.CADENA().getText());
		}
		else if(ultimo_introducido==3){
			grafo.getPropiedades().get(grafo.getPropiedades().size()-1).setNombre(ctx.CADENA().getText());
		}
	}
	
	@Override
	public void enterIdioma(IdiomaContext ctx) {
		GrafoJSON grafo= _tablasimbolos.getGrafos().get(_tablasimbolos.getGrafos().size()-1);
		if(ultimo_introducido==1) {
			grafo.getClases().get(grafo.getClases().size()-1).addLabel(ctx.IDIOMA().getText(),ctx.CADENA().getText());
		}
		else if(ultimo_introducido==2){
			grafo.getRelaciones().get(grafo.getRelaciones().size()-1).addLabel(ctx.IDIOMA().getText(),ctx.CADENA().getText());
		}
		else if(ultimo_introducido==3){
			grafo.getPropiedades().get(grafo.getPropiedades().size()-1).addLabel(ctx.IDIOMA().getText(),ctx.CADENA().getText());
		}
	}
	 
	@Override
	public void enterCadenaProperty(CadenaPropertyContext ctx) {
		GrafoJSON grafo= _tablasimbolos.getGrafos().get(_tablasimbolos.getGrafos().size()-1);
		if(ultimo_introducido==1) {
			grafo.getClases().get(grafo.getClases().size()-1).addProperty(ctx.CADENA().getText());
		}
		else if(ultimo_introducido==2){
			grafo.getRelaciones().get(grafo.getRelaciones().size()-1).addProperty(ctx.CADENA().getText());
		}
	}
	
	@Override
	public void enterInherits(InheritsContext ctx) {
		GrafoJSON grafo= _tablasimbolos.getGrafos().get(_tablasimbolos.getGrafos().size()-1);
		grafo.getClases().get(grafo.getClases().size()-1).setInherits(ctx.CADENA().getText());
	}
	
	@Override
	public void enterTypeof(TypeofContext ctx) {
		GrafoJSON grafo= _tablasimbolos.getGrafos().get(_tablasimbolos.getGrafos().size()-1);
		grafo.getPropiedades().get(grafo.getPropiedades().size()-1).setTypeOf(ctx.CADENA().getText());
	}
	
	@Override
	public void enterIslist(IslistContext ctx) {
		GrafoJSON grafo= _tablasimbolos.getGrafos().get(_tablasimbolos.getGrafos().size()-1);
		grafo.getPropiedades().get(grafo.getPropiedades().size()-1).setIsList(ctx.BOOLEAN().getText());
	}
	
	@Override
	public void enterOptional(OptionalContext ctx) {
		GrafoJSON grafo= _tablasimbolos.getGrafos().get(_tablasimbolos.getGrafos().size()-1);
		grafo.getPropiedades().get(grafo.getPropiedades().size()-1).setOptional(ctx.BOOLEAN().getText());
	}
	
	@Override
	public void enterMultiplicitymax(MultiplicitymaxContext ctx) {
		GrafoJSON grafo= _tablasimbolos.getGrafos().get(_tablasimbolos.getGrafos().size()-1);
		grafo.getPropiedades().get(grafo.getPropiedades().size()-1).setMultiplicityMax(ctx.CADENA().getText());
	}
	
	@Override
	public void enterMultiplicitymin(MultiplicityminContext ctx) {
		GrafoJSON grafo= _tablasimbolos.getGrafos().get(_tablasimbolos.getGrafos().size()-1);
		grafo.getPropiedades().get(grafo.getPropiedades().size()-1).setMultiplicityMin(ctx.CADENA().getText());
	}
	
	@Override
	public void enterLanguagedata(LanguagedataContext ctx) {
		GrafoJSON grafo= _tablasimbolos.getGrafos().get(_tablasimbolos.getGrafos().size()-1);
		grafo.getPropiedades().get(grafo.getPropiedades().size()-1).setLanguageData(ctx.CADENA().getText());
	}
	
	@Override
	public void enterCadenaUsedBy(CadenaUsedByContext ctx) {
		GrafoJSON grafo= _tablasimbolos.getGrafos().get(_tablasimbolos.getGrafos().size()-1);
		grafo.getPropiedades().get(grafo.getPropiedades().size()-1).addUsedBy(ctx.getText());
	}
	
	@Override
	public void enterReversename(ReversenameContext ctx) {
		GrafoJSON grafo= _tablasimbolos.getGrafos().get(_tablasimbolos.getGrafos().size()-1);
		grafo.getRelaciones().get(grafo.getRelaciones().size()-1).setReversename(ctx.CADENA().getText());
	}
	
	@Override
	public void enterRevidioma(RevidiomaContext ctx) {
		GrafoJSON grafo= _tablasimbolos.getGrafos().get(_tablasimbolos.getGrafos().size()-1);
		grafo.getRelaciones().get(grafo.getRelaciones().size()-1).addReverseLabel(ctx.IDIOMA().getText(),ctx.CADENA().getText());
	}
	
	@Override
	public void enterFrom(FromContext ctx) {
		GrafoJSON grafo= _tablasimbolos.getGrafos().get(_tablasimbolos.getGrafos().size()-1);
		grafo.getRelaciones().get(grafo.getRelaciones().size()-1).setFrom(ctx.CADENA().getText());
	}
	
	@Override
	public void enterTo(ToContext ctx) {
		GrafoJSON grafo= _tablasimbolos.getGrafos().get(_tablasimbolos.getGrafos().size()-1);
		grafo.getRelaciones().get(grafo.getRelaciones().size()-1).setTo(ctx.CADENA().getText());
	}
	
	
	
	
}
