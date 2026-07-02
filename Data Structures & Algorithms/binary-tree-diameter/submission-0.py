# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        self.diameter = 0
        def walk(root):
            if root is None:
                return 0

            left_h = walk(root.left)
            right_h = walk(root.right)

            dia = right_h + left_h
            self.diameter = max(self.diameter, dia)

            return 1 + max(right_h, left_h)
        walk(root)
        return self.diameter

            

