class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int edges = 0;
        boolean[] visited = new boolean[n];
        int[] dist = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        int node = 0;
        int res = 0;
        while(edges < n - 1){
            visited[node] = true;
            int nextNode = -1;
            for(int i=0;i<n;i++){
                if(visited[i]){
                    continue;
                }
                int currdist = Math.abs(points[node][0]-points[i][0])+Math.abs(points[node][1]-points[i][1]);
                dist[i] = Math.min(dist[i],currdist);
                if(nextNode == -1 || dist[i] < dist[nextNode]){
                    nextNode = i;
                }
            }
            res = res + dist[nextNode];
            node = nextNode;
            edges++;

        }
        return res;
    }
}
