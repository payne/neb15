/**** Recursion ****/

def sumSquares(a: Int, b: Int): Int = {
  if (a > b) 0
  else sumSquares(a + 1, b) + (a * a)
}

sumSquares(1, 5)

import scala.annotation.tailrec

@tailrec def sumSquares2(a: Int, b: Int): Int = {
  if (a > b) 0
  else sumSquares2(a + 1, b) + (a * a) // FAILS
}

// still fails because the addition is the last thing
@tailrec def sumSquares2fixed(a: Int, b: Int): Int = {
  if (a > b) 0
  else  (a * a) + sumSquares2fixed(a + 1, b) // FAILS
}

// this is a "cute" party trick that you don't actually do.
def sumSquares3(a: Int, b: Int): Int = {
  @tailrec
  def loop(a: Int, acc: Int): Int = {
    if (a > b) acc
    else loop(a + 1, (a * a) + acc)
  }
  loop(a, 0)
}

sumSquares3(1, 5)