// Remember to check the Make Project checkbox before
// clicking run
import com.demo.shapes.{Shape, Circle, Rectangle}

def getShapeArea(s: Shape): Double = {
  // Eric says don't do any work after the pattern match
  // otherwise the cyclomatic complexity gets too big.
  s match {
    case Circle(r) => math.Pi * r * r
    case Rectangle(l, w) => l * w
  }
}

val c = Circle(20)
val r = Rectangle(5, 20)

getShapeArea(c)




