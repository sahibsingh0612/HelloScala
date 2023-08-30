package in.OLC.DSAEasy

object _3SmallestLargest {
  def main(args: Array[String]): Unit = {
    def findSmallestAndLargest(num1: Int, num2: Int, num3: Int): (Int, Int) = {
      val smallest = Math.min(Math.min(num1, num2), num3)
      val largest = Math.max(Math.max(num1, num2), num3)
      (smallest, largest)
    }

    println("Enter the first number:")
    val num1 = scala.io.StdIn.readInt()

    println("Enter the second number:")
    val num2 = scala.io.StdIn.readInt()

    println("Enter the third number:")
    val num3 = scala.io.StdIn.readInt()

    val (smallest, largest) = findSmallestAndLargest(num1, num2, num3)

    println(s"Smallest: $smallest")
    println(s"Largest: $largest")
  }
}
