name := "scala-unittesting-blank"

version := "0.1"

organization := "Daimon.scala"

scalaVersion := "2.9.0-1"

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.8.2" withSources(),
  "org.scalatest" % "scalatest" % "1.2" withSources(),
  "org.scala-tools.testing" %% "specs" % "1.6.8" withSources(),
  "org.specs2" %% "specs2" % "1.5" withSources(),
  "org.scala-tools.testing" %% "scalacheck" % "1.9"
)
