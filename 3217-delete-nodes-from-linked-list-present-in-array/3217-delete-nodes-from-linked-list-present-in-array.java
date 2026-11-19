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
    public ListNode modifiedList(int[] nums, ListNode head) {
       HashSet<Integer>set=new HashSet<>();
        if(head==null) return null;
        int n=nums.length;
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        ListNode temp=head;

        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        
            while(temp!=null){
                if(!set.contains(temp.val)){
                    t.next=temp;
                    t=t.next;
                }
                temp=temp.next;
            }
        
        t.next=null;
        return dummy.next;

        
        
           
        
        
        
    
        
    }
}