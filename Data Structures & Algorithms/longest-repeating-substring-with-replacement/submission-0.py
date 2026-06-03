class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        longest = 0
        left = 0
        hashmap = {}
        for right in range(len(s)):
            hashmap[s[right]] = hashmap.get(s[right], 0) + 1
            maxFreq = max(hashmap.values())
            if (right - left + 1) - maxFreq > k:
                hashmap[s[left]] -= 1
                left += 1
            longest = right - left + 1
        return longest