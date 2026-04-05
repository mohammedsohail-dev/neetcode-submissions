class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for(char task: tasks){
            count[task-'A']++;
        }
        Arrays.sort(count);
        int max_freq = count[25];
        int idle_times = (max_freq-1)*n;
        for(int i=24;i>=0;i--){
            if(count[i] == max_freq){
                idle_times = idle_times-(count[i] - 1);
            }else {
                idle_times = idle_times-count[i];
            }
        }

        if(idle_times<0){
            return tasks.length;
        }else {
            return tasks.length+idle_times;
        }
    }
}
