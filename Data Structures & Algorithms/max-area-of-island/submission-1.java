class Solution {
    int count = 0;
    int max_count = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visit = new boolean[m][n]; 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dfs(grid,i,j,visit);
                max_count = Math.max(max_count,count);
                count = 0;
            }
        }
        return max_count;
        
    }
    public void dfs(int[][] grid, int i, int j, boolean[][] visit){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || visit[i][j] || grid[i][j] == 0){
            return;
        }

        visit[i][j] = true;
        count++;

        dfs(grid,i+1,j,visit);
        dfs(grid,i-1,j,visit);
        dfs(grid,i,j+1,visit);
        dfs(grid,i,j-1,visit);
    }
}
