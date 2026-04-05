class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b)->
            (
                 a[0]*a[0] + a[1]*a[1] - b[0]*b[0] - b[1]*b[1]
            )
        );
        for(int[] point : points){
            pq.add(point);
        }

        int[][] ans = new int[k][2];
        for(int i=0;i<k;i++){
            int[] poll = pq.poll();
            ans[i][0] = poll[0];
            ans[i][1] = poll[1];
        }
        
        return ans;
    }
}
