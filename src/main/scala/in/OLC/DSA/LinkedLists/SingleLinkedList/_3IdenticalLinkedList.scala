package in.OLC.DSA.LinkedLists.SingleLinkedList

class Node3[A](var value: A, var next: Option[Node3[A]] = None)

class _2LinkedList[A] {

  var head: Option[Node3[A]] = None

  def insert(value: A): Unit = {
    val newNode = new Node3(value)
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

  def printList(): Unit = {
    var current = head
    while (current.isDefined) {
      print(current.get.value + " -> ")
      current = current.get.next
    }
    println("null")
  }

  def areIdentical(other: _2LinkedList[A]): Boolean = {
    def compareLists(node1: Option[Node3[A]], node2: Option[Node3[A]]): Boolean = {
      (node1, node2) match {
        case (None, None) => true
        case (Some(n1), Some(n2)) if n1.value == n2.value =>
          compareLists(n1.next, n2.next)
        case _ => false
      }
    }

    compareLists(head, other.head)
  }
}


object CheckIdenticalLinkedListsTailRecursive {
  def main(args: Array[String]): Unit = {
    val linkedList1 = new _2LinkedList[Int]()
    linkedList1.insert(10)
    linkedList1.insert(20)
    linkedList1.insert(30)

    val linkedList2 = new _2LinkedList[Int]()
    linkedList2.insert(10)
    linkedList2.insert(20)
    linkedList2.insert(40)

    println("Linked List 1:")
    linkedList1.printList()

    println("Linked List 2:")
    linkedList2.printList()

    val areIdentical = linkedList1.areIdentical(linkedList2)
    if (areIdentical) {
      println("The linked lists are identical.")
    } else {
      println("The linked lists are not identical.")
    }
  }
}
