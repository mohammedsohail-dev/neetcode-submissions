class Solution {
    HashMap<Integer, Boolean> map;
    public boolean wordBreak(String s, List<String> wordDict) {
        map = new HashMap<>();
        return dfs(s, wordDict, 0);
    }
    public boolean dfs(String s,List<String> dict, int i){
        if(i==s.length()){
            return true;
        }

        if(map.containsKey(i)){
            return map.get(i);
        }

        for(String word:dict){
            if(word.length()+i<=s.length()){
                if(s.substring(i,i+word.length()).equals(word)){
                    if(dfs(s,dict,i+word.length())){
                        map.put(i, true);
                        return true;
                    }
                }
            }
        }

        map.put(i, false);
        return false;
    }
}
