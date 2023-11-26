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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp=head;
        ListNode current=head;
        ListNode prev=null;
        
        while(n >=1 && temp !=null)
        {
            temp=temp.next;
            n--;
        }
       
        while(temp!=null)
        {
            prev=current;
            current=current.next;
            temp=temp.next;
            
        }
         if(prev==null)
        {
            head=current.next;
            return head;
        }
        
        prev.next=current.next;
        current.next=null;
        
        return head;
    }
}