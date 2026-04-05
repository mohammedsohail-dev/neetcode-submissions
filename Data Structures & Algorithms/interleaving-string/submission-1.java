class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length() + s2.length() != s3.length()){
            return false;
        }
        return dfs(s1,s2,s3,0,0,0,s1.length(),s2.length(),s3.length());
    }

    public boolean dfs(String s1, String s2, String s3, int i, int j, int k, int m, int n, int o){
        if(i == m && j == n && k == o){
            return true;
        }


        boolean str1 = false;
        if(i < m && s1.charAt(i) == s3.charAt(k)){
            str1 = dfs(s1,s2,s3,i+1,j,k+1,m,n,o);
        }

        boolean str2 = false;
        if(j < n && s2.charAt(j) == s3.charAt(k)){
            str1 = dfs(s1,s2,s3,i,j+1,k+1,m,n,o);
        }

        return str1 || str2;
    }
}
