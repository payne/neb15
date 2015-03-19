name := "romantests"

version := "1.0"

scalaVersion := "2.11.6"


// two percent signs automatically appends the scala version to the name
// one percent sign you'll need to explicitly mention the version.
// Here, "2.11" is the scala version

// Specs 2 and ScalaTest are the two major testing libraries
// they are heavily modeled on RSpec from the ruby and rails world
// scalatest has an older version with mostly just asserts --- See RomanSpec.scala

libraryDependencies ++= Seq (
  "org.scalacheck" %% "scalacheck" % "1.12.2" % "test",
  "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"
)