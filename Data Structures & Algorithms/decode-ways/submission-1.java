class Solution {
    public int numDecodings(String s) {
        HashMap<Integer,Integer> map = new HashMap<>();
        return dfs(0,s,map);
    }

    public int dfs(int i, String s,HashMap<Integer, Integer> map){
        if(map.get(i)!=null){
            return map.get(i);
        }

        if(i==s.length()){
            return 1;
        }

        if(s.charAt(i) == '0'){
            return 0;
        }

        int br1 = dfs(i+1,s,map);
        
        int br2 = 0;
        if(i< s.length()-1){
            if(s.charAt(i) == '1' || s.charAt(i) == '2' && s.charAt(i+1) < '7' ){
                br2 = dfs(i+2,s,map);
            }
        }

        map.put(i,br1+br2);
        return br1+br2;
    }
}
