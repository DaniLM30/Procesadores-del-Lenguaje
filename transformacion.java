import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


import fuente.*;

public class transformacion {

	public static void main(String[] args) throws Exception {

		//Si hay argumentos
		if(args.length>0) {

			//Creamos el árbol de entrada
			ParseTreeWalker walker = new ParseTreeWalker();
			TSimb_Parametros_Avanzado tablaEntrada = new TSimb_Parametros_Avanzado();
			ParametrosListener_TipoAvanzadoTS listenerEntrada = new ParametrosListener_TipoAvanzadoTS(tablaEntrada);
	        
			String sb="";
	        for(String argumento: args) {
	        	sb+=argumento;
	        	sb+=" ";
	        }
	        CharStream input= CharStreams.fromString(sb);
			GparametrosLexer lexer = new GparametrosLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			GparametrosParser parser = new GparametrosParser(tokens);
			parser.setBuildParseTree(true);
			ParseTree treeEntrada= parser.entrada();

	        walker.walk(listenerEntrada, treeEntrada);	
	        
			//Llenamos los arrays de parametros
	        ArrayList<String> _node_relationship = tablaEntrada.getNodeRelationshipParameters();
	        ArrayList<String> _node_class = tablaEntrada.getNodeClassParameters();
	        ArrayList<String> _node_property = tablaEntrada.getNodePropertyParameters();
	        ArrayList<String> _node_inheritance = tablaEntrada.getNodeInheritanceParameters();
	        ArrayList<String> _node_indirect_use = tablaEntrada.getNodeIndirectUseParameters();
	        
            ArrayList<String> _edge_relationship = tablaEntrada.getEdgeRelationshipParameters();           
            ArrayList<String> _edge_class = tablaEntrada.getEdgeClassParameters();           
            ArrayList<String> _edge_property = tablaEntrada.getEdgePropertyParameters();           
            ArrayList<String> _edge_inheritance = tablaEntrada.getEdgeInheritanceParameters();           
            ArrayList<String> _edge_indirect_use = tablaEntrada.getEdgeIndirectUseParameters();
            
            //Si hay CSV
            if(tablaEntrada.getCSVs().size()>0) {
            	
            	//Llenamos la tabla de cada CSV
            	for(String csv: tablaEntrada.getCSVs()) {
            		
            		String inputFileCSV=null;
        			
        			inputFileCSV= csv ; 
        			InputStream isCSV = System.in;
        			
        			if(inputFileCSV!=null) {
        				isCSV = new FileInputStream(inputFileCSV);
        			}
            		
            		
            		ParseTreeWalker walkerCSV = new ParseTreeWalker();
                	TSimb_CSV_Avanzado tablaCSV = new TSimb_CSV_Avanzado();
                	CSVListener_TipoAvanzadoTS listenerCSV = new CSVListener_TipoAvanzadoTS(tablaCSV);
                	
                	CharStream inputCSV= CharStreams.fromStream(isCSV);
                	GestrategiacsvLexer lexerCSV = new GestrategiacsvLexer(inputCSV);
        			CommonTokenStream tokensCSV = new CommonTokenStream(lexerCSV);
        			GestrategiacsvParser parserCSV = new GestrategiacsvParser(tokensCSV);
        			parserCSV.setBuildParseTree(true);
        			
        			ParseTree treeCSV= parserCSV.csv();
        			
        			walkerCSV.walk(listenerCSV, treeCSV);
        			
        			//Llenamos la tabla de cada JSON
        			for(int i=1;i<=tablaCSV.size();i++) {
        				
        				String inputFileJSON=null;
            			
            			inputFileJSON= tablaCSV.getValue(i, "rutafichero");
            			InputStream isJSON = System.in;
            			
            			if(inputFileJSON!=null) {
            				isJSON = new FileInputStream(inputFileJSON);
            			}
            			
            			ParseTreeWalker walkerJSON = new ParseTreeWalker();
                    	TSimb_JSON_Avanzado tablaJSON = new TSimb_JSON_Avanzado();
                    	JSONListener_TipoAvanzadoTS listenerJSON = new JSONListener_TipoAvanzadoTS(tablaJSON);
                    	
                    	CharStream inputJSON= CharStreams.fromStream(isJSON);
                    	GjsonLexer lexerJSON = new GjsonLexer(inputJSON);
            			CommonTokenStream tokensJSON = new CommonTokenStream(lexerJSON);
            			GjsonParser parserJSON = new GjsonParser(tokensJSON);
            			parserJSON.setBuildParseTree(true);
            			
            			ParseTree treeJSON= parserJSON.archivo();
            			
            			walkerJSON.walk(listenerJSON, treeJSON);
            			
            			//Creamos el DOT de cada grafo
            			for(GrafoJSON grafo: tablaJSON.getGrafos()) {
            				String nombreFicheroDot=tablaCSV.getValue(i,"rutaficherosalida").replace(".dot", "_" + grafo.getNombre() + ".dot");
            				String grafoSTR = grafo.toDot(_node_relationship,_node_class,_node_property,_node_inheritance,
							_node_indirect_use,_edge_relationship,_edge_class,_edge_property,_edge_inheritance,_edge_indirect_use);

							BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nombreFicheroDot),StandardCharsets.UTF_8));
            			    writer.write(grafoSTR);
            			     
            			    writer.close();
            			    
            			    //Elegimos el tipo de motor dependiendo del tipo del grafo
            			    String motor=null;
            			    if(grafo.getTipo().equals("\"@graph\"")) {
            			    	motor="neato";
            			    }
            			    else if(grafo.getTipo().equals("\"@tree\"")) {
            			    	motor="dot";
            			    }
            			    
            			  //Generamos el SVG             			    
            			    String nombreFicheroSVG=tablaCSV.getValue(i, "rutaficherografico").replace(".svg", "_"+grafo.getNombre()+".svg");
            			    
                			Process p = Runtime.getRuntime().exec(motor + " -Tsvg " + nombreFicheroDot + " -o " + nombreFicheroSVG);
                	        p.waitFor();
                	        InputStream isSVG = p.getErrorStream();
                	        byte[] buffer = new byte[isSVG.available()];
                	        isSVG.read(buffer, 0, isSVG.available());
                	        for (byte dato : buffer) {
                	        System.out.print((char) dato);
                	        }           			           			
            	        }                				
        			}       			        			               	
            	}            	            	
            }
            //SI NO HAY CSV
            else {
            	//Llenamos la tabla de cada JSON
            	if(tablaEntrada.getJSONs().size()>0) {
            		for(int i=0;i<tablaEntrada.getJSONs().size();i++) {
            			String inputFileJSON=null;
            			
            			inputFileJSON= tablaEntrada.getJSONs().get(i);
            			InputStream isJSON = System.in;
            			
            			if(inputFileJSON!=null) {
            				isJSON = new FileInputStream(inputFileJSON);
            			}
            			
            			ParseTreeWalker walkerJSON = new ParseTreeWalker();
                    	TSimb_JSON_Avanzado tablaJSON = new TSimb_JSON_Avanzado();
                    	JSONListener_TipoAvanzadoTS listenerJSON = new JSONListener_TipoAvanzadoTS(tablaJSON);
                    	
                    	CharStream inputJSON= CharStreams.fromStream(isJSON);
                    	GjsonLexer lexerJSON = new GjsonLexer(inputJSON);
            			CommonTokenStream tokensJSON = new CommonTokenStream(lexerJSON);
            			GjsonParser parserJSON = new GjsonParser(tokensJSON);
            			parserJSON.setBuildParseTree(true);
            			
            			ParseTree treeJSON= parserJSON.archivo();
            			
            			walkerJSON.walk(listenerJSON, treeJSON);
            			
            			//Creamos el DOT de cada grafo
            			for(GrafoJSON grafo: tablaJSON.getGrafos()) {
            				
            				String nombreFicheroDot=tablaEntrada.getJSONs().get(i).replace(".dot", "_" + grafo.getNombre() + ".dot");
            				String grafoSTR = grafo.toDot(_node_relationship,_node_class,_node_property,_node_inheritance,
							_node_indirect_use,_edge_relationship,_edge_class,_edge_property,_edge_inheritance,_edge_indirect_use);
            			    
							BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nombreFicheroDot),StandardCharsets.UTF_8));
            			    writer.write(grafoSTR);
            			     
            			    writer.close();
            			    
            			    //Elegimos el tipo de motor dependiendo del tipo del grafo
            			    String motor=null;
            			    if(grafo.getTipo().equals("\"@graph\"")) {
            			    	motor="neato";
            			    }
            			    else if(grafo.getTipo().equals("\"@tree\"")) {
            			    	motor="dot";
            			    }
            			    
            			  //Generamos el SVG 
            			    
            			    String nombreFicheroSVG=tablaEntrada.getSVGs().get(i).replace(".svg", "_"+grafo.getNombre()+".svg");
            			    
                			Process p = Runtime.getRuntime().exec(motor + " -Tsvg " + nombreFicheroDot + " -o " + nombreFicheroSVG);
                	        p.waitFor();
                	        InputStream isSVG = p.getErrorStream();
                	        byte[] buffer = new byte[isSVG.available()];
                	        isSVG.read(buffer, 0, isSVG.available());
                	        for (byte dato : buffer) {
                	        System.out.print((char) dato);
                	        }           			           			
            	        }            			
            		}
            	}            	
            }		
		}
		else {			
            System.out.print("Sin Argumentos");           	            	
        }
	}
}