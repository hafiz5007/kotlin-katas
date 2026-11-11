package week04_recursion_dp

/*
 * Problem: 198. House Robber (LeetCode)
 *
 * You are a professional robber planning to rob houses along a street.
 * Each house has a stashed amount of money in it.
 *
 * The only constraint stopping you: adjacent houses have connected security
 * systems — robbing TWO adjacent houses on the same night triggers the alarm.
 *
 * Given an integer array `nums` representing the amount of money at each
 * house, return the MAXIMUM amount you can rob tonight without alerting
 * the police.
 *
 *   nums = [1, 2, 3, 1]     -> 4 (rob 1 + 3)
 *   nums = [2, 7, 9, 3, 1]  -> 12 (rob 2 + 9 + 1)
 *
 * 1D DP with choice at each step:
 *   dp[i] = max(dp[i-1], dp[i-2] + nums[i])
 *   "skip this house" vs "rob this house + best from 2 ago"
 */
class P0198HouseRobber {
    fun rob(nums: IntArray): Int {
        TODO("Your solution here")
    }
}
