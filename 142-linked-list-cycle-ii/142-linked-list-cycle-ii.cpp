/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        if(head==NULL || head->next==NULL){
return NULL;}
        ListNode *fastptr= head;
        ListNode *slowptr=head;
        
        
        while(fastptr!=NULL && fastptr->next!=NULL){
            fastptr=fastptr->next->next;
        slowptr=slowptr->next;
        if(slowptr==fastptr){
ListNode *temp=head;
        while(temp!=slowptr){
            temp=temp->next;
            slowptr=slowptr->next;
            
        }
        return slowptr;}
        }
        return NULL;
    }
};