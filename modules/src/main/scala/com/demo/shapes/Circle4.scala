package com.demo.shapes

// the case keyword gives you the companion object with apply for free.
// this is a "case class" this gives you several things
// a hidden toString function
// an == function

case class Circle4(radius: Double) {
  private val myPi = 3.14

  def area = myPi * radius * radius
  def perimeter = myPi * radius * 2
}
