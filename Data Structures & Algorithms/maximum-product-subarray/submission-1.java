class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int prod = 1;
        for(int i=0;i<nums.length;i++){
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
