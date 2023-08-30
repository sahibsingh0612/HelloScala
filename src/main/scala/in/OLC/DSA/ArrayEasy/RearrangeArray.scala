package in.OLC.DSA.ArrayEasy

object RearrangeArray {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 3, 4, 5, 6, 7)
    rearrangeArray(arr)
    println(arr.mkString(", "))
  }

  def rearrangeArray(arr: Array[Int]): Unit = {
    for (i <- 0 until arr.length) {
      if (i % 2 == 0) {
        // Find the maximum element in the remaining array
        val maxIndex = findMaxIndex(arr, i)

        // Swap the current element with the maximum element
        val temp = arr(i)
        arr(i) = arr(maxIndex)
        arr(maxIndex) = temp
      }
    }
  }

  def findMaxIndex(arr: Array[Int], startIndex: Int): Int = {
    var maxIndex = startIndex
    for (i <- startIndex + 1 until arr.length) {
      if (arr(i) > arr(maxIndex)) {
        maxIndex = i
      }
    }
    maxIndex
  }
}

