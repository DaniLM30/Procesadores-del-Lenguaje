package fuente;

import java.util.ArrayList;
import java.util.HashMap;

public class RelacionJSON {
	
	String nombre;
	String reversename;
	HashMap<String,String> labels= new HashMap<>();
	HashMap<String,String> reverselabels= new HashMap<>();
	String from;
	String to;
	ArrayList<String> propiedades= new ArrayList<>();
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void addLabel(String clave, String valor) {
		labels.put(clave, valor);
	}
	
	public String getReversename() {
		return this.reversename;
	}
	
	public void setReversename(String reversename) {
		this.reversename=reversename;
	}
	
	public void addReverseLabel(String clave, String valor) {
		reverselabels.put(clave, valor);
	}
	
	public String getFrom() {
		return this.from;
	}
	
	public void setFrom(String from) {
		this.from=from;
	}
	
	public String getTo() {
		return this.to;
	}
	
	public void setTo(String to) {
		this.to=to;
	}
	
	public ArrayList<String> getPropiedades(){
		return this.propiedades;
	}
	
	public void addProperty(String property) {
		propiedades.add(property);
	}
	
	public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("\t\tNOMBRE:"+nombre+"\n");
        sb.append("\tREVERSENAME:"+reversename+"\n");
        sb.append("\t\tLABELS: \n");
        for (String labelsId : labels.keySet()) {
            sb.append("\t\t\t" + labelsId + " : " + labels.get(labelsId) + "\n");
        }
        sb.append("\t\tREVERSELABELS: \n");
        for (String revlabelsId : reverselabels.keySet()) {
            sb.append("\t\t\t" + revlabelsId + " : " + reverselabels.get(revlabelsId) + "\n");
        }
        sb.append("\t\tFROM:"+from+"\n");
        sb.append("\t\tTO:"+to+"\n");
        
        sb.append("\t\tPROPERTIES: \n");
        for (String propiedadId : propiedades) {
            sb.append("\t\t\t" + propiedadId + "\n");
        }
        return sb.toString();
    }
	
	public String toDot() {
		String dot="\t relationship_"+this.nombre+" [label=\""+this.nombre+"\"];\n";
		return dot;
	}
	
}
