class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] visit = new boolean[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j] == 0){
                    
                    // x-pass
                    for(int p = 0;p<m;p++){
                        visit[p][j] = true;
                    }

                    //y-pass
                    for(int q = 0;q<n;q++){
                        visit[i][q] = true;
                    }

                }
            }
        }

        for(int x = 0;x<m;x++){
            for(int y =0;y<n;y++){
                if(visit[x][y]){
                    matrix[x][y] = 0;
                }
            }
        }

        
    }
    
}
