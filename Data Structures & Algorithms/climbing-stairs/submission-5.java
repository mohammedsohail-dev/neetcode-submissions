class Solution {
    int[] memo;
    public int climbStairs(int n) {
        memo = new int[n+1];
        int ans = dfs(n,memo);
        return ans;        
    }

    public int dfs(int n, int[] memo){
        if(n<=2){
            return n;
        }

        if(memo[n] !=0){
            return memo[n];
        }

        memo[n] = dfs(n-1,memo)+dfs(n-2,memo);
        return memo[n];
    }
}
