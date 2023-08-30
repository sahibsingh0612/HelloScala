package in.OLC.scala99

object flatNestedList  {
  def flatten(list: List[Any]): List[Any] = list flatMap {
    case sublist: List[_] => flatten(sublist)
    case element => List(element)
  }

  def main(args: Array[String]): Unit = {
    val nestedList = List(1, List(2, 3), List(4, List(5, 6), 3))
    val flattenedList = flatten(nestedList)
    println(flattenedList)
  }
}
