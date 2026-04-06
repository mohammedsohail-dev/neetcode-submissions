class Solution {
    int ROWS;
    int COLS;
    public void solve(char[][] board) {
        ROWS = board.length;
        COLS = board[0].length;
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLS; j++){
                  if(board[i][j] == 'O' && i == 0 || board[i][j] == 'O' && j == 0 || board[i][j] == 'O' && j == COLS-1 || board[i][j] == 'O' && i == ROWS-1){
                    dfs(board, i, j);
                  }
            }
        }

        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLS; j++){
                  if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                  }

                  if(board[i][j] == '#'){
                    board[i][j] = 'O';
                  }
            }
        }
        
    }

    public void dfs(char[][] board, int x, int y){
        if(x<0 || x>= ROWS || y<0 || y>=COLS || board[x][y] != 'O' ){
            return;
        }

        board[x][y] = '#';

        dfs(board, x+1,y);
        dfs(board, x-1,y);
        dfs(board, x, y+1);
        dfs(board, x, y-1);
        return;
    }
}
