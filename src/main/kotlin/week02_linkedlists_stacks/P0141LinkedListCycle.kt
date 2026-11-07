package week02_linkedlists_stacks

/*
 * Problem: 141. Linked List Cycle (LeetCode)
 *
 * Given the head of a linked list, determine if it has a cycle.
 */
class P0141LinkedListCycle {


    fun hasCycle(head: ListNode?): Boolean {

        if(head == null || head.next == null)
            return false

        var checkCycleHashMap = hashSetOf<ListNode>() // first one value , second one position

        var startNode : ListNode? = null
        startNode = head

        while (startNode != null)
            {
            if(checkCycleHashMap.contains(startNode))
            {
                return  true
            }
            else
            {
                checkCycleHashMap.add(startNode)
                startNode = startNode.next
            }
        }

        return false

    }
}



// 2. Helper function to create a linked list with a cycle
fun createLinkedListWithCycle(values: IntArray, pos: Int): ListNode? {
    if (values.isEmpty()) return null

    val head = ListNode(values[0])
    var current = head
    var cycleNode: ListNode? = if (pos == 0) head else null

    // Build the list and keep track of the node at index 'pos'
    for (i in 1 until values.size) {
        val newNode = ListNode(values[i])
        current.next = newNode
        current = newNode

        if (i == pos) {
            cycleNode = newNode
        }
    }

    // Connect the tail to the cycle node if pos is valid
    if (pos >= 0 && cycleNode != null) {
        current.next = cycleNode
    }

    return head
}

fun main() {
    val headArray = intArrayOf(3, 2, 0, -4)
    val pos = 1

    val testHead = createLinkedListWithCycle(headArray, pos)

    printListSafely(testHead)

    var result = P0141LinkedListCycle().hasCycle(testHead)

    println(result)

}


// Safe helper function to print the list starting from a given node
fun printListSafely(head: ListNode?) {
    val visited = HashSet<ListNode>()
    var current = head
    val result = mutableListOf<String>()

    while (current != null) {
        // If we see the node again, we found the loop start
        if (visited.contains(current)) {
            result.add("LOOP_BACK_TO(${current.`val`})")
            break
        }

        visited.add(current)
        result.add("${current.`val`}")
        current = current.next
    }

    if (current == null) {
        result.add("null")
    }

    println(result.joinToString(" -> "))
}
