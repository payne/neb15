
// And now, in a object oriented way by moving a parameter to the outside

object State {
  def apply[S,A](a: A) = new State((s:S) => (a, s))
}

case class State[S,A](m: S => (A, S)) {
  def bind[B](k: A => State[S,B]): State[S,B] = {
    State((x: S) => {
      val (a, s1) = m(x)
      k(a).m(s1)
    })
  }
}


def sq(a: Int) = State[Int,Int]((i: Int) => (i+1, a*a))

((x: Int) => State(x).bind(sq))(2).m(0)


