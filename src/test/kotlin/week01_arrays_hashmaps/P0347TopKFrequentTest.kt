package week01_arrays_hashmaps

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class P0347TopKFrequentTest {
    private val solution = P0347TopKFrequent()

    @Test fun `classic example`() {
        val result = solution.topKFrequent(intArrayOf(1, 1, 1, 2, 2, 3), 2)
        assertEquals(setOf(1, 2), result.toSet())
    }

    @Test fun `single element k equals 1`() {
        val result = solution.topKFrequent(intArrayOf(1), 1)
        assertEquals(setOf(1), result.toSet())
    }

    @Test fun `all distinct k equals n`() {
        val result = solution.topKFrequent(intArrayOf(1, 2, 3, 4), 4)
        assertEquals(setOf(1, 2, 3, 4), result.toSet())
    }

    @Test fun `k equals 1 with clear top`() {
        val result = solution.topKFrequent(intArrayOf(4, 4, 4, 4, 1, 1, 2), 1)
        assertEquals(setOf(4), result.toSet())
    }

    @Test fun `negatives work`() {
        val result = solution.topKFrequent(intArrayOf(-1, -1, -2, -2, -3), 2)
        assertEquals(setOf(-1, -2), result.toSet())
    }
}
