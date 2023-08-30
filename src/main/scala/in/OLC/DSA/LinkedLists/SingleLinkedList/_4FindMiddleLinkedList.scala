package in.OLC.DSA.LinkedLists.SingleLinkedList

class Node4[A](var value: A, var next: Option[Node4[A]] = None)

class _3LinkedList[A] {
  var head: Option[Node4[A]] = None

  def insert(value: A): Unit = {
    val newNode = new Node4(value)
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
  def findMiddle(): Option[A] = {
    def findMiddleRec(slow: Option[Node4[A]], fast: Option[Node4[A]]): Option[A] = {
      fast match {
        case None => slow.map(_.value)
        case Some(f) if f.next.isEmpty => slow.map(_.value)
        case Some(f) => findMiddleRec(slow.flatMap(_.next), f.next.flatMap(_.next))
      }
    }

    findMiddleRec(head, head)
  }
}

object FindMiddleInLinkedListTailRecursive {
  def main(args: Array[String]): Unit = {
    val linkedList = new _3LinkedList[Int]()
    linkedList.insert(10)
    linkedList.insert(20)
    linkedList.insert(30)
    linkedList.insert(40)
    linkedList.insert(50)

    println("Linked List:")
    linkedList.printList()

    val middleValue = linkedList.findMiddle()
    println(s"Middle value: $middleValue")
  }
}
