// Kadane Algo
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0; 
        int ans=Integer.MIN_VALUE;
        int len = nums.length;
        for(int i=0; i<len; i++)
        {
            if(sum>=0)
            {
                sum=sum+nums[i]; 
            }
            else
            {
                sum=nums[i]; 
            }
            if(sum>ans) ans=sum;
        }
        return ans;
    }
}

// -2,1,-3,4,-1,2,1,-5,4
// sum = 5 / ans = 6
