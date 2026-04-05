class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        for(int i=0;i<gas.length;i++){
            int start = i;
            int tank = 0;
            int count = 0;
            for(int j = 0;j<gas.length;j++){
                int index = (start + j) % gas.length;
                tank = tank + gas[index] - cost[index];
                if(tank>0){
                    count++;
                }
            }
            if(count==gas.length){
                return start;
            }
        }

        return -1;
    }
}
