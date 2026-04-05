class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 1){
            return s;
        }
        
        String ans = "";
        for(int left = 0;left<s.length();left++){
            for(int right = left;right<s.length();right++){
                if(s.substring(left,right).equals(new StringBuilder(s.substring(left,right)).reverse().toString()) && ans.length() < s.substring(left,right).length()){
                    ans = s.substring(left,right);
                }
            }
        }

        return ans;
    }
}
