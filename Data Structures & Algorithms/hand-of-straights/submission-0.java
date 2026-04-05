class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) {
            return false;
        }
        Arrays.sort(hand);

        int no_of_groups = hand.length / groupSize;
        for(int i = 0;i<no_of_groups;i++){
            int start = i;
            while(start+2 < hand.length){
                if(hand[start]+1 != hand[start + 2]){
                    return false;
                }
                start = start + 2;
            }
        }

        return true;
        
    }
}
