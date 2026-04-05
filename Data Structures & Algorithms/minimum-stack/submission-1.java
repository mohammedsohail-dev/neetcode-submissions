class MinStack {
    ArrayList<Integer> Stack;

    public MinStack() {
        this.Stack = new ArrayList<>();
    }
    
    public void push(int val) {
        this.Stack.add(val);
    }
    
    public void pop() {
        this.Stack.remove(Stack.size()-1);
    }
    
    public int top() {
        return this.Stack.get(Stack.size()-1);
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<this.Stack.size();i++){
            min = Math.min(min,Stack.get(i));
        }
        return min;
    }
}
