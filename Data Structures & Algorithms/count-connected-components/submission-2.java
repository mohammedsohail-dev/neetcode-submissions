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
            if(visit[j] == false){
                dfs(j,graph,visit);
                count++;
            }
            
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
