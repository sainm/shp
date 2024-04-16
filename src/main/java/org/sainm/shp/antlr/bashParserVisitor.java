// Generated from D:/github/shp/src/main/resources/org/sainm/shp/antlr/bashParser.g4 by ANTLR 4.13.1
package org.sainm.shp.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link bashParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface bashParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link bashParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(bashParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#simpleOrComplexCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleOrComplexCommand(bashParser.SimpleOrComplexCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#simpleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCommand(bashParser.SimpleCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#pipeline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipeline(bashParser.PipelineContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#sublist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSublist(bashParser.SublistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PipeStdoutToStdin}
	 * labeled alternative in {@link bashParser#pipe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipeStdoutToStdin(bashParser.PipeStdoutToStdinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PipeStdoutAndStderrToStdin}
	 * labeled alternative in {@link bashParser#pipe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipeStdoutAndStderrToStdin(bashParser.PipeStdoutAndStderrToStdinContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#sublistJoiner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSublistJoiner(bashParser.SublistJoinerContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(bashParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#listWithOptionalTerminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListWithOptionalTerminator(bashParser.ListWithOptionalTerminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#listTerminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListTerminator(bashParser.ListTerminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#listTerminatorWait}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListTerminatorWait(bashParser.ListTerminatorWaitContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#listTerminatorBackground}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListTerminatorBackground(bashParser.ListTerminatorBackgroundContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#complexCommands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexCommands(bashParser.ComplexCommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#ifThenFi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenFi(bashParser.IfThenFiContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#ifElifElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElifElse(bashParser.IfElifElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#ifSingular}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfSingular(bashParser.IfSingularContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#forInDoDone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInDoDone(bashParser.ForInDoDoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#forLiteralsDoDone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLiteralsDoDone(bashParser.ForLiteralsDoDoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#whileDoDone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileDoDone(bashParser.WhileDoDoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#untilDoDone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntilDoDone(bashParser.UntilDoDoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#repeatDoDone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatDoDone(bashParser.RepeatDoDoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#caseInEsac}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseInEsac(bashParser.CaseInEsacContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#selectDoDone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectDoDone(bashParser.SelectDoDoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#casePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasePattern(bashParser.CasePatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#caseTerminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseTerminator(bashParser.CaseTerminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#forkProcess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForkProcess(bashParser.ForkProcessContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#codeblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeblock(bashParser.CodeblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#tryAlways}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryAlways(bashParser.TryAlwaysContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(bashParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#simpleFunctionListDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleFunctionListDeclaration(bashParser.SimpleFunctionListDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#simpleFunctionSingleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleFunctionSingleDeclaration(bashParser.SimpleFunctionSingleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(bashParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(bashParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionLiteral}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionLiteral(bashParser.ExpressionLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionStringEquals}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStringEquals(bashParser.ExpressionStringEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionStringGreaterThan}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStringGreaterThan(bashParser.ExpressionStringGreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAnd}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAnd(bashParser.ExpressionAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionShortFlagLiteral}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionShortFlagLiteral(bashParser.ExpressionShortFlagLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionIsTrue}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionIsTrue(bashParser.ExpressionIsTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionStringLessThan}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStringLessThan(bashParser.ExpressionStringLessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionShortFlagLiterals}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionShortFlagLiterals(bashParser.ExpressionShortFlagLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionStringNotEquals}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStringNotEquals(bashParser.ExpressionStringNotEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionIsFalse}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionIsFalse(bashParser.ExpressionIsFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionOr}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOr(bashParser.ExpressionOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionStringNotEqualsRegexp}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStringNotEqualsRegexp(bashParser.ExpressionStringNotEqualsRegexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#commandModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandModifier(bashParser.CommandModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(bashParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(bashParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#commandSubstitutionLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandSubstitutionLiteral(bashParser.CommandSubstitutionLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#arithmeticLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticLiteral(bashParser.ArithmeticLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(bashParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(bashParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#shortFlagGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortFlagGroup(bashParser.ShortFlagGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#longFlagGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongFlagGroup(bashParser.LongFlagGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#shortFlagGroupWithOptionalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortFlagGroupWithOptionalValue(bashParser.ShortFlagGroupWithOptionalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#longFlagGroupWithOptionalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongFlagGroupWithOptionalValue(bashParser.LongFlagGroupWithOptionalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#quotedString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedString(bashParser.QuotedStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#variableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReference(bashParser.VariableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(bashParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticNumericalLiteral}
	 * labeled alternative in {@link bashParser#arithmeticStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticNumericalLiteral(bashParser.ArithmeticNumericalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticVariableReference}
	 * labeled alternative in {@link bashParser#arithmeticStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticVariableReference(bashParser.ArithmeticVariableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticAssignment}
	 * labeled alternative in {@link bashParser#arithmeticStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticAssignment(bashParser.ArithmeticAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryArithmeticExpression}
	 * labeled alternative in {@link bashParser#arithmeticStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryArithmeticExpression(bashParser.TernaryArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GroupedArithmeticOperation}
	 * labeled alternative in {@link bashParser#arithmeticStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupedArithmeticOperation(bashParser.GroupedArithmeticOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticOperation}
	 * labeled alternative in {@link bashParser#arithmeticStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperation(bashParser.ArithmeticOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#arithmeticModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticModifier(bashParser.ArithmeticModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#arithmeticAssignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticAssignmentOperator(bashParser.ArithmeticAssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperator(bashParser.ArithmeticOperatorContext ctx);
}