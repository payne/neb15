type State = Int
type M[A] = State => (A, State)
def pure[A](a: A): M[A] = (m:State) => (a, m)
def bind[A,B](m: M[A], k: A => M[B]): M[B] = {
  s0 => {
    val (a, s1) = m(s0)
    val (b, s2) = k(a)(s1)
    (b, s2)
  }
}

def sq(a: Int): M[Int] = (i: Int) => (a*a, i+1)

((s: Int) => bind(pure(s),sq)(0))(2)
((s: Int) => bind(bind(pure(s), sq), sq)(0))(2)
((s: Int) => bind(bind(bind(pure(s), sq), sq), sq)(0))(2)


// Int => (State => (Int*Int, State+1)
val fn1 = (s: Int) => bind(pure(s),sq)

// 2 => (State => (2 * 2, State + 1)
val fn2 = fn1(2)

//  0 => (4, 0 + 1) is the same as s0 => (b, s2)
val res = fn2(0)

