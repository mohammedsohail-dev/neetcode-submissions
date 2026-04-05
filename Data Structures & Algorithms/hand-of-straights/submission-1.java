class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) {
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int p = 0;p<hand.length;p++){
            map.put(hand[p], map.getOrDefault(hand[p], 0) + 1);
        }
        Arrays.sort(hand);
 
        for(int num: hand) {
            if(map.get(num) > 0){
                for(int i=num;i<num+groupSize;i++){
                    if(map.getOrDefault(i, 0) == 0) return false;
                    map.put(i, map.get(i) - 1);
                }
            }
        }
        
        return true;
    }
}
