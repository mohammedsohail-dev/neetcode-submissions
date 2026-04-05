class Solution {
    int[][] directions = {{1,0}, {-1,0},{0,1},{0,-1}};
    int ROWS;
    int COLS;
    public int orangesRotting(int[][] grid){
        ROWS = grid.length;
        COLS = grid[0].length;
        int max = -1;
        for(int i = 0;i<ROWS;i++){
            for(int j = 0;j<COLS;j++){
                if(grid[i][j]!=0){
                    max = Math.max(max , bfs(grid, i , j));
                }
            }
        }
        if(max == 0){
            return -1;
        }
        return max;
    }

    public int bfs(int[][] grid, int x, int y){
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visit = new boolean[ROWS][COLS];
        visit[x][y] = true;
        q.add(new int[]{x,y});
        int steps = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0;i<size;i++){
                int[] curr = q.poll();
                int row = curr[0];
                int col = curr[1];
                if(grid[row][col] == 2) return steps;
                for(int[] dir:directions){
                    int nr = row + dir[0];
                    int nc = col + dir[1];
                    if(nr>=0 && nr<ROWS && nc >= 0 && nc < COLS && !visit[nr][nc] && grid[nr][nc] != 0 ){
                        visit[nr][nc] = true;
                        q.add(new int[]{nr, nc});
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}
