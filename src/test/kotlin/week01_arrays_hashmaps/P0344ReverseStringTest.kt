package week01_arrays_hashmaps

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class P0344ReverseStringTest {
    private val solution = P0344ReverseString()

    @Test fun `happy path odd length`() {
        val s = charArrayOf('h', 'e', 'l', 'l', 'o')
        solution.reverseString(s)
        assertContentEquals(charArrayOf('o', 'l', 'l', 'e', 'h'), s)
    }

    @Test fun `even length`() {
        val s = charArrayOf('H', 'a', 'n', 'n', 'a', 'h')
        solution.reverseString(s)
        assertContentEquals(charArrayOf('h', 'a', 'n', 'n', 'a', 'H'), s)
    }

    @Test fun `single character`() {
        val s = charArrayOf('A')
        solution.reverseString(s)
        assertContentEquals(charArrayOf('A'), s)
    }

    @Test fun `empty array`() {
        val s = charArrayOf()
        solution.reverseString(s)
        assertContentEquals(charArrayOf(), s)
    }

    @Test fun `two characters`() {
        val s = charArrayOf('a', 'b')
        solution.reverseString(s)
        assertContentEquals(charArrayOf('b', 'a'), s)
    }
}
