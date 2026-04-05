class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid, i,j);
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid, int x, int y){
        if(x<0 || y<0|| x>=grid.length || y>=grid[0].length || grid[x][y] != '1'){
            return;
        }

        if(grid[x][y] == '1'){
            grid[x][y] = '#';
        }

        dfs(grid,x+1,y);
        dfs(grid,x-1,y);
        dfs(grid,x,y+1);
        dfs(grid,x,y-1);
    }
}
