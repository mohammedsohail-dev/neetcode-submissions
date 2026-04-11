class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0;i<=n;i++){
            int res = 0;
            int num = i;
            while(num!=0){
                res = res + (num & 1);
                num = num>>1;
            }
            ans[i] = res;
        }
        return ans;
    }
}
