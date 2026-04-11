class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] og = new int[n];
        Arrays.fill(og, Integer.MAX_VALUE);
        og[src] = 0;
        int i = 0;
        while(i<k+1){
            int[] temp = new int[n];
            for(int j=0;j<n;j++){
                temp[j] = og[j];
            }
            for(int[] flight:flights){
                int source = flight[0];
                int destination = flight[1];
                int cost = flight[2];
                if(og[source] == Integer.MAX_VALUE){
                    continue;
                }
                if(og[source]+cost<temp[destination]){
                    temp[destination] = og[source]+cost;
                }
            }
            og = temp;
            i++;
        }

        if(og[dst] == Integer.MAX_VALUE){
            return -1;
        }
        return og[dst];
    }
}
