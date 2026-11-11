package week03_trees_graphs

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class P0226InvertBinaryTreeTest {
    private val solution = P0226InvertBinaryTree()

    @Test fun `classic example`() {
        val input = treeOf(4, 2, 7, 1, 3, 6, 9)
        val result = solution.invertTree(input)
        assertEquals(listOf<Int?>(4, 7, 2, 9, 6, 3, 1), result.toLevelOrderList())
    }

    @Test fun `null returns null`() {
        assertNull(solution.invertTree(null))
    }

    @Test fun `single node`() {
        val input = treeOf(1)
        val result = solution.invertTree(input)
        assertEquals(listOf<Int?>(1), result.toLevelOrderList())
    }

    @Test fun `two nodes`() {
        val input = treeOf(1, 2)
        val result = solution.invertTree(input)
        assertEquals(listOf<Int?>(1, null, 2), result.toLevelOrderList())
    }

    @Test fun `left heavy tree`() {
        val input = treeOf(1, 2, null, 3)
        val result = solution.invertTree(input)
        assertEquals(listOf<Int?>(1, null, 2, null, 3), result.toLevelOrderList())
    }
}
