# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        result = temp = ListNode()
        total = 0
        while head != None:
        # while (head is not None):
            if head.val == 0:
                temp.next = ListNode(total)
                temp = temp.next
                total = 0
            else:
                total += head.val
            head = head.next
        return result.next.next
