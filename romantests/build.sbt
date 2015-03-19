name := "romantests"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq (
  "org.scalacheck" %% "scalacheck" % "1.12.2" % "test",
  "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"
)