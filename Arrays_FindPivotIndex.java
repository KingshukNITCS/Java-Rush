// https://leetcode.com/problems/find-pivot-index/description/

class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        if(len==1) return 0;
        int suml = 0;
        int sumr = 0;
        int[] runl = new int[len+2];
        int[] runr = new int[len+2];
        for(int i=0; i<len; i++)
        {
            suml=suml+nums[i];
            runl[i+1]=suml;
            sumr=sumr+nums[len-1-i];
            runr[len-1-i+1]=sumr;
        } 
        for(int j=0; j<len; j++)
        {
            if(runl[j]==runr[j+2]) return j;
        }
        return -1;
    }
}
