class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
        for(Integer num:nums){
            set.add(num);
        }

        int maxstreak = 0;
        for(Integer num:nums){
            int current = num;
            int streak = 0;
            while(set.contains(current)){
                streak++;
                current++;
            }
            maxstreak = Math.max(maxstreak,streak);
        }

        return maxstreak;
    }
}
