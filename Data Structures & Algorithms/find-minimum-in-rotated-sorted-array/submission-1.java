class Solution {
    public int findMin(int[] nums) {
        return binarySearch(nums, 0, nums.length-1);
    }
    int binarySearch(int[] nums, int left, int right){
        int mid = (left+right)/2;
        if(left>right){
            return nums[mid-1];
        }
        if(nums[left]<nums[right]){
            return binarySearch(nums,left, mid-1);
        } else {
            return binarySearch(nums,mid+1,right);
        }
    }
}
