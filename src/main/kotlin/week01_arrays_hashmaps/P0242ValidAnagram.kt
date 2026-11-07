package week01_arrays_hashmaps

/*
 * Problem: 242. Valid Anagram (LeetCode)
 *
 * Given two strings `s` and `t`, return true if `t` is an anagram of `s`.
 */
class P0242ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {
        return s.toCharArray().sorted().toString() == t.toCharArray().sorted().toString()
    }
}
