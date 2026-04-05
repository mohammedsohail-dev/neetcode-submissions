class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for(int i = 0;i<gas.length;i++){
            int pos = i;
            int tank = 0;
            int count = 0;
            for(int j = pos;j<pos+gas.length;j++){
                int index = j % gas.length;
                tank = tank + gas[index] - cost[index];
                count++;

                if(tank<=0){
                    break;
                }
            }
            if(count == gas.length){
                return pos;
            }
        }

        return -1;
    }
}
