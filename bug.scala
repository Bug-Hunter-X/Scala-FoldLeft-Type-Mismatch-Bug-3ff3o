```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Incorrect usage of foldLeft.  The initial value should be of type Int
  val sum: String = list.foldLeft("0")(_ + _)

  println(sum) // Prints "012345" instead of 15
}
```