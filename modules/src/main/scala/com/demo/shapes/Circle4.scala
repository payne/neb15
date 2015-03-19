package com.demo.shapes

// the case keyword gives you the companion object with apply for free.
case class Circle4(radius: Double) {
  private val myPi = 3.14

  def area = myPi * radius * radius
  def perimeter = myPi * radius * 2
}
