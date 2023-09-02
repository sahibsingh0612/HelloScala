package in.OLC.DSA.Trees

class TreeNode2(var value: Int, var left: Option[TreeNode2] = None, var right: Option[TreeNode2] = None)

object PreorderToBST {
  var index = 0

  def constructBST(preorder: Array[Int], minValue: Int, maxValue: Int): Option[TreeNode2] = {
    if (index >= preorder.length || preorder(index) < minValue || preorder(index) > maxValue) {
      None
    } else {
      val root = Some(new TreeNode2(preorder(index)))
      index += 1
      root.foreach(r => {
        r.left = constructBST(preorder, minValue, r.value - 1)
        r.right = constructBST(preorder, r.value + 1, maxValue)
      })
      root
    }
  }

  def printInOrder(root: Option[TreeNode2]): Unit = {
    root.foreach { node =>
      printInOrder(node.left)
      print(node.value + " ")
      printInOrder(node.right)
    }
  }

  def main(args: Array[String]): Unit = {
    val preorder = Array(8, 5, 1, 7, 10, 12)
    val rootNode = constructBST(preorder, Int.MinValue, Int.MaxValue)

    println("In-order traversal of constructed BST:")
    printInOrder(rootNode)
  }
}
