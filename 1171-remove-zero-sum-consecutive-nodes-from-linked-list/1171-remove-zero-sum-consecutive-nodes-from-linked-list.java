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
public class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        int prefixSum = 0;
        Map<Integer, ListNode> map = new HashMap<>();
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        map.put(0, dummy);
        
        while (head != null) {
            prefixSum += head.val;
            
            if (map.containsKey(prefixSum)) {
                ListNode p = map.get(prefixSum);
                ListNode start = p;
                int pSum = prefixSum;
                
                while (start != head) {
                    start = start.next;
                    pSum += start.val;
                    if (start != head) {
                        map.remove(pSum);
                    }
                }
                
                p.next = start.next;
                
            } else {
                map.put(prefixSum, head);
            }
            
            head = head.next;
        }
        
        return dummy.next;
    }
}