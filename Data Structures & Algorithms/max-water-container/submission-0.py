class Solution:
    def maxArea(self, heights: List[int]) -> int:
        left = 0
        right = len(heights) - 1
        max_area = 0
        while left < right:
            if max_area < ((right - left) * min(heights[left], heights[right])):
                max_area = (right - left) * min(heights[left], heights[right])
                if heights[left] <= heights[right]:
                    left += 1
                    continue
                else:
                    right -= 1
                    continue
            if heights[left] <= heights[right]:
                left += 1
                continue
            else:
                right -= 1
                continue
        return max_area