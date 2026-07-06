# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        self.is_valid = True

        def dfs(curr, low, high):
            if curr == None:
                return
            if curr.val <= low or curr.val >= high:
                self.is_valid = False
            if curr.left:
                dfs(curr.left, low, curr.val)
            if curr.right:
                dfs(curr.right, curr.val, high)

        dfs(root, float('-inf'), float('inf'))

        return self.is_valid
            
        