package week02_linkedlists_stacks

/*
 * Problem: 20. Valid Parentheses (LeetCode)
 *
 * Given a string containing '(', ')', '{', '}', '[', ']', determine if
 * the input string is valid (properly nested and matched).
 */
class P0020ValidParentheses {
    fun isValid(s: String): Boolean {

        var mapBrackets =  mapOf( ')' to '(',  '}' to '{', ']' to '[')
        var stack = ArrayDeque<Char>()

        for (i in s.indices)
        {
            if ( mapBrackets.containsKey(s[i]) && stack.lastOrNull() == mapBrackets[s[i]])
            {
                stack.removeLastOrNull()
            }
            else
            {
                stack.add(s[i])
            }
        }

        if(stack.isNullOrEmpty())
        {
            return true
        }
        else
        {
            return false
        }

    }
}
