parser grammar JBashParser;

options { tokenVocab=JBashLexer; }

script : CRLF* list EOF  ;

list : (LBRACE in RBRACE? | LTON in RTON? | unitaryList) (separator list)*  ;

in : ((built_in_commands | expression | control_block) (separator (built_in_commands | expression | control_block))* SEMICOLON? | EOF)  ;

unitaryList : (built_in_commands | expression | control_block | EOF)  ;

control_block : (if_statement | for_statement | while_statement | until_statement | return_stm | function | select_statement | case_statement)  ;

separator : (PIPE | AND | DOUBLEPIPE | DOUBLEAND | SEMICOLON | CRLF+)  ;

expr_concat : (DOUBLEPIPE | DOUBLEAND)  ;

test_param : (ESCL | PARAM)  ;

op_conf : (DOUBLEEQUAL | DIFFERENT | MINOR | MAJOR | MINEQ | MAJEQ)  ;

redirection_op : (MINOR | DOUBLEMIN | MAJOR | DOUBLEMAJ)  ;

operatore_alta_priorita : (PRODUCT | DIVISION | MODULE)  ;

expression : (arithmetic_eval | conditional_expr)  ;

conditional_expr : (STRINGA? (test_param | DIFFERENT | EQUAL) STRINGA | DIRECTORY? test_param DIRECTORY)  ;

arithmetic_eval : DLTON formula sub? DRTON?  ;

sub : expr_concat formula sub?  ;

formula : (alg | ESCL alg) (op_conf (alg | ESCL alg))?  ;

alg : terminale_alta_priorita ((PLUS | MIN) terminale_alta_priorita)?  ;

terminale_alta_priorita : (MIN alg | LTON alg RTON? (operatore_alta_priorita alg)? | NUMERO? (operatore_alta_priorita alg)?)  ;

select_statement : SELECT NOME_VALIDO (IN NOME_VALIDO+)? SEMICOLON? DO? list SEMICOLON? DONE?  ;

case_statement : CASE (BILL NOME_VALIDO | NOME_VALIDO) IN? case_block* ESAC?  ;

case_block : LTON? NOME_VALIDO case_tail? RTON? list DOUBLESEMICOLON?  ;

case_tail : PIPE NOME_VALIDO case_tail?  ;

if_statement : IF list THEN? list elif_substatement? (ELSE list)? FI?  ;

elif_substatement : ELIF list THEN? list elif_substatement?  ;

for_statement : FOR DLTON expression? SEMICOLON? expression? SEMICOLON? expression? DRTON DO? list DONE?  ;

while_statement : WHILE list DO? list DONE?  ;

until_statement : UNTIL list DO? list DONE?  ;

statement_di_assegnamento : NOME_VALIDO EQUAL (NOME_VALIDO | arithmetic_eval | STRINGA | BILL NOME_VALIDO)?  ;

function : FUNCTION? NOME_VALIDO LTON? RTON? list redirection?  ;

redirection : redirection_op DIRECTORY?  ;

return_stm : RETURN (NUMERO | ZERO)?  ;

built_in_commands : (bash_version | alias_stm | break_stm | changedir_stm | command | declare_stm | echo_stm | exec_stm | exit_stm | export_stm | help_stm | kill_stm | suspend_stm | test_expr_stm | times_stm | ulimit_stm | umask_stm | unalias_stm | unset_stm | wait_stm | sptp_stm)  ;

bash_version : BASH_VERSION  ;

alias_stm : ALIAS PARAM? statement_di_assegnamento?  ;

break_stm : BREAK (NUMERO | ZERO)?  ;

changedir_stm : CD PARAM? DIRECTORY?  ;

command : COMMAND PARAM* (built_in_commands | NOME_VALIDO | DIRECTORY)?  ;

declare_stm : DECLARE PARAM* statement_di_assegnamento?  ;

echo_stm : ECHO PARAM* (STRINGA | BILL NOME_VALIDO)?  ;

exec_stm : EXEC PARAM? (PARAM NOME_VALIDO)? (built_in_commands | NOME_VALIDO | DIRECTORY)?  ;

exit_stm : EXIT (NUMERO | ZERO)?  ;

export_stm : EXPORT PARAM* NOME_VALIDO (EQUAL (STRINGA | DIRECTORY))?  ;

help_stm : HELP PARAM? (built_in_commands | NOME_VALIDO)?  ;

kill_stm : KILL (PARAM NUMERO)? (NUMERO | ZERO)?  ;

suspend_stm : SUSPEND PARAM?  ;

test_expr_stm : TEST expression  ;

times_stm : TIMES  ;

ulimit_stm : ULIMIT (PARAM (NUMERO | ZERO)?)?  ;

umask_stm : UMASK PARAM? (NUMERO | ZERO)?  ;

unalias_stm : UNALIAS PARAM? NOME_VALIDO?  ;

unset_stm : UNSET PARAM? NOME_VALIDO?  ;

wait_stm : WAIT (NUMERO | ZERO)?  ;

sptp_stm : SPTP PARAM? NUMERO? STRINGA? STRINGA?  ;
