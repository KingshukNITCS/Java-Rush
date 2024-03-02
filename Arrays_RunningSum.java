// https://leetcode.com/problems/running-sum-of-1d-array/description/

class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int len = nums.length;
        int[] ans = new int[len];
        for(int i=0; i<len; i++)
        {
            sum=sum+nums[i];
            ans[i]=sum;
        }
        return ans;
    }
}
