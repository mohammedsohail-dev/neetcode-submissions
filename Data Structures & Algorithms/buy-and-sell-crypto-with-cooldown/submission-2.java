class Solution {
    int max = Integer.MIN_VALUE;
    HashMap<Integer, HashMap<Integer, Integer>> map;
    public int maxProfit(int[] prices) {
        map = new HashMap<>();
        return dfs(prices, false, 0);
    }
    public int dfs(int[] prices,boolean bought, int i){
        if(i>=prices.length){
            return 0;
        }

        if(bought){
            if(map.get(i)!=null){
                if(map.get(i).get(0)!=null){
                    return map.get(i).get(0);
                }
            }
        } else {
            if(map.get(i)!=null){
                if(map.get(i).get(1)!=null){
                    return map.get(i).get(1);
                }
            }
        }

        int cooldown = dfs(prices, bought,i+1);

        if(bought){
            int sell = dfs(prices, false, i+2) + prices[i];
            HashMap<Integer, Integer> sub_map = new HashMap<>();
            sub_map.put(0,Math.max(cooldown,sell));
            map.put(i, sub_map);
            return Math.max(cooldown, sell);
        }

        int buy = dfs(prices, true, i+1) - prices[i];
        HashMap<Integer, Integer> sub_map = new HashMap<>();
        sub_map.put(1,Math.max(cooldown,buy));
        map.put(i, sub_map);
        return Math.max(buy, cooldown);
    }
}
