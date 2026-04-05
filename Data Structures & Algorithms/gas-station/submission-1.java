class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum_gas = 0;
        int sum_cost = 0;
        int[] diff = new int[gas.length];
        for(int i=0;i<gas.length;i++){
            sum_gas = sum_gas + gas[i];
            sum_cost = sum_cost + cost[i];
            diff[i] = gas[i]-cost[i];
        }

        if(sum_gas-sum_cost<0){
            return -1;
        }

        int prospective_ans = 0;
        for(int j=0;j<diff.length;j++){
            if(diff[j]>0){
                prospective_ans = j;
            } else {
                prospective_ans = j+1;
            }
        }

        return prospective_ans;
    }
}
