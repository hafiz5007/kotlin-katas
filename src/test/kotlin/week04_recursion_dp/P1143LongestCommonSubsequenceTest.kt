package week04_recursion_dp

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class P1143LongestCommonSubsequenceTest {
    private val solution = P1143LongestCommonSubsequence()

    @Test fun `classic example abcde ace`() {
        assertEquals(3, solution.longestCommonSubsequence("abcde", "ace"))
    }

    @Test fun `identical strings`() {
        assertEquals(3, solution.longestCommonSubsequence("abc", "abc"))
    }

    @Test fun `no common characters`() {
        assertEquals(0, solution.longestCommonSubsequence("abc", "def"))
    }

    @Test fun `both empty`() {
        assertEquals(0, solution.longestCommonSubsequence("", ""))
    }

    @Test fun `one empty`() {
        assertEquals(0, solution.longestCommonSubsequence("abc", ""))
        assertEquals(0, solution.longestCommonSubsequence("", "abc"))
    }

    @Test fun `single character match`() {
        assertEquals(1, solution.longestCommonSubsequence("a", "a"))
    }

    @Test fun `single character no match`() {
        assertEquals(0, solution.longestCommonSubsequence("a", "b"))
    }

    @Test fun `interleaved common characters`() {
        // "abcdef" ∩ "zazbzczdzezfz" = "abcdef" (6)
        assertEquals(6, solution.longestCommonSubsequence("abcdef", "zazbzczdzezfz"))
    }

    @Test fun `all same character`() {
        // "aaaa" vs "aaa" -> 3
        assertEquals(3, solution.longestCommonSubsequence("aaaa", "aaa"))
    }
}
