class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        return binarySearch(matrix, target, 0, m*n-1, m, n);
    }

    public boolean binarySearch(int[][] matrix, int target, int left, int right, int m, int n){
        if(right < left) {
            return false;
        }

        int mid = (left+right)/2;

        int mid_x = mid%n;
        int mid_y = mid/n;

        if(matrix[mid_y][mid_x]== target){
            return true;
        }
        
        if(matrix[mid_y][mid_x] > target){
            return binarySearch(matrix, target, left , mid-1, m,n);
        }

        else {
            return binarySearch(matrix, target, mid+1 , right, m,n);
        }
    }
}
