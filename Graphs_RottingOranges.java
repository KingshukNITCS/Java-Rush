/* https://leetcode.com/problems/rotting-oranges/description/ */

class Pair {
    int i;
    int j;
    int t;
    Pair(int i, int j,int t)
    {
        this.i=i;
        this.j=j;
        this.t=t;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0; i<m; i++)
        {
        for(int j=0; j<n; j++)
        {
            if(grid[i][j]==2)
            {
                Pair p = new Pair(i,j,0);
                q.add(p);
            }
        }
        }
        int ans=0;
        while(q.size()>0)
        {
            Pair xp = q.remove();
            int xi = xp.i;
            int xj = xp.j;
            int xt = xp.t;
            ans = xt;
            int xi1 = xi-1; int xj1 = xj;
            int xi2 = xi; int xj2 = xj+1;
            int xi3 = xi+1; int xj3 = xj;
            int xi4 = xi; int xj4 = xj-1;
            if(xi1>=0 && xi1<m && xj1>=0 && xj1<n)
            {
                if(grid[xi1][xj1]==1)
                {
                    grid[xi1][xj1]=2;
                    Pair tp = new Pair(xi1,xj1,xt+1);
                    q.add(tp);
                }
            }
            if(xi2>=0 && xi2<m && xj2>=0 && xj2<n)

            {

                if(grid[xi2][xj2]==1)

                {

                    grid[xi2][xj2]=2;

                    Pair tp = new Pair(xi2,xj2,xt+1);

                    q.add(tp);

                }

            }
            if(xi3>=0 && xi3<m && xj3>=0 && xj3<n)
            {
                if(grid[xi3][xj3]==1)
                {
                    grid[xi3][xj3]=2;
                    Pair tp = new Pair(xi3,xj3,xt+1);
                    q.add(tp);
                }
            }
            if(xi4>=0 && xi4<m && xj4>=0 && xj4<n)
            {
                if(grid[xi4][xj4]==1)
                {
                    grid[xi4][xj4]=2;
                    Pair tp = new Pair(xi4,xj4,xt+1);
                    q.add(tp);
                }
            }
        }
        
        for(int w=0; w<m; w++)

        {

        for(int z=0; z<n; z++)

        {

            if(grid[w][z]==1)

            {

                return -1;

            }

        }

        }
        return ans;
    }
}
/*
222
022
102


*/
