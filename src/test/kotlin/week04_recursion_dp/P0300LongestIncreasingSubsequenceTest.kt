package week04_recursion_dp

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class P0300LongestIncreasingSubsequenceTest {
    private val solution = P0300LongestIncreasingSubsequence()

    @Test fun `classic example`() {
        // [2, 3, 7, 101] has length 4
        assertEquals(4, solution.lengthOfLIS(intArrayOf(10, 9, 2, 5, 3, 7, 101, 18)))
    }

    @Test fun `all same values`() {
        // Strictly increasing — only 1 unique
        assertEquals(1, solution.lengthOfLIS(intArrayOf(7, 7, 7, 7, 7, 7, 7)))
    }

    @Test fun `already sorted ascending`() {
        assertEquals(5, solution.lengthOfLIS(intArrayOf(1, 2, 3, 4, 5)))
    }

    @Test fun `sorted descending has LIS of 1`() {
        assertEquals(1, solution.lengthOfLIS(intArrayOf(5, 4, 3, 2, 1)))
    }

    @Test fun `single element`() {
        assertEquals(1, solution.lengthOfLIS(intArrayOf(42)))
    }

    @Test fun `two elements ascending`() {
        assertEquals(2, solution.lengthOfLIS(intArrayOf(1, 2)))
    }

    @Test fun `two elements descending`() {
        assertEquals(1, solution.lengthOfLIS(intArrayOf(2, 1)))
    }

    @Test fun `interleaved example`() {
        // [0, 1, 2, 3] has length 4
        assertEquals(4, solution.lengthOfLIS(intArrayOf(0, 1, 0, 3, 2, 3)))
    }

    @Test fun `with negatives`() {
        // [-5, -3, -2, 0, 1] has length 5
        assertEquals(5, solution.lengthOfLIS(intArrayOf(-5, -3, -2, 0, 1)))
    }
}
