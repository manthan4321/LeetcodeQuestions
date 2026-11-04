/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}s
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int len(ListNode head){
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode rotateRight(ListNode head, int k) {
        // last se k-1 node access karni hai 
        if(head==null) return head;
        if(head.next==null) return head;
        int n=len(head);
        if(k>=n) k=k%n;
        if(k==0) return head;

        ListNode slow=head;
        ListNode fast=head;
        for(int i=1;i<=k+1;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode a=slow.next;
        slow.next=null;
        ListNode tail=a;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=head;
        return a;
        
    }
}