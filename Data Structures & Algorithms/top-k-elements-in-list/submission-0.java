class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer num: nums){
            map.putIfAbsent(num, 0);
            map.put(num, map.get(num)+1);
        }
        List<int[]> lis = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int[] temp = new int[2];
            temp[0]=entry.getValue();
            temp[1]=entry.getKey();
            lis.add(temp);
        }

        lis.sort((a,b) -> b[0] - a[0]);
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = lis.get(i)[1];
        }

        return ans;
    }
}
