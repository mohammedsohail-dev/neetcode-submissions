class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        //verify rows
        for(int i=0;i<9;i++){
            HashSet<Character> set = new HashSet();
            for(int j=0;j<9;j++){
                if(set.contains(board[i][j])){
                    return false;
                } else if(board[i][j] == '.') {
                    continue;
                } else {
                    set.add(board[i][j]);
                }
            }
        }

        //verify columns
        for(int i=0;i<9;i++){
            HashSet<Character> set = new HashSet();
            for(int j=0;j<9;j++){
                if(set.contains(board[j][i])){
                    return false;
                } else if(board[j][i] == '.') {
                    continue;
                } else {
                    set.add(board[j][i]);
                }
            }
        }

        //verify squares
        for(int i=0;i<9;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    int row = (i/3)*3+j;
                    int col = (i%3)*3+k;
                    if(set.contains(board[row][col])){
                        return false;
                    } else if(board[row][col]=='.') {
                        continue;
                    } else {
                        set.add(board[row][col]);
                    }
                }
            }
        }

        return true;
    }
}
