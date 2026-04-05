class Solution {
    public int largestRectangleArea(int[] heights) {
    Stack<Integer> stack = new Stack<>();
    int max_area = 0;
    for(int i=0;i<heights.length;i++){
        if(stack.isEmpty()){
            stack.push(heights[i]);
            max_area= heights[i]*1;
            break;
        }
        int area = 0;
        if(stack.peek()>heights[i]){
            area = area + heights[i];
            while(!stack.isEmpty()){
                area = area + heights[i];
                stack.pop();
            }
        }
        max_area = Math.max(max_area, area);

    }
    return max_area;
}}
