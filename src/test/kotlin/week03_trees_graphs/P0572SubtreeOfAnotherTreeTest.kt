package week03_trees_graphs

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class P0572SubtreeOfAnotherTreeTest {
    private val solution = P0572SubtreeOfAnotherTree()

    @Test fun `classic positive example`() {
        // root =    3           subRoot =   4
        //          / \                     / \
        //         4   5                   1   2
        //        / \
        //       1   2
        val root = treeOf(3, 4, 5, 1, 2)
        val subRoot = treeOf(4, 1, 2)
        assertTrue(solution.isSubtree(root, subRoot))
    }

    @Test fun `classic negative example`() {
        // root has an extra node, so subRoot does not exactly match
        val root = treeOf(3, 4, 5, 1, 2, null, null, null, null, 0)
        val subRoot = treeOf(4, 1, 2)
        assertFalse(solution.isSubtree(root, subRoot))
    }

    @Test fun `subRoot equals root`() {
        val root = treeOf(1, 2, 3)
        val subRoot = treeOf(1, 2, 3)
        assertTrue(solution.isSubtree(root, subRoot))
    }

    @Test fun `subRoot null is always true`() {
        assertTrue(solution.isSubtree(treeOf(1, 2, 3), null))
    }

    @Test fun `root null with non-null subRoot is false`() {
        assertFalse(solution.isSubtree(null, treeOf(1)))
    }

    @Test fun `subRoot is a leaf of root`() {
        val root = treeOf(1, 2, 3)
        val subRoot = treeOf(3)
        assertTrue(solution.isSubtree(root, subRoot))
    }

    @Test fun `subRoot matches shape but different value`() {
        val root = treeOf(1, 2, 3)
        val subRoot = treeOf(4)
        assertFalse(solution.isSubtree(root, subRoot))
    }
}
