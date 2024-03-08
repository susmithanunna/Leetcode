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
        ListNode curr=head;
        ListNode back=null;
        while(curr!=null){
            ListNode front=curr.next;
            curr.next=back;
            back=curr;
            curr=front;
        }
        head=back;
        return head;
    }
}