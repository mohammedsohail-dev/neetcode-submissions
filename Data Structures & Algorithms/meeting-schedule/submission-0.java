/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        int[][] arr = new int[intervals.size()][2];
        for(int j = 0;j<intervals.size();j++){
            int[] ele = new int[]{intervals.get(j).start, intervals.get(j).end};
            arr[j] = ele;
        }
        Arrays.sort(arr, (a,b)->(a[0]-b[0]));
        List<int[]> res = new ArrayList<>();
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(res.isEmpty() || res.get(res.size()-1)[1] <= arr[i][0]){
                res.add(arr[i]);
            } else {
                return false;
            }
        }

        return true;
    }
}
