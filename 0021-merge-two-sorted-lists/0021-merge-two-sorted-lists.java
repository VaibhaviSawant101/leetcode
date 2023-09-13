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
 class Linkedlist
 {
     ListNode head;
     ListNode tail;
     int size;

     Linkedlist()
     {
         head = null;
         tail = null;
         size = 0;
     }

     void add(int a)
     {
         ListNode temp = new ListNode();
         temp.val = a;
         temp.next = null;

         if(size == 0)
         {
             head = temp;
             tail = head;
         }
         else
         {
             tail.next = temp;
             tail = temp;
         }
         size++;

     }
 }
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        Linkedlist ls = new Linkedlist();
        while((temp1 != null) && (temp2 != null))
        {
            int dig;
            if(temp1.val < temp2.val)
            {
                dig = temp1.val;
                temp1 = temp1.next;
            }
            else
            {
                dig = temp2.val;
                temp2 = temp2.next;
            }
            ls.add(dig);
        }
        while(temp1 != null)
        {
            ls.add(temp1.val);
            temp1 = temp1.next;
        }
        while(temp2 != null)
        {
            ls.add(temp2.val);
            temp2 = temp2.next;
        }

        return ls.head;
    }
}