package week03_trees_graphs

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class P0200NumberOfIslandsTest {
    private val solution = P0200NumberOfIslands()

    @Test fun `single island`() {
        val grid = arrayOf(
            charArrayOf('1', '1', '1', '1', '0'),
            charArrayOf('1', '1', '0', '1', '0'),
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('0', '0', '0', '0', '0')
        )
        assertEquals(1, solution.numIslands(grid))
    }

    @Test fun `three islands`() {
        val grid = arrayOf(
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('0', '0', '1', '0', '0'),
            charArrayOf('0', '0', '0', '1', '1')
        )
        assertEquals(3, solution.numIslands(grid))
    }

    @Test fun `no land`() {
        val grid = arrayOf(
            charArrayOf('0', '0'),
            charArrayOf('0', '0')
        )
        assertEquals(0, solution.numIslands(grid))
    }

    @Test fun `all land is one island`() {
        val grid = arrayOf(
            charArrayOf('1', '1'),
            charArrayOf('1', '1')
        )
        assertEquals(1, solution.numIslands(grid))
    }

    @Test fun `single cell island`() {
        val grid = arrayOf(charArrayOf('1'))
        assertEquals(1, solution.numIslands(grid))
    }

    @Test fun `single cell water`() {
        val grid = arrayOf(charArrayOf('0'))
        assertEquals(0, solution.numIslands(grid))
    }

    @Test fun `diagonal does not connect`() {
        // Should NOT be connected (diagonals don't count)
        val grid = arrayOf(
            charArrayOf('1', '0'),
            charArrayOf('0', '1')
        )
        assertEquals(2, solution.numIslands(grid))
    }

    @Test fun `empty grid`() {
        assertEquals(0, solution.numIslands(emptyArray()))
    }
}
