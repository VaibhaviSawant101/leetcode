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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode prev = new ListNode();
        prev.next = head;
        ListNode slw = head;
        ListNode frw = head.next;
        int count = 0;
        while(frw != null)
        {
            if(slw.val != frw.val)
            {
                frw = frw.next;
                slw = slw.next;
                prev = prev.next;
            }
            else
            {
                while(frw != null && slw.val == frw.val)
                {
                    if(head == slw)
                    {
                        head = head.next;
                    }
                    frw = frw.next;
                    slw = slw.next;
                    count++;
                }
                if(count > 0)
                {
                    if(head == slw)
                    {
                        head = head.next;
                    }
                    prev.next = frw;
                    slw = slw.next;
                    if(frw != null)
                    {
                        frw = frw.next;
                    }
                    count = 0;
                }
            }    
        }
        return head;
    }
}