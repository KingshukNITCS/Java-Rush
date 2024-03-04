class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int[] pva = new int[len+2];
        pva[1] = nums[0];
        for(int i=2; i<=len; i++)
        {
            pva[i] = pva[i-1]+nums[i-1];
        }
        pva[len+1] = pva[len];
        for(int j=1; j<len+1; j++)
        {
            int lsum = pva[j-1];
            int rsum = pva[len+1]-pva[j];
            if(lsum==rsum) return j-1;
        }
        return -1;
    }
}
