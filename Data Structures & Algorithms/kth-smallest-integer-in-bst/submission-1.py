# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        self.sub = []
        def dfs(root):
            if root == None:
                return
            dfs(root.left)
            self.sub.append(root.val)
            dfs(root.right)
        dfs(root)
        # sorted_list = sorted(self.sub)
        # return sorted_list[k-1]
        return self.sub[k-1]

        