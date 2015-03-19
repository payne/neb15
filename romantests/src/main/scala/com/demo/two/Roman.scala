package com.demo.two


final class Roman private(s:String) {
  override def toString = s
  override def equals(other: Any): Boolean =
    other match {
      case r: Roman => r.toString == s
      case _ => false
    }
}

// This is an example of a so called smart constructor
// it only returns things that it thinks are valid.
// This is an option type.   None represents the value that does not exist.
// could add in scalaz disjunction for more information about where things
// are blowing up...
// TODO: Add helper method to disallow IIII and VV
object Roman {
  def apply(sin:String): Option[Roman] = {
    sin match {
      case s if s.map("MDCLXVI".contains(_)).foldLeft(true)(_ && _) => Some(new Roman(s))
      case _ => None
    }
  }
}