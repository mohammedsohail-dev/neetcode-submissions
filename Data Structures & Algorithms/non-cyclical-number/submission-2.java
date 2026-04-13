class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        return happy(n,set);
    }

    public boolean happy(int n, HashSet<Integer> set){
        if(n == 1) {
            return true;
        }

        if(set.contains(n)){
            return false;
        }

        set.add(n);

        String str = String.valueOf(n);
        char[] arr = str.toCharArray();
        int square = 0;
        for(char c : arr){
            square = square + (c-'0') * (c-'0');
        }

        

        return happy(square, set);
    }
}
