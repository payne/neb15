// Option

//sealed trait Option[+T]
//case class Some[+T](v: T) extends Option[T]
//case object None extends Option[Nothing]

case class FirstName(name: String)
case class LastName(name: String)
case class Age(age: Int)
case class Person(first: FirstName, last: LastName, age: Age)

val firstName = Some(FirstName("John"))
val lastName = Some(LastName("Smith"))
//val lastName = None
val age = Some(Age(30))
//val age = None

for {
  fn <- firstName
  ln <- lastName
  age <- age
} yield Person(fn, ln, age)

