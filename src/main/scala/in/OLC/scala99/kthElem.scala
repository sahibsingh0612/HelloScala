package in.OLC.scala99

import scala.io.StdIn.readLine

object kthElem {
  def kthElement[A](k: Int, ls:List[A]):A = (k, ls) match {
    case (0, h :: _) => h
    case (k, _ :: tail) => kthElement(k - 1, tail)
    case (_, Nil) => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    val ls = readLine("Enter numbers into the list: ").split(" ").toList
    val k = readLine("Enter a position: ").toInt
    println(s"The $k element in the list is ${kthElement(k, ls)}")
  }
}
