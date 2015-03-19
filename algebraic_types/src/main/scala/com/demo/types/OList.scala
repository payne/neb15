// Object oriented approach to implementing a list

package com.demo.types


sealed trait OList[+T] {
  def map[U](f: T => U): OList[U] = this match {
    case OEmpty => OEmpty
    case OCons(x, xs) => OCons(f(x), xs.map(f))
  }
}

case class OCons[+T](first: T, rest: OList[T]) extends OList[T]
case object OEmpty extends OList[Nothing]
