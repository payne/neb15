package com.demo.shapes

sealed trait Shape
case class Circle(radius: Double) extends Shape
case class Rectangle(length: Double, width: Double) extends Shape

// Shape is the type constructor here.
// The implementation is not here.
// Implementation is located in worksheet 001.sc
// where we use this type.
