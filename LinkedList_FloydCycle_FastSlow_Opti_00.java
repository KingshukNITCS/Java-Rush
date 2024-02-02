/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = head;
        while(fast.next!=null)
        {
             slow=slow.next;
             fast=fast.next.next;
             if(fast==null) break;
             if(fast==slow) break;
        }
        if(fast==null) return null;
        if(fast.next==null) return null;
        while(fast!=temp)
        {
            fast=fast.next;
            temp=temp.next;
        }
        return temp;
    }
               }
