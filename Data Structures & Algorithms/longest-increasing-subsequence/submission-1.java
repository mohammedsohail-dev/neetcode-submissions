class Solution {
    int[][] map;
    public int lengthOfLIS(int[] nums) {
        map = new int[nums.length][nums.length];
        for(int i = 0;i<nums.length;i++){
            Arrays.fill(map[i], -1);
        }

        return dfs(nums,0,-1);
    }
    public int dfs(int[] nums, int i, int j){
        if(i == nums.length){
            return 0;
        }

        if(j!=-1){
            if(map[i][j]!=-1){
                return map[i][j];
            }
        }
        
        int LIS = dfs(nums,i+1,j);

        if(j == -1 || nums[j]<nums[i]){
            LIS = Math.max(LIS, 1+dfs(nums, i+1,i));
        }

        if(j!=-1){
            map[i][j] = LIS; 
        }
        return LIS;

    }
}
