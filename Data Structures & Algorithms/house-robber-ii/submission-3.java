class Solution {
    int[] memo;
    public int rob(int[] nums) {
        int[] first_part = new int[nums.length-1];
        int[] second_part = new int[nums.length-1];

        for(int i = 0;i<nums.length-1;i++){
                first_part[i] = nums[i];
                second_part[i] = nums[i+1];  
        }

        return Math.max(dfs(first_part,0),dfs(second_part,0));
    }
    public int dfs(int[] nums, int i){
        if(i >= nums.length){
            return 0;
        }

        return Math.max(dfs(nums,i+1), nums[i]+dfs(nums,i+2));
    }
}
