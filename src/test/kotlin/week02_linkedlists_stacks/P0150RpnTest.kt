package week02_linkedlists_stacks

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class P0150RpnTest {
    private val solution = P0150Rpn()

    @Test fun `simple addition then multiplication`() {
        assertEquals(9, solution.evalRPN(arrayOf("2", "1", "+", "3", "*")))
    }

    @Test fun `addition and division truncation`() {
        assertEquals(6, solution.evalRPN(arrayOf("4", "13", "5", "/", "+")))
    }

    @Test fun `single number`() {
        assertEquals(42, solution.evalRPN(arrayOf("42")))
    }

    @Test fun `subtraction order matters`() {
        // "5 3 -" means 5 - 3 = 2
        assertEquals(2, solution.evalRPN(arrayOf("5", "3", "-")))
    }

    @Test fun `negative numbers in expression`() {
        // "-5" "3" "+" means -5 + 3 = -2
        assertEquals(-2, solution.evalRPN(arrayOf("-5", "3", "+")))
    }

    @Test fun `complex nested expression`() {
        // From LeetCode: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5 = 22
        val tokens = arrayOf(
            "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"
        )
        assertEquals(22, solution.evalRPN(tokens))
    }

    @Test fun `all operations`() {
        // ((3 + 4) * 2) / 7 = 2
        assertEquals(2, solution.evalRPN(arrayOf("3", "4", "+", "2", "*", "7", "/")))
    }
}
