class MinStack {

    Stack<Integer> stack;
    int min;

    public MinStack() {
        //Initializing data structure
        stack = new Stack<Integer>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        
        //push min everytime a new min value is obtained.
        if(x<=min){
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }
    
    public void pop() {
        //get the previous min value everytime a min value is popped
        if(stack.pop()==min){
            min = stack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
