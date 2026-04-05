class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str.append(s.charAt(i));
            }
        }
        String filstr = str.toString().toLowerCase();
        int i=0;
        int j=filstr.length() - 1;
        while(i<j){
            if(filstr.charAt(i) == filstr.charAt(j)){
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
