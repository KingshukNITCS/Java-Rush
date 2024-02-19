// https://leetcode.com/problems/unique-paths/description/
class Solution {
    public int uniquePaths(int m, int n) {             int[][] dp = new int[m][n];
        for(int i=0;i<m;i++) dp[i][0]=1;
        for(int j=0;j<n;j++) dp[0][j]=1;
        return(func(m-1,n-1,dp));
    }
    int func(int x, int y, int[][] dp)
    {
        if(dp[x][y]!=0) return dp[x][y];
        dp[x][y] = func(x-1,y,dp)+func(x,y-1,dp);
        return dp[x][y];
    }
}
