class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        backtrack(nums, list, 0, set);
        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer> ele : set){
            ans.add(ele);
        }

        return ans;

    }

    public void backtrack(int[] nums, List<Integer> list, int i, HashSet<List<Integer>> set){
        if(i == nums.length) {
            set.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[i]);
        backtrack(nums, list, i+1,set);
        list.remove(list.size() - 1);
        backtrack(nums, list, i+1,set);
    }
}
