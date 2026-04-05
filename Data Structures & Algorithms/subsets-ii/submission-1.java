class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        backtrack(nums,0,res, list);
        return new ArrayList<>(res);
    }
    public void backtrack(int[] nums, int i, Set<List<Integer>> res, List<Integer> list){
        if(i == nums.length){
            return;
        }
        
        list.add(nums[i]);
        res.add(new ArrayList<>(list));
        backtrack(nums, i+1, res,list);
        list.remove(list.size() - 1);
        res.add(new ArrayList<>(list));
        backtrack(nums, i+1, res, list);  
    }
}
