package com.demo.shapes


class Circle3(radius: Double) {
  private val myPi = 3.14

  def area = myPi * radius * radius
  def perimeter = myPi * radius * 2

}

object Circle3 {
  // apply is a special name.
  def apply(radius: Double) = new Circle3(radius)
}
