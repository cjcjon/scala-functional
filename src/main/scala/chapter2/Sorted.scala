package chapter2

import scala.annotation.tailrec

object Sorted {

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @tailrec
    def go(n: Int): Boolean = {
      if (n == (as.length - 1)) true
      else if (!ordered(as(n), as(n + 1))) false
      else go(n + 1)
    }

    go(0)
  }

  def main(args: Array[String]): Unit = {
    val sorted1 = isSorted(Array[Int](0, 1, 2, 3), (a: Int, b: Int) => a < b)
    val sorted2 = isSorted(Array[Int](3, 2, 1), (a: Int, b: Int) => a > b)
    val sorted3 = isSorted(Array[Int](1, 3, 2, 4), (a: Int, b: Int) => a < b)

    println(s"$sorted1, $sorted2, $sorted3")
  }
}
