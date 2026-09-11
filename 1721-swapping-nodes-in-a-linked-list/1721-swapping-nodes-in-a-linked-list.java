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
        if(head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head;
        for(int i=1;i<=k;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        // ab mera slow pointer alreaddy last kth node pe jaa chuka hai ab bas beginning se access karna hai
        ListNode slow2=head;
        for(int i=1;i<k;i++){
            slow2=slow2.next;
        }
        
        int temp=slow.val;
        slow.val=slow2.val;
        slow2.val=temp;
        return head;


        
    }
}