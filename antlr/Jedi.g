grammar Jedi;
options {output=AST;}
tokens {PROG; FIELDDEC; PARAMDEC; METHOD;}

@lexer::header {
package br.ufpb.iged.jedi;
}

@header {
package br.ufpb.iged.jedi;
}

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

// Regras da Gramatica
prog	:	klass+ -> ^(PROG klass+)  ;

klass	:	'klass' ID '{' classItem* '}' ; 

classItem
	:	field
	|	method
	;
	
field	:	type ID ';' -> ^(FIELDDEC type ID) ;

type	:	'int' ;

method	:	 type ID '(' (param (',' param)*)? ')'
		 '{' stat* '}' -> ^(METHOD type ID param+ stat*) ;

param	:	 type ID  -> ^(PARAMDEC type ID) ; 


// Comandos
//
// - Expressao
// - Bloco de comandos entre chaves
// - Comando condicional (if-then-else)
// - for e while

stat    : 	expr
	|	'{' stat* '}'
	|	'if' cond stat ('else' stat)?
	|	'while' cond stat
	|	'for' '(' ID '=' expr ('to' | 'downto') expr ')' stat
	;


cond	:	'(' expr ')' ;


// Expressoes
//
// Niveis precedencia:
// - Operacoes logicas (expr)
// - Comparacoes (relExpr)
// - Adicao/sub (addExpr)
// - Multiplicacao/div (multExpr)
// - negacao/parenteses/atribuicoes/fatores unarios (primary)

expr	:	relExpr (('&&' | '||')^ relExpr)* ;

relExpr :	addExpr (('>' | '<' | '=' | '!=' | '>=' | '<=')^ addExpr)* ; 

addExpr	:	multExpr (('+' | '-')^ multExpr)* ;

multExpr:	primary (('*' | '/')^ primary)* ; 

primary	:	INT
	|	ID 
//	|	ID '='^ expr
	|	'(' expr ')'
	|	CHAR
	|	STRING
	|	'true'
	|	'false'
	|	'null'
	;
	
