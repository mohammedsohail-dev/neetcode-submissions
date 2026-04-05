class Solution {
    public int maxArea(int[] heights) {
        int maxarea = 0;
        int left = 0;
        int right = heights.length-1;

        while(left<right){
            int area = (right-left) * Math.min(heights[right], heights[left]);
            maxarea = Math.max(area,maxarea);
            if(heights[left]<=heights[right]){
                left++;
            } else if( heights[right]<heights[left]){
                right--;
            } else {
                left++;
                right--;
            }
        }

        return maxarea;
    }
}
