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
        while(q.size()>0)
        {
            Pair xp = q.remove();
            int xi = xp.i;
            int xj = xp.j;
            int xt = xp.t;
            int xi1 = xi-1; int xj1 = xj;
            int xi2 = xi; int xj2 = xj+1;
            int xi3 = xi+1; int xj3 = xj;
            int xi4 = xi; int xj4 = xj-1;
            if(xi1>0 && xi1<m && xj1
        }
        return 1;
    }
}
/*
222
022
102


*/
