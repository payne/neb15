//http://tonymorris.github.io/blog/posts/scalaoption-cheat-sheet/


val opt: Option[Int] = Some(3)
def foo(x: Int): Option[Int] = Some(x)

opt.flatMap(foo)
//opt.flatMap(foo(_))

//opt match {
//  case Some(x) => foo(x)
//  case None => None
//}

opt.getOrElse(0)

//opt match {
//  case None => 0
//  case Some(x) => x
//}




