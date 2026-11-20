package week03_trees_graphs

/*
 * Problem: 200. Number of Islands (LeetCode)
 *
 * Given a 2D grid of '1's (land) and '0's (water), return the number
 * of islands.
 *
 * An island is surrounded by water and is formed by connecting adjacent
 * lands HORIZONTALLY or VERTICALLY (not diagonally). You may assume all
 * four edges of the grid are surrounded by water.
 *
 *   Input:
 *     1 1 1 1 0
 *     1 1 0 1 0
 *     1 1 0 0 0
 *     0 0 0 0 0
 *   Output: 1
 *
 *   Input:
 *     1 1 0 0 0
 *     1 1 0 0 0
 *     0 0 1 0 0
 *     0 0 0 1 1
 *   Output: 3
 */
class P0200NumberOfIslands {
    fun numIslands(grid: Array<CharArray>): Int {
        if (grid.isEmpty()) return 0

        val rows = grid.size
        val cols = grid[0].size
        var islands = 0

        fun dfs(r: Int, c: Int) {
            // Stop if out of bounds or at water ('0')
            if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == '0') {
                return
            }

            // Sink the current land cell so it isn't counted again
            grid[r][c] = '0'

            // Visit all 4 adjacent neighbours
            dfs(r + 1, c)
            dfs(r - 1, c)
            dfs(r, c + 1)
            dfs(r, c - 1)
        }

        for (r in 0 until rows) {
            for (c in 0 until cols) {
                if (grid[r][c] == '1') {
                    islands++
                    dfs(r, c)
                }
            }
        }

        return islands
    }
}
