class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < numCourses; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] pre : prerequisites){
            int course = pre[0];
            int prereq = pre[1];
            graph.get(prereq).add(course);
        }

        int[] visit = new int[numCourses]; // 0=unvisited, 1=visiting, 2=visited
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < numCourses; i++){
            if(!dfs(i, graph, visit, result)){
                return new int[0]; 
            }
        }

        // reverse result
        int[] ans = new int[numCourses];
        for(int i = 0; i < numCourses; i++){
            ans[i] = result.get(numCourses - 1 - i);
        }

        return ans;
    }

    public boolean dfs(int node, List<List<Integer>> graph, int[] visit, List<Integer> result){
        if(visit[node] == 1) return false; // cycle
        if(visit[node] == 2) return true;

        visit[node] = 1;

        for(int nei : graph.get(node)){
            if(!dfs(nei, graph, visit, result)){
                return false;
            }
        }

        visit[node] = 2;
        result.add(node); // postorder

        return true;
    }
}