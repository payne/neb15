package com.demo.two


final class Roman private(s:String) {
  override def toString = s
  override def equals(other: Any): Boolean =
    other match {
      case r: Roman => r.toString == s
      case _ => false
    }
}

object Roman {
  def apply(sin:String): Option[Roman] = {
    sin match {
      case s if s.map("MDCLXVI".contains(_)).foldLeft(true)(_ && _) => Some(new Roman(s))
      case _ => None
    }
  }
}