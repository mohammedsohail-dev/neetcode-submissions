class Solution {
    int min = Integer.MAX_VALUE;
    public int coinChange(int[] coins, int amount) {
        HashMap<Integer, Integer> map = new HashMap<>();
        dfs(coins, amount, 0, map);
        if(min == Integer.MAX_VALUE){
            return -1;
        }

        return min;  
    }
    public void dfs(int[] coins, int amount, int pieces, HashMap<Integer,Integer> map){
        if(map.get(amount)!=null){
            min = Math.min(min,map.get(amount));
            return;
        }

        if(amount == 0){
            map.put(amount,pieces);
            min = Math.min(min,pieces); 
            return;       
        }

        for(int i = coins.length-1;i>=0;i--){
            if(amount-coins[i] >= 0){
                dfs(coins, amount - coins[i], pieces+1,map);
            }
        }
    }
}
