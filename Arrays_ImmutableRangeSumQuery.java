// https://leetcode.com/problems/range-sum-query-immutable/description/

class NumArray {
    
    int[] narr;

    
    public NumArray(int[] nums) {
        narr = nums;
     
    }
    
    public int sumRange(int left, int right) {
        int sumr = 0;
        for(int i=left; i<=right; i++)
        {
            sumr=sumr+narr[i];
        }
        return sumr;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
