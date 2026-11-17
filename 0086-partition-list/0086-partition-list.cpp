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
class Solution {
public:
    ListNode* partition(ListNode* head, int x) {
        if(head==NULL || head->next==NULL)return head;
        ListNode*low=new ListNode(100);
        ListNode*high=new ListNode(200);
        ListNode*templow=low;
        ListNode*temphigh=high;
        ListNode*temp=head;
        while(temp!=NULL){
            if(temp->val<x){
                templow->next=temp;
                temp=temp->next;
                templow=templow->next;
            }
            else{
                temphigh->next=temp;
                temp=temp->next;
                temphigh=temphigh->next;
            }
        }
        // ab mai apni jo do linked lists bni hai unko jodunga
        templow->next=high->next;
        temphigh->next=NULL;
        return low->next;


        
    }
};