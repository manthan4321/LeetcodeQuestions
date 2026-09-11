/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public static int len(ListNode head){
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int diff1=0;
        int diff2=0;
        ListNode temp1=headA;
        ListNode temp2=headB;
        if(len(headA)>=len(headB)){
            diff1=len(headA)-len(headB);
            for(int i=0;i<diff1;i++){
                temp1=temp1.next;
            }  
        }
        if(len(headB)>len(headA)){
            diff2=len(headB)-len(headA);
            for(int i=0;i<diff2;i++){
                temp2=temp2.next;
            }
        }

        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;


        
    }
}