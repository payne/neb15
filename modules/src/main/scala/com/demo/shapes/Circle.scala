// packages are a little different than in java.
// Here we are using it in a similar way.
// nested folders in the file system
// namespaces.

package com.demo.shapes

object Circle {
  private val myPi = 3.14

  def area(radius: Double): Double = radius * radius * myPi

  def perimeter(radius: Double): Double = radius * myPi * 2
}
