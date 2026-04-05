class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0) {
            return -1;
        }
        int mid = nums.length/2;
        if(nums[mid]>target) {
            int[] sub = new int[mid];
            for(int i=0;i<mid;i++){
                sub[i] = nums[i];
            }
            return search(sub,target);
        } else if(nums[mid]<target) {
            int[] sub = new int[mid];
            for(int i=0;i<mid;i++){
                sub[i] = nums[mid+i];
            }
            return search(sub,target);
        } else  {
            return mid;
        }
    }
}
