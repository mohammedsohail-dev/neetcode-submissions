class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int top = 0;
        int down = matrix.length-1;
        int right = matrix[0].length-1;
        List<Integer> ans = new ArrayList<>();
        while(top<=down && left<=right){
        // left to right
        for(int i = left;i<=right;i++){
            ans.add(matrix[top][i]);
        }
        top++;

        //right to down
        for(int j = top;j<=down;j++){
            ans.add(matrix[j][right]);
        }
        right--;

        //right to left
        if(top<=down){
        for(int k = right;k>=left;k--){
            ans.add(matrix[down][k]);
        }
        down--;
        }
        //down to top
        if(left<=right){
        for(int l=down;l>=top;l--){
            ans.add(matrix[l][left]);
        }
        left++;
        }

        }

        return ans;
    }
   
}
