class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0) + 1 );
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> map.get(a) - map.get(b));
        for(int num:nums){
            pq.add(num);
        }

        return pq.poll();
        
    }
}
