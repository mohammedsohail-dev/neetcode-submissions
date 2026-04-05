class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int res = 0;
        for(Integer num:nums){
            set.add(num);
        }

        for(int num: nums){
            int streak =0;
            int curr = num;
            while(set.contains(curr)){
                curr++;
                streak++;
            }
            res = Math.max(res,streak);
        }
        return res;

    }
}
