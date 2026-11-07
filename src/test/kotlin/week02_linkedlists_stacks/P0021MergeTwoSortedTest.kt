package week02_linkedlists_stacks

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class P0021MergeTwoSortedTest {
    private val solution = P0021MergeTwoSorted()

    @Test fun `classic example`() {
        val a = listOfNodes(1, 2, 4)
        val b = listOfNodes(1, 3, 4)
        assertEquals(listOf(1, 1, 2, 3, 4, 4), solution.mergeTwoLists(a, b).toValueList())
    }

    @Test fun `both null`() {
        assertNull(solution.mergeTwoLists(null, null))
    }

    @Test fun `one null`() {
        val a = listOfNodes(1, 2, 3)
        assertEquals(listOf(1, 2, 3), solution.mergeTwoLists(a, null).toValueList())
        assertEquals(listOf(1, 2, 3), solution.mergeTwoLists(null, listOfNodes(1, 2, 3)).toValueList())
    }

    @Test fun `uneven lengths`() {
        val a = listOfNodes(1, 5)
        val b = listOfNodes(2, 3, 4, 6, 7)
        assertEquals(listOf(1, 2, 3, 4, 5, 6, 7), solution.mergeTwoLists(a, b).toValueList())
    }

    @Test fun `one list completely smaller`() {
        val a = listOfNodes(1, 2)
        val b = listOfNodes(10, 20)
        assertEquals(listOf(1, 2, 10, 20), solution.mergeTwoLists(a, b).toValueList())
    }

    @Test fun `duplicates work`() {
        val a = listOfNodes(2, 2, 2)
        val b = listOfNodes(2, 2)
        assertEquals(listOf(2, 2, 2, 2, 2), solution.mergeTwoLists(a, b).toValueList())
    }
}
