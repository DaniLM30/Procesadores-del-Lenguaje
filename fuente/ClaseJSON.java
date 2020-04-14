package fuente;

import java.util.ArrayList;
import java.util.HashMap;

public class ClaseJSON {

	String nombre;
	HashMap<String,String> labels= new HashMap<>();
	ArrayList<String> propiedades= new ArrayList<>();
	String inherits;
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public ArrayList<String> getPropiedades(){
		return this.propiedades;
	}
	
	public void addProperty(String property) {
		propiedades.add(property);
	}
	
	public void addLabel(String clave, String valor) {
		labels.put(clave, valor);
	}
	
	public String getInherits() {
		return this.inherits;
	}
	
	public void setInherits(String inherits) {
		this.inherits=inherits;
	}
	
	public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("\t\tNOMBRE:"+nombre+"\n");
        sb.append("\t\tLABELS: \n");
        for (String labelsId : labels.keySet()) {
            sb.append("\t\t\t" + labelsId + " : " + labels.get(labelsId) + "\n");
        }

        sb.append("\t\tPROPERTIES: \n");
        for (String propiedadId : propiedades) {
            sb.append("\t\t\t" + propiedadId + "\n");
        }
        sb.append("\t\tHERENCIA:"+inherits+"\n");
        return sb.toString();
    }
	
	public String toDot() {
		String dot="\t class_"+this.nombre+" [label=\""+this.nombre+"\"];\n";
		return dot;
	}
	
}
