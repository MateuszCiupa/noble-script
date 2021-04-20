grammar NobleScript;

program: statement* EOF;

statement: definition | compound_statement;

definition: variable_definition SEMICOL
| structure_definition
| function_definition;

structure_definition: 'struct{}';
function_definition: 'function def(){}';
variable_definition: type ID ASSIGN_OP expression;

expression: value | expression arithmetic_operator expression;
value: literal | function_call | ID;
function_call: 'function call()';

literal: primitive_literal | array_literal;
primitive_literal: BOOLEAN_LITERAL | INT_LITERAL | DOUBLE_LITERAL | STRING_LITERAL;
array_literal: primitive_type ARRAY_SIZE_LITERAL;

type: primitive_type | array_type;
array_type: primitive_type '[]';

primitive_type: BOOLEAN_TYPE | INT_TYPE | DOUBLE_TYPE | STRING_TYPE;

logic_operator: LESSER_THAN_OP | GREATER_THAN_OP | EQUAL_OP | NOT_EQUAL_OP;
arithmetic_operator: PLUS_OP | MINUS_OP | POW_OP | DIV_OP | MUL_OP;

compound_statement: if_statement | loop_statement;
loop_statement: 'for()';
if_statement: '(' 'abc' ')';

INT_LITERAL: '-'?[1-9]+[0-9]*;
DOUBLE_LITERAL: '-'?[1-9]+[0-9]*.[0-9]+;
BOOLEAN_LITERAL: 'true' | 'false';
STRING_LITERAL: '"'.*'"';
ARRAY_SIZE_LITERAL: '['[1-9]+[0-9]*']';
BOOLEAN_TYPE: 'boolean';
INT_TYPE: 'int';
DOUBLE_TYPE: 'double';
STRING_TYPE: 'string';

ID: [a-zA-Z][a-zA-Z0-9_-]*;

SEMICOL: ';';
ASSIGN_OP: '=';
LESSER_THAN_OP: '<';
GREATER_THAN_OP: '>';
EQUAL_OP: '==';
NOT_EQUAL_OP: '!=';
PLUS_OP: '+';
MINUS_OP: '-';
POW_OP: '^';
DIV_OP: '/';
MUL_OP: '*';

WHITESPACE: [ \t] -> skip;
NEWLINE: [\r\n] -> skip;
