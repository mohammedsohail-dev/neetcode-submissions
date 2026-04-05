class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(map.get(a)-map.get(b)));

        for(Integer num : map.keySet()){
            pq.add(num);

            if(pq.size()>k){
                pq.poll();
            }
        
        }

        int[] ans = new int[k];

        for(int l=0;l<k;l++){
            ans[l] = pq.poll();
        }

        return ans;
    }
}
