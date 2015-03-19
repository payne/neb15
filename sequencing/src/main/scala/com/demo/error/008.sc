import scalaz._
import Scalaz._


val good = 42.right[String]
val bad = "Failed!".left[Int]
val good2 = \/-(127)
val bad2 = -\/("bad")

for {
  a <- good
  b <- good2
} yield (a, b)