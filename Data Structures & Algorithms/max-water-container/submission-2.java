class Solution {
    public int maxArea(int[] heights) {
        int maxarea= 0;
        int left = 0;
        int right = heights.length-1;
        while(left<right){
            int area = Math.min(heights[left], heights[right]) * (right - left);
            maxarea = Math.max(area,maxarea);
            if(heights[left]>heights[right]) {
                right--;
            }else if(heights[right] > heights[left]) {
                left++;
            } else  {
                right--;
                left++;
            }
        }
     return maxarea;   
    }
}
