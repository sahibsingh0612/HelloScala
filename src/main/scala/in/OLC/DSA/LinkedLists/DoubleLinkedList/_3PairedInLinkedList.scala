package in.OLC.DSA.LinkedLists.DoubleLinkedList

class Node3(val value: Int) {
  var prev: Option[Node3] = None
  var next: Option[Node3] = None
}

class _3DoublyLinkedList {
  private var head: Option[Node3] = None
  private var tail: Option[Node3] = None

  def append(value: Int): Unit = {
    val newNode = new Node3(value)
    tail match {
      case None =>
        head = Some(newNode)
        tail = Some(newNode)
      case Some(oldTail) =>
        oldTail.next = Some(newNode)
        newNode.prev = Some(oldTail)
        tail = Some(newNode)
    }
  }

  def findPairsWithSum(targetSum: Int): List[(Int, Int)] = {
    var pairs: List[(Int, Int)] = List()
    var left = head
    var right = tail

    while (left.isDefined && right.isDefined && left != right) {
      val sum = left.get.value + right.get.value

      if (sum == targetSum) {
        pairs = pairs :+ (left.get.value, right.get.value)
        left = left.get.next
        right = right.get.prev
      } else if (sum < targetSum) {
        left = left.get.next
      } else {
        right = right.get.prev
      }
    }

    pairs.distinct.map {
      case (a, b) if a > b => (b, a)
      case pair => pair
    }
  }
}

object FindPairsWithSumInDoublyLinkedList {
  def main(args: Array[String]): Unit = {
    val linkedList = new _3DoublyLinkedList()
    linkedList.append(1)
    linkedList.append(2)
    linkedList.append(3)
    linkedList.append(4)
    linkedList.append(5)
    linkedList.append(6)

    val targetSum = 7
    val pairs = linkedList.findPairsWithSum(targetSum)

    println(s"Pairs with sum $targetSum:")
    pairs.foreach { case (a, b) =>
      println(s"$a, $b")
    }
  }
}