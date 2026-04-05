class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] edge:edges){
            int a = edge[0];
            int b = edge[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        int count = 0;

        boolean[] visit = new boolean[n];
        for(int j = 0;j<n;j++){
            dfs(j,graph,visit);

            for(int k=0;k<n;k++){
                if(visit[k] == false){
                    count++;
                    j = k;
                }
            }
        }

        if(count == 0){
            return 1;
        }

        return count;
    }
    public void dfs(int node,List<List<Integer>> graph,boolean[] visit){
        if(visit[node]) return;

        visit[node] = true;
        for(int nei:graph.get(node)){
            dfs(nei,graph,visit);
        }
    }
}
