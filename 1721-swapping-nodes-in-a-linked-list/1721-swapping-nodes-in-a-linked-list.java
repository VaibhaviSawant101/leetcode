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
    public int size(ListNode head)
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
    public ListNode swapNodes(ListNode head, int k) {
        int len = size(head);
        int ind1 = k;
        int ind2 = len - k + 1;
        int max = ind1 > ind2? ind1: ind2;
        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode();
        ListNode temp = head;
        for(int i = 1; i <= max; i++)
        {
            if(i == ind1)
            {
                node1 = temp;
            }
            if(i == ind2)
            {
                node2 = temp;
            }
            temp = temp.next;
        }
        System.out.println(node1.val);
        System.out.println(node2.val);
        int a = node1.val;
        node1.val = node2.val;
        node2.val = a;
        return head;
    }
}