lexer grammar GparametrosLexer;

// import GparametrosFragments;

@header {
	package fuente;
}

WS: ' '+;

JSON: '-JSON=';
DOT: '-DOT=';
SVG: '-SVG=';
CSV: '-CSV=';
LEN: '-len';
FONTCOLOR: '-fontcolor';
FONTNAME: '-fontname';
FONTSIZE: '-fontsize';
ARROWSIZE: '-arrowsize';
ARROWCOLOR: '-arrowcolor';
PENWIDTH: '-penwidth';
FILLCOLOR: '-fillcolor';
STYLE: '-style';
SHAPE: '-shape';

EDGE: '_edge';
NODE: '_node';

RELATIONSHIP: '_relationship=';
CLASS: '_class=';
PROPERTY: '_property=';
INHERITANCE: '_inheritance=';
INDERECT_USE: '_indirect_use=';

NUMERO:[0-9]+;
TEXTO: .+?;
CADENA: '"'.+?'"' {setText(getText().substring(1, getText().length()-1).replaceAll("\\\\(-)", "$1"));};
