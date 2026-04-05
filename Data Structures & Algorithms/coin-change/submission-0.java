class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        return dfs(coins, amount, 0);
    }
    public int dfs(int[] coins, int amount, int pieces){
        if(amount == 0){
            return pieces;        
        }

        int chosen_coin = -1;
        for(int i = coins.length-1;i>=0;i--){
            if(amount-coins[i] >= 0){
                chosen_coin = i;
                break;
            }
        }

        if(chosen_coin == -1){
            return -1;
        }

        return dfs(coins, amount - coins[chosen_coin], pieces+1);

    }
}
