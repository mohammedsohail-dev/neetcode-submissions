class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] list:matrix){
            if(search(list,target)){
                return true;
            }
        }

        return false;
    }
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                return true;
            }

            if(nums[mid]<target){
                left = mid+1;
            }

            if(nums[mid]>target){
                right = mid-1;
            }

        }

        return false;

    }
}
