package in.OLC.scala99

object CheckPalindrome {
  def isPalindrome[A](list: List[A]): Boolean = {
    list == list.reverse
  }

  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 2, 1) // Replace this with your desired list
    val result = isPalindrome(inputList)

    if (result) {
      println("The list is a palindrome.")
    }
    else {
      println("The list is not a palindrome.")
    }
  }
}
