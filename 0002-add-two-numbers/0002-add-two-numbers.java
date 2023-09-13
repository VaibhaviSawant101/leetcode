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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0;
        ListNode head = new ListNode(0);
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode p3 = head;

        while(p1 != null || p2 != null || c != 0)
        {
            int ans = 0;
            if(p1 != null)
            {
                ans += p1.val;
                p1 = p1.next;
            }
            if(p2 != null)
            {
                ans += p2.val;
                p2 = p2.next;
            }
            if(c != 0)
            {
                ans += c;
            }
            c = ans/10;
            ans = ans%10;
            p3.next = new ListNode(ans);
            p3 = p3.next;
        }
        return head.next;
    }
}