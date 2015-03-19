package com.demo.one

import com.demo.one.RomanNum._
import org.scalacheck.Properties
import org.scalacheck.Prop.forAll


// ScalaCheck is another style of testing library
// in property based programming, identifying the properties
// is not easy.   Eric's suggestion (which he implies will help some but not totally)
// is to look for identifies like we see below with commutative property

object RomanProp extends Properties("RomanNum") {

  property("Use cases for toRoman") = {
    toRoman(4) == "IV" &&
      toRoman(2015) == "MMXV"
  }

  property("Use cases for fromRoman") = {
    fromRoman("IV") == 4 &&
      fromRoman("MMXV") == 2015 &&
    fromRoman("IIII") == 4
    // this is because Eric did not implement all of the roman numeral spec
  }

  // Here it automatically generates input data
  // Since roman is really a string, this is a problem!
  // See the two folder for a partially done fix to this.
  property("Commutative property of Roman addition") = forAll {
    (a: Roman, b: Roman) => {
      add(a,b) == add(b,a)
    }
  }

}