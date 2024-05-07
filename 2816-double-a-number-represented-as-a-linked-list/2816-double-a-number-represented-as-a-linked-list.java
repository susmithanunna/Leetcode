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
        int carry=multiply(head);
        if(head!=null && carry!=0){
            head=new ListNode(carry,head);
        }
        return head;
        
    }
    public int multiply(ListNode head){
        if(head==null){
            return 0;
        }
        int value=head.val*2+(multiply(head.next));
        head.val=value%10;
        return value/10;
    }
}