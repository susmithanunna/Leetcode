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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s1=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            s1.add(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(!s1.isEmpty()){
            int t1=s1.pop();
            if(t1!=temp.val){
                return false;
            }
            temp=temp.next;
        }
        return true;
    }
}