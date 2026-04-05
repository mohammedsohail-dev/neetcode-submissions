class Solution {
    int[][] memo;
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        memo = new int[m][n];
        for(int[] ele:memo){
            Arrays.fill(ele,-1);
        }
        return dfs(word1,word2,0,0,m,n);
    }
    public int dfs(String word1, String word2, int i, int j, int m, int n){
        if(i == m) return n-j;
        if(j == n) return m-i;

        if(memo[i][j]!=-1){
            return memo[i][j];
        }

        if(word1.charAt(i) == word2.charAt(j)){
            return dfs(word1,word2,i+1,j+1,m,n);
        }

        int insert = dfs(word1,word2,i+1,j,m,n);
        int delete = dfs(word1,word2,i,j+1,m,n);
        int replace = dfs(word1,word2,i+1,j+1,m,n);
        int min = Math.min(insert,delete);
        min = Math.min(min,replace);
        memo[i][j] = min+1;
        return min+1;
    }
}
