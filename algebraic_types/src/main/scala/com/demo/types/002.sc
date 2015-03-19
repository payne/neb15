
// Like generics in java
import com.demo.types.{Pair, Triple}

val p1 = Pair(1.0, 'a')

p1.fst
p1.snd


val t1 = Triple(true, 2.718, "hello")

t1._1
t1._2
t1._3


val p2 = (1.0, 'a')
val t2 = (true, 2.718, "hello")

p2._2
t1._3

val (a, b, c) = t2
a
b
c




