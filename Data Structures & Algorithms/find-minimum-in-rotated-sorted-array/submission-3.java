class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int min = 10000000;
        while(left<right) {
            int mid = (left+right)/2;
            if(nums[left]<nums[right]){
                right = mid-1;
            } else {
                left = mid+1;
            }
            min = Math.min(min, nums[mid]);
        }
        return min;
    }
}
