package week02_linkedlists_stacks

/*
 * Shared ListNode class used by all linked-list problems in Week 2.
 *
 * A singly linked list node. Each node holds a value and a pointer to
 * the next node (or null if this is the tail).
 *
 * Helpers at the bottom make it easy to build and inspect lists in tests.
 */
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

/** Build a linked list from varargs — convenient for tests. */
fun listOfNodes(vararg values: Int): ListNode? {
    if (values.isEmpty()) return null
    val head = ListNode(values[0])
    var tail = head
    for (i in 1..values.lastIndex) {
        tail.next = ListNode(values[i])
        tail = tail.next!!
    }
    return head
}

/** Convert a linked list to a Kotlin List<Int> — convenient for test assertions. */
fun ListNode?.toValueList(): List<Int> {
    val out = mutableListOf<Int>()
    var curr = this
    while (curr != null) {
        out.add(curr.`val`)
        curr = curr.next
    }
    return out
}
