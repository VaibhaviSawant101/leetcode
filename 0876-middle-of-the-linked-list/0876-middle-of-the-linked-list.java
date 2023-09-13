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
    public int length(ListNode head)
    {
        ListNode temp = head;
        int len = 0;
        while(temp != null)
        {
            len++;
            temp = temp.next;
        }
        return len;
    }
    
    public ListNode middleNode(ListNode head) {
        int mid = length(head);
        mid = mid/2;
        ListNode temp = head;
        for(int i  = 0; i < mid; i++)
        {
            temp = temp.next;
        }
        return temp;
    }
}