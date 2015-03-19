package com.demo.one

import com.demo.one.RomanNum._
import org.scalacheck.Properties
import org.scalacheck.Prop.forAll


object RomanProp extends Properties("RomanNum") {

  property("Use cases for toRoman") = {
    toRoman(4) == "IV" &&
      toRoman(2015) == "MMXV"
  }

  property("Use cases for fromRoman") = {
    fromRoman("IV") == 4 &&
      fromRoman("MMXV") == 2015
  }

//  property("Commutative property of Roman addition") = forAll {
//    (a: Roman, b: Roman) => {
//      add(a,b) == add(b,a)
//    }
//  }

}