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
    public int GCD(int n1, int n2)
    {
        int div = n1;
        int dis = n2;
        while(dis != 0)
        {
            int temp = div;
            div = dis;
            dis = temp%dis;
        }
        return div;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode first = head;
        while(first.next != null)
        {
            int n1 = first.val;
            int n2 = (first.next).val;
            int v = GCD(n1, n2);
            System.out.println(v);
            ListNode temp = new ListNode();
            temp.val = v;
            temp.next = first.next;
            first.next = temp;
            first = first.next.next;
        }
        return head;
    }
}