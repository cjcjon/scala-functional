package chapter2

object Composing {

  def compose[A, B, C](f: B => C, g: A => B): A => C =
    (a: A) => f(g(a))

  def main(args: Array[String]): Unit = {
    val f = (x: String) => x * 2
    val g = (x: Double) => (x + 1).toString

    val compose1 = compose(f, g)
    val compose2 = f compose g

    println(s"compose1: ${compose1(3.5)}")
    println(s"compose2: ${compose2(3.5)}")
  }
}
