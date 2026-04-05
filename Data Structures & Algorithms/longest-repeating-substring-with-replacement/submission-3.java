class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int[] count = new int[26];
        int max_count = 0;
        for(int right = 0;right<s.length();right++){
            count[s.charAt(right) - 'A']++;
            int max_val = 0;
            for(int i=0;i<count.length;i++){
                max_val = Math.max(max_val,count[i]);
            }

            if(right-left+1-max_val>k){
                count[s.charAt(left) - 'A']--;
                left++;
            }
            
            max_count = Math.max(max_count,right-left+1);
        }
        return max_count;
    }
}
