package week03_trees_graphs

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class P0543DiameterOfBinaryTreeTest {
    private val solution = P0543DiameterOfBinaryTree()

    @Test fun `classic example`() {
        // [1,2,3,4,5] → longest path is 4 -> 2 -> 1 -> 3 (3 edges)
        val input = treeOf(1, 2, 3, 4, 5)
        assertEquals(3, solution.diameterOfBinaryTree(input))
    }

    @Test fun `single edge`() {
        // [1, 2] → longest path is 1 -> 2 (1 edge)
        val input = treeOf(1, 2)
        assertEquals(1, solution.diameterOfBinaryTree(input))
    }

    @Test fun `single node returns 0`() {
        assertEquals(0, solution.diameterOfBinaryTree(treeOf(1)))
    }

    @Test fun `null returns 0`() {
        assertEquals(0, solution.diameterOfBinaryTree(null))
    }

    @Test fun `left-skewed tree`() {
        // 1 -> 2 -> 3 -> 4 (3 edges)
        val input = treeOf(1, 2, null, 3, null, 4)
        assertEquals(3, solution.diameterOfBinaryTree(input))
    }

    @Test fun `diameter does not pass through root`() {
        //        1
        //       /
        //      2
        //     / \
        //    3   4
        //   /     \
        //  5       6
        // Longest: 5 -> 3 -> 2 -> 4 -> 6 (4 edges)
        val input = treeOf(1, 2, null, 3, 4, 5, null, null, 6)
        assertEquals(4, solution.diameterOfBinaryTree(input))
    }
}
