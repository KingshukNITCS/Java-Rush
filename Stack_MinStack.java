/* https://leetcode.com/problems/min-stack/*/
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
    }
    
    public void pop() {
        //System.out.println(mst.peek());
        //System.out.println(st.peek());
        
        // == won't work / use equals()
        if((st.peek()).equals(mst.peek()))
        {
            //System.out.println(mst.peek());
            //System.out.println(st.peek());
            mst.pop();

        }
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
