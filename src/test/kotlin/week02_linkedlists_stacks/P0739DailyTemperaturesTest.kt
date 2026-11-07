package week02_linkedlists_stacks

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class P0739DailyTemperaturesTest {
    private val solution = P0739DailyTemperatures()

    @Test fun `classic example`() {
        assertContentEquals(
            intArrayOf(1, 1, 4, 2, 1, 1, 0, 0),
            solution.dailyTemperatures(intArrayOf(73, 74, 75, 71, 69, 72, 76, 73))
        )
    }

    @Test fun `monotonic increasing`() {
        assertContentEquals(
            intArrayOf(1, 1, 1, 1, 0),
            solution.dailyTemperatures(intArrayOf(30, 40, 50, 60, 70))
        )
    }

    @Test fun `monotonic decreasing`() {
        assertContentEquals(
            intArrayOf(0, 0, 0, 0, 0),
            solution.dailyTemperatures(intArrayOf(70, 60, 50, 40, 30))
        )
    }

    @Test fun `all same`() {
        assertContentEquals(
            intArrayOf(0, 0, 0, 0),
            solution.dailyTemperatures(intArrayOf(50, 50, 50, 50))
        )
    }

    @Test fun `single element`() {
        assertContentEquals(intArrayOf(0), solution.dailyTemperatures(intArrayOf(42)))
    }

    @Test fun `two elements going up`() {
        assertContentEquals(intArrayOf(1, 0), solution.dailyTemperatures(intArrayOf(30, 31)))
    }

    @Test fun `two elements going down`() {
        assertContentEquals(intArrayOf(0, 0), solution.dailyTemperatures(intArrayOf(31, 30)))
    }
}
