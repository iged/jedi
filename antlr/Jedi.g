grammar Jedi;

// tokens
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

// regras

// Expressoes
//
// Niveis precedencia:
// - Operacoes logicas
// - Comparacoes
// - Adicao/sub
// - Multiplicacao/div
// - negacao
expr	:	relExpr (('&&' | '||') relExpr)* ;

relExpr :	addExpr (('>' | '<' | '=' | '!=' | '>=' | '<=') addExpr)* ; 

addExpr	:	multExpr (('+' | '-') multExpr)* ;

multExpr:	primary (('*' | '/') primary)* ; 

primary	:	INT
	|	ID
	|	CHAR
	|	STRING
	|	'true'
	|	'false'
	;
	