class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int left = 0;left<s.length();left++){
            for(int right = left;right<s.length();right++){
                if(s.substring(left,right+1).equals(new StringBuilder(s.substring(left,right+1)).reverse().toString())){
                    count++;
                }
            }
        }

        return count;
    }
}
