class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> stack = new ArrayList<>();
        if (nums.length < 3) return stack;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0) return stack;
            if (i > 0 && nums[i] == nums[i-1]) continue;

            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right){
                if (nums[left] + nums[right] > target) right--;
                else if (nums[left] + nums[right] < target) left++;
                else {
                    List<Integer> cell = new ArrayList<>();
                    cell.add((nums[i]));
                    cell.add((nums[left]));
                    cell.add((nums[right]));        
                    left++;
                    right--;
                    if (!cell.isEmpty()) stack.add(cell);
                    while (left < right && nums[left] == nums[left -1]) left++;
                }
            }
        }
        return stack;
    }
}
