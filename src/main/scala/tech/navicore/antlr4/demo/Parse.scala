package tech.navicore.antlr4.demo

import com.typesafe.scalalogging.LazyLogging
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import tech.navicore.antlr4.demo.antlr.{ArithmeticLexer, ArithmeticParser}
import tech.navicore.antlr4.demo.antlr4.{ArithmeticVisitorImpl, Expr}

object Parse extends LazyLogging {

  val arithmeticVisitor = new ArithmeticVisitorImpl()

  def apply(input: String): Expr = {

    logger.debug("Evaluating expression: " + input)

    val charStream = CharStreams.fromString(input)
    val lexer = new ArithmeticLexer(charStream)
    val tokens = new CommonTokenStream(lexer)
    val parser = new ArithmeticParser(tokens)
    arithmeticVisitor.visit(parser.expr())
  }

}
