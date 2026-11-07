package week02_linkedlists_stacks

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class P0206ReverseLinkedListTest {
    private val solution = P0206ReverseLinkedList()

    @Test fun `classic five elements`() {
        val input = listOfNodes(1, 2, 3, 4, 5)
        val result = solution.reverseList(input)
        assertEquals(listOf(5, 4, 3, 2, 1), result.toValueList())
    }

    @Test fun `two elements`() {
        val input = listOfNodes(1, 2)
        val result = solution.reverseList(input)
        assertEquals(listOf(2, 1), result.toValueList())
    }

    @Test fun `single element`() {
        val input = listOfNodes(42)
        val result = solution.reverseList(input)
        assertEquals(listOf(42), result.toValueList())
    }

    @Test fun `null input`() {
        assertNull(solution.reverseList(null))
    }

    @Test fun `with negatives`() {
        val input = listOfNodes(-1, -2, -3)
        val result = solution.reverseList(input)
        assertEquals(listOf(-3, -2, -1), result.toValueList())
    }
}
