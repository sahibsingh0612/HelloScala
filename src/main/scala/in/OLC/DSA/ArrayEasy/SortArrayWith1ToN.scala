package in.OLC.DSA.ArrayEasy

object SortArrayWith1ToN {
  def main(args: Array[String]): Unit = {
    val arr = Array(3, 1, 4, 2, 5)
    sortArrayWith1ToN(arr)
    println(arr.mkString(", "))
  }

  def sortArrayWith1ToN(arr: Array[Int]): Unit = {
    val n = arr.length

    for (i <- 0 until n) {
      while (arr(i) != i + 1) {
        val temp = arr(i)
        arr(i) = arr(temp - 1)
        arr(temp - 1) = temp
      }
    }
  }
}
