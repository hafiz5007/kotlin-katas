package week03_trees_graphs

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class P0100SameTreeTest {
    private val solution = P0100SameTree()

    @Test fun `identical trees`() {
        val p = treeOf(1, 2, 3)
        val q = treeOf(1, 2, 3)
        assertTrue(solution.isSameTree(p, q))
    }

    @Test fun `different values`() {
        val p = treeOf(1, 2)
        val q = treeOf(1, null, 2)
        assertFalse(solution.isSameTree(p, q))
    }

    @Test fun `different structure same values`() {
        val p = treeOf(1, 2, 1)
        val q = treeOf(1, 1, 2)
        assertFalse(solution.isSameTree(p, q))
    }

    @Test fun `both null`() {
        assertTrue(solution.isSameTree(null, null))
    }

    @Test fun `one null one not`() {
        assertFalse(solution.isSameTree(null, treeOf(1)))
        assertFalse(solution.isSameTree(treeOf(1), null))
    }

    @Test fun `single node same`() {
        assertTrue(solution.isSameTree(treeOf(42), treeOf(42)))
    }

    @Test fun `single node different`() {
        assertFalse(solution.isSameTree(treeOf(1), treeOf(2)))
    }

    @Test fun `deep identical trees`() {
        val p = treeOf(1, 2, 3, 4, 5, 6, 7)
        val q = treeOf(1, 2, 3, 4, 5, 6, 7)
        assertTrue(solution.isSameTree(p, q))
    }
}
