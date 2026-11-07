package week01_arrays_hashmaps

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class P0001TwoSumTest {
    private val solution = P0001TwoSum()

    @Test fun `happy path from problem statement`() {
        assertContentEquals(intArrayOf(0, 1), solution.twoSum(intArrayOf(2, 7, 11, 15), 9))
    }

    @Test fun `pair in middle`() {
        assertContentEquals(intArrayOf(1, 2), solution.twoSum(intArrayOf(3, 2, 4), 6))
    }

    @Test fun `duplicate numbers`() {
        assertContentEquals(intArrayOf(0, 1), solution.twoSum(intArrayOf(3, 3), 6))
    }

    @Test fun `negative numbers`() {
        assertContentEquals(intArrayOf(0, 2), solution.twoSum(intArrayOf(-3, 4, 3, 90), 0))
    }
}
