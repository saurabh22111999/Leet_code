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
    public boolean isPalindrome(ListNode head) {
        ListNode slowptr=head;
        ListNode fastptr=head;
        while(fastptr!=null&& fastptr.next!=null){
            fastptr=fastptr.next.next;
            slowptr=slowptr.next;
        }
        ListNode prev=null;
        ListNode current=slowptr;
        ListNode next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            
        }
        ListNode temp=head;
        while(prev!=null){
            if(temp.val!=prev.val)
                return false;
            
            prev=prev.next;
            temp=temp.next;
                
        }
        return true;
    }
}