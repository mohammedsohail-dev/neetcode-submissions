class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() = 1) {
            return 1;
        }

        HashSet<Character> set = new HashSet<>();
        int len = 0;
        int maxlen = 0;
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                maxlen = Math.max(maxlen, len);
                len = 0;
            }
            len++;
            set.add(s.charAt(i));
        }
        
        return maxlen;
    }
}
