
// Eric says he is not a TDD disciple
// Says this turns out to be a common TDD kata/koan

package com.demo.one

import RomanNum._
import org.scalatest.FunSuite


class RomanSpec extends FunSuite {
  test("Convert 1 to I") {
    assert(toRoman(1) === "I" )
  }

  test("Convert the year") {
    assert(toRoman(2015) === "MMXV")
  }

  test("Convert IV to 4") {
    assert(fromRoman("IV") === 4)
  }
}
