class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int length = matrix[0].length;
        int breadth = matrix.length;

        for(int i=0;i<breadth;i++){
            if(binarySearch(matrix[i], target, 0, length-1)) {
                return true;
            }
        }
        return false;
    }
    boolean binarySearch(int[] nums, int target, int left, int right) {
        int mid = (left+right)/2;
        if(left>right){
            return false;
        }

        if(nums[mid]==target){
            return true;
        } else if(nums[mid]>target){
            return binarySearch(nums, target, left, mid-1);
        } else {
            return binarySearch(nums, target, mid+1, right);
        }
    }
}
