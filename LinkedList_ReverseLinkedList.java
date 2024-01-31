/** Given the head of a singly linked list, reverse the list, and return the reversed list.

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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev=null;
        ListNode first=head;
        ListNode second=first.next;
        while(second!=null)
        {
            ListNode temp = second.next;
            second.next=first;
            first.next=prev;
            prev=first;
            first=second;
            second=temp;
        }
        return first;
    }
}
