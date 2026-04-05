class Solution {
    public boolean checkValidString(String s) {
        Stack<Character> stack = new Stack<>();
        char[] s_char = s.toCharArray();
        int left = 0;
        int right = s_char.length-1;

        while(left<right){
            if(s_char[left] == '(' && s_char[right] == ')'){
                left++;
                right--;
            }else if(s_char[left] == '*' && s_char[right] == ')') {
                left++;
                right--;
            } else if(s_char[left] == '(' && s_char[right] == '*') {
                left++;
                right--;
            } else if(s_char[left] == '*' && s_char[right] == '*'){
                left++;
                right--;
            }
        }

        if(s_char[left] == '*'){
            return true;
        } else {
            return false;
        }
        
    }
}
