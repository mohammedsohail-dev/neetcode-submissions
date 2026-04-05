class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(candidates);
        backtrack(candidates,0,0,target,list,set);
        return new ArrayList<>(set);
    }
    public void backtrack(int[] candidates, int i,int sum, int target, List<Integer> list, HashSet<List<Integer>> set) {
        if(sum == target) {
            set.add(new ArrayList<>(list));
            return;
        }

        if(sum>target || i == candidates.length){
            return;
        }

        sum = sum + candidates[i];
        list.add(candidates[i]);
        backtrack(candidates, i+1, sum, target,list,set);
        sum = sum - candidates[i];
        list.remove(list.size()-1);
        backtrack(candidates, i+1, sum, target, list, set);

    }
}
