import scalaz._
import Scalaz._

// In scala it's called either.
// The problem is an either is not a monand
// so can't do for comprehensions with an either type

// The library scalaz helps with this!
// It has a type called disjunction which is a monad

val good = 42.right[String]
val bad = "Failed!".left[Int]
val good2 = \/-(127)
val bad2 = -\/("bad")

for {
  a <- good
  b <- good2
} yield (a, b)