package com.demo.two


object RomanNum extends RomanNumerable[Roman] {

  def toRoman(num: Int): Option[Roman]  = {
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
    Roman(roman)
  }

  // FIXME - this is a bad implementation as it allows "IIII" as legit
  def fromRoman(rin: Option[Roman]): Option[Int] = {
    rin match {
      case Some(r) =>
        val numerals = Map('I' -> 1, 'V' -> 5, 'X' -> 10, 'L' -> 50, 'C' -> 100, 'D' -> 500, 'M' -> 1000)
        val s = r.toString
        val res = s.toUpperCase.map(numerals).foldLeft((0, 0)) {
            case ((sum, last), curr) => (sum + curr + (if (last < curr) -2 * last else 0), curr)
          }._1
        Some(res)

      case None => None
    }
  }

  def add(a: Option[Roman], b: Option[Roman]): Option[Roman] = {
    val res = for {
      x <- fromRoman(a)
      y <- fromRoman(b)
    } yield x + y

    res.flatMap(toRoman)
  }

}




