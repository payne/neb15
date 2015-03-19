import com.demo.shapes.{Rectangle, Shape, Circle5}


def getShapeArea(s: Shape): Double = s.area

val c = Circle5(20)
getShapeArea(c)

val r = Rectangle(5, 15)
getShapeArea(r)

