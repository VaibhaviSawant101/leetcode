/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode slw = new ListNode();
        slw.next = head;
        ListNode temp = head;
        if(head == null)
        return head;
        while(temp != null)
        {
            if(temp.val == val)
            {
                head = head.next;
                temp = temp.next;
                slw = slw.next;
            }
            else
            {
                break;
            }
        }
        while(temp != null)
        {
            if(temp.val != val)
            {
                slw = slw.next;
            }
            else
            {
                slw.next = temp.next;
            }
            temp = temp.next;
        }
        return head;

    }
}