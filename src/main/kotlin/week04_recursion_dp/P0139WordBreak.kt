package week04_recursion_dp

/*
 * Problem: 139. Word Break (LeetCode)
 *
 * Given a string `s` and a dictionary of strings `wordDict`, return true
 * if `s` can be segmented into a space-separated sequence of one or more
 * dictionary words.
 *
 * Note: the same word in the dictionary may be reused multiple times.
 *
 *   s = "leetcode",  wordDict = ["leet", "code"]            -> true
 *   s = "applepenapple", wordDict = ["apple", "pen"]        -> true
 *   s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"] -> false
 *
 * 1D DP + hash set:
 *   dp[i] = can s[0..i-1] be segmented?
 *   dp[0] = true (empty string)
 *   dp[i] = OR over j < i: dp[j] && s[j..i-1] is in dictionary
 */
class P0139WordBreak {
    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        TODO("Your solution here")
    }
}
