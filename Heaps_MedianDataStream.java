class MedianFinder {
    
    PriorityQueue<Integer> minpq;
    PriorityQueue<Integer> maxpq;
    int count=2;
    public MedianFinder() {
        this.minpq = new PriorityQueue<>();
        this.maxpq = new PriorityQueue<>(Collections.reverseOrder());
        this.minpq.add(Integer.MAX_VALUE);
        this.maxpq.add(Integer.MIN_VALUE);
    }
    
    public void addNum(int num) {
        this.count++;
        if(this.count%2!=0)
        {
            if(num>minpq.peek())
            {
                this.maxpq.add(this.minpq.remove());
                this.minpq.add(num);
            }
            else
            {
                this.maxpq.add(num);
            }
        }
        if(this.count%2==0)
        {
            if(num<maxpq.peek())
            {
                this.minpq.add(this.maxpq.remove());
                this.maxpq.add(num);
            }
            else
            {
                this.minpq.add(num);
            }
        }
    }
    
    public double findMedian() {
        double mxpq = this.maxpq.peek();
        double mnpq = this.minpq.peek();

        if(this.count%2==0) return ((mxpq+mnpq)/2);
        else return mxpq;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
