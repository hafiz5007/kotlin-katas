package week04_recursion_dp

/*
 * Problem: 300. Longest Increasing Subsequence (LeetCode)
 *
 * Given an integer array `nums`, return the LENGTH of the longest STRICTLY
 * INCREASING subsequence.
 *
 *   nums = [10, 9, 2, 5, 3, 7, 101, 18]  -> 4 ([2, 3, 7, 101])
 *   nums = [0, 1, 0, 3, 2, 3]            -> 4 ([0, 1, 2, 3])
 *   nums = [7, 7, 7, 7, 7, 7, 7]         -> 1 (strictly increasing, so just one 7)
 *
 * 1D DP approach:
 *   dp[i] = length of LIS ending at index i
 *   dp[i] = max(dp[j]) + 1 for all j < i where nums[j] < nums[i]
 *   Answer = max of all dp[i]
 *
 * Time: O(n²) with DP. O(n log n) possible with binary search (patience sort).
 */
class P0300LongestIncreasingSubsequence {
    fun lengthOfLIS(nums: IntArray): Int {
        TODO("Your solution here")
    }
}
