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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=findMid(head);
        ListNode left=head;
        ListNode right=mid.next;
        mid.next=null;
        left=sortList(left);
        right=sortList(right);
        
        ListNode ans=merge(left,right);
        return ans;
    }
    static ListNode findMid(ListNode head){
       ListNode slow = head;
       ListNode fast = head;
       ListNode prev = null;
       while (fast != null && fast.next != null) {
          prev = slow;
          slow = slow.next;
          fast = fast.next.next;
       }
       return prev;
    }
    static ListNode merge(ListNode left,ListNode right){
        if(left==null){
            return right;
        }
        else if(right==null){
            return left;
        }
        ListNode ans=new ListNode(-1);
        ListNode temp=ans;
        while(left!=null && right!=null){
            if(left.val<right.val){
                temp.next=left;
                left=left.next;
            }
            else{
                temp.next=right;
                right=right.next;
            }
            temp=temp.next;
        }
        if (left != null) {
            temp.next = left;
        }
        if (right != null) {
            temp.next = right;
        }
        return ans.next;
    }
}