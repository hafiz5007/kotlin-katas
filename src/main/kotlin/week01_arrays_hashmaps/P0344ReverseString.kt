package week01_arrays_hashmaps

/*
 * Problem: 344. Reverse String (LeetCode)
 *
 * Reverse the character array `s` in-place with O(1) extra memory.
 */
class P0344ReverseString {
    fun reverseString(s: CharArray): CharArray {

        var left = 0
        var right = s.size - 1

        while (left< right)
        {
            val temp = s[left]
            s[left] = s[right]
            s[right] = temp

            left++
            right--
        }

        return  s
    }
}
