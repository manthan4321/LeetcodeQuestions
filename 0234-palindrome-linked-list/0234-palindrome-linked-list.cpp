/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
 // iss method me ham ye algorithm follow krenge ki if first half is the reverse of second half then it is pallindrome wlse not.
class Solution {
public:
    ListNode* reverseList(ListNode*head){
        ListNode*curr=head;
        ListNode*prev=NULL;
        ListNode*Next=NULL;
        while(curr!=NULL){
            Next=curr->next;
            curr->next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }


    bool isPalindrome(ListNode* head) {
        if(head==NULL || head->next==NULL) return true;
        // step 1-> midlle find krlo
        ListNode*slow=head;
        ListNode*fast=head;
        while(fast->next!=NULL && fast->next->next!=NULL)// for first middle
        {
            slow=slow->next;
            fast=fast->next->next;

        }
        // slow ke aage wle ko reverse kardo
        ListNode*x=reverseList(slow->next);
        ListNode*a=head;
        ListNode*b=x;
        while(b!=NULL){
        if(a->val!=b->val) return false;
            a=a->next;
            b=b->next;
        }
        return true;

    }
};