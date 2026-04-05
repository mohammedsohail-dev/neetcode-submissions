class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        for(int i = 0;i<target.length; i++){
            int target_num = target[i];
            for(int j = 0;j<triplets.length;j++){
                if(triplets[j][i]> target_num){
                    return false;
                }
            }
        }

        return true;
    }

}
