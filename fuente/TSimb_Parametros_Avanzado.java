package fuente;


import java.util.*;

public class TSimb_Parametros_Avanzado{

    private ArrayList<String> CSVs = new ArrayList<String>();
    private ArrayList<String> JSONs = new ArrayList<String>();
    private ArrayList<String> DOTs = new ArrayList<String>();
    private ArrayList<String> SVGs = new ArrayList<String>();
    private ArrayList<String> nombreParametros = new ArrayList<String>();
    private ArrayList<String> valorParametros = new ArrayList<String>();

    public static final String CAMPO_VACIO = "";
 
    public TSimb_Parametros_Avanzado() {
        for (String p1 : parametros_1) {
            for (String p2 : parametros_2) {
                if (p1 != parametros_1[0]) {
                    for (String p3 : parametros_3) {
                        valorParametros.add(CAMPO_VACIO);
                        nombreParametros.add(p1 + p3 + p2);
                    }
                } else {
                    valorParametros.add(CAMPO_VACIO); 
                    nombreParametros.add(p1 + p2);
                }
            }
        }
    }

    private static final String parametros_1[] = { "-len", "-fontcolor", "-fontname", "-fontsize", "-arrowsize",
            "-arrowcolor", "-penwidth", "-fillcolor", "-style", "-shape" };
    private static final String parametros_2[] = { "_relationship=", "_class=", "_property=", "_inheritance=",
            "_indirect_use=" };
    private static final String parametros_3[] = { "_edge", "_node", };
 
    
    public void addCSV(String p_csv) {
        CSVs.add(p_csv);
    }
    
    public void addJSON(String p_json) {        
    	JSONs.add(p_json);
    }
   
    public void addDOT(String p_dot) {
        DOTs.add(p_dot);
    }
  
    public void addSVG(String p_svg) {
        SVGs.add(p_svg);
    }
    
    public ArrayList<String> getCSVs(){
    	return this.CSVs;
    }
    
    public ArrayList<String> getJSONs(){
    	return this.JSONs;
    }

    public ArrayList<String> getDOTs(){
    	return this.DOTs;
    }
    
    public ArrayList<String> getSVGs(){
    	return this.SVGs;
    }
    
    public void addParameters(String nombreParametro, String contenidoParametro) {
        if (nombreParametros.contains(nombreParametro))
            valorParametros.set(nombreParametros.indexOf(nombreParametro), contenidoParametro);
    }

    public ArrayList<String> getNodeRelationshipParameters() {
        return getParameter("_node_relationship=");
    }

    public ArrayList<String> getEdgeRelationshipParameters() {
        return getParameter("_edge_relationship=");
    }

    public ArrayList<String> getNodeClassParameters() {
        return getParameter("_node_class=");
    }

    public ArrayList<String> getEdgeClassParameters() {
        return getParameter("_edge_class=");
    }

    public ArrayList<String> getNodePropertyParameters() {
        return getParameter("_node_property=");
    }

    public ArrayList<String> getEdgePropertyParameters() {
        return getParameter("_edge_property=");
    }

    public ArrayList<String> getNodeInheritanceParameters() {
        return getParameter("_node_inheritance=");
    }

    public ArrayList<String> getEdgeInheritanceParameters() {
        return getParameter("_edge_inheritance=");
    }

    public ArrayList<String> getNodeIndirectUseParameters() {
        return getParameter("_node_indirect_use=");
    }

    public ArrayList<String> getEdgeIndirectUseParameters() {
        return getParameter("_edge_indirect_use=");
    }

    private ArrayList<String> getParameter(String nombre) {
        ArrayList<String> parametros = new ArrayList<>();
        for (int i = 0; i < nombreParametros.size(); i++) {
            if (nombreParametros.get(i).contains(nombre) || nombreParametros.get(i).contains("-len" + nombre.replace("_edge", ""))
            		||nombreParametros.get(i).contains("-len" + nombre.replace("_node", ""))){
                if (!valorParametros.get(i).equals(CAMPO_VACIO)) {
                    String cadena = nombreParametros.get(i);
                    for (String borrar : parametros_2) {
                        cadena = cadena.replaceAll(borrar, CAMPO_VACIO);
                    }
                    for (String borrar : parametros_3) {
                        cadena = cadena.replaceAll(borrar, CAMPO_VACIO);
                    }
                    cadena = cadena.replace("-", "");
                    cadena = cadena.replace("=", "");
                    parametros.add(cadena + "=\"" + valorParametros.get(i) + "\"");
                }
            }
        }
        return parametros;
    }
}