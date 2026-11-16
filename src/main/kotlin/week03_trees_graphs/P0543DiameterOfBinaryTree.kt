package week03_trees_graphs

/*
 * Problem: 543. Diameter of Binary Tree (LeetCode)
 *
 * Given the root of a binary tree, return the length of the DIAMETER of the tree.
 *
 * The diameter is the length of the longest path between any two nodes in a
 * tree. This path may or may not pass through the root.
 *
 * Length = number of EDGES between nodes (not nodes).
 *
 *   Input: [1, 2, 3, 4, 5]
 *          1
 *         / \
 *        2   3
 *       / \
 *      4   5
 *   Output: 3  (path 4 -> 2 -> 5 -> ... wait, longest is 4 -> 2 -> 1 -> 3 = 3 edges)
 */
class P0543DiameterOfBinaryTree {
    var maxDiameter = 0
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        if(root == null)
            return  0

        getHeight(root)


        return maxDiameter

          }

    fun getHeight (node: TreeNode?) : Int
    {
        if(node == null)
        {
            return 0
        }

        var leftHeight = getHeight(node.left)
        var rightHeight = getHeight(node.right)

        var currentDiameter = leftHeight + rightHeight

        maxDiameter = Math.max(maxDiameter, currentDiameter)

      return 1 + Math.max(leftHeight, rightHeight)
    }
}
