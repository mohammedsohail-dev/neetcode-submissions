class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newstr= new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                newstr.append(Character.toLowerCase(c));
            }
        }
        String str = newstr.toString();
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            j--;
            i++;
        }

        return true;
}
}