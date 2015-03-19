// we're going to make our own Option type to learn
// Option type comes with scala.

// Option, Some, None are built into scala

//sealed trait Option[+T]
//case class Some[+T](v: T) extends Option[T]
//case object None extends Option[Nothing]

case class FirstName(name: String)
case class LastName(name: String)
case class Age(age: Int)
case class Person(first: FirstName, last: LastName, age: Age)

val firstName = Some(FirstName("John"))
val lastName = Some(LastName("Smith"))
// Try and see what happens
//val lastName = None
val age = Some(Age(30))
// try and see what happens
// if one is none, the whole thing is none
// this is the essence of error hanlding in scala
//val age = None

for {
  fn <- firstName
  ln <- lastName
  age <- age
} yield Person(fn, ln, age)

