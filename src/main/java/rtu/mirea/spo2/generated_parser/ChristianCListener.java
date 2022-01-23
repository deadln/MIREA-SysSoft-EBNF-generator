package rtu.mirea.spo2.generated_parser;// Generated from ChristianC.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ChristianCParser}.
 */
public interface ChristianCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ChristianCParser#lang}.
	 * @param ctx the parse tree
	 */
	void enterLang(ChristianCParser.LangContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChristianCParser#lang}.
	 * @param ctx the parse tree
	 */
	void exitLang(ChristianCParser.LangContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChristianCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ChristianCParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChristianCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ChristianCParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChristianCParser#declaring_expr}.
	 * @param ctx the parse tree
	 */
	void enterDeclaring_expr(ChristianCParser.Declaring_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChristianCParser#declaring_expr}.
	 * @param ctx the parse tree
	 */
	void exitDeclaring_expr(ChristianCParser.Declaring_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChristianCParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr(ChristianCParser.Assign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChristianCParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr(ChristianCParser.Assign_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChristianCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_expr(ChristianCParser.Arithmetic_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChristianCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_expr(ChristianCParser.Arithmetic_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChristianCParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ChristianCParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChristianCParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ChristianCParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChristianCParser#if_expr}.
	 * @param ctx the parse tree
	 */
	void enterIf_expr(ChristianCParser.If_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChristianCParser#if_expr}.
	 * @param ctx the parse tree
	 */
	void exitIf_expr(ChristianCParser.If_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChristianCParser#if_head}.
	 * @param ctx the parse tree
	 */
	void enterIf_head(ChristianCParser.If_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChristianCParser#if_head}.
	 * @param ctx the parse tree
	 */
	void exitIf_head(ChristianCParser.If_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChristianCParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ChristianCParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChristianCParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ChristianCParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChristianCParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expression(ChristianCParser.Logical_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChristianCParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expression(ChristianCParser.Logical_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChristianCParser#if_body}.
	 * @param ctx the parse tree
	 */
	void enterIf_body(ChristianCParser.If_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChristianCParser#if_body}.
	 * @param ctx the parse tree
	 */
	void exitIf_body(ChristianCParser.If_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChristianCParser#else_head}.
	 * @param ctx the parse tree
	 */
	void enterElse_head(ChristianCParser.Else_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChristianCParser#else_head}.
	 * @param ctx the parse tree
	 */
	void exitElse_head(ChristianCParser.Else_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChristianCParser#else_body}.
	 * @param ctx the parse tree
	 */
	void enterElse_body(ChristianCParser.Else_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChristianCParser#else_body}.
	 * @param ctx the parse tree
	 */
	void exitElse_body(ChristianCParser.Else_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChristianCParser#while_expr}.
	 * @param ctx the parse tree
	 */
	void enterWhile_expr(ChristianCParser.While_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChristianCParser#while_expr}.
	 * @param ctx the parse tree
	 */
	void exitWhile_expr(ChristianCParser.While_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChristianCParser#while_head}.
	 * @param ctx the parse tree
	 */
	void enterWhile_head(ChristianCParser.While_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChristianCParser#while_head}.
	 * @param ctx the parse tree
	 */
	void exitWhile_head(ChristianCParser.While_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChristianCParser#while_body}.
	 * @param ctx the parse tree
	 */
	void enterWhile_body(ChristianCParser.While_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChristianCParser#while_body}.
	 * @param ctx the parse tree
	 */
	void exitWhile_body(ChristianCParser.While_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChristianCParser#do_while_expr}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_expr(ChristianCParser.Do_while_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChristianCParser#do_while_expr}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_expr(ChristianCParser.Do_while_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChristianCParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrint_expr(ChristianCParser.Print_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChristianCParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrint_expr(ChristianCParser.Print_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChristianCParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(ChristianCParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChristianCParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(ChristianCParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChristianCParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ChristianCParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChristianCParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ChristianCParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChristianCParser#logical_op}.
	 * @param ctx the parse tree
	 */
	void enterLogical_op(ChristianCParser.Logical_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChristianCParser#logical_op}.
	 * @param ctx the parse tree
	 */
	void exitLogical_op(ChristianCParser.Logical_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChristianCParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(ChristianCParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChristianCParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(ChristianCParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChristianCParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(ChristianCParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChristianCParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(ChristianCParser.VarContext ctx);
}