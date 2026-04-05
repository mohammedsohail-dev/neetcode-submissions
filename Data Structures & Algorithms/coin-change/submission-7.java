class Solution {
    HashMap<Integer, Integer> map;
    public int coinChange(int[] coins, int amount) {
        map = new HashMap<>();
        for(int i = 0;i<=amount;i++){
            map.put(amount, helper(coins, amount));
        }
        
        return map.get(amount);
    }
    public int helper(int[] coins, int amount){
        if(amount == 0){
            return 0;
        }

        if(map.containsKey(amount)){
            return map.get(amount);
        }

        int min = Integer.MAX_VALUE;

        for(int i = 0;i<coins.length;i++){
            if(amount-coins[i] >= 0){
                min = Math.min(min, 1 + helper(coins, amount - coins[i]));
            }
        }

        if(min == Integer.MAX_VALUE){
            min = -2;
        }

        return min;
    }
}
