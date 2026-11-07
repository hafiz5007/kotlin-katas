package week01_arrays_hashmaps

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class P0242ValidAnagramTest {
    private val solution = P0242ValidAnagram()

    @Test fun `classic anagram`() {
        assertTrue(solution.isAnagram("anagram", "nagaram"))
    }

    @Test fun `not an anagram`() {
        assertFalse(solution.isAnagram("rat", "car"))
    }

    @Test fun `different lengths`() {
        assertFalse(solution.isAnagram("abc", "abcd"))
    }

    @Test fun `both empty`() {
        assertTrue(solution.isAnagram("", ""))
    }

    @Test fun `single char match`() {
        assertTrue(solution.isAnagram("a", "a"))
    }

    @Test fun `single char no match`() {
        assertFalse(solution.isAnagram("a", "b"))
    }

    @Test fun `repeating characters`() {
        assertTrue(solution.isAnagram("aacc", "ccaa"))
    }

    @Test fun `listen silent`() {
        assertTrue(solution.isAnagram("listen", "silent"))
    }
}
