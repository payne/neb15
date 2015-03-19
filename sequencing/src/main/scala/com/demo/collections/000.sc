val ll = List(1,2,3)

ll.map(x => x*x)

ll.foldRight(0)(_+_)

ll.foldLeft(0)(_+_)

ll.foldLeft(1)((x:Int, y:Int) => x * y)

// it's just a fluke that 6 comes out for each
// fold above.


import scala.collection.immutable.StringOps
val s = "MMXV"
s.map("MDCLXVI".contains(_)).foldLeft(true)(_ && _)

"MDCLXVI".contains("X")
s.map("MDCLXVI".contains(_))
