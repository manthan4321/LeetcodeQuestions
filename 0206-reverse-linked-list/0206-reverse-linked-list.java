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
 //Method 1-> brute force 

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ArrayList<ListNode>res=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            res.add(temp);
            temp=temp.next;
        }
        int n=res.size();
        for(int i=n-1;i>=1;i--){
            res.get(i).next=res.get(i-1);
        }
        res.get(0).next=null;
        return res.get(n-1);

    }
}