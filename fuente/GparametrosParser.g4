parser grammar GparametrosParser;

options {
	tokenVocab = GparametrosLexer;
	language= Java;
}

@header {
	package fuente;
}
entrada: (tipo_archivo|parametro)+;

tipo_archivo: (json|svg|dot|csv);

textocsv: (TEXTO|CADENA)+;
textojson: (TEXTO|CADENA)+;
textosvg: (TEXTO|CADENA)+;
textodot: (TEXTO|CADENA)+;
textoparam: (TEXTO|CADENA)+;
numeroparam:NUMERO;


csv: CSV WS? textocsv WS?;
json: JSON WS? textojson WS?;
svg: SVG WS? textosvg WS?;
dot: DOT WS? textodot WS?;

parametro: (len|fontcolor|fontname|fontsize|arrowsize|arrowcolor|penwidth|fillcolor|style|shape);

len: len_name WS? numeroparam WS?;
fontcolor: fontcolor_name  WS? textoparam WS?;
fontname: fontname_name WS? textoparam WS?;
fontsize: fontsize_name WS? numeroparam WS?;
arrowsize: arrowsize_name WS? numeroparam WS?;
arrowcolor: arrowcolor_name WS? textoparam WS?;
penwidth: penwidth_name WS? numeroparam WS?;
fillcolor: fillcolor_name WS? textoparam WS?;
style: style_name WS? textoparam WS?;
shape: shape_name WS? textoparam WS?;

len_name: p_len (p_relationship|p_class|p_property|p_inheritance|p_inderect_use);
fontcolor_name: p_fontcolor (p_edge|p_node) (p_relationship|p_class|p_property|p_inheritance|p_inderect_use);
fontname_name: p_fontname  (p_edge|p_node)  (p_relationship|p_class|p_property|p_inheritance|p_inderect_use);
fontsize_name: p_fontsize (p_edge|p_node) (p_relationship|p_class|p_property|p_inheritance|p_inderect_use);
arrowsize_name:  p_arrowsize (p_edge|p_node) (p_relationship|p_class|p_property|p_inheritance|p_inderect_use);
arrowcolor_name: p_arrowcolor (p_edge|p_node) (p_relationship|p_class|p_property|p_inheritance|p_inderect_use);
penwidth_name: p_penwidth (p_edge|p_node) (p_relationship|p_class|p_property|p_inheritance|p_inderect_use);
fillcolor_name: p_fillcolor (p_edge|p_node) (p_relationship|p_class|p_property|p_inheritance|p_inderect_use);
style_name: p_style (p_edge|p_node) (p_relationship|p_class|p_property|p_inheritance|p_inderect_use);
shape_name: p_shape (p_edge|p_node) (p_relationship|p_class|p_property|p_inheritance|p_inderect_use);


p_edge:  EDGE;
p_node:  NODE;
p_relationship:  RELATIONSHIP;
p_class:  CLASS;
p_property:  PROPERTY;
p_inheritance:  INHERITANCE;
p_inderect_use:  INDERECT_USE;

p_len:  LEN;
p_fontcolor:  FONTCOLOR;
p_fontname:  FONTNAME;
p_fontsize:  FONTSIZE;
p_arrowsize:  ARROWSIZE;
p_arrowcolor:  ARROWCOLOR;
p_penwidth:  PENWIDTH;
p_fillcolor:  FILLCOLOR;
p_style:  STYLE;
p_shape:  SHAPE;

