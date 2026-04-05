class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> dump = new ArrayList<>();
        backtrack(dump,n, "", 0,0);
        return dump;
    }

    public void backtrack(List<String> dump,int n, String s, int open, int close){
        if(open == close && open == n){
            dump.add(s);
        }

        if(open < n){
            backtrack(dump, n, s+"(" , open+1, close);
        }

        if(open > close) {
            backtrack(dump, n, s+")", open, close+1);
        }
    }
}
