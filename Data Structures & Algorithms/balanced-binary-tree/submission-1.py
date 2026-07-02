# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        def walk(root):
            if root is None:
                return 0
            left_h = walk(root.left)
            if left_h == -1:
                return -1
            right_h = walk(root.right)
            if right_h == -1:
                return -1
            balance = abs(right_h - left_h)

            if balance > 1:
                return -1
            return 1 + max(left_h, right_h)
        return walk(root) != -1