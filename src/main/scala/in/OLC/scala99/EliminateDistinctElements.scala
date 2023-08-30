package in.OLC.scala99

object EliminateDistinctElements {
  def main(args: Array[String]): Unit = {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val result = eliminateConsecutiveDuplicates(list)
    println(result.mkString(", "))
  }

  def eliminateConsecutiveDuplicates[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case head :: tail => head :: eliminateConsecutiveDuplicates(tail.dropWhile(_ == head))
  }
}

