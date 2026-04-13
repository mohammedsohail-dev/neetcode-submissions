class Solution {
    public void rotate(int[][] matrix) {
        // transpose
        for(int i = 0;i<matrix.length;i++){
            for(int j = i;j<matrix[0].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse rows
        for(int p = 0;p<matrix.length;p++){
            int left = 0;
            int right = matrix[0].length-1;
            while(left<right){
                int temp = matrix[p][left];
                matrix[p][left] = matrix[p][right];
                matrix[p][right] = temp;
                left++;
                right--;
            }
        }
    }
}
