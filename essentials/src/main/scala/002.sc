/**** Function definition ****/

//def square(a: Int) = a * a
square(2)

//def square(a: Int): Int = a * a

def square(a: Int): Int =
  a * a

def pyth(a: Int, b: Int): Int = {
  val aSq = a * a
  val bSq = b * b
  aSq + bSq
}

pyth(10,20)

//def pyth(a: Int, b: Int): Int = {val aSq = a * a; val bSq = b * b; aSq + bSq }

/**** Function Literal ****/

(a: Int) => a * a

((a: Int) => a * a)(2)

val sq = (a: Int) => a * a
sq(2)





