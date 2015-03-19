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

// if else is kind of like C's ternary operator -- they return a value
// unlike if statements in scala

// there should be a blue screen (principles) on if expressions
// be careful about what is being evaluated.
// comparison -- greater than, less than -- if is appropriate
// if equivalence, then you should be wary -- that's a red flag
// they are often used where not appropriate



