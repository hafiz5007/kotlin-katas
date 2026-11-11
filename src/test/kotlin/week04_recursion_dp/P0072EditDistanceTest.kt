package week04_recursion_dp

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class P0072EditDistanceTest {
    private val solution = P0072EditDistance()

    @Test fun `classic horse to ros`() {
        // horse -> rorse (replace h->r) -> rose (delete r) -> ros (delete e) = 3
        assertEquals(3, solution.minDistance("horse", "ros"))
    }

    @Test fun `classic intention to execution`() {
        assertEquals(5, solution.minDistance("intention", "execution"))
    }

    @Test fun `empty to abc`() {
        // Insert 3 characters
        assertEquals(3, solution.minDistance("", "abc"))
    }

    @Test fun `abc to empty`() {
        // Delete 3 characters
        assertEquals(3, solution.minDistance("abc", ""))
    }

    @Test fun `both empty`() {
        assertEquals(0, solution.minDistance("", ""))
    }

    @Test fun `identical strings`() {
        assertEquals(0, solution.minDistance("abc", "abc"))
    }

    @Test fun `single character replace`() {
        assertEquals(1, solution.minDistance("a", "b"))
    }

    @Test fun `prefix only needs insertions`() {
        // "abc" -> "abcdef" = 3 insertions
        assertEquals(3, solution.minDistance("abc", "abcdef"))
    }

    @Test fun `completely different same length`() {
        // "abc" -> "xyz" = 3 replacements
        assertEquals(3, solution.minDistance("abc", "xyz"))
    }
}
