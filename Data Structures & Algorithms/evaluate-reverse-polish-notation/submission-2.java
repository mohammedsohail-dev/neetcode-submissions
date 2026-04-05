class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")) {
                int answer  = 0;
                while(!stack.isEmpty()){
                    answer = answer + stack.pop();
                }
                stack.push(answer);
            } else if(tokens[i].equals("-")) {
                int answer  = 0;
                while(!stack.isEmpty()){
                    answer = answer - stack.pop();
                }
                stack.push(answer);
            } else if(tokens[i].equals("*")) {
                int answer  = 1;
                while(!stack.isEmpty()){
                    answer = answer * stack.pop();
                }
                stack.push(answer);
            } else if(tokens[i].equals("/")) {
                int answer  = 1;
                while(!stack.isEmpty()){
                    answer = stack.pop() / answer;
                }
                stack.push(answer);
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
}
