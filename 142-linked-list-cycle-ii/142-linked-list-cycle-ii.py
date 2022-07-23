# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        fastptr=head
        slowptr=head
        if  head==None or head.next==None :
            return None
        while fastptr!=None and fastptr.next!=None:
            fastptr=fastptr.next.next
            slowptr=slowptr.next
            if slowptr==fastptr:
                temp=head
                while slowptr!=temp:
                    temp=temp.next
                    slowptr=slowptr.next
                return slowptr
        return None
                