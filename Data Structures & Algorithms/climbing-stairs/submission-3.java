class Solution {
    int count = 0;
    public int climbStairs(int n) {
        dfs(n,0);
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
