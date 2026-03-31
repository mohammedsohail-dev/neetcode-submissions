class Solution {
    int[] memo;
    public int minCostClimbingStairs(int[] cost) {
        memo = new int[cost.length+1];
        return Math.min(dfs(0,cost),dfs(1,cost));
    }

    public int dfs(int i, int[] cost){
        if(i>=cost.length){
            return 0;
        }

        if(memo[i]!=0){
            return memo[i];
        }

        memo[i] = cost[i] + Math.min(dfs(i+1,cost),dfs(i+2,cost));
        return memo[i];
    }
}
