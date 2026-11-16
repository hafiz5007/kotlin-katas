package week03_trees_graphs

/*
 * Problem: 226. Invert Binary Tree (LeetCode)
 *
 * Given the root of a binary tree, invert the tree (swap every left + right
 * child), and return its root.
 *
 *   Input:          Output:
 *       4              4
 *      / \            / \
 *     2   7          7   2
 *    / \ / \        / \ / \
 *   1  3 6  9      9  6 3  1
 */
class P0226InvertBinaryTree {
    fun invertTree(root: TreeNode?): TreeNode? {

        if(root == null)
            return null

        var temp = root.left
        root.left = root.right
        root.right = temp

        invertTree(root.left)
        invertTree(root.right)

        return root

    }
}



fun main()
{
   // Input: root = [4,2,7,1,3,6,9]
   var treeNode = treeOf(4,2,7,1,3,6,9)

    var results = treeNode.toLevelOrderList()
    for (result in results)
        println(result)


    var rootNode = P0226InvertBinaryTree().invertTree(treeNode)


     results = rootNode.toLevelOrderList()
    for (result in results)
        println(result)


}