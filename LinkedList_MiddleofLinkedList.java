/**
https://leetcode.com/problems/middle-of-the-linked-list/description/
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.
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
    public ListNode middleNode(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp = head; int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        int req = count/2;
        ListNode ans=head; int x=1;
        while(x<req)
        {
            ans=ans.next;
            x++;
        }
        return ans.next;
    }
}
