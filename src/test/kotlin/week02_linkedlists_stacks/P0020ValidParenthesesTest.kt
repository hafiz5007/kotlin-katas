package week02_linkedlists_stacks

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class P0020ValidParenthesesTest {
    private val solution = P0020ValidParentheses()

    @Test fun `nested mixed valid`() {
        assertTrue(solution.isValid("{[()]}"))
    }

    @Test fun `crossed invalid`() {
        assertFalse(solution.isValid("([)]"))
    }

    @Test fun `only openers invalid`() {
        assertFalse(solution.isValid("((("))
    }

    @Test fun `only closers invalid`() {
        assertFalse(solution.isValid(")))"))
    }

    @Test fun `empty is valid`() {
        assertTrue(solution.isValid(""))
    }

    @Test fun `simple pair`() {
        assertTrue(solution.isValid("()"))
    }

    @Test fun `two pairs side by side`() {
        assertTrue(solution.isValid("()[]{}"))
    }

    @Test fun `unbalanced closer first`() {
        assertFalse(solution.isValid("()}"))
    }

    @Test fun `nested same type`() {
        assertTrue(solution.isValid("((()))"))
    }
}
