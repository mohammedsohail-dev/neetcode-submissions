class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<hand.length;i++){
            map.put(hand[i] , map.getOrDefault(hand[i] , 0) + 1);
        }

        Arrays.sort(hand);

        for(int j = 0;j<hand.length;j++){
            if(map.get(hand[j])>0){
                for(int k = hand[j];k<hand[j]+groupSize;k++){
                    if(map.get(k)==null){
                        return false;
                    } else {
                        map.put(k, map.get(k) - 1);
                    }
                }
            }
        }

        return true;



    }
}
