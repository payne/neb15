package com.demo.two


trait RomanNumerable[Roman] {
  def toRoman(n: Int): Option[Roman]
  def fromRoman(r: Option[Roman]): Option[Int]
  def add(a: Option[Roman], b: Option[Roman]): Option[Roman]
}
