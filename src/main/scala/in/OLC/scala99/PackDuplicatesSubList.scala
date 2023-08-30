package in.OLC.scala99


import scala.io.StdIn.readLine

object PackDuplicatesSubList {
  def pack[T](list: List[T]): List[List[T]] = list match {
    case Nil => Nil
    case head :: tail =>
      val (consecutive, rest) = list.span(_ == head)
      consecutive :: pack(rest)
  }

  def main(args: Array[String]): Unit = {
    //scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    //res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
    val ls = readLine("Enter input into the list: ").split(" ").toList
    val duplicates = pack(ls)

    println(s"The consequent duplicate sublist: $duplicates")
  }
}
