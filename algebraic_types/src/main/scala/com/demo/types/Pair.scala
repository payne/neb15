package com.demo.types

// This is a product type (not a sum type)
// demo of parametrized types

case class Pair[T, S](fst: T, snd: S)

case class Triple[T, S, R](_1: T, _2: S, _3: R)




