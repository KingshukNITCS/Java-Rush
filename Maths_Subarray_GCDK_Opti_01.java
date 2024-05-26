class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        for(int sp=0; sp<n; sp++)
        {
            int gcd_temp = 0;
            for(int ep=sp; ep<n && ((gcd_temp==0)||(gcd_temp>=k)); ep++)
            {
                gcd_temp=gcd(gcd_temp,nums[ep]);
                if(gcd_temp==k)
                { 
                    ans++;
                }
            }
        }
        return ans;
    }
  
    int gcd(int x, int y)
    {
        if(x==0) return y;
        return gcd(y%x, x);
    }
}
  
