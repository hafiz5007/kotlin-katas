package week02_linkedlists_stacks

/*
 * Problem: 206. Reverse Linked List (LeetCode)
 *
 * Given the head of a singly linked list, reverse the list and return
 * the new head.
 */
class P0206ReverseLinkedList {

    fun reverseList(head: ListNode?): ListNode? {


        if(head == null || head.next == null) {
            return head
        }


        var previous: ListNode? =
            null
        var current = head


        while (current !=  null)
        {
            val  nextNode = current.
            next
            current.next = previous
            previous = current
            current = nextNode
        }


        return  previous;
    }
}
