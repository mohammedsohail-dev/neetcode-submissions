class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        backtrack(nums, 0, target, list,set,0);
        return new ArrayList<>(set);
        
    }

    public void backtrack(int[] nums, int i, int target, List<Integer> list, HashSet<List<Integer>> set, int sum) {
        if(i == nums.length || sum > target){
            return;
        }

        if(sum == target){
            set.add(new ArrayList<>(list));
            return;
        }

        sum = sum + nums[i];
        list.add(nums[i]);
        backtrack(nums, i, target, list, set, sum);

        sum = sum - nums[i];
        list.remove(list.size() - 1);
        backtrack(nums, i+1, target, list, set, sum);
    }
}
