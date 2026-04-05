class Solution {
    public boolean checkValidString(String s) {
        return decision(s,0,0);
    }

    public boolean decision(String s, int i, int open){
        if(open<0){
            return false;
        }

        if(i == s.length()){
            return open == 0;
        }

        if(s.charAt(i) == '(') {
            return decision(s, i+1, open+1);
        } else if(s.charAt(i) == ')'){
            open--;
            return decision(s,i+1,open);
        } else {
            return decision(s,i+1,open+1) || decision(s,i+1,open) || decision(s,i+1,open-1);
        }

    }
}
