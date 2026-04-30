class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1;
        int hi = maxArr(piles);
        int minSpeed = hi;
        while (lo <= hi){
            int mid = (lo + hi) / 2;

            long total = 0;
            for (int x : piles){
                total += Math.ceil((double)x/mid);
            }
            if (total <= h){
                minSpeed = mid;
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return minSpeed;

    }

    public int maxArr(int[] piles){
        int num = 0;
        for (int x: piles){
            if (x >= num) num = x;
        }
        return num;
    }
}
