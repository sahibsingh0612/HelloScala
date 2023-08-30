package in.OLC.scala99

object RecursiveListReverse {
  def reverseList[A](list: List[A]): List[A] = {
    def reverseHelper(result: List[A], remaining: List[A]): List[A] = {
      remaining match {
        case Nil => result
        case head :: tail => reverseHelper(head :: result, tail)
      }
    }

    reverseHelper(Nil, list)
  }

  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5) // Replace this with your desired list
    val reversedList = reverseList(inputList)

    println("Original List: " + inputList)
    println("Reversed List: " + reversedList)
  }
}