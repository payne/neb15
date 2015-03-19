// Stringly typed

case class Person(first: String, last: String, address: String, age: Int, ssn: String)

val p = Person("Fred", "Smith", "123 Main", 25, "123-45-6789")
val h1 = Person("Potter", "Harry", "123-45-6789", 25, "12 Grimauld Place, London")

case class Address(street: String, city: String, zipOrPostcode: String)
case class FirstName(name: String)
case class LastName(name: String)
case class SSN(id: String)
case class Age(age: Int)
case class Person2(first: FirstName, last: LastName, address: Address, age: Age, ssn: SSN)


val h2 = Person2(
  FirstName("Harry"),
  LastName("Potter"),
  Address("12 Grimauld Place", "London", "E10"),
  Age(25),
  SSN("123-45-6789"))