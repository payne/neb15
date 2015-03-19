/**** Parentheses vs Curly braces ****/

def id(fn: Int => Int) = fn

val foo = id(x=>2*x)
foo(4)

id({x=>2*x})

// Note, you don't need () if you have {}
// when arity is one they are substitutes
id{x=>2*x}

// Here arity is not one, so we could not use (), we must use {}
id { x =>
     val y = 2 * x
     val z = y
     z
}

/**** Branching with if/else ****/

//TODO - if/else example(s)




