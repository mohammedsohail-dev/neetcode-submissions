class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_count = 0;
        for(int i=0;i<s.length();i++){
            int count = 0;
            HashSet<Character> set = new HashSet<>();
            if(set.isEmpty()){
                set.add(s.charAt(i));
                count = count+1;
            }
            for(int j=i+1;j<s.length();j++){
                if(set.contains(s.charAt(j))){
                    max_count = Math.max(max_count,count);
                    break;
                } else {
                    count++;
                    set.add(s.charAt(j));
                    max_count = Math.max(max_count,count);
                }   
            }
        }

        return max_count;
    }
}
