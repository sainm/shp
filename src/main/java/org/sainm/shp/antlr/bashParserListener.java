// Generated from D:/github/shp/src/main/resources/org/sainm/shp/antlr/bashParser.g4 by ANTLR 4.13.1
package org.sainm.shp.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link bashParser}.
 */
public interface bashParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link bashParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(bashParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(bashParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#simpleOrComplexCommand}.
	 * @param ctx the parse tree
	 */
	void enterSimpleOrComplexCommand(bashParser.SimpleOrComplexCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#simpleOrComplexCommand}.
	 * @param ctx the parse tree
	 */
	void exitSimpleOrComplexCommand(bashParser.SimpleOrComplexCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#simpleCommand}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCommand(bashParser.SimpleCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#simpleCommand}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCommand(bashParser.SimpleCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#pipeline}.
	 * @param ctx the parse tree
	 */
	void enterPipeline(bashParser.PipelineContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#pipeline}.
	 * @param ctx the parse tree
	 */
	void exitPipeline(bashParser.PipelineContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#sublist}.
	 * @param ctx the parse tree
	 */
	void enterSublist(bashParser.SublistContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#sublist}.
	 * @param ctx the parse tree
	 */
	void exitSublist(bashParser.SublistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PipeStdoutToStdin}
	 * labeled alternative in {@link bashParser#pipe}.
	 * @param ctx the parse tree
	 */
	void enterPipeStdoutToStdin(bashParser.PipeStdoutToStdinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PipeStdoutToStdin}
	 * labeled alternative in {@link bashParser#pipe}.
	 * @param ctx the parse tree
	 */
	void exitPipeStdoutToStdin(bashParser.PipeStdoutToStdinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PipeStdoutAndStderrToStdin}
	 * labeled alternative in {@link bashParser#pipe}.
	 * @param ctx the parse tree
	 */
	void enterPipeStdoutAndStderrToStdin(bashParser.PipeStdoutAndStderrToStdinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PipeStdoutAndStderrToStdin}
	 * labeled alternative in {@link bashParser#pipe}.
	 * @param ctx the parse tree
	 */
	void exitPipeStdoutAndStderrToStdin(bashParser.PipeStdoutAndStderrToStdinContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#sublistJoiner}.
	 * @param ctx the parse tree
	 */
	void enterSublistJoiner(bashParser.SublistJoinerContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#sublistJoiner}.
	 * @param ctx the parse tree
	 */
	void exitSublistJoiner(bashParser.SublistJoinerContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(bashParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(bashParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#listWithOptionalTerminator}.
	 * @param ctx the parse tree
	 */
	void enterListWithOptionalTerminator(bashParser.ListWithOptionalTerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#listWithOptionalTerminator}.
	 * @param ctx the parse tree
	 */
	void exitListWithOptionalTerminator(bashParser.ListWithOptionalTerminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#listTerminator}.
	 * @param ctx the parse tree
	 */
	void enterListTerminator(bashParser.ListTerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#listTerminator}.
	 * @param ctx the parse tree
	 */
	void exitListTerminator(bashParser.ListTerminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#listTerminatorWait}.
	 * @param ctx the parse tree
	 */
	void enterListTerminatorWait(bashParser.ListTerminatorWaitContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#listTerminatorWait}.
	 * @param ctx the parse tree
	 */
	void exitListTerminatorWait(bashParser.ListTerminatorWaitContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#listTerminatorBackground}.
	 * @param ctx the parse tree
	 */
	void enterListTerminatorBackground(bashParser.ListTerminatorBackgroundContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#listTerminatorBackground}.
	 * @param ctx the parse tree
	 */
	void exitListTerminatorBackground(bashParser.ListTerminatorBackgroundContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#complexCommands}.
	 * @param ctx the parse tree
	 */
	void enterComplexCommands(bashParser.ComplexCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#complexCommands}.
	 * @param ctx the parse tree
	 */
	void exitComplexCommands(bashParser.ComplexCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#ifThenFi}.
	 * @param ctx the parse tree
	 */
	void enterIfThenFi(bashParser.IfThenFiContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#ifThenFi}.
	 * @param ctx the parse tree
	 */
	void exitIfThenFi(bashParser.IfThenFiContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#ifElifElse}.
	 * @param ctx the parse tree
	 */
	void enterIfElifElse(bashParser.IfElifElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#ifElifElse}.
	 * @param ctx the parse tree
	 */
	void exitIfElifElse(bashParser.IfElifElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#ifSingular}.
	 * @param ctx the parse tree
	 */
	void enterIfSingular(bashParser.IfSingularContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#ifSingular}.
	 * @param ctx the parse tree
	 */
	void exitIfSingular(bashParser.IfSingularContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#forInDoDone}.
	 * @param ctx the parse tree
	 */
	void enterForInDoDone(bashParser.ForInDoDoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#forInDoDone}.
	 * @param ctx the parse tree
	 */
	void exitForInDoDone(bashParser.ForInDoDoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#forLiteralsDoDone}.
	 * @param ctx the parse tree
	 */
	void enterForLiteralsDoDone(bashParser.ForLiteralsDoDoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#forLiteralsDoDone}.
	 * @param ctx the parse tree
	 */
	void exitForLiteralsDoDone(bashParser.ForLiteralsDoDoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#whileDoDone}.
	 * @param ctx the parse tree
	 */
	void enterWhileDoDone(bashParser.WhileDoDoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#whileDoDone}.
	 * @param ctx the parse tree
	 */
	void exitWhileDoDone(bashParser.WhileDoDoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#untilDoDone}.
	 * @param ctx the parse tree
	 */
	void enterUntilDoDone(bashParser.UntilDoDoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#untilDoDone}.
	 * @param ctx the parse tree
	 */
	void exitUntilDoDone(bashParser.UntilDoDoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#repeatDoDone}.
	 * @param ctx the parse tree
	 */
	void enterRepeatDoDone(bashParser.RepeatDoDoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#repeatDoDone}.
	 * @param ctx the parse tree
	 */
	void exitRepeatDoDone(bashParser.RepeatDoDoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#caseInEsac}.
	 * @param ctx the parse tree
	 */
	void enterCaseInEsac(bashParser.CaseInEsacContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#caseInEsac}.
	 * @param ctx the parse tree
	 */
	void exitCaseInEsac(bashParser.CaseInEsacContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#selectDoDone}.
	 * @param ctx the parse tree
	 */
	void enterSelectDoDone(bashParser.SelectDoDoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#selectDoDone}.
	 * @param ctx the parse tree
	 */
	void exitSelectDoDone(bashParser.SelectDoDoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#casePattern}.
	 * @param ctx the parse tree
	 */
	void enterCasePattern(bashParser.CasePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#casePattern}.
	 * @param ctx the parse tree
	 */
	void exitCasePattern(bashParser.CasePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#caseTerminator}.
	 * @param ctx the parse tree
	 */
	void enterCaseTerminator(bashParser.CaseTerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#caseTerminator}.
	 * @param ctx the parse tree
	 */
	void exitCaseTerminator(bashParser.CaseTerminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#forkProcess}.
	 * @param ctx the parse tree
	 */
	void enterForkProcess(bashParser.ForkProcessContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#forkProcess}.
	 * @param ctx the parse tree
	 */
	void exitForkProcess(bashParser.ForkProcessContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void enterCodeblock(bashParser.CodeblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void exitCodeblock(bashParser.CodeblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#tryAlways}.
	 * @param ctx the parse tree
	 */
	void enterTryAlways(bashParser.TryAlwaysContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#tryAlways}.
	 * @param ctx the parse tree
	 */
	void exitTryAlways(bashParser.TryAlwaysContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(bashParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(bashParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#simpleFunctionListDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleFunctionListDeclaration(bashParser.SimpleFunctionListDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#simpleFunctionListDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleFunctionListDeclaration(bashParser.SimpleFunctionListDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#simpleFunctionSingleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleFunctionSingleDeclaration(bashParser.SimpleFunctionSingleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#simpleFunctionSingleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleFunctionSingleDeclaration(bashParser.SimpleFunctionSingleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(bashParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(bashParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(bashParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(bashParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionLiteral}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionLiteral(bashParser.ExpressionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionLiteral}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionLiteral(bashParser.ExpressionLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStringEquals}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStringEquals(bashParser.ExpressionStringEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStringEquals}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStringEquals(bashParser.ExpressionStringEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStringGreaterThan}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStringGreaterThan(bashParser.ExpressionStringGreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStringGreaterThan}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStringGreaterThan(bashParser.ExpressionStringGreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAnd}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAnd(bashParser.ExpressionAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAnd}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAnd(bashParser.ExpressionAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionShortFlagLiteral}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionShortFlagLiteral(bashParser.ExpressionShortFlagLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionShortFlagLiteral}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionShortFlagLiteral(bashParser.ExpressionShortFlagLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionIsTrue}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionIsTrue(bashParser.ExpressionIsTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionIsTrue}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionIsTrue(bashParser.ExpressionIsTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStringLessThan}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStringLessThan(bashParser.ExpressionStringLessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStringLessThan}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStringLessThan(bashParser.ExpressionStringLessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionShortFlagLiterals}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionShortFlagLiterals(bashParser.ExpressionShortFlagLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionShortFlagLiterals}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionShortFlagLiterals(bashParser.ExpressionShortFlagLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStringNotEquals}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStringNotEquals(bashParser.ExpressionStringNotEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStringNotEquals}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStringNotEquals(bashParser.ExpressionStringNotEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionIsFalse}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionIsFalse(bashParser.ExpressionIsFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionIsFalse}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionIsFalse(bashParser.ExpressionIsFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionOr}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOr(bashParser.ExpressionOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionOr}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOr(bashParser.ExpressionOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStringNotEqualsRegexp}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStringNotEqualsRegexp(bashParser.ExpressionStringNotEqualsRegexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStringNotEqualsRegexp}
	 * labeled alternative in {@link bashParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStringNotEqualsRegexp(bashParser.ExpressionStringNotEqualsRegexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#commandModifier}.
	 * @param ctx the parse tree
	 */
	void enterCommandModifier(bashParser.CommandModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#commandModifier}.
	 * @param ctx the parse tree
	 */
	void exitCommandModifier(bashParser.CommandModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(bashParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(bashParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(bashParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(bashParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#commandSubstitutionLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCommandSubstitutionLiteral(bashParser.CommandSubstitutionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#commandSubstitutionLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCommandSubstitutionLiteral(bashParser.CommandSubstitutionLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#arithmeticLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticLiteral(bashParser.ArithmeticLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#arithmeticLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticLiteral(bashParser.ArithmeticLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(bashParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(bashParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(bashParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(bashParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#shortFlagGroup}.
	 * @param ctx the parse tree
	 */
	void enterShortFlagGroup(bashParser.ShortFlagGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#shortFlagGroup}.
	 * @param ctx the parse tree
	 */
	void exitShortFlagGroup(bashParser.ShortFlagGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#longFlagGroup}.
	 * @param ctx the parse tree
	 */
	void enterLongFlagGroup(bashParser.LongFlagGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#longFlagGroup}.
	 * @param ctx the parse tree
	 */
	void exitLongFlagGroup(bashParser.LongFlagGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#shortFlagGroupWithOptionalValue}.
	 * @param ctx the parse tree
	 */
	void enterShortFlagGroupWithOptionalValue(bashParser.ShortFlagGroupWithOptionalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#shortFlagGroupWithOptionalValue}.
	 * @param ctx the parse tree
	 */
	void exitShortFlagGroupWithOptionalValue(bashParser.ShortFlagGroupWithOptionalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#longFlagGroupWithOptionalValue}.
	 * @param ctx the parse tree
	 */
	void enterLongFlagGroupWithOptionalValue(bashParser.LongFlagGroupWithOptionalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#longFlagGroupWithOptionalValue}.
	 * @param ctx the parse tree
	 */
	void exitLongFlagGroupWithOptionalValue(bashParser.LongFlagGroupWithOptionalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#quotedString}.
	 * @param ctx the parse tree
	 */
	void enterQuotedString(bashParser.QuotedStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#quotedString}.
	 * @param ctx the parse tree
	 */
	void exitQuotedString(bashParser.QuotedStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(bashParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(bashParser.VariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(bashParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(bashParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticNumericalLiteral}
	 * labeled alternative in {@link bashParser#arithmeticStatement}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticNumericalLiteral(bashParser.ArithmeticNumericalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticNumericalLiteral}
	 * labeled alternative in {@link bashParser#arithmeticStatement}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticNumericalLiteral(bashParser.ArithmeticNumericalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticVariableReference}
	 * labeled alternative in {@link bashParser#arithmeticStatement}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticVariableReference(bashParser.ArithmeticVariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticVariableReference}
	 * labeled alternative in {@link bashParser#arithmeticStatement}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticVariableReference(bashParser.ArithmeticVariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticAssignment}
	 * labeled alternative in {@link bashParser#arithmeticStatement}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticAssignment(bashParser.ArithmeticAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticAssignment}
	 * labeled alternative in {@link bashParser#arithmeticStatement}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticAssignment(bashParser.ArithmeticAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryArithmeticExpression}
	 * labeled alternative in {@link bashParser#arithmeticStatement}.
	 * @param ctx the parse tree
	 */
	void enterTernaryArithmeticExpression(bashParser.TernaryArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryArithmeticExpression}
	 * labeled alternative in {@link bashParser#arithmeticStatement}.
	 * @param ctx the parse tree
	 */
	void exitTernaryArithmeticExpression(bashParser.TernaryArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GroupedArithmeticOperation}
	 * labeled alternative in {@link bashParser#arithmeticStatement}.
	 * @param ctx the parse tree
	 */
	void enterGroupedArithmeticOperation(bashParser.GroupedArithmeticOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GroupedArithmeticOperation}
	 * labeled alternative in {@link bashParser#arithmeticStatement}.
	 * @param ctx the parse tree
	 */
	void exitGroupedArithmeticOperation(bashParser.GroupedArithmeticOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticOperation}
	 * labeled alternative in {@link bashParser#arithmeticStatement}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperation(bashParser.ArithmeticOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticOperation}
	 * labeled alternative in {@link bashParser#arithmeticStatement}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperation(bashParser.ArithmeticOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#arithmeticModifier}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticModifier(bashParser.ArithmeticModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#arithmeticModifier}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticModifier(bashParser.ArithmeticModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#arithmeticAssignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticAssignmentOperator(bashParser.ArithmeticAssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#arithmeticAssignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticAssignmentOperator(bashParser.ArithmeticAssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(bashParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(bashParser.ArithmeticOperatorContext ctx);
}