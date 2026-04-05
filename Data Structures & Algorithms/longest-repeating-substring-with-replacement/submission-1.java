class Solution {
    public int characterReplacement(String s, int k) {
        int max_count = 0;
        for(int i=0;i<s.length();i++){
            HashSet<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            int count = 1;
            int disp = k;
            for(int j=0;j<s.length();j++){
                if(set.contains(s.charAt(j))){
                    count++;
                    max_count = Math.max(max_count,count);
                } else if(k!=0) {
                    k--;
                    count++;
                    max_count = Math.max(max_count,count);
                } else if(k==0) {
                    max_count = Math.max(max_count,count);
                    break;
                }
            }
        }

        return max_count-1;
    }
}
