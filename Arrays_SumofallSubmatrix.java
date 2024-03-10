/*

Given a NxM 2-D matrix, the task to find the sum of all the submatrices.
Input Format

The first line contains two integers n and m.
Each of next n line contains m integers.
Constraints

1 <= n,m <= 100
1 <= mat[i][j] <= 100
Output Format

Return the sum of all the submatrices.
Sample Input 0

2 2
1 2
3 4
Sample Output 0

40

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //row
        int m = scn.nextInt(); //col
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++)
        {
        for(int j=0; j<m; j++)
        {
            arr[i][j]=scn.nextInt();
        }
        }
        int sum=0;
        for(int i=0; i<n; i++)
        {
        for(int j=0; j<m; j++)
        {
            sum = sum + arr[i][j]*(i+1)*(j+1)*(n-i)*(m-j);
        }
        }
        System.out.print(sum);
    }
}
