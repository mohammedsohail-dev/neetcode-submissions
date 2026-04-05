class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }

        for(int j = 0;j<prerequisites.length;j++){
            int crs = prerequisites[j][0];
            int req = prerequisites[j][1];
            graph.get(crs).add(req);
        }

        boolean[] visit = new boolean[numCourses];
        boolean[] path = new boolean[numCourses];
        List<Integer> path_list = new ArrayList<>();
        
        for(int k = 0;k<numCourses;k++){
            if(dfs(k,graph,visit,path,path_list)){
                return new int[0];
            }
        }

        int[] ans = new int[numCourses];
        for(int i = 0; i < numCourses; i++){
            ans[i] = path_list.get(i);
        }

        return ans;

    
    }

    public boolean dfs(int node, List<List<Integer>> graph, boolean[] visit, boolean[] path, List<Integer> path_list){
        if(path[node]) return true;
        if(visit[node]) return false;

        visit[node] = true;
        path[node] = true;

        for(int nei : graph.get(node)){
            if(dfs(nei,graph,visit,path, path_list)){
                return true;
            }
        }

        

        path[node] = false;
        path_list.add(node);
        return false;
    }


}
