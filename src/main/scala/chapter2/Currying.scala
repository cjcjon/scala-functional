package chapter2

object Currying {

  def curry[A, B, C](f: (A, B) => C): A => (B => C) =
    (a: A) => (b: B) => f(a, b)

  def main(args: Array[String]): Unit = {
    val curried = curry((a: Int, b: String) => s"${a.toString} + ${b}")

    val partialApplied = curried(10)
    val applied = partialApplied("십")

    println(applied)
  }
}
