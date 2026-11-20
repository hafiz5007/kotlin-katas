package week03_trees_graphs

/*
 * Problem: 102. Binary Tree Level Order Traversal (LeetCode)
 *
 * Given the root of a binary tree, return the LEVEL ORDER traversal of
 * its nodes' values. (i.e., from left to right, level by level.)
 *
 *   Input: [3, 9, 20, null, null, 15, 7]
 *          3
 *         / \
 *        9   20
 *           /  \
 *          15   7
 *   Output: [[3], [9, 20], [15, 7]]
 */
class P0102BinaryTreeLevelOrder {
     val resultsOfLevel = mutableListOf<MutableList<Int>>()
    var level : Int = 0

    fun levelOrder(root: TreeNode?): List<List<Int>> {
        if (root == null) return emptyList()

        // Create a new inner list the first time we reach this depth
        if (resultsOfLevel.size == level) {
            resultsOfLevel.add(mutableListOf())
        }

        // Add the current node's value to its level
        resultsOfLevel[level].add(root.`val`)

        // Go deeper into left and right subtrees
        level++
        levelOrder(root.left)
        levelOrder(root.right)
        level-- // Backtrack level when returning up to the parent

        return resultsOfLevel
    }

   // fun addLevel

    fun levelOrder1(root: TreeNode?): List<List<Int>> {
        val result = mutableListOf<MutableList<Int>>()

        fun dfs(node: TreeNode?, level: Int) {
            if (node == null) return
            if (result.size == level) result.add(mutableListOf())

            result[level].add(node.`val`)
            dfs(node.left, level + 1)
            dfs(node.right, level + 1)
        }

        dfs(root, 0)
        return result
    }
}
