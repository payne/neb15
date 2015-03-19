package com.demo.inout

import java.io.FileNotFoundException

import scala.io.Source

// $ sbt run --warn -f=somefile.txt

object Demo {
  def main (args: Array[String]): Unit = {
    println("Hello World")

    process(args.toList)

  }

  def process(args: List[String]): Boolean = {
    args match {
      case Nil => true // true if everything processed successfully
      case "-f" :: x :: rest =>
        try {
          val file = Source.fromFile(x).mkString
          // Entry into program here
          println("done")
        } catch {
          case ex: FileNotFoundException => println("Not found: " + x)
        }
        process(rest)
      case _ => false
    }
  }

}


