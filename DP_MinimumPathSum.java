// https://leetcode.com/problems/minimum-path-sum/description/

class Solution {
    public int minPathSum(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        if(m==1 && n==1) return grid[0][0];
        int msum=0;
        for(int i=0;i<m;i++)
        {
            msum=msum-grid[i][0];
            grid[i][0]=msum;
        }
        int nsum = grid[0][0];
        for(int j=1;j<n;j++)

        {

            nsum=nsum-grid[0][j];

            grid[0][j]=nsum;

            
        }
        
        return sump(grid,m-1,n-1);
    }
    int sump(int[][] grid, int x, int y)
    {
        if(x==0 || y==0)
        {
            if(grid[x][y]==0) return 0;
        }
        if(grid[x][y] < 0) return (0-grid[x][y]);
        int res = (0-(grid[x][y]+Math.min(sump(grid, x-1, y),sump(grid, x, y-1))));
   
        grid[x][y]=res;
        return (0-grid[x][y]);
    }
}
