// https://leetcode.com/problems/maximum-subarray/description/

class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int[] psa = new int[len];
        psa[0]=nums[0];
        for(int i=1; i<len; i++)
        {
            psa[i]=psa[i-1]+nums[i];
        }
        int max=Integer.MIN_VALUE;
        for(int j=0; j<len; j++)
        {
            for(int k=j; k<len; k++)
            {
                int sum = psa[k]-psa[j]+nums[j];
                if(sum>max)
                {
                    max=sum;
                }
            }
        }
        return max;
    }
}
