class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int res = 0;
        Arrays.sort(intervals, (a,b)->(a[0]-b[0]));
        ArrayList<int[]> result = new ArrayList<>();
        int n = intervals.length;
        for(int i = 0;i<n;i++){
            if(result.isEmpty() || result.get(result.size()-1)[1] <= intervals[i][0]){
                result.add(intervals[i]);
            } else {
                res++;
                if(result.get(result.size()-1)[1]>intervals[i][1]){
                    result.get(result.size()-1)[0] = intervals[i][0];
                    result.get(result.size()-1)[1] = intervals[i][1];
                }
            }
        }

        return res;

    }
}
