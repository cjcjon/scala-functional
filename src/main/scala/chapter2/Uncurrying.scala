package chapter2

object Uncurrying {

  def uncurry[A, B, C](f: A => B => C): (A, B) => C =
    (a: A, b: B) => f(a)(b)

  def main(args: Array[String]): Unit = {
    val uncurried = uncurry((a: Int) => (b: String) => s"${a.toString} + ${b}")

    val applied = uncurried(10, "십")

    println(applied)
  }
}
