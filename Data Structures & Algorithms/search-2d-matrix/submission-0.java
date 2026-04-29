class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lowRow = 0;
        int highRow = matrix.length - 1;
        int midRow = 0;
        while (lowRow <= highRow){
            midRow = (lowRow + highRow) / 2;
            if (matrix[midRow][0] <= target && matrix[midRow][matrix[midRow].length - 1] >= target){
                break;
            }
            if (target < matrix[midRow][0]) highRow = midRow - 1;
            if (target > matrix[midRow][matrix[midRow].length - 1]) lowRow = midRow + 1;
        }
        int lo = 0;
        int hi = matrix[midRow].length - 1;
        while (lo <= hi){
            int mid = (lo + hi) / 2;
            if (target == matrix[midRow][mid]) return true;
            if (target > matrix[midRow][mid]) lo = mid + 1;
            if (target < matrix[midRow][mid]) hi = mid - 1;
            
        }
        return false;
    }
}
