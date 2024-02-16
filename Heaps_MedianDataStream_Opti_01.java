class MedianFinder {
    
    PriorityQueue<Integer> minpq;
    PriorityQueue<Integer> maxpq;
   
    public MedianFinder() {
        this.minpq = new PriorityQueue<>();
        this.maxpq = new PriorityQueue<>(Collections.reverseOrder());        
    }
    
    public void addNum(int num) {
  
        if(this.minpq.size() == this.maxpq.size())
        {
            this.minpq.add(num);
            this.maxpq.add(this.minpq.remove());
        }
        else
        {
            this.maxpq.add(num);
            this.minpq.add(this.maxpq.remove());
        }
    }
    
    public double findMedian() {        
        double mxpq = this.maxpq.peek();
        if(this.minpq.size()==0) return mxpq;
        double mnpq = this.minpq.peek();
        if(this.minpq.size() == this.maxpq.size()) return ((mxpq+mnpq)/2);
        else return mxpq;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
