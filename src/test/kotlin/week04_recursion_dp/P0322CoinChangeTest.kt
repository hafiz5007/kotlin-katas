package week04_recursion_dp

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class P0322CoinChangeTest {
    private val solution = P0322CoinChange()

    @Test fun `classic example`() {
        // 11 = 5 + 5 + 1 (3 coins)
        assertEquals(3, solution.coinChange(intArrayOf(1, 2, 5), 11))
    }

    @Test fun `impossible amount`() {
        // [2] cannot make 3
        assertEquals(-1, solution.coinChange(intArrayOf(2), 3))
    }

    @Test fun `zero amount returns 0`() {
        assertEquals(0, solution.coinChange(intArrayOf(1), 0))
    }

    @Test fun `single coin fits exactly`() {
        assertEquals(1, solution.coinChange(intArrayOf(5), 5))
    }

    @Test fun `many coins same amount`() {
        // 10 with [1, 5, 10] -> 1 coin
        assertEquals(1, solution.coinChange(intArrayOf(1, 5, 10), 10))
    }

    @Test fun `greedy fails test case`() {
        // [1, 3, 4, 5] for 7: greedy would pick 5 + 1 + 1 (3 coins)
        // Optimal: 3 + 4 (2 coins) — DP finds this, greedy doesn't
        assertEquals(2, solution.coinChange(intArrayOf(1, 3, 4, 5), 7))
    }

    @Test fun `only one coin denomination`() {
        assertEquals(10, solution.coinChange(intArrayOf(1), 10))
    }

    @Test fun `amount of 1 with coin 1`() {
        assertEquals(1, solution.coinChange(intArrayOf(1), 1))
    }

    @Test fun `larger example`() {
        // 100 with [1, 5, 10, 25] (US coins) -> 4 (25 * 4)
        assertEquals(4, solution.coinChange(intArrayOf(1, 5, 10, 25), 100))
    }

    @Test fun `impossible with gaps`() {
        // [3, 5] cannot make 1 or 2 or 4 or 7
        assertEquals(-1, solution.coinChange(intArrayOf(3, 5), 7))
    }
}
