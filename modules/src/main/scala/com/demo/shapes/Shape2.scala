package com.demo.shapes

// Ability to extend multiple traits is referred to as mixins.

trait Shape2 {
  def area: Double
  def perimeter: Double
}

trait Color {
  val red: Double
  val blue: Double
  val green: Double
}

case class Circle6(radius: Double, red: Double, blue: Double, green: Double) extends Shape2 with Color {
  private val myPi = 3.14
  def area = myPi * radius * radius
  def perimeter = myPi * radius * 2
}

