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
    public ListNode removeNodes(ListNode head) {
        ListNode temp=head;
        Stack<ListNode> s1=new Stack<>();
        while(temp!=null){
            while(!s1.isEmpty() && s1.peek().val<temp.val){
                s1.pop();
            }
            s1.push(temp);
            temp=temp.next;
        }
        ListNode nxt=null;
        while(!s1.isEmpty()){
            temp=s1.pop();
            temp.next=nxt;
            nxt=temp;
        }
        return temp;
    }
}
