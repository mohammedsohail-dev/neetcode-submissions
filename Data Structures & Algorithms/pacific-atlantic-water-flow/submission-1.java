class Solution {
    int ROWS;
    int COLS;
    int[][] directions = {{0,1}, {0,-1}, {1,0}, {-1,0}};
    boolean[][] pacific;
    boolean[][] atlantic;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        ROWS = heights.length;
        COLS = heights[0].length;
        pacific = new boolean[ROWS][COLS];
        atlantic = new boolean[ROWS][COLS];
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i<heights.length;i++){
            for(int j = 0;j<heights[0].length;j++){
                if(i==0){
                    pacific[i][j] = true;
                }
                if(j == 0){
                    pacific[i][j] = true;
                }
            }
        }

        for(int i = 0;i<heights.length;i++){
            for(int j = 0;j<heights[0].length;j++){
                if(i==heights.length-1){
                    atlantic[i][j] = true;
                }
                if(j == heights[0].length-1){
                    atlantic[i][j] = true;
                }
            }
        }

        for(int p = 0;p<ROWS;p++){
            for(int q = 0;q<COLS;q++){
                if(bfs(heights, p, q)){
                    List<Integer> sub = new ArrayList<>();
                    sub.add(p);
                    sub.add(q);
                    res.add(sub);
                }
            }
        }

        return res;

    }

    public boolean bfs(int[][] heights, int x, int y){
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visit = new boolean[ROWS][COLS];
        visit[x][y] = true;
        q.add(new int[]{x,y});
        boolean pacific_flag = false;
        boolean atlantic_flag = false;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                int[] curr = q.poll();
                int row = curr[0];
                int col = curr[1];
                if(pacific[row][col] == true){
                    pacific_flag = true;
                }
                if(atlantic[row][col] == true){
                    atlantic_flag = true;
                }
                for(int[] dir:directions){
                    int nr = row + dir[0];
                    int nc = col + dir[1];
                    if(nr>=0 && nr<ROWS && nc>=0 && nc<COLS && !visit[nr][nc] && heights[row][col]>=heights[nr][nc]){
                        visit[nr][nc] = true;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
        }
        return pacific_flag && atlantic_flag;
    }
}
