// List comprehension based on set comprehension in mathematics
// elements of the list are paired together into a new list.

// do not try to make a fluent API in scala!

// it is idomatic for code to look different when using the collections API
// than when you're using your own code.

// These will be OO looking things but we get something new back everytime.

//List(1,2)
//List('a','b','c')

val foo = List(1,2).map(n => List('a', 'b', 'c').map( ch => (n, ch)))
// the output is:
// TODO: Step through this!!!
// List(List((1,a), (1,b), (1,c)), List((2,a), (2,b), (2,c)))

foo.flatten
// the output is
// List((1,a), (1,b), (1,c), (2,a), (2,b), (2,c))

List(1,2).flatMap( n => List('a','b','c').map( ch => (n,ch)))
// List((1,a), (1,b), (1,c), (2,a), (2,b), (2,c))

// made the lists vertical
// flatMap, flatMap, map
List(1,2).flatMap( n =>
  List('a', 'b', 'c').flatMap( ch =>
    List(true, false).map( b =>
      (n,ch,b))))
// List((1,a,true), (1,a,false), (1,b,true), (1,b,false), (1,c,true), (1,c,false), (2,a,true), (2,a,false), (2,b,true), (2,b,false), (2,c,true), (2,c,false))

// a for comprehension
for {
  n <- List(1,2)
  ch <- List('a','b','c')
  b <- List(true, false)
} yield (n, ch, b)
// Note, it is yielding a list of tuples
// List((1,a,true), (1,a,false), (1,b,true), (1,b,false), (1,c,true), (1,c,false), (2,a,true), (2,a,false), (2,b,true), (2,b,false), (2,c,true), (2,c,false))

// There is a moral to this.
// There is pain if you do it this way
// then there is the for comprehension.

// Eric says this different than Haskell's zipper
// This is like the do notation in Haskell




