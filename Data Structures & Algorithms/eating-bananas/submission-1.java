class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i=0;i<piles.length;i++){
            max = Math.max(piles[i],max);
        }

        int left = 0;
        int right = max;
        while(left<right){
            int mid = (left+right)/2;
            double time = 0;
            for(int k=0;k<piles.length;k++){
                time = time + Math.ceil((double) piles[k]/mid);
            }
            if(time>h){
                left = mid+1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
