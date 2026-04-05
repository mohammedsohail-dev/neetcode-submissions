class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            int target = nums[i];
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                if(target == -(nums[left]+nums[right])){
                  List<Integer> sub = new ArrayList<>();
                  sub.add(target);
                  sub.add(nums[left]);
                  sub.add(nums[right]);
                  set.add(sub);
                  left++;
                  right--;  
                } else if(target > -(nums[left]+nums[right])) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        for(List<Integer> entry : set){
            ans.add(entry);
        }

        return ans;
    }
}
