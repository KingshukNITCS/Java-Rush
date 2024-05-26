// https://leetcode.com/problems/number-of-subarrays-with-gcd-equal-to-k/description/

class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        for(int sp=0; sp<n; sp++)
        {
            int gcd_temp = 0;
            for(int ep=sp; ep<n; ep++)
            {
                gcd_temp=gcd(gcd_temp,nums[ep]);
                if(gcd_temp==k)
                {
                    //System.out.println(sp + "," + ep);
                    //System.out.println(nums[sp] + "," + nums[ep]);
                    ans++;
                }
            }
        }
        return ans;
    }
    int gcd_arr(int[] arr, int sp, int ep)
    {
        int val=0;
        for(int i=sp; i<=ep; i++)
        {
            val=gcd(val,arr[sp]);
        }
        return val;
    }
    int gcd(int x, int y)
    {
        if(x==0) return y;
        return gcd(y%x, x);
    }
}
