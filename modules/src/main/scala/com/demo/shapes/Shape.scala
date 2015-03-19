package com.demo.shapes


// smells like a java interface for the moment.
trait Shape {
  // note that in java 5,6,7 this would not be possible!  Cool.
  val myPi = 3.14
  def area: Double
  def perimeter: Double
}

case class Circle5(radius: Double) extends Shape {
  //private val myPi = 3.14
  def area = myPi * radius * radius
  def perimeter = myPi * radius * 2
}

case class Rectangle(length: Double, width: Double) extends Shape {
  def area = length * width
  def perimeter = (length * 2) + (width * 2)
}
