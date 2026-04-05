class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        int ans = 0;
        for(int i=0;i<piles.length;i++){
            max = Math.max(piles[i],max);
        }

        for(int j=1;j<=max;j++){
            double time = 0;
            for(int k=0;k<piles.length;k++){
                time = time + Math.ceil((double) piles[k]/j);
            }
            if(time<=h){
                ans = j;
                break;
            }
        }
        return ans;
    }
}
