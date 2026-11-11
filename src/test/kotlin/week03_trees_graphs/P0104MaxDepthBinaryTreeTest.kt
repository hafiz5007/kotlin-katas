package week03_trees_graphs

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class P0104MaxDepthBinaryTreeTest {
    private val solution = P0104MaxDepthBinaryTree()

    @Test fun `classic example depth 3`() {
        val input = treeOf(3, 9, 20, null, null, 15, 7)
        assertEquals(3, solution.maxDepth(input))
    }

    @Test fun `null returns 0`() {
        assertEquals(0, solution.maxDepth(null))
    }

    @Test fun `single node returns 1`() {
        assertEquals(1, solution.maxDepth(treeOf(1)))
    }

    @Test fun `left-skewed tree`() {
        // 1 -> 2 -> 3 -> 4 (all left children)
        val input = treeOf(1, 2, null, 3, null, 4)
        assertEquals(4, solution.maxDepth(input))
    }

    @Test fun `right-skewed tree`() {
        // 1 -> 2 -> 3 (all right children)
        val input = treeOf(1, null, 2, null, 3)
        assertEquals(3, solution.maxDepth(input))
    }

    @Test fun `balanced tree depth 2`() {
        val input = treeOf(1, 2, 3)
        assertEquals(2, solution.maxDepth(input))
    }
}
