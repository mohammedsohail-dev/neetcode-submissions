class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int area = 0;
        while(left<right){
            int curr_area = Math.min(heights[left],heights[right]) * (right - left);

            if(heights[left]>heights[right]){
                right--;
            } else if(heights[left]<heights[right]){
                left++;
            } else {
                right--;
                left++;
            }

            area = Math.max(curr_area, area);
        }

        return area;
        
    }
}
