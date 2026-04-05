class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int min = 10000000;
        while(left<right) {
            int mid = (left+right)/2;
            min = Math.min(min, nums[mid]);
            if(nums[mid]>nums[right]){
                left= mid+1;
            } else {
                right = mid;
            }
            
        }
        return min;
    }
}
