grammar Jedi;
options {output=AST;}
tokens {PROG; CLASS;}

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
prog	:	class+ -> ^(PROG<Program> class+)  ;

class	:	'class' ID '{' classItem* '}' -> ^(CLASS<Class>[$ID] classItem*);

classItem
	:	field
	|	method
	;
	
field	:	type ID ';' ;  

type	:	'int' ;

method	:	 type ID '(' (param (',' param)*)? ')'
		 '{' stat* '}' ;

param	:	 type ID ;

cond	:	'(' expr ')' ;

stat    : 	expr
	|	'{' stat* '}'
	|	'if' cond stat ('else' stat)?
	|	'while' cond stat
	|	'for' '(' ID '=' expr ('to' | 'downto') expr ')' stat
	;
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

primary	:	INT -> INT<IntLiteral>
	|	ID -> ID<Var>
	|	ID '=' expr
	|	'(' expr ')'
	|	CHAR -> CHAR<CharLiteral>
	|	STRING -> STRING<StringLiteral>
	|	'true' -> 'true'<BooleanLiteral>
	|	'false' -> 'false'<BooleanLiteral>
	|	'null'
	;
	