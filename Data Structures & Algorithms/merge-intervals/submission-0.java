class Solution {
    public int[][] merge(int[][] intervals) {
     Arrays.sort(intervals, (a,b)->(a[0]-b[0]));
     List<int[]> res = new ArrayList<>();
     int n = intervals.length;
     for(int i = 0;i<n;i++){
        if(res.isEmpty() || res.get(res.size()-1)[1]<intervals[i][0]){
            res.add(intervals[i]);
        } else {
            res.get(res.size() - 1)[0] = Math.min(res.get(res.size() - 1)[0], intervals[i][0]);
            res.get(res.size() - 1)[1] = Math.max(res.get(res.size() - 1)[1], intervals[i][1]);
        }
     }

     return res.toArray(new int[res.size()][]);
     
    }
}
