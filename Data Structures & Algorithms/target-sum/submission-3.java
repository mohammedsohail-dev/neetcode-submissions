class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return dfs(nums, target, 0);
    }
    
    public int dfs(int[] nums, int target, int i){
        if(i == nums.length){
            if(target == 0){
                return 1;
            }
            return 0;   
        }


        int add = dfs(nums, target - nums[i], i+1);
        int sub = dfs(nums, target + nums[i], i+1);

        return add+sub;
    } 
}
