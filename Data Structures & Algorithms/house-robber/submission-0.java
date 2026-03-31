class Solution {
    int[] memo;
    public int rob(int[] nums) {
        memo = new int[nums.length];
        return dfs(nums, 0);
    }

    public int dfs(int[] nums, int i) {
        if(i>=nums.length || i<0){
            return 0;
        }

        if(memo[i] != 0){
            return memo[i];
        }

        int rob = nums[i] + dfs(nums,i+2);
        int skip = dfs(nums,i+1);
        memo[i] = Math.max(rob,skip);
        return memo[i];
    }
}
