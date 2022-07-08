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
    public ListNode detectCycle(ListNode head) {
        ListNode fastptr=head;
        ListNode slowptr=head;
        while(fastptr!=null && fastptr.next!=null){
            fastptr=fastptr.next.next;
            slowptr=slowptr.next;
            if(fastptr==slowptr){
                ListNode temp=head;
        
        
        while(temp!=slowptr){
           
        temp=temp.next;
        slowptr=slowptr.next;
            }
            return slowptr;  }
            
        } 
    return null;
    }}