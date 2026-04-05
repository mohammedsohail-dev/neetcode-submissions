class Solution {
    public int uniquePaths(int m, int n) {
        return dfs(0,0,m,n);   
    }

    public int dfs(int i, int j, int m, int n){

        if(i==m-1 && j==n-1){
            return 1;
        }
        
        if(i<0 || i>=m || j<0 || j>=n){
            return 0;
        }

        int right = dfs(i+1,j,m,n);
        int down = dfs(i,j+1,m,n);

        return right+down;
    }
}
