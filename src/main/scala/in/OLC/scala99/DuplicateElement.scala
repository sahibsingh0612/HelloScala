package in.OLC.scala99

object DuplicateElement {
  def main(args: Array[String]): Unit = {
    val ls = List('a, 'b, 'c, 'c, 'd)
    val result = duplicate(ls)
    println(result.mkString(", "))
  }
  def duplicate[A](ls: List[A]): List[A] = ls flatMap { e => List(e, e) }
}
