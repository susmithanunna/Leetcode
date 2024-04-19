/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       HashSet<ListNode> h1=new HashSet<>();
        while(head!=null){
            if(h1.contains(head)){
                return true;
            }
            else{
                h1.add(head);
                
            }
            head=head.next;
        }
        return false;
    }
}