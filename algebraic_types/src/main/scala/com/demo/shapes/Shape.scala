package com.demo.shapes

// sealed means you can not extend this trait in any file other than this one
sealed trait Shape
case class Circle(radius: Double) extends Shape
case class Rectangle(length: Double, width: Double) extends Shape

// Shape is the type constructor here.
// The implementation is not here.
// Implementation is located in worksheet 001.sc
// where we use this type.

// This relates to the expression problem!

// This is not dynamic dispatch
// This is using pattern matching to do this.


