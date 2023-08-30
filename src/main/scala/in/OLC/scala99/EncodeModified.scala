package in.OLC.scala99

import scala.io.StdIn.readLine

object EncodeModified {
  def main(args: Array[String]): Unit = {
    val ls = readLine("Enter Input to a List: ").split("").toList
    val result = EncodedModified(ls)
    println(result)
  }
  import LengthEncoding.Encoding
  def EncodedModified[A](ls: List[A]): List[Any] =
    Encoding(ls) map { t => if (t._1 == 1) t._2 else t}
}
