package week04_recursion_dp

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class P0070ClimbingStairsTest {
    private val solution = P0070ClimbingStairs()

    @Test fun `n equals 1 returns 1`() {
        assertEquals(1, solution.climbStairs(1))
    }

    @Test fun `n equals 2 returns 2`() {
        assertEquals(2, solution.climbStairs(2))
    }

    @Test fun `n equals 3 returns 3`() {
        assertEquals(3, solution.climbStairs(3))
    }

    @Test fun `n equals 4 returns 5`() {
        assertEquals(5, solution.climbStairs(4))
    }

    @Test fun `n equals 5 returns 8`() {
        assertEquals(8, solution.climbStairs(5))
    }

    @Test fun `n equals 10 returns 89`() {
        assertEquals(89, solution.climbStairs(10))
    }

    @Test fun `n equals 20 returns 10946`() {
        assertEquals(10946, solution.climbStairs(20))
    }

    @Test fun `n equals 45 returns 1836311903`() {
        // Max practical n for Int return (Fibonacci fits in Int up to ~46)
        assertEquals(1836311903, solution.climbStairs(45))
    }
}
