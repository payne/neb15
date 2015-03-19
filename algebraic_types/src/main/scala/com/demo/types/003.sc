// Remember to click make project
// Let's make our own list!  a linked list


import com.demo.types.{Empty, Cons, FList}
import com.demo.types.FList._


val ls = Cons(42, Cons(69, Cons(613, Empty)))

ls

def map[T, U](f: T => U, ys: FList[T]): FList[U] = {
  ys match {
    case Empty => Empty
    case Cons(x, xs) => Cons(f(x), map(f, xs))
  }
}

map((x: Int) => x*x, ls)






