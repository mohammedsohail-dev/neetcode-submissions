class Solution {
    private int[][] directions = {{1 ,0}, {-1,0}, {0,1}, {0,-1}};
    private int ROWS;
    private int COLS;
    private int INF = 2147483647;
    
    public void islandsAndTreasure(int[][] grid) {
        ROWS = grid.length;
        COLS = grid[0].length;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == INF){
                    grid[i][j] = bfs(grid,i,j);
                }
            }
        }
    }

    public int bfs(int[][] grid, int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        boolean[][] visit = new boolean[grid.length][grid[0].length];
        visit[x][y] = true;
        int steps = 0;

        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0;i<size;i++){
                int[] curr = q.poll();
                int row = curr[0];
                int col = curr[1];
                if(grid[row][col] == 0) return steps;
                for(int[] dir : directions){
                    int nr = row + dir[0];
                    int nc = col + dir[1];
                    if(nr >=0 && nr < ROWS && nc >=0 && nc < COLS && !visit[nr][nc] && grid[nr][nc] != -1){
                        visit[nr][nc] = true;
                        q.add(new int[]{nr,nc});
                    }
                }

            }
            steps++;
        }
        return Integer.MAX_VALUE;
    }
}
