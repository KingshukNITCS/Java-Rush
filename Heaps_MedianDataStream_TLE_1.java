class MedianFinder {
    
        PriorityQueue<Integer> minpq = new PriorityQueue<>();
      
    public MedianFinder() {
    }
    
    public void addNum(int num) {
        this.minpq.add(num);
      
    }
    
    public double findMedian() {
        
        PriorityQueue<Integer> minpqt = new PriorityQueue<>(minpq);
        

        int len = minpqt.size();
        if(len==1) return (minpqt.remove());

        for(int i=1; i<=(len/2-1); i++)
        {
            minpqt.remove();
        }
        

        double x = minpqt.remove();
        double y = 0;
        if(len>1)
        {
            y = minpqt.remove();
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
