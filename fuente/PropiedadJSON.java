package fuente;

import java.util.ArrayList;
import java.util.HashMap;

public class PropiedadJSON {

	String nombre;
	HashMap<String,String> labels= new HashMap<>();
	String typeOf;
	String isList;
	String optional;
	String multiplicityMax;
	String multiplicityMin;
	ArrayList<String> usedBy=new ArrayList<>();
	String languageData;
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void addLabel(String clave, String valor) {
		labels.put(clave, valor);
	}
	
	public String getTypeOf() {
		return this.typeOf;
	}
	
	public void setTypeOf(String typeof) {
		this.typeOf=typeof;
	}
	
	public void setIsList(String islist) {
		this.isList=islist;
	}
	
	public void setOptional(String optional) {
		this.optional=optional;
	}
	
	public String getMultiplicityMax() {
		return this.multiplicityMax;
	}
	
	public void setMultiplicityMax(String multiplicitymax) {
		this.multiplicityMax=multiplicitymax;
	}
	
	public String getMultiplicityMin() {
		return this.multiplicityMin;
	}
	
	public void setMultiplicityMin(String multiplicitymin) {
		this.multiplicityMin=multiplicitymin;
	}
	
	public void setLanguageData(String languagedata) {
		this.languageData=languagedata;
	}
	
	public ArrayList<String> getUsedBy(){
		return this.usedBy;
	}
	
	public void addUsedBy(String usedBy) {
		this.usedBy.add(usedBy);
	}
	
	public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("\t\tNOMBRE:"+nombre+"\n");
        sb.append("\t\tLABELS: \n");
        for (String labelsId : labels.keySet()) {
            sb.append("\t\t\t" + labelsId + " : " + labels.get(labelsId) + "\n");
        };
        sb.append("\t\tTYPEOF:"+typeOf+"\n");
        sb.append("\t\tISLIST:"+isList+"\n");
        sb.append("\t\tOPTIONAL:"+optional+"\n");
        sb.append("\t\tNMULTIPLICITYMAX:"+multiplicityMax+"\n");
        sb.append("\t\tMULTIPLICITYMIN:"+multiplicityMin+"\n");
        sb.append("\t\tUSEDBY: \n");
        for (String usedById : usedBy) {
            sb.append("\t\t\t" + usedById + "\n");
        }
        sb.append("\t\tLANGUAJEDATA:"+nombre+"\n");
        return sb.toString();
    }
	
	public String toDot() {
		String dot="\t property_"+Character.toLowerCase(this.nombre.charAt(0))+this.nombre.substring(1)+"[label=\"{"+this.nombre+"|"+this.typeOf+"}\"";
		if(this.optional!=null) {
			if(this.optional.equals("true")) {
				dot+=",style=\"filled,dashed\"";
			}
		}
		
		dot+="];\n";
		return dot;
	}
}
