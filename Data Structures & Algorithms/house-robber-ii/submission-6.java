class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int[] first_part = new int[nums.length-1];
        int[] second_part = new int[nums.length-1];
        int[] memo1 = new int[nums.length];
        int[] memo2 = new int[nums.length];

        for(int i = 0;i<nums.length-1;i++){
                first_part[i] = nums[i];
                second_part[i] = nums[i+1];  
        }

        return Math.max(dfs(first_part,0,memo1),dfs(second_part,0,memo2));
    }
    public int dfs(int[] nums, int i,int[] memo){
        if(i >= nums.length || i < 0){
            return 0;
        }

        if(memo[i]!=0){
            return memo[i];
        }

        memo[i] = Math.max(dfs(nums,i+1,memo), nums[i]+dfs(nums,i+2,memo));
        return memo[i];
    }
}
