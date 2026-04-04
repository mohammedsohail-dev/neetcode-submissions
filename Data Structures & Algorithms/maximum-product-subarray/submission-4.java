class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        
        for(int i = 0;i<nums.length;i++){
            int curr = nums[i];
            res= Math.max(res,curr);
            for(int j = i+1;j<nums.length;j++){
                curr = curr * nums[j];
                res= Math.max(res,curr);
            }
        }

        return res;
        
    }
    
}
