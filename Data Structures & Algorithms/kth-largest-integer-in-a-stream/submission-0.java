class KthLargest {
    int k;
    int[] nums;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
    }
    
    public int add(int val) {
        int[] arr = new int[this.nums.length+1];
        for(int i=0;i<this.nums.length;i++){
            arr[i] = this.nums[i];
        }
        arr[this.nums.length] = val;

        this.nums = arr;

        Arrays.sort(arr);
        return arr[arr.length - k];
    }
}
