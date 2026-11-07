package week02_linkedlists_stacks

import week02_linkedlists_stacks.P0232QueueFromStacks

/*
 * Problem: 232. Implement Queue using Stacks (LeetCode)
 *
 * Implement a FIFO queue using only two stacks. Support push, pop, peek, empty.
 */
class P0232QueueFromStacks {

        // Only one container allowed
        private val stack = mutableListOf<Int>()

        fun push(x: Int) {
            stack.add(x) // Pure Stack Push (O(1))
        }

        fun pop(): Int {
            return popBottomElement()
        }

        fun peek(): Int {
            return peekBottomElement()
        }

        fun empty(): Boolean {
            return stack.isEmpty()
        }

        // Recursive helper to safely peel back layers, grab the bottom element,
        // and put everything else back exactly how it was.
        private fun popBottomElement(): Int {
            val top = stack.removeAt(stack.size - 1) // Pure Stack Pop

            if (stack.isEmpty()) {
                return top // This was the bottom element (the first item pushed)!
            }

            val bottom = popBottomElement() // Recurse deeper
            stack.add(top) // Put the item back onto the stack on the way up
            return bottom
        }

        // Same logic as pop, but puts the bottom element back too
        private fun peekBottomElement(): Int {
            val top = stack.removeAt(stack.size - 1)

            if (stack.isEmpty()) {
                stack.add(top) // Put it back before returning
                return top
            }

            val bottom = peekBottomElement()
            stack.add(top)
            return bottom
        }



}



/**
 * Your MyQueue object will be instantiated and called as such:
 * var obj = MyQueue()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */

fun main() {


    val myQueue = P0232QueueFromStacks()
    println( myQueue.push(1)) // queue is: [1]
    println(myQueue.push(2)) // queue is: [1, 2] (leftmost is front of the queue)
    println(myQueue.peek()) // return 1
    println(myQueue.pop()) // return 1, queue is [2]
    println(myQueue.empty()) // return false

}

