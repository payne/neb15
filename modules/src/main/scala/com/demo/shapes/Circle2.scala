package com.demo.shapes


class Circle2(radius: Double) {
  private val myPi = 3.14

  def area = myPi * radius * radius
  def perimeter = myPi * radius * 2
}

