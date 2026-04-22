class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int best = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++){
            if (map.containsKey(s.charAt(right)) && map.get(s.charAt(right)) >= left){
                left = map.get(s.charAt(right)) + 1;
            }
            map.put(s.charAt(right), right);
            best = Math.max(best, right - left + 1);
        }
        return best;
    }
}
