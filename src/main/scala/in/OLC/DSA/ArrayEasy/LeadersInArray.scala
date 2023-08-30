package in.OLC.DSA.ArrayEasy

object LeadersInArray {
  def main(args: Array[String]): Unit = {
    val arr = Array(16, 17, 4, 3, 5, 2)
    val leaders = findLeaders(arr)
    println(s"The leaders in the array are: ${leaders.mkString(", ")}")
  }

  def findLeaders(arr: Array[Int]): Array[Int] = {
    val n = arr.length
    var maxRight = arr(n - 1)
    var leaders = List(maxRight)

    for (i <- (n - 2) to 0 by -1) {
      if (arr(i) > maxRight) {
        maxRight = arr(i)
        leaders = maxRight :: leaders
      }
    }

    leaders.toArray
  }
}
