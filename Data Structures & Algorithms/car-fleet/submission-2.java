class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int cars = position.length;
        double max_time = 0;
        ArrayList<Integer> positions = new ArrayList<>(); 
        Map<Integer,Integer> pos_speed = new HashMap<>();
        for(int i=0;i<position.length;i++){
            pos_speed.put(position[i], speed[i]);
            positions.add(position[i]);
        }
        Collections.sort(positions,Collections.reverseOrder());
        
        for(int j=0;j<position.length;j++){
            double time = (double)(target-positions.get(j))/pos_speed.get(positions.get(j));
            if(time>max_time) {
                max_time = time;
            } else {
                cars=cars-1;
            }
        }
        return cars;
    }
}
