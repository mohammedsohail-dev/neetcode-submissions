class MedianFinder {
    int[] arr;
 
    public MedianFinder() {
        arr = new int[0];
    }
    
    public void addNum(int num) {
        int size = arr.length+1;
        int[] dum = new int[size];
        for(int i=0;i<size-1;i++){
            dum[i] = arr[i];
        }
        dum[size-1] = num;
        Arrays.sort(dum);
        arr = dum;
    }
    
    public double findMedian() {
        int size = arr.length;
        if(size%2 == 0){
            int half_1 = size/2;
            int half_2 = half_1+1;
            return (double) (arr[half_1-1]+arr[half_2-1])/2;
        } else {
            int loc = (size+1)/2;
            return (double) arr[loc-1];
        }
    }
}
