package fuente;

import java.util.ArrayList;

public class GrafoJSON {	
	String nombre;
	String tipo;
	ArrayList<ClaseJSON> clases=new ArrayList<>();
	ArrayList<PropiedadJSON> propiedades=new ArrayList<>();
	ArrayList<RelacionJSON> relaciones=new ArrayList<>();
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}
	
	public void addClase(ClaseJSON clase) {
		clases.add(clase);
	}
	
	public ArrayList<ClaseJSON> getClases(){
		return clases;
	}
	
	public ArrayList<PropiedadJSON> getPropiedades(){
		return propiedades;
	}
	
	public ArrayList<RelacionJSON> getRelaciones(){
		return relaciones;
	}
	
	public void addRelacion(RelacionJSON relacion) {
		relaciones.add(relacion);
	}
	
	public void addPropiedad(PropiedadJSON propiedad) {
		propiedades.add(propiedad);
	}
	
	public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Grafo: " + nombre + "\n");

        sb.append("TIPO: " + tipo.toString() + "\n");
        for (ClaseJSON claseId : clases) {
            sb.append("\tClase: " + claseId + "\n");
        }

        for (RelacionJSON relacionId : relaciones) {
            sb.append("\tRelacion: " + relacionId + "\n");
        }

        for (PropiedadJSON propiedadId : propiedades) {
            sb.append("\tPropiedad: " + propiedadId + "\n");
        }

        return sb.toString();
    }
	
	public String toDot(ArrayList<String> _node_relationship, ArrayList<String> _node_class, ArrayList<String> _node_property,
		ArrayList<String> _node_inheritance, ArrayList<String> _node_indirect_use, ArrayList<String> _edge_relationship,
		ArrayList<String> _edge_class, ArrayList<String> _edge_property, ArrayList<String> _edge_inheritance, ArrayList<String> _edge_indirect_use) {
		StringBuffer sb= new StringBuffer();
		
		//Generico
		sb.append("graph " + this.nombre + "{\n");
		sb.append("\t//Defecto\n");
		sb.append("\t node [fontname=\"Arial\"];\n");
		sb.append("\t edge [fontname=\"Arial\",fontsize=12];\n\n");
		
		//Propiedades
		sb.append("\t//PROPERTIES\n");
		sb.append("\t node \n \t [shape=\"record\",style=\"filled\",fillcolor=\"lightgoldenrodyellow\",fontsize=\"10\"]\n");
		sb.append("\t" + parametroDot(_node_property, "node") + "\n");
		for(PropiedadJSON propiedad: propiedades) {
			String propiedadADot=propiedad.toDot();
			sb.append(propiedadADot);			
		}
		
		//Clases
		sb.append("\n\t//CLASES\n");
		sb.append("\t node [shape=\"ellipse\",style=\"filled\",fillcolor=\"lightseagreen\",fontsize=\"20\"]\n");
		sb.append("\t" + parametroDot(_node_class, "node") + "\n");
        sb.append("\t" + parametroDot(_edge_class, "edge") + "\n");
		for(ClaseJSON clase: clases) {
			String claseADot= clase.toDot();
			sb.append(claseADot);
		}
		
		//Relaciones
		sb.append("\n\t//RELACIONES\n");
		sb.append("\t node [shape=\"hexagon\",style=\"filled\",fillcolor=\"paleturquoise\",fontsize=\"15\"]\n");
		sb.append("\t" + parametroDot(_node_relationship, "node") + "\n");
    	sb.append("\t" + parametroDot(_edge_relationship, "edge") + "\n");
		for(RelacionJSON relacion: relaciones) {
			String relacionADot= relacion.toDot();
			sb.append(relacionADot);
		}
		
		//Se separan elementos
		sb.append("\n\t//Se separan elementos\n");
		sb.append("\t edge[style=dashed,len=3,color=grey]\n");
		
		//Clase--Propiedad
		sb.append("\n\t//Clase-propiedad\n");
		sb.append("\t" + parametroDot(_edge_property, "edge") + "\n");
		for(ClaseJSON clase: clases) {			
			for(String propiedad: clase.getPropiedades()) {
				sb.append("\t class_"+clase.getNombre()+" -- ");
				int indice=propiedad.indexOf('#');
				String nombreProp= Character.toLowerCase(propiedad.charAt(indice+1))+propiedad.substring(indice+2);
				sb.append("property_"+nombreProp+";\n");
			}
			if(clase.getInherits()!=null) {
				conseguirHerencias(clase.getNombre(),clase,sb);
			}
		}
		
		//Relacion--propiedad
		sb.append("\n\t//Relacion-propiedad\n");
		sb.append("\t" + parametroDot(_edge_relationship, "edge") + "\n");
		for(RelacionJSON relacion: relaciones) {			
			for(String propiedad: relacion.getPropiedades()) {
				sb.append("\t relationship_"+relacion.getNombre()+" -- ");
				int indice=propiedad.indexOf('#');
				String nombreProp= Character.toLowerCase(propiedad.charAt(indice+1))+propiedad.substring(indice+2);
				sb.append("property_"+nombreProp+";\n");
			}
		}
		
		//uso indirecto de definici�n de tipos
		sb.append("\n\t//uso indirecto de definici�n de tipos\n");
		sb.append("\t edge[style=dotted,arrowhead=vee,dir=forward,arrowsize=2,label=\"TypeOf\"];\n");
		for(PropiedadJSON propiedad: propiedades) {
			if(propiedad.getTypeOf()!=null) {
				if(propiedad.getTypeOf().contains("#")) {
					sb.append("\t property_"+Character.toLowerCase(propiedad.getNombre().charAt(0))+propiedad.getNombre().substring(1)+" -- ");
					int indice=propiedad.getTypeOf().indexOf('#');
					String typeOf= propiedad.getTypeOf().substring(indice+1);
					sb.append("class_"+typeOf+"\n");
					sb.append(" [" + parametroDot(_edge_indirect_use, "") + parametroDot(_node_indirect_use, "")+ "label=\"TypeOf\"];\n");
				}
			}
		}
		
		
		//asociaciones a trav�s de atributos marcadas de forma directa
		sb.append("\n\t//asociaciones a trav�s de atributos marcadas de forma directa\n");
		for(PropiedadJSON propiedad: propiedades) {
			if(propiedad.getTypeOf().contains("#")) {
				for(String usedBy: propiedad.getUsedBy()) {
					int indiceUsedBy= usedBy.indexOf("#");
					String usedByNombre= usedBy.substring(indiceUsedBy+1);
					sb.append("\t class_"+usedByNombre+" -- ");
					int indiceProp=propiedad.getTypeOf().indexOf("#");
					String typeOfNombre= propiedad.getTypeOf().substring(indiceProp+1);
					sb.append("class_"+typeOfNombre);
					sb.append(" [label=\"."+propiedad.getNombre().toLowerCase() +" ("+propiedad.getMultiplicityMin()+".."+propiedad.getMultiplicityMax()+")\" ,\n");
					sb.append("\t fontcolor=orangered, color=orangered, style=dashed, \n");
					sb.append("\t arrowhead=vee,dir=forward,arrowsize=2];\n");					
				}
			}
		}
		
		
		//Herencias
		sb.append("\n\t//Herencias\n");
		sb.append("\t edge[len=5,color=black,arrowhead=normal,arrowsize=3,dir=back]\n");
		for(ClaseJSON clase: clases) {
			if(clase.getInherits()!=null) {
				int indice= clase.getInherits().indexOf("#");
				String inherit= clase.getInherits().substring(indice+1);
				sb.append("\t class_"+inherit+" -- ");
				sb.append("class_"+clase.getNombre()+"\n");
				sb.append(" [" + parametroDot(_node_inheritance, "") + parametroDot(_edge_inheritance, "")+ "label=\"inherits\"];\n");
			}
		}
		
		//Enlaces de las relaciones
		sb.append("\n\t//Enlaces de las relaciones\n");
		sb.append("\t edge[len=2,penwidth=3,color=blue]\n");
		for(RelacionJSON relacion: relaciones) {
			if(relacion.getFrom()!=null && relacion.getTo()!=null) {
				int indiceFrom= relacion.getFrom().indexOf("#");
				String from= relacion.getFrom().substring(indiceFrom+1);
				sb.append("\t class_"+from+" -- ");
				sb.append("relationship_"+relacion.getNombre());
				sb.append(" [label=\""+relacion.getNombre()+ "\n\t(0..n)\",");
				sb.append("fontcolor=blue,dir=forward,arrowhead=normal];\n");
				
				int indiceTo=relacion.getTo().indexOf("#");
				String to= relacion.getTo().substring(indiceTo+1);
				sb.append("\t relationship_"+relacion.getNombre()+" -- ");
				sb.append("class_"+to);
				sb.append(" [label=\""+relacion.getReversename()+ "\n\t(0..n)\",");
				sb.append("fontcolor=blue,dir=forward,arrowhead=normal];\n");
			}
		}
		
		sb.append("\n\t}\n\n");
		return sb.toString();
	}
	
	public void conseguirHerencias(String nombre, ClaseJSON clase, StringBuffer sb) {
		ClaseJSON padre=null;
		for(ClaseJSON clasePadre: clases) {
			if(clasePadre.getNombre().equals(clase.getInherits().substring(clase.getInherits().indexOf("#")+1))) {
				padre=clasePadre;
			}
		}
		
		if(padre.getInherits()!=null) {
			conseguirHerencias(nombre,padre,sb);
		}
		
		for(String propiedadPadre: padre.getPropiedades()) {
			sb.append("\t class_"+nombre+" -- ");
			int indice=propiedadPadre.indexOf('#');
			String nombreProp= Character.toLowerCase(propiedadPadre.charAt(indice+1))+propiedadPadre.substring(indice+2);
			sb.append("property_"+nombreProp+";\n");
		}
	}
	
	public String parametroDot( ArrayList<String> parametros, String tipo ) {
		StringBuffer sb = new StringBuffer();
        if (parametros.size() > 0) {
            sb.append(tipo);
            if (!tipo.equals(""))
                sb.append("[");
            for (String parametro : parametros) {
                sb.append(parametro + ", ");
            }
            if (!tipo.equals(""))
                sb.append("]\n");
            return sb.toString();
        }
        return "";
	}
}
