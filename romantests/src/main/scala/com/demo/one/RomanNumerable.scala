package com.demo.one

trait RomanNumerable {
  type Roman
  def toRoman(n: Int): Roman
  def fromRoman(r: Roman): Int
  def add(a: Roman, b: Roman): Roman
}


