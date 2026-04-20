class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashset = new HashSet<>();
        for (int x : nums) hashset.add(x);

        Iterator<Integer> idx = hashset.iterator();
        Integer origin = 0;
        Integer longest = 0;
        while (idx.hasNext()){
            Integer curr = idx.next();
            Integer length = 1;
            if (!hashset.contains(curr - 1)){
                length = 1;
                while (hashset.contains(curr + length)) length += 1;
            }
            longest = Math.max(longest, length);
        }
        return longest;
    }
}
