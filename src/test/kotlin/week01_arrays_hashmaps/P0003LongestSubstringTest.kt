package week01_arrays_hashmaps

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class P0003LongestSubstringTest {
    private val solution = P0003LongestSubstring()

    @Test fun `classic example`() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"))
    }

    @Test fun `all same character`() {
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"))
    }

    @Test fun `mixed with window shift`() {
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"))
    }

    @Test fun `empty string`() {
        assertEquals(0, solution.lengthOfLongestSubstring(""))
    }

    @Test fun `single character`() {
        assertEquals(1, solution.lengthOfLongestSubstring("a"))
    }

    @Test fun `all distinct characters`() {
        assertEquals(7, solution.lengthOfLongestSubstring("abcdefg"))
    }

//    @Test fun `with spaces`() {
//        assertEquals(3, solution.lengthOfLongestSubstring("abac"))
//    }

    @Test fun `with symbols`() {
        assertEquals(6, solution.lengthOfLongestSubstring("!@#\$%^"))
    }
}
