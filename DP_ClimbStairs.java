class Solution {
    public int climbStairs(int n) {
        if(n==1 || n==2) return n;
        int[] dp = new int[n+1];
        dp[1] = 1; dp[2] = 2;
        return(ans(n,dp));
    }
    int ans(int n, int[] dp)
    {
        if(dp[n]!=0) return dp[n];
        dp[n] = ans(n-1,dp)+ans(n-2,dp);
        return dp[n];
    }
}
