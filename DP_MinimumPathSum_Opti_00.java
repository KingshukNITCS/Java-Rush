class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length; //rows
        int n = grid[0].length; //columns
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++)
        {
        for(int j=0;j<n;j++)
        {
            dp[i][j]=-1;
        }
        }
        return ans(m-1,n-1,grid,dp);
    }
    int ans(int x,int y,int[][] grid,int[][] dp)
    {
        if(x<0 || y<0) return Integer.MAX_VALUE;
        if(x==0 && y==0) 
        {
            dp[x][y]=grid[x][y];
            return grid[x][y];
        }
        if(dp[x][y]!=-1) return dp[x][y];
        dp[x][y] = grid[x][y]+Math.min(ans(x-1,y,grid,dp),ans(x,y-1,grid,dp));
        return dp[x][y];
    }
   }
