parser grammar GestrategiacsvParser;

options{
	tokenVocab= GestrategiacsvLexer;
	language= Java;
}

@header{
	package fuente;
}

csv: cabecera linea+;

cabecera: columna (SEPARADOR columna)* INTRO;

linea: campo (SEPARADOR campo)* INTRO;

columna: TEXTO   #columnaSinComillas
    |   CADENA   #columnaConComillas
    |            #columnaVacio
    ;


campo: TEXTO    #textoSinComillas
    |   CADENA   #stringConComillas
    |            #campoVacio
    ;

