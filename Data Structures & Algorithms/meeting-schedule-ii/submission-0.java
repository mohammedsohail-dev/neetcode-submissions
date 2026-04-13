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
    public int minMeetingRooms(List<Interval> intervals) {
        int[][] conv_intervals = new int[intervals.size()][2];
        for(int i = 0;i < intervals.size();i++){
            int[] ele = new int[]{intervals.get(i).start, intervals.get(i).end};
            conv_intervals[i] = ele;
        }

        Arrays.sort(conv_intervals, (a,b) -> (a[0] - b[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(a - b));
        for(int j = 0;j<conv_intervals.length;j++){
            if(!pq.isEmpty() && pq.peek() <= conv_intervals[j][0]){
                pq.poll();
            }
            pq.add(conv_intervals[j][1]);
        }

        return pq.size();

    }
}
