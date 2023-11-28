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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode head=null;
        ListNode ptr=null;
        
        while(list1 !=null && list2 !=null)
        {
             ListNode node;
            if(list1.val<= list2.val)
            {
                node=new ListNode(list1.val);
                list1=list1.next;
            }
            else
            {
                node=new ListNode(list2.val);
                list2=list2.next;
            }
            
            if(head==null)
            {
                head=node;
                ptr=head;
                
            }
            else
            {
                ptr.next=node;
                ptr=ptr.next;
            }
        }
        
        while(list1 != null)
        {
              ListNode node=new ListNode(list1.val);
              list1=list1.next;
                   
            if(head==null)
            {
                head=node;
                ptr=head;
                
            }
            else
            {
                ptr.next=node;
                ptr=ptr.next;
            }
            
        }
        
        while(list2 !=null)
        {
              ListNode node=new ListNode(list2.val);
              list2=list2.next;
                   
            if(head==null)
            {
                head=node;
                ptr=head;
                
            }
            else
            {
                ptr.next=node;
                ptr=ptr.next;
            }
            
        }
    
        return head;
    }
    
    
}