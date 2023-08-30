package in.OLC.scala99

import scala.io.StdIn.readLine

object DecodeModified  {
  def main(args: Array[String]): Unit = {
    val inputList = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val encodedList = encodeDirect(inputList)
    println(encodedList)
  }

  def encodeDirect[A](list: List[A]): List[(Int, A)] = {
    if (list.isEmpty) Nil
    else {
      val (packed, next) = list.span(_ == list.head)
      (packed.length, packed.head) :: encodeDirect(next)
    }
  }
}
