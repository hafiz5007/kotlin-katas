package week02_linkedlists_stacks

/*
 * Problem: 21. Merge Two Sorted Lists (LeetCode)
 *
 * Merge two sorted linked lists into one sorted list. Return the head.
 */
class P0021MergeTwoSorted {

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val dummy = ListNode(0)
        var previous :ListNode? = dummy



// 2. Initialize iterators for BOTH lists correctly
        var current1 = list1
        var current2 = list2


        while (current1 != null && current2 != null)
        {
            if(current1.`val` <= current2.`val`)
            {
                previous?.next = current1
                current1 = current1.
                next
            }

            else
            {
                previous?.next = current2
                current2 = current2.
                next
            }


            previous = previous?.
            next
        }


        if(current1 != null)
        {
            previous?.next = current1
        }
        else  if(current2 != null) {
            previous?.next = current2
        }


        return  dummy.
        next
    }
}
