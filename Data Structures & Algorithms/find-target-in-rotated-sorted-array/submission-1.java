class Solution {
    public int search(int[] nums, int target) {
    int left = 0;
    int right = nums.length-1;

    while(left<right){
        int mid = (left+right)/2;
        if(nums[mid]<nums[right]){
            right = mid;
        } else {
            left = mid+1;
        }
    }

    int pivot = left;
    if(binarySearch(nums,0,pivot-1,target) == -1) {
        return binarySearch(nums,pivot,nums.length-1,target);
    } else {
        return binarySearch(nums,0,pivot-1,target);
    }
    }

    public int binarySearch(int[] nums, int left, int right, int target){
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            } else {
                if(nums[mid]>target) {
                    right = mid-1;
                } else {
                    left = mid+1;
                }
            }
        }
        return -1;
    }
}
