/*
Given two sorted arrays with N and M elements. Merge them into one sorted array and Print them. 
Input Format

The first line contains two integers n and m representing the size of 2 arrays
The second line contains n elements of first array.
The third line contains m elements of second array.
Constraints

1<= N <= 10 ^ 6
1<= A[i] <=10 ^ 9
Output Format

Print the merged sorted array in a line separated by space
Sample Input 0

4 3
7 10 11 14
3 8 9
Sample Output 0

3 7 8 9 10 11 14 
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] farr = new int[n];
        int[] sarr = new int[m];
        for(int i=0; i<n; i++) farr[i] = scn.nextInt();
        for(int j=0; j<m; j++) sarr[j] = scn.nextInt();
        int x=0; int y=0;
        int[] arr = new int[n+m];
        int c=0;
        while(x<n && y<m)
        {
            if(farr[x]<sarr[y])
            {
                arr[c++]=farr[x++];
            }
            else
            {
                arr[c++]=sarr[y++];
            }
        }
        while(x<n)
        {
            arr[c++]=farr[x++];
        }
        while(y<m)
        {
            arr[c++]=sarr[y++];
        }
        for(int i=0; i<c; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
