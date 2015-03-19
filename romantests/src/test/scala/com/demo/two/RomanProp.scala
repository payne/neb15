package com.demo.two

import com.demo.two.RomanNum._
import org.scalacheck.Prop.forAll
import org.scalacheck.{Gen, Properties}


object RomanProp extends Properties("RomanNum") {

  val romans: Gen[Option[Roman]] =
    for {
      s <- Gen.oneOf(List("MMXV", "IV")) // TODO - Expand?
    } yield Roman(s)

  property("Use cases for toRoman") = {
    toRoman(4) == Roman("IV") &&
      toRoman(2015) == Roman("MMXV")
  }

  property("Use cases for fromRoman") = {
    fromRoman(Roman("IV")) == Some(4) &&
      fromRoman(Roman("MMXV")) == Some(2015)
  }


  property("Commutative property of Roman addition") = forAll(romans,romans) {
      (a: Option[Roman], b: Option[Roman]) => {
        add(a,b) == add(b,a)
      }
    }

}
