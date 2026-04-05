class Solution {
    public boolean checkValidString(String s) {
        return dfs( 0, 0, s);
    }

    public boolean dfs(int open, int i, String s){
        if(open<0) return false;
        if(i == s.length()) return open == 0;

        if(s.charAt(i) == '('){
            return dfs(open+1, i+1, s);
        } else if(s.charAt(i) == ')') {
            return dfs(open-1, i+1, s);
        } else {
            return dfs(open, i+1, s) || dfs(open+1, i+1,s) || dfs(open-1, i+1, s); 
        }

    }
}
