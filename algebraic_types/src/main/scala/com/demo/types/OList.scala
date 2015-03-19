// Object oriented approach to implementing a list

package com.demo.types

// implementation is inside of the trait
// otherwise the recursive sum type is the same
sealed trait OList[+T] {
  // the this keyword refers to the object itself
  def map[U](f: T => U): OList[U] = this match {
    case OEmpty => OEmpty
    case OCons(x, xs) => OCons(f(x), xs.map(f))
  }
}

case class OCons[+T](first: T, rest: OList[T]) extends OList[T]
case object OEmpty extends OList[Nothing]

// see 004.sc for exercising this

