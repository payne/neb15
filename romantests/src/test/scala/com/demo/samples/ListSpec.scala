package com.demo.samples

import org.scalatest.FunSuite

class ListSpec extends FunSuite {
  test("List size should be 3") {
    val list = List(1,2,3)
    assert(list.size === 3)
  }
}

