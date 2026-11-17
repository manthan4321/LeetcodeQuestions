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
 //logic-> merge sort
 //merge sort logic 2 parts me array todo then recursion se sort krdo then usse merge kardo
 // 1->linked list ko middle se tod do
 //2->for odd normal slow fast,for even slow fast se 2nd middle nikalta hai but by dry run hum slow fast ki condn find kr skte hai
 //then same merge sort logic
class Solution {
    public static ListNode mergeSort(ListNode head1,ListNode head2){
        if(head1==null && head2==null) return null;
        if(head1==null) return head2;
        if(head2==null) return head1;
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        ListNode i=head1;
        ListNode j=head2;
        while(i!=null && j!=null){
            if(i.val<=j.val){
                t.next=i;
                i=i.next;
                t=t.next;
            }
            else{
                t.next=j;
                j=j.next;
                t=t.next;
            }
        }
        while(i!=null){
            t.next=i;
            i=i.next;
            t=t.next;
        }
        while(j!=null){
            t.next=j;
            j=j.next;
            t=t.next;
        }

        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp1=head;
        ListNode temp2=slow.next;
        slow.next=null;
        ListNode left=sortList(temp1);
        ListNode right=sortList(temp2);
        return mergeSort(left,right);

        

        
    }
}