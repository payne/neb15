package com.demo.types

// This is a sum type
// this is parametrized


// The + here means that it's covariant
// There is an opposite called contravariance that is hardly ever seen, and it is mind twisting.

// At the very top of the hierarchy is any at the bottom is nothing

sealed trait FList[+T]
case class Cons[+T](first: T, rest: FList[T]) extends FList[T]
case object Empty extends FList[Nothing]

object FList {
  def map[T, U](f: T => U, ys: FList[T]): FList[U] = {
    ys match {
      case Empty => Empty
      case Cons(x, xs) => Cons(f(x), map(f, xs))
    }
  }
}

// Linked list is a recursive sum type

// map is very important because it is a way to do repetition in a functional language
// map has to be inside of a trait, class, or object
// but in the worksheet we can use map directly

// Look at 003.sc to exercise this

