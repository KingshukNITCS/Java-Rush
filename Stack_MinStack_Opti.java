class MinStack {
    Stack<Integer> mst, st;
    public MinStack() {
        st = new Stack<>();
        mst = new Stack<>();
    }
    
    public void push(int val) {
        if(st.size()==0) mst.push(val);
        st.push(val);
       
        if(mst.peek()>=val) 
        {

            mst.push(val);
        }
        else if(mst.peek()<val)
        {
            mst.push(mst.peek());
        }
    }
    
    public void pop() {
        mst.pop();
        st.pop();   
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return mst.peek();
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
