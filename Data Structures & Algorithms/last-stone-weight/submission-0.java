class Solution {
    public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(b-a));

    for(Integer stone:stones){
        pq.add(stone);
    }

    while(pq.size()>=2 ){
        int diff = pq.poll()-pq.poll();
        if(diff!=0){
            pq.add(diff);
        }
    }

    if(pq.size()==1){
        return pq.poll();
    }

    return 0;

        
    }
}
