// Generated from D:/github/shp/src/main/resources/org/sainm/shp/antlr/JBashParser.g4 by ANTLR 4.13.1
package org.sainm.shp.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JBashParser}.
 */
public interface JBashParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JBashParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(JBashParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(JBashParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(JBashParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(JBashParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#in}.
	 * @param ctx the parse tree
	 */
	void enterIn(JBashParser.InContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#in}.
	 * @param ctx the parse tree
	 */
	void exitIn(JBashParser.InContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#unitaryList}.
	 * @param ctx the parse tree
	 */
	void enterUnitaryList(JBashParser.UnitaryListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#unitaryList}.
	 * @param ctx the parse tree
	 */
	void exitUnitaryList(JBashParser.UnitaryListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#control_block}.
	 * @param ctx the parse tree
	 */
	void enterControl_block(JBashParser.Control_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#control_block}.
	 * @param ctx the parse tree
	 */
	void exitControl_block(JBashParser.Control_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#separator}.
	 * @param ctx the parse tree
	 */
	void enterSeparator(JBashParser.SeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#separator}.
	 * @param ctx the parse tree
	 */
	void exitSeparator(JBashParser.SeparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#expr_concat}.
	 * @param ctx the parse tree
	 */
	void enterExpr_concat(JBashParser.Expr_concatContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#expr_concat}.
	 * @param ctx the parse tree
	 */
	void exitExpr_concat(JBashParser.Expr_concatContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#test_param}.
	 * @param ctx the parse tree
	 */
	void enterTest_param(JBashParser.Test_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#test_param}.
	 * @param ctx the parse tree
	 */
	void exitTest_param(JBashParser.Test_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#op_conf}.
	 * @param ctx the parse tree
	 */
	void enterOp_conf(JBashParser.Op_confContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#op_conf}.
	 * @param ctx the parse tree
	 */
	void exitOp_conf(JBashParser.Op_confContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#redirection_op}.
	 * @param ctx the parse tree
	 */
	void enterRedirection_op(JBashParser.Redirection_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#redirection_op}.
	 * @param ctx the parse tree
	 */
	void exitRedirection_op(JBashParser.Redirection_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#operatore_alta_priorita}.
	 * @param ctx the parse tree
	 */
	void enterOperatore_alta_priorita(JBashParser.Operatore_alta_prioritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#operatore_alta_priorita}.
	 * @param ctx the parse tree
	 */
	void exitOperatore_alta_priorita(JBashParser.Operatore_alta_prioritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JBashParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JBashParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#conditional_expr}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expr(JBashParser.Conditional_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#conditional_expr}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expr(JBashParser.Conditional_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#arithmetic_eval}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_eval(JBashParser.Arithmetic_evalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#arithmetic_eval}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_eval(JBashParser.Arithmetic_evalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(JBashParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(JBashParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(JBashParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(JBashParser.FormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#alg}.
	 * @param ctx the parse tree
	 */
	void enterAlg(JBashParser.AlgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#alg}.
	 * @param ctx the parse tree
	 */
	void exitAlg(JBashParser.AlgContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#terminale_alta_priorita}.
	 * @param ctx the parse tree
	 */
	void enterTerminale_alta_priorita(JBashParser.Terminale_alta_prioritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#terminale_alta_priorita}.
	 * @param ctx the parse tree
	 */
	void exitTerminale_alta_priorita(JBashParser.Terminale_alta_prioritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(JBashParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(JBashParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(JBashParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(JBashParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#case_block}.
	 * @param ctx the parse tree
	 */
	void enterCase_block(JBashParser.Case_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#case_block}.
	 * @param ctx the parse tree
	 */
	void exitCase_block(JBashParser.Case_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#case_tail}.
	 * @param ctx the parse tree
	 */
	void enterCase_tail(JBashParser.Case_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#case_tail}.
	 * @param ctx the parse tree
	 */
	void exitCase_tail(JBashParser.Case_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(JBashParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(JBashParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#elif_substatement}.
	 * @param ctx the parse tree
	 */
	void enterElif_substatement(JBashParser.Elif_substatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#elif_substatement}.
	 * @param ctx the parse tree
	 */
	void exitElif_substatement(JBashParser.Elif_substatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(JBashParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(JBashParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(JBashParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(JBashParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#until_statement}.
	 * @param ctx the parse tree
	 */
	void enterUntil_statement(JBashParser.Until_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#until_statement}.
	 * @param ctx the parse tree
	 */
	void exitUntil_statement(JBashParser.Until_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#statement_di_assegnamento}.
	 * @param ctx the parse tree
	 */
	void enterStatement_di_assegnamento(JBashParser.Statement_di_assegnamentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#statement_di_assegnamento}.
	 * @param ctx the parse tree
	 */
	void exitStatement_di_assegnamento(JBashParser.Statement_di_assegnamentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(JBashParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(JBashParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#redirection}.
	 * @param ctx the parse tree
	 */
	void enterRedirection(JBashParser.RedirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#redirection}.
	 * @param ctx the parse tree
	 */
	void exitRedirection(JBashParser.RedirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#return_stm}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stm(JBashParser.Return_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#return_stm}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stm(JBashParser.Return_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#built_in_commands}.
	 * @param ctx the parse tree
	 */
	void enterBuilt_in_commands(JBashParser.Built_in_commandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#built_in_commands}.
	 * @param ctx the parse tree
	 */
	void exitBuilt_in_commands(JBashParser.Built_in_commandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#bash_version}.
	 * @param ctx the parse tree
	 */
	void enterBash_version(JBashParser.Bash_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#bash_version}.
	 * @param ctx the parse tree
	 */
	void exitBash_version(JBashParser.Bash_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#alias_stm}.
	 * @param ctx the parse tree
	 */
	void enterAlias_stm(JBashParser.Alias_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#alias_stm}.
	 * @param ctx the parse tree
	 */
	void exitAlias_stm(JBashParser.Alias_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#break_stm}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stm(JBashParser.Break_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#break_stm}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stm(JBashParser.Break_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#changedir_stm}.
	 * @param ctx the parse tree
	 */
	void enterChangedir_stm(JBashParser.Changedir_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#changedir_stm}.
	 * @param ctx the parse tree
	 */
	void exitChangedir_stm(JBashParser.Changedir_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(JBashParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(JBashParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#declare_stm}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_stm(JBashParser.Declare_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#declare_stm}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_stm(JBashParser.Declare_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#echo_stm}.
	 * @param ctx the parse tree
	 */
	void enterEcho_stm(JBashParser.Echo_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#echo_stm}.
	 * @param ctx the parse tree
	 */
	void exitEcho_stm(JBashParser.Echo_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#exec_stm}.
	 * @param ctx the parse tree
	 */
	void enterExec_stm(JBashParser.Exec_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#exec_stm}.
	 * @param ctx the parse tree
	 */
	void exitExec_stm(JBashParser.Exec_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#exit_stm}.
	 * @param ctx the parse tree
	 */
	void enterExit_stm(JBashParser.Exit_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#exit_stm}.
	 * @param ctx the parse tree
	 */
	void exitExit_stm(JBashParser.Exit_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#export_stm}.
	 * @param ctx the parse tree
	 */
	void enterExport_stm(JBashParser.Export_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#export_stm}.
	 * @param ctx the parse tree
	 */
	void exitExport_stm(JBashParser.Export_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#help_stm}.
	 * @param ctx the parse tree
	 */
	void enterHelp_stm(JBashParser.Help_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#help_stm}.
	 * @param ctx the parse tree
	 */
	void exitHelp_stm(JBashParser.Help_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#kill_stm}.
	 * @param ctx the parse tree
	 */
	void enterKill_stm(JBashParser.Kill_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#kill_stm}.
	 * @param ctx the parse tree
	 */
	void exitKill_stm(JBashParser.Kill_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#suspend_stm}.
	 * @param ctx the parse tree
	 */
	void enterSuspend_stm(JBashParser.Suspend_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#suspend_stm}.
	 * @param ctx the parse tree
	 */
	void exitSuspend_stm(JBashParser.Suspend_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#test_expr_stm}.
	 * @param ctx the parse tree
	 */
	void enterTest_expr_stm(JBashParser.Test_expr_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#test_expr_stm}.
	 * @param ctx the parse tree
	 */
	void exitTest_expr_stm(JBashParser.Test_expr_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#times_stm}.
	 * @param ctx the parse tree
	 */
	void enterTimes_stm(JBashParser.Times_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#times_stm}.
	 * @param ctx the parse tree
	 */
	void exitTimes_stm(JBashParser.Times_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#ulimit_stm}.
	 * @param ctx the parse tree
	 */
	void enterUlimit_stm(JBashParser.Ulimit_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#ulimit_stm}.
	 * @param ctx the parse tree
	 */
	void exitUlimit_stm(JBashParser.Ulimit_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#umask_stm}.
	 * @param ctx the parse tree
	 */
	void enterUmask_stm(JBashParser.Umask_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#umask_stm}.
	 * @param ctx the parse tree
	 */
	void exitUmask_stm(JBashParser.Umask_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#unalias_stm}.
	 * @param ctx the parse tree
	 */
	void enterUnalias_stm(JBashParser.Unalias_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#unalias_stm}.
	 * @param ctx the parse tree
	 */
	void exitUnalias_stm(JBashParser.Unalias_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#unset_stm}.
	 * @param ctx the parse tree
	 */
	void enterUnset_stm(JBashParser.Unset_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#unset_stm}.
	 * @param ctx the parse tree
	 */
	void exitUnset_stm(JBashParser.Unset_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#wait_stm}.
	 * @param ctx the parse tree
	 */
	void enterWait_stm(JBashParser.Wait_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#wait_stm}.
	 * @param ctx the parse tree
	 */
	void exitWait_stm(JBashParser.Wait_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link JBashParser#sptp_stm}.
	 * @param ctx the parse tree
	 */
	void enterSptp_stm(JBashParser.Sptp_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link JBashParser#sptp_stm}.
	 * @param ctx the parse tree
	 */
	void exitSptp_stm(JBashParser.Sptp_stmContext ctx);
}