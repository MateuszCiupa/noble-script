grammar myLang;

program: statement* EOF;

statement: expression;

expression: assign_operation;

assign_operation: NAME '=' INT;

NAME: '"'.*'"';

INT: '-'?[1-9]+[0-9]*;

WHITESPACE: [ \t] -> skip;
NEWLINE: [\r\n] -> skip;