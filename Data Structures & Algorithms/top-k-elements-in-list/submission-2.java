class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            Integer num = hashmap.getOrDefault(nums[i], 0);
            num += 1;
            hashmap.put(nums[i], num);
        }
        ArrayList<Integer> keys = new ArrayList<>(hashmap.keySet());
        keys.sort((a, b) -> hashmap.get(b) - hashmap.get(a));
        int[] res = new int[k];
        for (int j = 0; j < k; j++){
            res[j] = keys.get(j);
        }
        return res;

    }
}
