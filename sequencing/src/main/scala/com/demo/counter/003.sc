
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
def dbl(a: Int): M[Int] = (i: Int) => (2*a, i+1)


/////////////////////////
/////////////////////////
// and now on the bottom.....

// Left Identity
// bind(pure(x), f) is the same thing as f(x)
val fn = (s: Int) => bind(pure(s),sq)
fn(2)(0)
sq(2)(0)

// Right Identity
//bind(m,pure) is no different than just m
val m = (a: Int) => (i: Int) => (i, a)
bind(m(1), (a: Int) => pure(a))(3)
m(1)(3)

// Associativity
// Doing bind(bind(m, f), g) is just like doing
// bind(m, x => bind(f, g))
bind(bind(m(0), sq), dbl)(2)
bind(m(0), (a: Int) => bind(sq(a), (b: Int) => dbl(b)))(2)




