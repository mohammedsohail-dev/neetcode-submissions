class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] pref = new int[n];
        int[] suff = new int[n];

        pref[0] = 1;
        suff[n-1] = 1;
        for(int i=1;i<n;i++){
            pref[i] = pref[i-1]*nums[i-1];
        }

        for(int j=n-2;j>=0;j--){
            suff[j] = suff[j+1]*nums[j+1];
        }

        for(int i=0;i<n;i++){
            res[i] = pref[i] * suff[i];
        }

        return res;
    }
}  
