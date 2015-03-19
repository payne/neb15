// Eric says this is the gnarliest of the day.
// Nice story from Eric about denotational semantics

// Normally this stuff is presented in a much simpler way
// But that simpler way is misleading.
// This is not just a computation.
// It's a computation on types

// type alias.   Say State instead of Int
type State = Int
// Read M of A
// Parameter that is a function type
// Type alias for a parametrized function type
// This can be thought of a type constructor
type M[A] = State => (A, State)

// 2nd thing -- a function called pure
// It was called pure in the original paper
// If you try to find meaning in the function name,
// you will be misled.
// this returns a function
def pure[A](a: A): M[A] = (m:State) => (a, m)


// it is called bind in the original paper
// the type signature is what matters here
// two parameters A, B
def bind[A,B](m: M[A], k: A => M[B]): M[B] = {
  s0 => {
    val (a, s1) = m(s0)
    val (b, s2) = k(a)(s1)
    (b, s2)
  }
}

// this is a squaring function
def sq(a: Int): M[Int] = (i: Int) => (a*a, i+1)

// the outputs are the value and the number of operations
((s: Int) => bind(pure(s),sq)(0))(2)
((s: Int) => bind(bind(pure(s), sq), sq)(0))(2)
((s: Int) => bind(bind(bind(pure(s), sq), sq), sq)(0))(2)


// Int => (State => (Int*Int, State+1)
val fn1 = (s: Int) => bind(pure(s),sq)

// 2 => (State => (2 * 2, State + 1)
val fn2 = fn1(2)

//  0 => (4, 0 + 1) is the same as s0 => (b, s2)
val res = fn2(0)

