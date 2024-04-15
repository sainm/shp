// Generated from D:/github/shp/src/main/resources/org/sainm/shp/antlr/JBashParser.g4 by ANTLR 4.13.1
package org.sainm.shp.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JBashParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JBashParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JBashParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(JBashParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(JBashParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn(JBashParser.InContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#unitaryList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitaryList(JBashParser.UnitaryListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#control_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl_block(JBashParser.Control_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#separator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeparator(JBashParser.SeparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#expr_concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat(JBashParser.Expr_concatContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#test_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest_param(JBashParser.Test_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#op_conf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_conf(JBashParser.Op_confContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#redirection_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedirection_op(JBashParser.Redirection_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#operatore_alta_priorita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatore_alta_priorita(JBashParser.Operatore_alta_prioritaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JBashParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#conditional_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_expr(JBashParser.Conditional_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#arithmetic_eval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_eval(JBashParser.Arithmetic_evalContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(JBashParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormula(JBashParser.FormulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#alg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg(JBashParser.AlgContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#terminale_alta_priorita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminale_alta_priorita(JBashParser.Terminale_alta_prioritaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(JBashParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement(JBashParser.Case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#case_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_block(JBashParser.Case_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#case_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_tail(JBashParser.Case_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(JBashParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#elif_substatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_substatement(JBashParser.Elif_substatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(JBashParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(JBashParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#until_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntil_statement(JBashParser.Until_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#statement_di_assegnamento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_di_assegnamento(JBashParser.Statement_di_assegnamentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(JBashParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#redirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedirection(JBashParser.RedirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#return_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stm(JBashParser.Return_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#built_in_commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuilt_in_commands(JBashParser.Built_in_commandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#bash_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBash_version(JBashParser.Bash_versionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#alias_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_stm(JBashParser.Alias_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#break_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stm(JBashParser.Break_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#changedir_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangedir_stm(JBashParser.Changedir_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(JBashParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#declare_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stm(JBashParser.Declare_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#echo_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEcho_stm(JBashParser.Echo_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#exec_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_stm(JBashParser.Exec_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#exit_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_stm(JBashParser.Exit_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#export_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport_stm(JBashParser.Export_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#help_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelp_stm(JBashParser.Help_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#kill_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKill_stm(JBashParser.Kill_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#suspend_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuspend_stm(JBashParser.Suspend_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#test_expr_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest_expr_stm(JBashParser.Test_expr_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#times_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimes_stm(JBashParser.Times_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#ulimit_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUlimit_stm(JBashParser.Ulimit_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#umask_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUmask_stm(JBashParser.Umask_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#unalias_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnalias_stm(JBashParser.Unalias_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#unset_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnset_stm(JBashParser.Unset_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#wait_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWait_stm(JBashParser.Wait_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBashParser#sptp_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSptp_stm(JBashParser.Sptp_stmContext ctx);
}