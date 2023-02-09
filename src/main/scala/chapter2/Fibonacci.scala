package chapter2

import scala.annotation.tailrec

object Fibonacci {
  def fib(n: Int): Int = {
    @tailrec
    def go(n: Int, first: Int, second: Int): Int = n match {
      case 0 => first
      case 1 => second
      case _ => go(n - 1, second, first + second)
    }

    go(n, 0, 1)
  }

  def main(args: Array[String]): Unit = {
    println(s"fibo0: ${fib(0)}")
    println(s"fibo1: ${fib(1)}")
    println(s"fibo2: ${fib(2)}")
    println(s"fibo15: ${fib(15)}")
  }
}
