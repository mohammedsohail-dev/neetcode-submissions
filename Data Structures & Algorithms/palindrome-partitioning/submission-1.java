class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> list = new ArrayList<>();
        backtrack(s,0,list,res);
        return res;
    }

    public void backtrack(String s, int start, List<String> list, List<List<String>> res){
        if(start == s.length()){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i = start+1; i<=s.length();i++){
            String sub = s.substring(start, i);

            if(isPalindrome(sub)){
                list.add(sub);
                backtrack(s,i,list,res);
                list.remove(list.size() - 1);
            }
        }

    }

    public boolean isPalindrome(String s){
        String reverse = new StringBuilder(s).reverse().toString();
        return s.equals(reverse);
    }
}
