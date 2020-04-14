parser grammar GjsonParser;

options {
	tokenVocab = GjsonLexer;
	language= Java;
}

@header {
	package fuente;
}

archivo: ABRE_LLAVE context lista CIERRA_LLAVE;

context: CONTEXT CIERRA_CONTEXTO;


grafo: ABRE_LLAVE nombre_grafo cuerpo_grafo CIERRA_LLAVE;

cuerpo_grafo: ABRE_LLAVE tipo_grafo lista CIERRA_LLAVE;

objeto: ABRE_LLAVE identificador (COMA atributo)* CIERRA_LLAVE;

lista: ABRE_CORCHETE (grafo (COMA grafo)*
	|objeto (COMA objeto)*
	|cadenaUsedBy (COMA cadenaUsedBy)*
	|CADENA (COMA CADENA)*) CIERRA_CORCHETE;

identificador:IDENTIFICADOR CADENA;
atributo:
	| name
	| reversename
	| label
	| reverselabel
	| gender
	| number
	| wordtype
	| typeof
	| islist
	| multiplicitymax
	| multiplicitymin
	| usedby
	| languagedata
	| from
	| to
	| inherits
	| properties
	| optional;

name: NAME CADENA ;
reversename: REVERSENAME CADENA;
label: LABEL ABRE_LLAVE idioma (COMA idioma)* CIERRA_LLAVE;
reverselabel: REVERSELABEL ABRE_LLAVE revidioma (COMA revidioma)* CIERRA_LLAVE;
gender: GENDER CADENA;
number: NUMBER CADENA;
wordtype: WORDTYPE CADENA;
typeof: TYPEOF CADENA;
islist: ISLIST BOOLEAN;
multiplicitymax: MULTIPLICITYMAX CADENA;
multiplicitymin: MULTIPLICITYMIN CADENA;
usedby: USEDBY lista;
languagedata: LANGUAGEDATA CADENA;
from: FROM CADENA;
to: TO CADENA;
inherits: INHERITS CADENA;
properties: PROPERTIES cadenaProperty (COMA cadenaProperty)*  CIERRA_CORCHETE;
optional: OPTIONAL BOOLEAN;

revidioma:IDIOMA CADENA;
idioma: IDIOMA CADENA;
cadenaProperty: CADENA;
cadenaUsedBy: CADENA;

tipo_grafo: TIPO_GRAFO DOSPUNTOS;
nombre_grafo: CADENA DOSPUNTOS;



