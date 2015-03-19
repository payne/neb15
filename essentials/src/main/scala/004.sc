/**** Closure ****/

// a closure is a function that contains a free variable that is packaged
// with the function that is returned.   Here, factor is the free variable.
val factor = 3
val triple = (x: Double) => x * factor

triple(10)

//def mulBy(factor: Double) = {
//  def foo(x: Int) = x * factor
//  foo _
//}

//val triple = mulBy(3)

//triple(10)

//mulBy(3)(10)

// Curried function
//def mulBy(factor: Double)(x: Int) = x * factor

//mulBy(3)(10)

// Partial application
//val triple = mulBy(3) _

//triple(10)

