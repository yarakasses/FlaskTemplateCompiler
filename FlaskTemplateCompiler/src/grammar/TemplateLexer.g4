lexer grammar TemplateLexer;

/* ===== Symbols ===== */
VAR_OPEN    : '{{' ;
VAR_CLOSE   : '}}' ;

/* ===== Keywords ===== */
SHOW        : 'show' ;
ADD         : 'add' ;
DETAILS     : 'details' ;
PRODUCT     : 'product' ;
PRODUCTS    : 'products' ;

/* ===== Literals ===== */
STRING      : '"' (~["\r\n])* '"' ;
NUMBER      : [0-9]+ ('.' [0-9]+)? ;

/* ===== Identifiers ===== */
ID          : [a-zA-Z_][a-zA-Z_0-9]* ;

/* ===== Text ===== */
TEXT : ~[{}]+ ;

/* ===== Whitespace ===== */
WS          : [ \t\r\n]+ -> skip ;
