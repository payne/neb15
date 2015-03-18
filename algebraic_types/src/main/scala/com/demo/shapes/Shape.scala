package com.demo.shapes

sealed trait Shape
case class Circle(radius: Double) extends Shape
case class Rectangle(length: Double, width: Double) extends Shape

