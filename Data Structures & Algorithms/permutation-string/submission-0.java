class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int count_s1[] = new int[26];
        for(int i=0;i<s1.length();i++){
            count_s1[s1.charAt(i) - 'a']++;
        }

        for(int a=0;a<s2.length();a++){
            int[] count_window = new int[26];
            for(int b = a+s1.length();b<s2.length();b++){
                for(int c = a; c<b ; c++){
                    count_window[s2.charAt(c) - 'a']++;
                }
                if(Arrays.equals(count_s1,count_window)) {
                    return true;
                }
            } 
        }
        return false;
    }
}
