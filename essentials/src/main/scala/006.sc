/**** Recursion ****/

//def sumSquares(a: Int, b: Int): Int = {
//  if (a > b) 0
//  else sumSquares(a + 1, b) + (a * a)
//}

//sumSquares(1, 5)

//import scala.annotation.tailrec

//@tailrec def sumSquares(a: Int, b: Int): Int = {
//  if (a > b) 0
//  else sumSquares(a + 1, b) + (a * a) // FAILS
//}

//def sumSquares(a: Int, b: Int): Int = {
//  @tailrec
//  def loop(a: Int, acc: Int): Int = {
//    if (a > b) acc
//    else loop(a + 1, (a * a) + acc)
//  }
//  loop(a, 0)
//}

//sumSquares(1, 5)