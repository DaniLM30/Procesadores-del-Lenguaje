lexer grammar GjsonLexer;

// import GjsonFragments;

@header {
	package fuente;
}

TIPO_GRAFO:('"@graph"'|'"@tree"');

IDENTIFICADOR: '"@id"' WS? DOSPUNTOS;
NAME: '"name"' WS? DOSPUNTOS;
GENDER: '"gender"'WS? DOSPUNTOS;
NUMBER: '"number"' WS? DOSPUNTOS;
WORDTYPE: '"wordType"' WS? DOSPUNTOS;
TYPEOF: '"typeOf"' WS? DOSPUNTOS;
ISLIST: '"isList"' WS? DOSPUNTOS;
OPTIONAL: '"optional"' DOSPUNTOS;
MULTIPLICITYMAX: '"multiplicityMax"' WS? DOSPUNTOS;
MULTIPLICITYMIN: '"multiplicityMin"' WS? DOSPUNTOS;
REVERSENAME: '"reverseName"' WS? DOSPUNTOS;
FROM: '"from"' WS? DOSPUNTOS;
TO: '"to"' WS? DOSPUNTOS;
INHERITS: '"inherits"' WS? DOSPUNTOS;
PROPERTIES:'"properties"' DOSPUNTOS WS? ABRE_CORCHETE;
USEDBY: '"usedby"' WS? DOSPUNTOS;
LANGUAGEDATA: '"languageData"' WS? DOSPUNTOS;
LABEL: '"label"' WS? DOSPUNTOS;
REVERSELABEL: '"labelReverseName"' WS? DOSPUNTOS;

IDIOMA:('"es"'|'"eng"'|'"en"') WS? DOSPUNTOS;

CONTEXT: '"@context"' -> pushMode(CONTEXT_MODE);

ABRE_LLAVE:'{';
CIERRA_LLAVE:'}';
ABRE_CORCHETE:'[';
CIERRA_CORCHETE:']';
COMA:',';
DOSPUNTOS:':';
BOOLEAN:('true'|'false');
CADENA:'"' ('""'|~'"')* '"' {setText(getText().substring(1, getText().length()-1).replaceAll("\\\\(-)", "$1"));};
WS: ' '+->skip;
INTRO:[\r\n]+->skip;

mode CONTEXT_MODE;
CIERRA_CONTEXTO: '"graphs"' WS? ':' -> popMode;
INFO_CONTEXT: .+? -> skip;

