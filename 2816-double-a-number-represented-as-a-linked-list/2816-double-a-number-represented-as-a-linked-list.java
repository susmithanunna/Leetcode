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
    public ListNode doubleIt(ListNode head) {
        // int carry=multiply(head);
        // if(head!=null && carry!=0){
        //     head=new ListNode(carry,head);
        // }
        // return head;
        head=reverse(head);
        int carry=0;
        ListNode temp=head;
        while(temp!=null){
            int value=temp.val*2+carry;
            temp.val=value%10;
            carry=value/10;
           if(temp.next==null && carry!=0){
               temp.next=new ListNode(carry);
               temp=temp.next;
           }
            temp=temp.next;
        }
        return reverse(head);
        
    }
    // public int multiply(ListNode head){
    //     if(head==null){
    //         return 0;
    //     }
    //     int value=head.val*2+(multiply(head.next));
    //     head.val=value%10;
    //     return value/10;
    // }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
        return prev;
        
    }
}