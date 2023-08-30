package in.OLC.DSA.ArrayEasy

object SubarrayWithGiveSum {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 4, 20, 3, 10, 5)
    val targetSum = 33
    findSubarrayWithSum(arr, targetSum)
  }

  def findSubarrayWithSum(arr: Array[Int], targetSum: Int): Unit = {
    var start = 0
    var end = 0
    var currentSum = arr(0)

    while (end <= arr.length) {
      if (currentSum == targetSum) {
        println(s"Subarray found from index $start to $end")
        return
      }

      if (currentSum < targetSum) {
        end += 1
        if (end < arr.length) {
          currentSum += arr(end)
        }
      } else {
        currentSum -= arr(start)
        start += 1
      }
    }

    println("No subarray found with the given sum.")
  }
}

