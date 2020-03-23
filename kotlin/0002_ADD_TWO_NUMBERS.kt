/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var tmp1: ListNode? = l1
        var tmp2: ListNode? = l2
        var carry: Int = 0

        val ans = ListNode(-1)
        var tmpAns = ans

        while(tmp1 != null || tmp2 != null || carry > 0) {
            var cal = 0
            tmp1?.let {
                cal += it.`val`
                tmp1 = it.next
            }
            tmp2?.let {
                cal += it.`val`
                tmp2 = it.next
            }
            
            cal += carry
            if(cal >= 10) {
                carry = 1
                cal %= 10
            } else {
                carry = 0
            }

            tmpAns.next = ListNode(cal)
            tmpAns = tmpAns.next!!
        }


        return ans.next
    }
}