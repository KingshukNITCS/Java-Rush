/*

Given a square matrix of N*N, print the outer boundary in clockwise direction
Input Format

First line contains an integer n representing size of matrix.
Each of next n lines contain n integer representing array elements.
Constraints

1 <= N <= 100
1 <= arr[i] <= 10^4
Output Format

Print the outer boundary in clockwise direction in a line with space in between each.
Sample Input 0

3
1 2 3
4 5 6
7 8 9
Sample Output 0

1 2 3 6 9 8 7 4

  */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++)
        {
        for(int j=0; j<n; j++)
        {
            arr[i][j]=sc.nextInt();
        }
        }
        int x=0; int y=0;
        while(y<n-1)
        {
            System.out.print(arr[x][y]+" ");
            y++;
        }
        while(x<n-1)
        {
            System.out.print(arr[x][y]+" ");
            x++;
        }
        while(y>0)
        {
            System.out.print(arr[x][y]+" ");
            y--;
        }
        while(x>0)
        {
            System.out.print(arr[x][y]+" ");
            x--;
        }
    }
 }
