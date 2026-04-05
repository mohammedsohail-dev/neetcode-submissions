class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        return dfs(s, wordDict, 0);
    }
    public boolean dfs(String s,List<String> dict, int i){
        if(i==s.length()){
            return true;
        }

        for(String word:dict){
            if(word.length()+i<=s.length()){
                if(s.substring(i,i+word.length()).equals(word)){
                    return dfs(s,dict,i+word.length());
                }
            }
        }

        return false;
    }
}
