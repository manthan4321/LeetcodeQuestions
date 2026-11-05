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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        // Step1 -> dummy node 
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        ListNode i=head;
        while(i!=null){
            if(i.next==null || i.val!=i.next.val){
                t.next=i;
                t=i;
                i=i.next;
            }
            else{ // i ki val equal hai uske next wle ke 
                ListNode j=i.next;
                while(j!=null && j.val==i.val){
                    j=j.next;
                }
                i=j;

            }
        }
        // ab ye step bht necceasry hai kyuki agr ye condn nhi likhi to last wla duplicate hmesha reh jayega kyuki agr maanlo last me aise hai 
        // 5 5 null to j aage bdhta rhega or null pe aajeyega or loop break ho jayegi and i bhi j pe aajayega or last me t ke sath  5 5 ka connection maintain reh jayega to iss liye ham usse mitayenge through this line
        t.next=i;
        return dummy.next;

    }
}