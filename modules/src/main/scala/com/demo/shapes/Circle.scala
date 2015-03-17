package com.demo.shapes

object Circle {
  private val myPi = 3.14

  def area(radius: Double): Double = radius * radius * myPi

  def perimeter(radius: Double): Double = radius * myPi * 2
}
