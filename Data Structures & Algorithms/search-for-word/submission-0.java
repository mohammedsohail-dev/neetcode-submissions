class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(backtrack(board, word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean backtrack(char[][] board, String word, int i, int j, int count){
        if(count == word.length()){
            return true;
        }

        if(i > 0 || j > 0 || i <= board.length || j <= board[0].length){
            return false;
        }

        if(word.charAt(count) != board[i][j]) {
            return false;
        } 

        char temp = board[i][j];
        board[i][j] = '#';
        count++;
        boolean search = backtrack(board, word, i+1,j,count) || backtrack(board, word, i-1,j,count) || backtrack(board, word, i,j+1,count) || backtrack(board, word, i,j-1,count);


        board[i][j] = temp;

        return search;

    }
}
