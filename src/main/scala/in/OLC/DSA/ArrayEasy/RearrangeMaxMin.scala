package in.OLC.DSA.ArrayEasy

object RearrangeMaxMin {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 3, 4, 5, 6, 7)
    rearrangeMaxMin(arr)
    println(arr.mkString(", "))
  }

  def rearrangeMaxMin(arr: Array[Int]): Unit = {
    val n = arr.length
    val temp = new Array[Int](n)
    var left = 0
    var right = n - 1
    var index = 0

    while (left <= right) {
      if (index % 2 == 0) {
        temp(index) = arr(right)
        right -= 1
      } else {
        temp(index) = arr(left)
        left += 1
      }
      index += 1
    }

    for (i <- 0 until n) {
      arr(i) = temp(i)
    }
  }
}
