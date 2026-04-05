class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(nums,visited,res, list);
        return res;
    }
    public void backtrack(int[] nums, boolean[] visited,List<List<Integer>> res, List<Integer> list){
        if(list.size() == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i = 0;i<nums.length;i++){
            if(visited[i]==false){
                list.add(nums[i]);
                visited[i] = true;
                backtrack(nums, visited, res,list);

                list.remove(list.size() - 1);
                visited[i] = false;
            }
        }


    }
    
}
