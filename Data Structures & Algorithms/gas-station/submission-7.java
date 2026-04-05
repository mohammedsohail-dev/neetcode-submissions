class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
      for(int i = 0;i<gas.length;i++){
        int start = i;
        int tank = 0;
        int count = 0;
        for(int j = start;j<start+gas.length;j++){
            int index = j % gas.length;
            tank = tank + gas[index] - cost[index];
            
            if(tank<0){
                break;
            }
            count++;
        }
        if(count == gas.length){
            return start;
        }
      }

      return -1;  
    }
}
