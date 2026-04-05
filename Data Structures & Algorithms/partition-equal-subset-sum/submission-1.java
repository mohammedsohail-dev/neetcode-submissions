class Solution {
    Boolean[][] memo;
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num:nums){
            sum = sum + num;
        }
        if(sum%2 != 0){
            return false;
        }

        int target = sum /2;

        memo = new Boolean[nums.length][target+1];

        return dfs(nums, 0 , target);
    }

    public boolean dfs(int[] nums, int i, int target){
        if(i == nums.length){
            return target == 0;
        }

        if(memo[i][target]!=null){
            return memo[i][target];
        }

        if(target < 0){
            return false;
        }

        memo[i][target] = dfs(nums, i+1,target) || dfs(nums, i+1, target - nums[i]);
        return dfs(nums, i+1,target) || dfs(nums, i+1, target - nums[i]);
    }
}
