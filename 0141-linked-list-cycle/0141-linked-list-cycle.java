/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;
        ListNode slow=head;
        ListNode fast=head;
        // yhn par loop null or fast ka next not equal to null tak issliye chalaya taaki agr cycle hui hi nhi to null hoga fr usme or agr cycle hui to niche wli codn true;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) return true;
        }
        return false;
        
        
    }
}