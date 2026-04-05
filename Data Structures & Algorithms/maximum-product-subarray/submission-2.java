class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int prod = nums[0];
        for(int i=1;i<nums.length;i++){
            prod = prod * nums[i];
            if(prod>=max){
                max = prod;
            } else {
                prod = 1;
            }
        }

        return max;
        
    }
}
