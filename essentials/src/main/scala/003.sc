/**** Higher-order functions ****/

def sumTwoOps(f: Int => Int, a: Int, b: Int): Int = {
  f(a) + f(b)
}

//def sq(a: Int): Int = a * a
//
//sumTwoOps(sq, 2, 3)

// Here we're passing in anonymous function.
// => is read "rocket" by Eric.
sumTwoOps(x => x*x, 2, 3)

sumTwoOps( x => 2 * x, 2, 3)

// the _ (underscore) is a place holder of some kind.
// Here it is a short hand for the previous
sumTwoOps( 2 * _ , 2, 3)

//sumTwoOps(x => _*_, 2, 3) // FAILS

/**** Returning a function ****/

def mulBy(factor: Double) = (x: Double) => x * factor
val triple = mulBy(3)
triple(10)




