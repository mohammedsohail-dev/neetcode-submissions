class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int count_s1[] = new int[26];
        for(int i=0;i<s1.length();i++){
            count_s1[s1.charAt(i) - 'a']++;
        }

        for(int a=0;a<s2.length()-s1.length();a++){
            int[] count_window = new int[26];
            for(int b = a;b < a + s1.length(); b++){
                count_window[s2.charAt(b) - 'a']++;
            }

            if(Arrays.equals(count_window,count_s1)){
                return true;
            }
        }

    return false;    
    }
}
