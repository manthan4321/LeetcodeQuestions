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
    public static int len(ListNode head){
        ListNode temp=head;
        int count=0;
        while(temp!=null){
             count++;
            temp=temp.next;

        }
        return count;
    }
    public ListNode insertionSortList(ListNode head) {

        int []arr=new int[len(head)];
        int idx=0;
        ListNode temp=head;
        while(temp!=null){
            arr[idx++]=temp.val;
            temp=temp.next;

        }

        // now insertion sort on arr
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int tempi=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=tempi;
                j--;
            }
        }
        // now arr is sorted
        temp=head;
        idx=0;
        while(temp!=null){
            temp.val=arr[idx++];
            temp=temp.next;

        }
        return head;
       
       
        
    }
}