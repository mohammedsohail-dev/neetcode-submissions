class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] par = new int[edges.length+1];
        int[] rank = new int[edges.length+1];
        for(int i = 0;i<par.length;i++){
            par[i] = i;
            rank[i] = 1;
        }

        for(int[] edge:edges){
            int n1 = edge[0];
            int n2 = edge[1];

            int p1 = find(par,n1);
            int p2 = find(par,n2);

            if(p1 == p2) {
                return edge;
            }

            if(rank[p1]>rank[p2]){
                par[p2] = p1;
                rank[p1] = rank[p1] + rank[p2];
            } else {
                par[p1] = p2;
                rank[p2] = rank[p2] + rank[p1];
            }

        }

        return new int[0];
    }

    public int find(int[] par,int n){
        int p = par[n];
        if(p!=par[p]){
            p = find(par,par[p]);
        }
        return p;
    }
    

}
