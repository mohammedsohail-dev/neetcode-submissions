class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> num = new Stack<>();
        for(String token : tokens){
            if("+-*/".contains(token)){
                int ans = num.pop();
                while(!num.isEmpty()){
                    if(token.equals("+")){
                        ans = ans + num.pop();
                    } else if(token.equals("-")){
                        ans =  num.pop() - ans ;
                    } else if(token.equals("*")){
                        ans = ans * num.pop();
                    } else if(token.equals("/")){
                        ans = num.pop() / ans;
                    }
                }
                num.push(ans);
            } else {
                num.push(Integer.parseInt(token));
            }
        }
        return num.pop();
    }
}
