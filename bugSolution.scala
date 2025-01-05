```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Correct usage of foldLeft.  Initial value is now an Int
  val sum: Int = list.foldLeft(0)(_ + _)

  println(sum) // Prints 15
}
```