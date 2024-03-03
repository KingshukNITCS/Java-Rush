class NumArray {
    
    int[] narr;
    int[] psarr;
    
    public NumArray(int[] nums) {
        narr = nums;
        int len=narr.length;
        psarr = new int[len];
        psarr[0] = nums[0];
        for(int i=1; i<len; i++)
        {
            psarr[i]=psarr[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        int sumr = psarr[right]-psarr[left]+narr[left];
        return sumr;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
