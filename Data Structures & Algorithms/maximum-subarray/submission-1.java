class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int sum =0;
        int maxSum = 0;
        for(int num : nums){
            sum = sum+num;
            if(sum<0){
                sum = 0;
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
