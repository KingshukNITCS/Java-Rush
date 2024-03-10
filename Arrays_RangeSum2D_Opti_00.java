class NumMatrix {
    int[][] arr;
    int sum;
    int[][] psarr;
    int m,n;
    public NumMatrix(int[][] matrix) {
        this.arr=matrix;
        m = arr.length;
        n = arr[0].length; 
        psarr = new int[m][n];
        for(int i=0; i<m; i++) 
        {
        psarr[i][0] = arr[i][0];
        for(int j=1; j<n; j++)
        {
            psarr[i][j]=psarr[i][j-1]+arr[i][j];
        }
        }
        /*for(int k=0;k<m;k++)
        {
            System.out.println(psarr[k][1]);
        }*/        
        for(int j=0; j<n; j++)
        {
        for(int i=1; i<m; i++)
        {
            psarr[i][j]=psarr[i-1][j]+psarr[i][j];
        }
        }
        /*for(int k=0;k<m;k++)
        {
            System.out.println(psarr[k][1]);
        }*/
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(row1!=0 && col1!=0)
        {
            this.sum=psarr[row2][col2]-psarr[row1-1][col2]-psarr[row2][col1-1]+psarr[row1-1][col1-1];
        }
        else if(row1==0 && col1==0)
        {
            this.sum = psarr[row2][col2];
        }
        else if(row1==0)
        {
            this.sum = psarr[row2][col2]-psarr[row2][col1-1];
        }
        else if(col1==0)
        {
            this.sum = psarr[row2][col2]-psarr[row1-1][col2];
        }
        return this.sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
