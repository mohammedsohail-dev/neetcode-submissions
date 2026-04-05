class Solution {
    int[] memo;
    public int rob(int[] nums) {
        memo = new int[nums.length+1];
        if (nums.length == 1) return nums[0];
        return Math.max(dfs(nums,0, true), dfs(nums, 1, false));
    }
    public int dfs(int[] nums, int i, boolean flag){
        if(i >= nums.length || flag && i == nums.length-1){
            return 0;
        }

        if(memo[i]!=0){
            return memo[i];
        }

        return Math.max(dfs(nums,i+1,flag), nums[i]+dfs(nums,i+2,flag || i==0));
    }
}
