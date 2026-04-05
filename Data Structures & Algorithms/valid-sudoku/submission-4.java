class Solution {
    public boolean isValidSudoku(char[][] board) {
        return checkhorizontal(board) && checkvertical(board) && checksquare(board);
    }
    public boolean checkvertical(char[][] board){
        for(int i=0;i<9;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<9;j++){
                if(set.contains(board[j][i])){
                    return false;
                } else if(board[j][i]!='.'){
                    set.add(board[j][i]);
                }
            }
        }
        return true;
    }

    public boolean checkhorizontal(char[][] board){
        for(int i=0;i<9;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<9;j++){
                if(set.contains(board[i][j])){
                    return false;
                } else if(board[i][j]!='.'){
                    set.add(board[i][j]);
                }
            }
        }
        return true;
    }

    public boolean checksquare(char[][] board){
        for(int i=0;i<9;i++){
            int x = (i / 3) * 3;
            int y = (i % 3) * 3;
            HashSet<Character> set = new HashSet<>();
            for(int j = 0;j<3;j++){
                for(int k = 0;k<3;k++){
                    char val = board[x+j][y+k];
                    if(val!='.' && set.contains(val)){
                        return false;
                    }
                    set.add(val);
                }
            }
        }
        return true;
    }


}
