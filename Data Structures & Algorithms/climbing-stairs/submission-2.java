class Solution {
    int count = 0;
    public int climbStairs(int n) {
        dfs(n,0);
        return count;
    }
    public void dfs(int n, int i){
        if(n==i){
            count++;
        }
        if(i>n){
            return;
        }

        dfs(n, i+1);
        dfs(n, i+2);
        return;
    }
}
