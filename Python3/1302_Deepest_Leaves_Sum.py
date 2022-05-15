# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def deepestLeavesSum(self, root: Optional[TreeNode]) -> int:
        list1 = [root]
        list2 = list1
        while list2 != []:
            list1 = list2
            list2 = []
            for item in list1:
                if item.left != None:
                    list2.append(item.left)
                if item.right != None:
                    list2.append(item.right)
        result = 0
        for item in list1:
            result += item.val
        return result
        
        
"""
class Solution:
    def deepestLeavesSum(self, root: Optional[TreeNode]) -> int:
        self.level = 0
        self.result = 0
    
        self.helper(root, 0)
        return self.result
    
    def helper(self, root: Optional[TreeNode], level: int) -> None:
        if root != None:
            self.helper(root.left, level+1)
            self.helper(root.right, level+1)
            
            if level == self.level:
                self.result += root.val
            elif level > self.level:
                self.level = level
                self.result = root.val
        
        return
"""
