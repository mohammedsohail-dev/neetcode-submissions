class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }

        for(int j = 0;j<prerequisites.length;j++){
            int req = prerequisites[j][0];
            int crs = prerequisites[j][1];
            graph.get(crs).add(req);
        }

        boolean[] path = new boolean[numCourses];
        for(int k = 0;k<numCourses;k++){
            if(dfs(k,graph,path)){
                return false;
            }
        }

        return true;

    }

    public boolean dfs(int node,List<List<Integer>> graph,boolean[] path){
        if(path[node] == true) return true;

        path[node] = true;
        for(int nei: graph.get(node)){
            if(dfs(nei,graph,path)){
                return true;
            }
        }

        path[node] = false;
        return false;
    }
}
