class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        HashMap<Integer, List<int[]>> map = new HashMap<>();
        for(int[] time:times){
            int source = time[0];
            int target = time[1];
            int cost = time[2];
            if(!map.containsKey(source)){
                map.put(source, new ArrayList<>());
            }
            map.get(source).add(new int[]{target, cost});
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        HashSet<Integer> visit = new HashSet<>();
        pq.add(new int[]{0,k});
        int t = 0;
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int w1 = curr[0];
            int n1 = curr[1];
            if(visit.contains(n1)){
                continue;
            }
            visit.add(n1);
            t = w1;

            if(map.containsKey(n1)){

                for(int[] next : map.get(n1)){
                    int n2 = next[0];
                    int w2 = next[1];
                    if(!visit.contains(n2)){
                        pq.add(new int[]{w1+w2,n2});
                    }

                }
            }




        }

        return visit.size() == n ? t : -1;
    }
}
