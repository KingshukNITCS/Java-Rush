/*
Write a program to find the transpose of a square matrix of size N*N.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
Input Format

First line contains an integer N
Next N lines contain the matrix with N numbers in each line.
Constraints

1<=N<=10^3
-10^9<=mat[i][j]<=10^9
Output Format

Output N lines containing the transposed matrix with N numbers in each line.
Sample Input 0

4
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
Sample Output 0

1 2 3 4 
1 2 3 4 
1 2 3 4 
1 2 3 4 
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++)
        {
        for(int j=0; j<n; j++)
        {
            arr[i][j]=scn.nextInt();
        }         
        }        
        for(int i=0; i<n; i++)
        {
        for(int j=0; j<n; j++)
        {
            if(j>i)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }         
        }                
        for(int w=0; w<n; w++)
        {
        for(int z=0; z<n; z++)
        {
            System.out.print(arr[w][z]+" ");
        }
        System.out.println();
        }
    }
 }
