package in.OLC.DSAEasy

object SmallestNumber {
  def main(args: Array[String]): Unit = {
    // Function to find the smallest of three numbers
    def findSmallestNumber(num1: Int, num2: Int, num3: Int): Int = {
      Math.min(Math.min(num1, num2), num3)
    }

    // Accept the three numbers from the user
    println("Enter the first number:")
    val num1 = scala.io.StdIn.readInt()

    println("Enter the second number:")
    val num2 = scala.io.StdIn.readInt()

    println("Enter the third number:")
    val num3 = scala.io.StdIn.readInt()

    // Find the smallest number
    val smallestNumber = findSmallestNumber(num1, num2, num3)

    // Display the result
    println(s"The smallest number is: $smallestNumber")
  }
}
