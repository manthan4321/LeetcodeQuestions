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
    public static ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode curr=head;
        ListNode prev=null;
        ListNode fwd=null;
        while(curr!=null){
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        if(head==null || head.next==null) return 0;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode a=slow.next;
        slow.next=null;
        ListNode i=head;
        ListNode j=reverse(a);
        int maxsum=0;
        while(i!=null){
            int sum=i.val+j.val;
            if(sum>maxsum){
                maxsum=sum;
            }
            i=i.next;
            j=j.next;

        }
        return maxsum;
        
    }
}