import com.demo.shapes.{Shape, Circle, Rectangle}

def getShapeArea(s: Shape): Double = {
  s match {
    case Circle(r) => math.Pi * r * r
//    case Rectangle(l, w) => l * w
  }
}

val c = Circle(20)
val r = Rectangle(5, 20)

getShapeArea(c)




