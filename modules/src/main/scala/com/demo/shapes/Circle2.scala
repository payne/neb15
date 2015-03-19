package com.demo.shapes


// if val was placed inside the parameter, radius would become publicly accessible.
class Circle2(radius: Double) {
  private val myPi = 3.14

  def area = myPi * radius * radius
  def perimeter = myPi * radius * 2
}

