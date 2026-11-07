package week01_arrays_hashmaps

import kotlin.math.max

/*
 * Problem: 3. Longest Substring Without Repeating Characters (LeetCode)
 *
 * Given a string `s`, find the length of the longest substring without
 * repeating characters.
 */

import kotlin.math.max

class P0003LongestSubstring {


    fun lengthOfLongestSubstring(s: String): Int {
        val charMap = HashMap<Char, Int>()
        var maxLength = 0
        var start = 0

        for (end in s.indices) {
            val currentChar = s[end]
            val prevIndex = charMap[currentChar]

            // If the character exists and is within the current window
            if (prevIndex != null && prevIndex >= start) {
                start = prevIndex + 1
            }

            charMap[currentChar] = end
            maxLength = kotlin.math.max(maxLength, end - start + 1) // Using inline package path instead of import
        }

        return maxLength
    }


}
