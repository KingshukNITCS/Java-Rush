/** https://leetcode.com/problems/linked-list-cycle-ii/description/
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
        HashMap<ListNode,Integer> hm = new HashMap<>();
        ListNode temp = head; int i=0;
        while(temp!=null)
        {
            if(hm.containsKey(temp)) 
            {

                return temp;
            }
            else
            {
                hm.put(temp,i); i++;
            }
            temp=temp.next;
        }
        return null;
    }
}
