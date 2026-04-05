class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<>();
        for(Character c:s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == map.get(c)){
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        if(stack.isEmpty()){
            return true;
        }

        return false;
    }
}
