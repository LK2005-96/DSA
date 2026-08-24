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
    public ListNode reverseList(ListNode head) {
        ListNode curr = reverse(head);
        return curr;
    }
    public ListNode reverse(ListNode curr)
    {
        ListNode temp = curr;
        ListNode prev = null;
        ListNode nexts = null;
        while(temp!=null)
        {
            nexts = temp.next;
            temp.next = prev;
            prev  = temp;
            temp = nexts;
        }
        return prev;
    }
}