class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        return binarySearch(nums, left, right);
    }

    public int binarySearch(int[] nums, int left, int right){
        int mid = (left+right)/2;
        if(left > right) {
            return nums[mid];
        }

        if(nums[left] > nums[right]){
            return binarySearch(nums, mid+1, right);
        } else {
            return binarySearch(nums, left, mid-1);
        }
    }
}
