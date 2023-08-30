package in.OLC.DSA.ArrayEasy

object CountPossibleTriangles {
  def main(args: Array[String]): Unit = {
    val arr = Array(4, 6, 3, 7)
    val count = countPossibleTriangles(arr)
    println(s"Number of possible triangles: $count")
  }

  def countPossibleTriangles(arr: Array[Int]): Int = {
    val n = arr.length
    if (n < 3) {
      return 0
    }

    scala.util.Sorting.quickSort(arr) // Sort the array first

    var count = 0
    for (i <- 0 until n - 2) {
      var k = i + 2
      for (j <- i + 1 until n - 1) {
        while (k < n && arr(i) + arr(j) > arr(k)) {
          k += 1
        }
        count += k - j - 1
      }
    }

    count
  }
}

