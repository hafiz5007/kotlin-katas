package week04_recursion_dp

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class P0139WordBreakTest {
    private val solution = P0139WordBreak()

    @Test fun `leetcode classic positive`() {
        assertTrue(solution.wordBreak("leetcode", listOf("leet", "code")))
    }

    @Test fun `apple pen apple reuses words`() {
        assertTrue(solution.wordBreak("applepenapple", listOf("apple", "pen")))
    }

    @Test fun `classic negative example`() {
        assertFalse(solution.wordBreak("catsandog", listOf("cats", "dog", "sand", "and", "cat")))
    }

    @Test fun `empty dictionary cannot match non-empty string`() {
        assertFalse(solution.wordBreak("abc", emptyList()))
    }

    @Test fun `single character in dictionary`() {
        assertTrue(solution.wordBreak("a", listOf("a")))
    }

    @Test fun `single character not in dictionary`() {
        assertFalse(solution.wordBreak("a", listOf("b")))
    }

    @Test fun `word exactly matches a dictionary word`() {
        assertTrue(solution.wordBreak("hello", listOf("hello")))
    }

    @Test fun `greedy fails but DP succeeds`() {
        // "aaaaaaa" with ["aaaa", "aaa"] — greedy might pick 4+4 and fail
        // Actually 3+4 = 7 works
        assertTrue(solution.wordBreak("aaaaaaa", listOf("aaaa", "aaa")))
    }

    @Test fun `long impossible case`() {
        // All 'a' with only 'b' in dict
        assertFalse(solution.wordBreak("aaaaa", listOf("b")))
    }
}
