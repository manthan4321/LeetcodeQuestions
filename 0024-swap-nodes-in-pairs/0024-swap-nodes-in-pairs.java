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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode d1=new ListNode(-1);
        ListNode t1=d1;
        ListNode d2=new ListNode(-1);
        ListNode t2=d2;
        ListNode temp=head;
        int index=1;
        while(temp!=null){
            if(index%2!=0){
                t1.next=temp;
                t1=t1.next;
                temp=temp.next;
            }
            else{
                t2.next=temp;
                t2=t2.next;
                temp=temp.next;
            }
            index++;
        }
        t1.next=null;
        t2.next=null;
        ListNode temp1=d1.next;
        ListNode temp2=d2.next;
        ListNode res=new ListNode(1);
        ListNode r=res;
        while(temp1!=null && temp2!=null){
            r.next=temp2;
            temp2=temp2.next;
            r=r.next;
            r.next=temp1;
            temp1=temp1.next;
            r=r.next;
            
        }
        if(temp1==null) r.next=temp2;
        else r.next=temp1;

        return res.next;
        
    }
}