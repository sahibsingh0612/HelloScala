package in.OLC.scala99

import scala.io.StdIn.readLine

object LengthEncoding {
  def main(args: Array[String]): Unit = {
    val ls = readLine("Enter input into the List: ").split("").toList
    val result = Encoding(ls)
    println(result)
  }
  import PackDuplicatesSubList.pack
  def Encoding[A](ls: List[A]): List[(Int, A)] =
    pack(ls) map { e => (e.length, e.head) }

}
