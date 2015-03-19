/**** Closure ****/

// a closure is a function that contains a free variable that is packaged
// with the function that is returned.   Here, factor is the free variable.
// Peter Landin is very responsible for the term closure and many of these
// concepts -- per Peter.
// Jeremy Clark notes that the free variable factor has been captured
// in the closure.   He says this is a term that Microsoft promotes.
val factor = 3
val triple = (x: Double) => x * factor

triple(10)

def mulBy(factor: Double) = {
  def foo(x: Int) = x * factor
  foo _
  // just above, because foo is done via def the _ is required when
  // returning a function.
}

val tripleB = mulBy(3)

tripleB(10)

mulBy(3)(10)

// Curried function
def mulByC(factor: Double)(x: Int) = x * factor

mulByC(3)(10)

// Partial application
val tripleC = mulByC(3) _

tripleC(10)

