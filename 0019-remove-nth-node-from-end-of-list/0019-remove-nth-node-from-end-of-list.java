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
        int len=1;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int c=len-n;
        
        System.out.println(c);
        int count=1;
        temp=head;
        ListNode prev=null;
        if(len==1){
            return prev;
        }
        else if(c==1){
            return head.next;
        }
        else{
            while(temp!=null){
            if(count==c){
                prev.next=temp.next;
            }
            count++;
            prev=temp;
            temp=temp.next;
           } 
        }
        return head;
    }
}