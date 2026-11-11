package week03_trees_graphs

/*
 * Shared TreeNode class used by all binary tree problems in Week 3.
 *
 * A standard LeetCode binary tree node with value + left + right.
 *
 * Helpers at the bottom make it easy to build and inspect trees in tests.
 */
class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

/**
 * Build a binary tree from a level-order list (LeetCode's standard format).
 * Use `null` to indicate missing children.
 *
 *   treeOf(1, 2, 3, null, 4, 5, 6)   →
 *          1
 *        /   \
 *       2     3
 *        \   / \
 *         4 5   6
 */
fun treeOf(vararg values: Int?): TreeNode? {
    if (values.isEmpty() || values[0] == null) return null
    val root = TreeNode(values[0]!!)
    val queue = ArrayDeque<TreeNode>()
    queue.addLast(root)

    var i = 1
    while (queue.isNotEmpty() && i < values.size) {
        val current = queue.removeFirst()

        // Left child
        if (i < values.size) {
            val v = values[i]
            if (v != null) {
                current.left = TreeNode(v)
                queue.addLast(current.left!!)
            }
            i++
        }

        // Right child
        if (i < values.size) {
            val v = values[i]
            if (v != null) {
                current.right = TreeNode(v)
                queue.addLast(current.right!!)
            }
            i++
        }
    }
    return root
}

/**
 * Convert tree to level-order list with nulls (reverse of treeOf).
 * Useful for comparing tree shapes in tests.
 */
fun TreeNode?.toLevelOrderList(): List<Int?> {
    if (this == null) return emptyList()
    val result = mutableListOf<Int?>()
    val queue = ArrayDeque<TreeNode?>()
    queue.addLast(this)

    while (queue.isNotEmpty()) {
        val node = queue.removeFirst()
        if (node == null) {
            result.add(null)
        } else {
            result.add(node.`val`)
            queue.addLast(node.left)
            queue.addLast(node.right)
        }
    }

    // Trim trailing nulls (common for ragged trees)
    while (result.isNotEmpty() && result.last() == null) {
        result.removeAt(result.size - 1)
    }
    return result
}
