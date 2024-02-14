class MedianFinder {
    
    PriorityQueue<Integer> minpq = new PriorityQueue<>();
      
    public MedianFinder() {
    }
    
    public void addNum(int num) {
        this.minpq.add(num);
      
    }
    
    public double findMedian() {
        
        List<Integer> al = new ArrayList<>();
        int len = this.minpq.size();

        for(int i=1; i<=len; i++)
        {
            al.add(this.minpq.remove());
        }
        double x = (double)(al.get(len/2));
        double y = 0;
        if(len>1)
        {
            y = al.get(len/2-1);
        }
        for(int n : al)
        {
            this.minpq.add(n);
        }
        if(len%2!=0) return(x);
        else return((x+y)/2);

    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
