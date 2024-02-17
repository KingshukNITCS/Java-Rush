class Solution {
    public int fib(int n) {
        if(n==0 || n==1) return n;
        int[] dp = new int[n+1];
        dp[0] = 0; dp[1] = 1;
        for(int i=2; i<dp.length; i++)
        {
            dp[i] = -1;
        }       
        return (ans(n,dp));
    }
    int ans(int n, int[] dp)
    {
        if(dp[n] != -1) return dp[n];
        dp[n] = ans(n-1,dp)+ans(n-2,dp);
        return dp[n];
    }
}
