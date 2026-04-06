class Solution {
    int[][] directions = {{1,0}, {-1,0},{0,1},{0,-1}};
    int ROWS;
    int COLS;
    public int orangesRotting(int[][] grid){
        ROWS = grid.length;
        COLS = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fruits = 0;
        for(int i = 0;i<ROWS;i++){
            for(int j = 0;j<COLS;j++){
                if(grid[i][j]==2){
                   q.add(new int[]{i,j});
                }
                if(grid[i][j] == 1){
                    fruits++;
                }
            }
        }
        int steps = 0;
        while(!q.isEmpty() && fruits > 0){
            int size = q.size();
            for(int i = 0;i<size;i++){
                int[] curr = q.poll();
                int row = curr[0];
                int col = curr[1];
                for(int[] dir:directions){
                    int nr = row + dir[0];
                    int nc = col + dir[1];
                    if(nr>=0 && nr<ROWS && nc >= 0 && nc < COLS && grid[nr][nc] == 1 ){
                        grid[nr][nc] = 2;
                        fruits--;
                        q.add(new int[]{nr, nc});
                    }
                }    
            }
            steps++;    
        }

        if(fruits==0){
            return steps;
        }else{
            return -1;
        }
    }

}
