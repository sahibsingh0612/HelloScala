package in.OLC.DSA.ArrayEasy

object SegregateEvenOdd {
  def main(args: Array[String]): Unit = {
    val arr = Array(12, 34, 45, 9, 8, 90, 3)
    segregateEvenOdd(arr)
    println(arr.mkString(", "))
  }

  def segregateEvenOdd(arr: Array[Int]): Unit = {
    val n = arr.length
    var left = 0
    var right = n - 1

    while (left < right) {
      while (arr(left) % 2 == 0 && left < right) {
        left += 1
      }
      while (arr(right) % 2 == 1 && left < right) {
        right -= 1
      }
      if (left < right) {
        val temp = arr(left)
        arr(left) = arr(right)
        arr(right) = temp
        left += 1
        right -= 1
      }
    }
  }
}

