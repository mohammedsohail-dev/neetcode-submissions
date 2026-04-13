class Solution {
    public int[] plusOne(int[] digits) {
        long num = 0;
        for(int i = 0;i<digits.length;i++){
            num = num + digits[i];
            if(i!=digits.length-1){
                num = num * 10;
            }
        }

        num++;
        String str = String.valueOf(num);
        char[] arr = str.toCharArray();
        int[] ans = new int[arr.length];
        for(int j = 0;j<arr.length;j++){
            ans[j] = arr[j]-'0';
        }

        return ans;
        
    }
}
