package in.OLC.DSA.LinkedLists.SingleLinkedList

class Node5[A](var value: A, var next: Option[Node5[A]] = None)

class _5LinkedList[A] {
  var head: Option[Node5[A]] = None

  def insert(value: A): Unit = {
    val newNode = new Node5(value)
    if (head.isEmpty) {
      head = Some(newNode)
    } else {
      var current = head
      while (current.get.next.isDefined) {
        current = current.get.next
      }
      current.get.next = Some(newNode)
    }
  }

  def getNth(k: Int): Option[A] = {
    var current = head
    var count = 0

    while (current.isDefined && count < k) {
      current = current.get.next
      count += 1
    }

    current.map(_.value)
  }

  def nthFromEnd(n: Int): Option[A] = {
    var slow = head
    var fast = head

    // Move the fast pointer n nodes ahead
    for (_ <- 0 until n) {
      if (fast.isDefined) {
        fast = fast.get.next
      } else {
        return None // Invalid n for the given list length
      }
    }

    while (fast.isDefined && fast.get.next.isDefined) {
      slow = slow.get.next
      fast = fast.get.next
    }

    slow.map(_.value)
  }

  def printList(): Unit = {
    var current = head
    while (current.isDefined) {
      print(current.get.value + " -> ")
      current = current.get.next
    }
    println("null")
  }
}

object GetNthNodeInLinkedList {
  def main(args: Array[String]): Unit = {
    val linkedList = new _5LinkedList[Int]()
    linkedList.insert(5)
    linkedList.insert(4)
    linkedList.insert(3)
    linkedList.insert(2)
    linkedList.insert(1)

    println("Linked List:")
    linkedList.printList()

    val k = 3
    val nthValue = linkedList.getNth(k)
    nthValue match {
      case Some(value) => println(s"Value at $k node: $value")
      case None => println(s"Invalid position $k")

        val n = 2
        val nthValue = linkedList.nthFromEnd(n)
        nthValue match {
          case Some(value) => println(s"Value at $n nodes from end: $value")
          case None => println(s"Invalid position $n")
        }
    }
  }
}
