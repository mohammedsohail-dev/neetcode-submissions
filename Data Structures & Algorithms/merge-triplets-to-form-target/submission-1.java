class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        
        for(int i = 0; i <triplets.length; i++) {
            int[] triplet1 = triplets[i];
            for(int j = i+1 ; j<triplets.length ; j++){
                int[] triplet2 = triplets[i+1];
                if(Math.max(triplet1[0], triplet2[0]) == target [0] && Math.max(triplet1[1], triplet2[1]) == target[1] && Math.max(triplet1[2],triplet2[2]) == target[2]) {
                    return true;
                }
            }
        }
    return false;
    }
}
