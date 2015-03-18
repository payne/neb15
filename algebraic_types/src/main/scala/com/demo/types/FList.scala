package com.demo.types

sealed trait FList[+T]
case class Cons[+T](first: T, rest: FList[T]) extends FList[T]
case object Empty extends FList[Nothing]

//object FList {
//  def map[T, U](f: T => U, ys: FList[T]): FList[U] = {
//    ys match {
//      case Empty => Empty
//      case Cons(x, xs) => Cons(f(x), map(f, xs))
//    }
//  }
//}
