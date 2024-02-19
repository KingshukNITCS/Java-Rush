/* The problem is to count all the possible paths from top left to bottom right of a MxN matrix with the constraints that from each cell you can either move to right or down.

mat[i][j] == 0 represents blocked cell and mat[i][j] == 1 represents unblocked cell and you can't move via blocked cell.
Input Format

The first line contains the number of rows N and number of columns M of matrix.
Each of next N rows contain m numbers representing the elements of array.
Constraints

1 <= m,n <=100
Output Format

Print the number of possible paths
Sample Input 0

3 3
1 0 1
1 1 1
1 0 1
Sample Output 0

1
  */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int j=0;j<n;j++)
        {
            for(int i=0;i<m;i++)
            {
                int k = sc.nextInt();
                if(k==0) arr[i][j] = k;
                else arr[i][j] = -1;
            }
        }
        int c=0;
        for(int i=0;i<m;i++)
        {
            if(c==0 && arr[i][0]==-1) arr[i][0]=1;
            if(arr[i][0]==0) c++;
            if(c>0) arr[i][0]=0;
        }
        c=0;
        for(int j=0;j<n;j++)
         {                        
            if(c==0 && arr[0][j]==-1) arr[0][j]=1;
            if(arr[0][j]==0) c++;
            if(c>0) arr[0][j]=0;
        }
        System.out.print(paths(arr,m-1,n-1));
    }
    static int paths(int[][] arr,int x,int y)
    {
        if(arr[x][y]!=-1) return arr[x][y];
        arr[x][y]=paths(arr,x-1,y)+paths(arr,x,y-1);
        return arr[x][y];     
    }
}
