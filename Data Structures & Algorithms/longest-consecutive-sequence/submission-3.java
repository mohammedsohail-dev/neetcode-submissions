class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int p=0;p<nums.length;p++){
            set.add(nums[p]);
        }

        int ans = 0;
        for(int i=0;i<nums.length;i++){
            int streak = 0;
            int curr = nums[i];
            for(int j=0;j<nums.length;j++){
                if(set.contains(curr)){
                    curr++;
                    streak++;
                }
            }
            ans = Math.max(ans,streak);
        }
        return ans;
    }
}
