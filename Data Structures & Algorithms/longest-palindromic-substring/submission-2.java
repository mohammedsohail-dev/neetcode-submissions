class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        for(int left = 0;left<s.length();left++){
            for(int right = left;right<s.length();right++){
                if(s.substring(left,right+1).equals(new StringBuilder(s.substring(left,right+1)).reverse().toString()) && ans.length() < s.substring(left,right+1).length()){
                    ans = s.substring(left,right+1);
                }
            }
        }

        return ans;
    }
}
