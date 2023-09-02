package in.OLC.DSA.Trees

class TreeNode3(var value: Int, var left: Option[TreeNode3] = None, var right: Option[TreeNode3] = None)

class _3BinarySearchTree {
  var root: Option[TreeNode3] = None

  def insert(value: Int): Unit = {
    root = insertRec(root, value)
  }

  private def insertRec(node: Option[TreeNode3], value: Int): Option[TreeNode3] = {
    node match {
      case None => Some(new TreeNode3(value))
      case Some(n) if value < n.value =>
        n.left = insertRec(n.left, value)
        Some(n)
      case Some(n) if value > n.value =>
        n.right = insertRec(n.right, value)
        Some(n)
      case _ => node // If the value already exists, no duplicate is added.
    }
  }

  def inOrderTraversal(node: Option[TreeNode3]): List[Int] = {
    node match {
      case None => List.empty
      case Some(n) => inOrderTraversal(n.left) ::: List(n.value) ::: inOrderTraversal(n.right)
    }
  }

  def printTree(): Unit = {
    val inOrder = inOrderTraversal(root)
    println("Binary Search Tree (In-order traversal):")
    println(inOrder.mkString(" "))
  }
}

object _3InsertionInBSTInsertIntoBST {
  def main(args: Array[String]): Unit = {
    val bst = new _3BinarySearchTree()

    bst.insert(5)
    bst.insert(3)
    bst.insert(8)
    bst.insert(2)
    bst.insert(4)
    bst.insert(7)
    bst.insert(9)

    bst.printTree()
  }
}
