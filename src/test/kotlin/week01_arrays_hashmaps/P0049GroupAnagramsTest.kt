package week01_arrays_hashmaps

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class P0049GroupAnagramsTest {
    private val solution = P0049GroupAnagrams()

    // Helper to compare groupings ignoring order within + across groups
    private fun groupsEqual(actual: List<List<String>>, expected: List<Set<String>>): Boolean {
        val actualSets = actual.map { it.toSet() }.toSet()
        val expectedSets = expected.toSet()
        return actualSets == expectedSets
    }

    @Test fun `classic group anagrams`() {
        val input = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
        val result = solution.groupAnagrams(input)
        val expected = listOf(
            setOf("eat", "tea", "ate"),
            setOf("tan", "nat"),
            setOf("bat")
        )
        assertTrue(groupsEqual(result, expected))
    }

    @Test fun `single empty string`() {
        val result = solution.groupAnagrams(arrayOf(""))
        assertEquals(listOf(listOf("")), result)
    }

    @Test fun `single character strings`() {
        val result = solution.groupAnagrams(arrayOf("a"))
        assertEquals(listOf(listOf("a")), result)
    }

    @Test fun `all anagrams`() {
        val input = arrayOf("abc", "bca", "cab")
        val result = solution.groupAnagrams(input)
        assertEquals(1, result.size)
        assertEquals(setOf("abc", "bca", "cab"), result[0].toSet())
    }

    @Test fun `no anagrams`() {
        val input = arrayOf("abc", "def", "ghi")
        val result = solution.groupAnagrams(input)
        assertEquals(3, result.size)
    }
}
