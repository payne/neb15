import com.demo.shapes.Circle4

val circ = Circle4(20)

circ.area

circ.radius // Field is accessible, but can't be changed
// even though there is no val in the "case class"

circ.toString


val circ2 = Circle4(20)

circ2 == circ






