class Solution {
    int count = 0;
    int[] memo = new int[2000];
    public int climbStairs(int n) {
        if(memo[n] != 0){
            return memo[n];
        }
        dfs(n,0);
        memo[n] = count;
        return count;
    }
    public void dfs(int n, int i){
        if(i>n){
            return;
        }
        if(n==i){
            count++;
        }

        dfs(n, i+1);
        dfs(n, i+2);
        return;
    }
}
