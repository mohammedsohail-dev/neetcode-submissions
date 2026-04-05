class Solution {
    int[][] memo;
    public int change(int amount, int[] coins) {
        memo = new int[coins.length][amount+1];
        return dfs(coins, amount, 0);
    }
    public int dfs(int[] coins, int amount, int i){
        if(amount == 0){
            return 1;
        }

        if(amount < 0){
            return 0;
        }

        if(i == coins.length){
            return 0;
        }

        if(memo[i][amount]!=0){
            return memo[i][amount];
        }

        int take = dfs(coins, amount-coins[i], i);

        int skip = dfs(coins, amount, i+1);

        memo[i][amount] = take+skip;
        return take+skip;
    }
}
