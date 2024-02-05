/* https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1*/
class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();
        int qsize = q.size();
        for(int i=1;i<=k;i++)
        {
            st.push(q.remove());
        }
        int ssize = st.size();
        for(int i=1;i<=ssize;i++)
        {
            q.add(st.pop());
        }
        for(int i=1;i<=qsize-k;i++)
        {
            q.add(q.remove());
        }
        return q;
    }
}
