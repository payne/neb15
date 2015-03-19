
// objects are just containers for functions
// that also might contain bindings (e.g. val)
// that are used as free variables
// in functions that are returned.
// The two things here are expressions and
// immutable name bindings.
object Circle {
  // protected works the same as java
  // private too
  private val myPi = 3.14

  def area(radius: Double): Double = {
    radius * radius * myPi
  }
}

Circle.area(20)

// Can also bring in via import
// notice the _ -- it's a wildcard in this case.
import Circle._

area(20)

