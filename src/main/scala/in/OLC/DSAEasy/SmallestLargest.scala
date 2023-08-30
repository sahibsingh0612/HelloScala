package in.OLC.DSAEasy

object SmallestLargest {
  def main(args: Array[String]): Unit = {
    def findSmallestAndLargest(num1: Int, num2: Int): (Int, Int) = {
      if (num1 < num2)
        (num1, num2)
      else
        (num2, num1)
    }

    println("Enter the first number:")
    val num1 = scala.io.StdIn.readInt()

    println("Enter the second number:")
    val num2 = scala.io.StdIn.readInt()

    val (smallest, largest) = findSmallestAndLargest(num1, num2)

    println(s"Smallest: $smallest")
    println(s"Largest: $largest")
  }
}

