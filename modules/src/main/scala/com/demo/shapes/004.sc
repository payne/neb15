import com.demo.shapes.Circle3

val c1 = Circle3.apply(20)

c1.area
c1.perimeter


val c2 = Circle3(20)

c2.area
c2.perimeter

// we do not need this new because there
// is a companion object with the apply function.
val c3 = new Circle3(20)

