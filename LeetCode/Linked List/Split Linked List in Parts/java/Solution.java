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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result=new ListNode[k];
        ListNode curr=head;
        int size=0;
        while(curr!=null)
        {
            size++;
            curr=curr.next;
        } 
        int currsize=size/k;
        int rem=size%k;
        curr=head;
        for(int i=0;i<k;i++)
        {     int limit=currsize;
               ListNode temp=new ListNode(0);
               if(rem>0)
               {
                limit++;
                rem--;
               }
               ListNode dummy=temp;
               for(int j=0;j<limit;j++)
               {
                dummy.next=new ListNode(curr.val);
                curr=curr.next;
                dummy=dummy.next;
               }
               result[i]=temp.next;
        }
        return result;
    }
}