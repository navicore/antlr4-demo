name := "Antlr4demo"

version := "1.0"

scalaVersion := "2.13.11"
val akkaVersion = "2.5.17"
val akkaHttpVersion = "10.1.5"

val antlrVer = "4.13.0"
enablePlugins(Antlr4Plugin)
antlr4Version in Antlr4 := antlrVer
antlr4PackageName in Antlr4 := Some("tech.navicore.antlr4.demo.antlr")
antlr4GenListener in Antlr4 := false
antlr4GenVisitor in Antlr4 := true

libraryDependencies ++=
  Seq(
    "org.antlr" % "antlr4-runtime" % antlrVer,
    "org.antlr" % "stringtemplate" % "4.0.2",

    "org.rogach" %% "scallop" % "5.0.0",
    "ch.qos.logback" % "logback-classic" % "1.4.11",
    "com.typesafe" % "config" % "1.4.2",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",

    "org.scalatest" %% "scalatest" % "3.2.16" % "test"

  )

mainClass in assembly := Some("tech.navicore.antlr4.demo.Main")
assemblyJarName in assembly := "Antlr4demo.jar"

