class Solution {
    public int numDecodings(String s) {
        return dfs(0,s);
    }

    public int dfs(int i, String s){
        if(i==s.length()){
            return 1;
        }

        if(s.charAt(i) == '0'){
            return 0;
        }

        int br1 = dfs(i+1,s);
        
        int br2 = 0;
        if(i< s.length()-1){
            if(s.charAt(i) == '1' || s.charAt(i) == '2' && s.charAt(i+1) < '7' ){
                br2 = dfs(i+2,s);
            }
        }

        return br1+br2;
    }
}
