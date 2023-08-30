package in.OLC.DSA.LinkedLists.SingleLinkedList

class Node1[A](var value: A, var next: Option[Node1[A]] = None)

class _1LinkedList[A] {
  var head: Option[Node1[A]] = None

  def insert(value: A): Unit = {
    val newNode = new Node1(value)
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

  def deleteFromBeginning(): Option[A] = {
    head.map { node =>
      head = node.next
      node.value
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
}

object DeleteFromBeginningInLinkedList {
  def main(args: Array[String]): Unit = {
    val linkedList = new _1LinkedList[Int]()
    linkedList.insert(10)
    linkedList.insert(20)
    linkedList.insert(30)

    println("Original Linked List:")
    linkedList.printList()

    val deletedValue = linkedList.deleteFromBeginning()
    println(s"Deleted value from beginning: $deletedValue")

    println("Linked List after deletion:")
    linkedList.printList()
  }
}
