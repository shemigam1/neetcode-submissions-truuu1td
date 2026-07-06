# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def goodNodes(self, root: TreeNode) -> int:
        self.good_nodes = 0

        def dfs(curr, max_node):
            if curr == None:
                return
            if curr.val >= max_node.val:
                self.good_nodes += 1
                max_node = curr
            # else:
            
            dfs(curr.left, max_node)
            dfs(curr.right, max_node)

        dfs(root, root)

        return self.good_nodes
                
        