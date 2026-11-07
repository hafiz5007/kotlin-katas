package week02_linkedlists_stacks

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class P0141LinkedListCycleTest {
    private val solution = P0141LinkedListCycle()

    @Test fun `no cycle linear list`() {
        assertFalse(solution.hasCycle(listOfNodes(1, 2, 3, 4, 5)))
    }

    @Test fun `empty list`() {
        assertFalse(solution.hasCycle(null))
    }

    @Test fun `single node no cycle`() {
        assertFalse(solution.hasCycle(ListNode(1)))
    }

    @Test fun `cycle at tail`() {
        // Build: 1 -> 2 -> 3 -> 2 (back to node 2)
        val n1 = ListNode(1)
        val n2 = ListNode(2)
        val n3 = ListNode(3)
        n1.next = n2
        n2.next = n3
        n3.next = n2
        assertTrue(solution.hasCycle(n1))
    }

    @Test fun `cycle at head`() {
        // Build: 1 -> 2 -> 3 -> 1 (back to head)
        val n1 = ListNode(1)
        val n2 = ListNode(2)
        val n3 = ListNode(3)
        n1.next = n2
        n2.next = n3
        n3.next = n1
        assertTrue(solution.hasCycle(n1))
    }

    @Test fun `self-loop single node`() {
        val n1 = ListNode(1)
        n1.next = n1
        assertTrue(solution.hasCycle(n1))
    }
}
