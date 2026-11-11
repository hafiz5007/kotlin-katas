package week04_recursion_dp

/*
 * Problem: 72. Edit Distance (LeetCode) — HARD
 *
 * Given two strings `word1` and `word2`, return the MINIMUM number of
 * operations required to convert `word1` to `word2`.
 *
 * You have the following three operations permitted on a word:
 *   - Insert a character
 *   - Delete a character
 *   - Replace a character
 *
 *   word1 = "horse", word2 = "ros"       -> 3
 *   word1 = "intention", word2 = "execution" -> 5
 *   word1 = "", word2 = "abc"             -> 3 (insert all)
 *
 * Classic 2D DP (Levenshtein distance):
 *   dp[i][j] = edit distance between word1[0..i-1] and word2[0..j-1]
 *
 *   If word1[i-1] == word2[j-1]:  dp[i][j] = dp[i-1][j-1]
 *   Else:                          dp[i][j] = 1 + min(
 *                                      dp[i-1][j],    // delete
 *                                      dp[i][j-1],    // insert
 *                                      dp[i-1][j-1]   // replace
 *                                  )
 */
class P0072EditDistance {
    fun minDistance(word1: String, word2: String): Int {
        TODO("Your solution here")
    }
}
