class Solution {
    public boolean checkValidString(String s) {
        Stack<Character> stack = new Stack<>();
        char[] s_char = s.toCharArray();
        int left = 0;
        int right = s_char.length-1;


        while(left<right){
            if(s_char[left] == '(' && s_char[right] == ')'){
                s_char[left] = '1';
                s_char[right] = '1';
            }else if(s_char[left] == '*' && s_char[right] == ')') {
                s_char[left] = '1';
                s_char[right] = '1';
            } else if(s_char[left] == '(' && s_char[right] == '*') {
                s_char[left] = '1';
                s_char[right] = '1';
            } else if(s_char[left] == '*' && s_char[right] == '*'){
                s_char[left] = '1';
                s_char[right] = '1';
            }

            left++;
            right--;
        }

        int i = 0;
        while(i<s_char.length){
            if(s_char[i] == ')' || s_char[i] == '(') {
                return false;
            }
            i++;
        }
        
        return true;
    }
}
