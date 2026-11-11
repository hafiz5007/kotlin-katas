package week03_trees_graphs

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class P0102BinaryTreeLevelOrderTest {
    private val solution = P0102BinaryTreeLevelOrder()

    @Test fun `classic example`() {
        val input = treeOf(3, 9, 20, null, null, 15, 7)
        val expected = listOf(listOf(3), listOf(9, 20), listOf(15, 7))
        assertEquals(expected, solution.levelOrder(input))
    }

    @Test fun `null tree returns empty`() {
        assertEquals(emptyList(), solution.levelOrder(null))
    }

    @Test fun `single node`() {
        assertEquals(listOf(listOf(1)), solution.levelOrder(treeOf(1)))
    }

    @Test fun `left-skewed tree`() {
        // 1 -> 2 -> 3 -> 4
        val input = treeOf(1, 2, null, 3, null, 4)
        val expected = listOf(listOf(1), listOf(2), listOf(3), listOf(4))
        assertEquals(expected, solution.levelOrder(input))
    }

    @Test fun `balanced tree`() {
        val input = treeOf(1, 2, 3)
        val expected = listOf(listOf(1), listOf(2, 3))
        assertEquals(expected, solution.levelOrder(input))
    }

    @Test fun `ragged tree`() {
        // Build:
        //       1
        //      / \
        //     2   3
        //      \
        //       4
        val input = treeOf(1, 2, 3, null, 4)
        val expected = listOf(listOf(1), listOf(2, 3), listOf(4))
        assertEquals(expected, solution.levelOrder(input))
    }
}
