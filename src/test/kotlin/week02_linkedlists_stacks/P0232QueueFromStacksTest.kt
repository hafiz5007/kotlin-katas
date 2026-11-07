package week02_linkedlists_stacks

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class P0232QueueFromStacksTest {

    @Test fun `push peek pop empty sequence`() {
        val q = P0232QueueFromStacks()
        q.push(1)
        q.push(2)
        assertEquals(1, q.peek())
        assertEquals(1, q.pop())
        assertFalse(q.empty())
        assertEquals(2, q.pop())
        assertTrue(q.empty())
    }

    @Test fun `empty when fresh`() {
        val q = P0232QueueFromStacks()
        assertTrue(q.empty())
    }

    @Test fun `push multiple then pop all in order`() {
        val q = P0232QueueFromStacks()
        listOf(10, 20, 30, 40).forEach { q.push(it) }
        assertEquals(10, q.pop())
        assertEquals(20, q.pop())
        assertEquals(30, q.pop())
        assertEquals(40, q.pop())
        assertTrue(q.empty())
    }

    @Test fun `interleave push and pop`() {
        val q = P0232QueueFromStacks()
        q.push(1)
        assertEquals(1, q.pop())
        q.push(2)
        q.push(3)
        assertEquals(2, q.pop())
        q.push(4)
        assertEquals(3, q.pop())
        assertEquals(4, q.pop())
        assertTrue(q.empty())
    }

    @Test fun `peek does not remove`() {
        val q = P0232QueueFromStacks()
        q.push(100)
        q.push(200)
        assertEquals(100, q.peek())
        assertEquals(100, q.peek())   // still there
        assertEquals(100, q.pop())
        assertEquals(200, q.peek())
    }
}
