class Solution {
    public boolean hasDuplicate(int[] nums) {
        int size = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<size;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}