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
    public int sizeList(ListNode head)
    {
        int size = 0;
        ListNode temp = head;
        while(temp != null)
        {
            size++;
            temp = temp.next;
        }
        return size;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = sizeList(head);
        int index = size-n;
        ListNode temp = head;
        if(index == 0)
        {
            return head.next;
        }
        for(int i = 0; i < index-1; i++)
        {
            temp = temp.next;
        }
        if(index == size-1)
        {
            temp.next = null;
        }
        else
        {
            temp.next = temp.next.next;
        }
        return head;
    }
}