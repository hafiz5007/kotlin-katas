package week04_recursion_dp

/*
 * Problem: 1143. Longest Common Subsequence (LeetCode)
 *
 * Given two strings `text1` and `text2`, return the LENGTH of their
 * longest common subsequence. If there is no common subsequence, return 0.
 *
 * A subsequence of a string is a new string generated from the original
 * string with some characters (can be none) deleted, without changing
 * the relative order of the remaining characters.
 *
 *   text1 = "abcde", text2 = "ace"   -> 3 ("ace")
 *   text1 = "abc",   text2 = "abc"    -> 3 ("abc")
 *   text1 = "abc",   text2 = "def"    -> 0 (none)
 *
 * Classic 2D DP:
 *   dp[i][j] = LCS length of text1[0..i] and text2[0..j]
 *
 *   If text1[i] == text2[j]:  dp[i][j] = dp[i-1][j-1] + 1
 *   Else:                      dp[i][j] = max(dp[i-1][j], dp[i][j-1])
 */
class P1143LongestCommonSubsequence {
    fun longestCommonSubsequence(text1: String, text2: String): Int {
        TODO("Your solution here")
    }
}
