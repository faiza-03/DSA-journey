class MinStack {
    Stack<Integer> st;
    Stack<Integer> minStack;
    int x;
    int y;

    public MinStack() {
        st = new Stack<>();
        minStack = new Stack<>();
        
    }
    
    public void push(int val) {
        st.push(val);

        if(minStack.isEmpty() || val<=minStack.peek())
            minStack.push(val);
        return;
        
    }
    
    public void pop() {
        x = st.pop();
        if(x==minStack.peek())
            minStack.pop();
        return;
        
    }
    
    public int top() {
        if(!st.isEmpty())
            return st.peek();
        return 0;
        
    }
    
    public int getMin() {
        if(!minStack.isEmpty())
            return minStack.peek();
        return 0;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */