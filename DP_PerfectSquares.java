// https://leetcode.com/problems/perfect-squares/description/

class Solution {
    public int numSquares(int n) {
        if(n==0 || n==1) return n;
        int[] dp = new int[n+1];
        for(int i=1; i<dp.length; i++)
        {
            dp[i]=-1;
        }
        dp[0]=0; dp[1]=1;
        return(ans(n,dp));        
    }
    int ans(int n, int[] dp)
    {
        if(dp[n]!=-1) return dp[n];
        int least = Integer.MAX_VALUE;
        for(int i=1; i*i<=n; i++)
        {
            int temp = ans(n-i*i,dp);
            if(temp<least) least=temp;                                
        }
        dp[n]=least+1;
        return dp[n];
    }
}
