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
    public ListNode oddEvenList(ListNode head) {
        ListNode oddf=null;
        ListNode oddl=null;
        ListNode evenf=null;
        ListNode evenl=null;
        ListNode temp=head;
        int c=1;
        while(temp!=null){
            if(c%2==0){
                if(evenf==null && evenl==null){
                    evenf=temp;
                    evenl=temp;
                }
                else if(evenf!=null){
                    evenl.next=temp;
                    evenl=temp;
                }
            }
            else{
                if(oddf==null && oddl==null){
                    oddf=temp;
                    oddl=temp;
                }
                else{
                    oddl.next=temp;
                    oddl=temp;
                }
            }
            temp=temp.next;
            c++;
        }
        if(evenl!=null){
            evenl.next=null;
        }
        if(oddl!=null){
            oddl.next=evenf;
        }
        if(oddf!=null){
            return oddf;
        }
        return evenf;
    }
}