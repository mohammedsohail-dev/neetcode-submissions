class Solution {
    public boolean checkValidString(String s) {
        Stack<Character> stack = new Stack<>();
        char[] str_char = s.toCharArray();
        for(Character str : str_char){
            if(str == '('){
                stack.push('(');
            }

            if(str == '*' && stack.isEmpty()){
                stack.push('*');
            }else if(str == '*' && !stack.isEmpty()){
                if(stack.peek() == '(') {
                    stack.pop();
                }
            }

            if(str == ')' && !stack.isEmpty()){
                if(stack.peek() == '(' || stack.peek() == '*'){
                    stack.pop();
                }
            }
        }

        if(stack.size() != 0){
            return false;
        } else {
            return true;
        }
        
    }
}
