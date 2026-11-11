package week04_recursion_dp

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class P0198HouseRobberTest {
    private val solution = P0198HouseRobber()

    @Test fun `classic example 1`() {
        // rob house 0 (1) + house 2 (3) = 4
        assertEquals(4, solution.rob(intArrayOf(1, 2, 3, 1)))
    }

    @Test fun `classic example 2`() {
        // rob house 0 (2) + house 2 (9) + house 4 (1) = 12
        assertEquals(12, solution.rob(intArrayOf(2, 7, 9, 3, 1)))
    }

    @Test fun `empty array returns 0`() {
        assertEquals(0, solution.rob(intArrayOf()))
    }

    @Test fun `single house`() {
        assertEquals(5, solution.rob(intArrayOf(5)))
    }

    @Test fun `two houses pick max`() {
        assertEquals(7, solution.rob(intArrayOf(3, 7)))
        assertEquals(10, solution.rob(intArrayOf(10, 5)))
    }

    @Test fun `all same value even length`() {
        // [5, 5, 5, 5] -> rob 1st + 3rd (or 2nd + 4th) = 10
        assertEquals(10, solution.rob(intArrayOf(5, 5, 5, 5)))
    }

    @Test fun `all same value odd length`() {
        // [5, 5, 5] -> rob 1st + 3rd = 10
        assertEquals(10, solution.rob(intArrayOf(5, 5, 5)))
    }

    @Test fun `alternating big small`() {
        // [100, 1, 100, 1, 100] -> 300
        assertEquals(300, solution.rob(intArrayOf(100, 1, 100, 1, 100)))
    }

    @Test fun `must skip to hit big value`() {
        // [2, 1, 1, 2] -> 4 (rob first + last)
        assertEquals(4, solution.rob(intArrayOf(2, 1, 1, 2)))
    }
}
