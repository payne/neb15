package com.demo.one

// One of the problems in Scala is the debate around how to name traits

trait RomanNumerable {
  // There is a type alias whatever extends this has to define this type alias
  // this syntax just says it must be present
  type Roman
  def toRoman(n: Int): Roman
  def fromRoman(r: Roman): Int
  def add(a: Roman, b: Roman): Roman
}


