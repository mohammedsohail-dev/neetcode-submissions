class Solution {
    int min = Integer.MAX_VALUE;
    public int coinChange(int[] coins, int amount) {
        dfs(coins, amount, 0);
        if(min == Integer.MAX_VALUE){
            return -1;
        }
        
        return min;  
    }
    public void dfs(int[] coins, int amount, int pieces){
        if(amount == 0){
            min = Math.min(min,pieces);        
        }

        for(int i = coins.length-1;i>=0;i--){
            if(amount-coins[i] >= 0){
                dfs(coins, amount - coins[i], pieces+1);
            }
        }
    }
}
