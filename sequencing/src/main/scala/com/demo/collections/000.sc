// map foldRight foldLeft are combinators
// these generally referer to higher order functions
// that take functions as parameters
// Repetition is frequently done with these combinators

val ll = List(1,2,3)

ll.map(x => x*x)

ll.foldRight(0)(_+_)

ll.foldLeft(0)(_+_)

ll.foldLeft(1)((x:Int, y:Int) => x * y)

// it's just a fluke that 6 comes out for each
// fold above.


import scala.collection.immutable.StringOps
val s = "MMXV"
// is s a valid roman number?
s.map("MDCLXVI".contains(_))
s.map("MDCLXVI".contains(_)).foldLeft(true)(_ && _)

// the above broken out a bit
"MDCLXVI".contains("X")
s.map("MDCLXVI".contains(_))
