package tech.navicore.antlr4.demo.antlr4

sealed trait Expr
case class Operation(name:String) extends Expr
case class ExprResult(res:Option[Double]) extends Expr
