package com.demo.one


object RomanNum extends RomanNumerable {

  type Roman = String

  def toRoman(num: Int): Roman  = {
    val rn = List(
      1000->"M", 900->"CM", 500->"D", 400->"CD", 100->"C",
      90->"XC", 50->"L", 40->"XL", 10->"X",
      9->"IX", 5->"V", 4->"IV", 1->"I")

    val (roman, _) = rn.foldLeft(("", num))((result, tuple) => {
      val (arabicNumber, romanNumber) = tuple
      val (romanString, remainder)    = result
      val romanUnit = romanNumber * (remainder / arabicNumber)
      (romanString + romanUnit, remainder % arabicNumber)
    })
    roman
  }

  def fromRoman(s: Roman): Int = {
    val numerals = Map('I' -> 1, 'V' -> 5, 'X' -> 10, 'L' -> 50, 'C' -> 100, 'D' -> 500, 'M' -> 1000)
    s.toUpperCase.map(numerals).foldLeft((0, 0)) {
      case ((sum, last), curr) => (sum + curr + (if (last < curr) - 2 * last else 0), curr)
    }._1
  }

  def add(a: Roman, b: Roman): Roman = {
    val res = fromRoman(a) + fromRoman(b)
    toRoman(res)
  }

}
