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
        if(len==1) 
        {
            return (this.minpq.peek());
        }
        for(int i=1; i<=(len/2-1); i++)
        {
            al.add(this.minpq.peek());
            this.minpq.remove();
        }
         
        al.add(this.minpq.peek());
        double x = this.minpq.remove();
        double y = 0;
        if(len>1)
        {
            al.add(this.minpq.peek());
            y = this.minpq.remove();
        }
        
        for(int n : al)
        {
            minpq.add(n);
        }
        
        if(len%2!=0) return(y);
        else return((x+y)/2);

    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
