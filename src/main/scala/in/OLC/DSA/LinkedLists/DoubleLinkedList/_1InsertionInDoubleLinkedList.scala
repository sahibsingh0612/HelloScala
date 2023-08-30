package in.OLC.DSA.LinkedLists.DoubleLinkedList

class Node[A](var value: A, var prev: Option[Node[A]] = None, var next: Option[Node[A]] = None)

class DoublyLinkedList[A] {
  var head: Option[Node[A]] = None
  var tail: Option[Node[A]] = None

  def insertAtFront(value: A): Unit = {
    val newNode = new Node(value)
    if (head.isEmpty) {
      head = Some(newNode)
      tail = Some(newNode)
    } else {
      newNode.prev = tail
      tail.foreach(_.next = Some(newNode))
      tail = Some(newNode)
    }
  }

  def insertBetween(value: A, prevValue: A, nextValue: A): Unit = {
    val newNode = new Node(value)
    var current = head

    while (current.isDefined && current.get.value != prevValue) {
      current = current.get.next
    }

    current.foreach { prevNode =>
      newNode.next = prevNode.next
      newNode.prev = Some(prevNode)
      prevNode.next.foreach(_.prev = Some(newNode))
      prevNode.next = Some(newNode)
      if (tail.contains(prevNode)) {
        tail = Some(newNode)
      }
    }
  }

  def insertAtEnd(value: A): Unit = {
    val newNode = new Node(value)
    newNode.prev = tail
    tail.foreach(_.next = Some(newNode))
    tail = Some(newNode)
    if (head.isEmpty) {
      head = tail
    }
  }

  def printList(): Unit = {
    var current = head
    while (current.isDefined) {
      print(current.get.value + " <-> ")
      current = current.get.next
    }
    println("null")
  }
}

object DoublyLinkedListOperations {
  def main(args: Array[String]): Unit = {
    val doublyLinkedList = new DoublyLinkedList[Int]()

    doublyLinkedList.insertAtFront(10)
    doublyLinkedList.insertAtFront(20)
    doublyLinkedList.insertAtFront(30)

    println("Doubly Linked List after inserting at front:")
    doublyLinkedList.printList()

    doublyLinkedList.insertBetween(4, 20, 30)

    println("Doubly Linked List after inserting between nodes:")
    doublyLinkedList.printList()

    doublyLinkedList.insertAtEnd(5)

    println("Doubly Linked List after inserting at end:")
    doublyLinkedList.printList()
  }
}
