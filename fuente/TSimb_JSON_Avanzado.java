package fuente;

import java.util.*;

public class TSimb_JSON_Avanzado {
	
    //Array con los grafos del archivo JSON
	ArrayList<GrafoJSON> grafos=new ArrayList<>();
	
	public void insertaGrafo(GrafoJSON grafo) {
        grafos.add(grafo);
    }
	
	public ArrayList<GrafoJSON> getGrafos(){
		return grafos;
	}
	
	public String toString() {
        StringBuffer sb = new StringBuffer();
        for (GrafoJSON grafo : grafos) {
            sb.append(grafo.toString());
        }
        return sb.toString();
    }
	

    

}
