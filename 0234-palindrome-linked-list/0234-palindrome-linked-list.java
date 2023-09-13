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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i;
        int j;
        while(head != null)
        {
            arr.add(head.val);
            head = head.next;
        }
        i = 0;
        j = arr.size()-1;
        while(i <= j)
        {
            if(arr.get(i) != arr.get(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}