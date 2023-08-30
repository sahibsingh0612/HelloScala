package in.OLC.DSA.ArrayEasy

object FindSingleElement {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 3, 4, 2, 1, 4)
    val singleElement = findSingleElement(arr)
    println(s"The element that appears once is: $singleElement")
  }

  def findSingleElement(arr: Array[Int]): Int = {
    var result = 0
    for (num <- arr) {
      result ^= num
    }
    result
  }
}
