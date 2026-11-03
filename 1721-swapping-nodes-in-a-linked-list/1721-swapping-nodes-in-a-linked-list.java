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
    public ListNode swapNodes(ListNode head, int k) {
        //pehle hi base case bna lo
        if(head.next==null) return head;
        // step1 ->last kth node ko access karlo
        ListNode slow= head;
        ListNode fast=head;
        for(int i=1;i<=k;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        //  step2 ->now ab first se k ki value access karlo
        ListNode slow2=head;
        for(int i=1;i<k;i++){
            slow2=slow2.next;

        }
        //now step3 -> swap kardo
        int temp=slow.val;
        slow.val=slow2.val;
        slow2.val=temp;
        return head;


    }
}