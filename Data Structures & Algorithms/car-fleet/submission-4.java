class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        if(position.length == 1) {
            return 1;
        }
        Stack<Double> stack = new Stack<>();
        int[][] posspe = new int[position.length][2];
        for(int i=0;i<position.length;i++){
            posspe[i][0] = position[i];
            posspe[i][1] = speed[i];
        }
        Arrays.sort(posspe,(a,b) -> a[0] - b[0]);

        for(int j=position.length-1;j>=0;j--) {
            double time = (double) (target-posspe[j][0])/ posspe[j][1];
            if(stack.isEmpty()){
                stack.push(time);
            } else if(!stack.isEmpty() && time>stack.peek()){
                stack.push(time);
            }
        }
        return stack.size();
    }
}
