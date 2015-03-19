
// bind now becomes flatMap


object State {
  def apply[S,A](a: A) = new State((s:S) => (a, s))
}

case class State[S,A](m: S => (A, S)) {
  def map[B](f: A => B): State[S,B] =
    flatMap((a: A) => State(f(a)))

  def flatMap[B](k: A => State[S,B]): State[S,B] = {
    State((x: S) => {
      val (a, s1) = m(x)
      k(a).m(s1)
    })
  }
}

def sq(a: Int) = State[Int,Int]((i: Int) => (a*a, i + 1))

((x: Int) => State(x).flatMap(sq))(2).m(0)
((x: Int) => State(x).flatMap(sq).flatMap(sq))(2).m(0)


val f = for {
  x <- sq(2)
  y <- sq(x)
  z <- sq(y)
} yield z

f.m(0)