package week02_linkedlists_stacks

/*
 * Problem: 150. Evaluate Reverse Polish Notation (LeetCode)
 *
 * Evaluate an arithmetic expression in Reverse Polish Notation.
 * Valid operators: +, -, *, /. Division truncates toward zero.
 */
class P0150Rpn {
    fun evalRPN(tokens: Array<String>): Int {

        if(tokens.isEmpty())
            return  0
        else if(tokens.size ==1)
        {
            return tokens[0].toIntOrNull()?:0
        }

        var result = 0
        var checkDeque = ArrayDeque<String>()
        var operators = setOf("+", "-", "*",  "/")


        for (i in tokens.indices)
        {
            if(operators.contains(tokens[i]))
            {
                var firstItem = (checkDeque.removeFirstOrNull()?.toIntOrNull() ?: 0)
                var secondItem = (checkDeque.removeFirstOrNull()?.toIntOrNull() ?: 0)

                result =  when(tokens[i]) {
                    "+" -> secondItem + firstItem
                    "-" ->  secondItem - firstItem
                    "*" -> secondItem * firstItem
                    "/" ->  secondItem / firstItem
                    else -> throw IllegalArgumentException("Unknown operator")

                }

                checkDeque.addFirst(result.toString())
            }

            else
            {
                checkDeque.addFirst(tokens[i])
            }


        }


        return  result;


    }
}
