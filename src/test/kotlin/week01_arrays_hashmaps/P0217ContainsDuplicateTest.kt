package week01_arrays_hashmaps

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class P0217ContainsDuplicateTest {
    private val solution = P0217ContainsDuplicate()

    @Test fun `contains duplicate returns true`() {
        assertTrue(solution.containsDuplicate(intArrayOf(1, 2, 3, 1)))
    }

    @Test fun `all distinct returns false`() {
        assertFalse(solution.containsDuplicate(intArrayOf(1, 2, 3, 4)))
    }

    @Test fun `empty array returns false`() {
        assertFalse(solution.containsDuplicate(intArrayOf()))
    }

    @Test fun `single element returns false`() {
        assertFalse(solution.containsDuplicate(intArrayOf(5)))
    }

    @Test fun `many duplicates returns true`() {
        assertTrue(solution.containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)))
    }

    @Test fun `negatives work`() {
        assertTrue(solution.containsDuplicate(intArrayOf(-1, -2, -1)))
    }
}
