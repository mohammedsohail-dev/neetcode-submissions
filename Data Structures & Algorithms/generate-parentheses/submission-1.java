class Solution {
    public List<String> generateParenthesis(int n) {
        List<Character> list = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        backtrack(n,0,0,list,ans);
        return ans;
    }
    public void backtrack(int n, int count_open, int count_closed, List<Character> list, List<String> main) {
        if(count_closed>count_open){
            return;
        }

        if(count_open == n && count_closed == n){
            StringBuilder str = new StringBuilder();
            for(int i=0;i<list.size();i++){
                str.append(list.get(i));
            }
            main.add(str.toString());
            return;
        }

        if(count_open<n){
            list.add('(');
            backtrack(n,count_open+1,count_closed,list,main);
            list.remove(list.size() - 1);
        }

        if(count_open>count_closed){
            list.add(')');
            backtrack(n,count_open,count_closed+1,list,main);
            list.remove(list.size() - 1);
        }
    }
}
