package in.OLC.scala99

import scala.io.StdIn.readLine

object DecodeRunLengthEncoding  {
  def main(args: Array[String]): Unit = {
    val encodedList = List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))
    val decodedList = decodeRunLengthEncoding(encodedList)
    println(decodedList.mkString(", "))
  }

  def decodeRunLengthEncoding[A](encodedList: List[(Int, A)]): List[A] = {
    encodedList.flatMap { case (count, element) => List.fill(count)(element) }
  }
}
