class Solution {
    Boolean[][] memo;
    public boolean checkValidString(String s) {
        memo = new Boolean[s.length()][s.length()];
        return dfs( 0, 0, s);
    }

    public boolean dfs(int open, int i, String s){
        if(open<0) return false;
        if(i == s.length()) return open == 0;

        if(memo[open][i]!=null) return memo[open][i];

        if(s.charAt(i) == '('){
            memo[open][i] = dfs(open+1, i+1, s);
            return memo[open][i];
        } else if(s.charAt(i) == ')') {
            memo[open][i] = dfs(open-1, i+1, s);
            return memo[open][i];
        } else {
            memo[open][i] = dfs(open, i+1, s) || dfs(open+1, i+1,s) || dfs(open-1, i+1, s); 
            return memo[open][i];
        }
    }
}
