/*
Given a sorted arrays with N elements and 3 indices s, m and e such that subarray [s,m] is sorted, subarray [m+1,e] is sorted. Sort the subarray [s,e].

Note: s to m and then m+1 to e are continuous subarray
Input Format

The first line contains integer n representing size of array
The second line contains n elements of array.
The third line contains 3 elements representing s,m and e index.
Constraints

1<= N <= 10 ^ 6
1<= A[i] <=10 ^ 9
Output Format

Print the array after sorting subarray [s,e] in a line separated by space
Sample Input 0

12
4 8 -1 2 6 9 11 3 4 7 13 0
2 6 9
Sample Output 0

4 8 -1 2 3 4 6 7 9 11 13 0
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] ans = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
            ans[i]=arr[i];
        }
        int s = sc.nextInt();
        int m = sc.nextInt();
        int e = sc.nextInt();
        
        int x=s; int y=m+1; int z=e;
        int c=s;
        while(x<=m && y<=e)
        {
            if(arr[x]<arr[y])
            {
                ans[c++]=arr[x++];
               
            }
            else
            {
                ans[c++]=arr[y++];
               
            }
        }
        while(x<=m)
        {
            ans[c++]=arr[x++];
        }
        while(y<=e)
        {
            ans[c++]=arr[y++];
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(ans[i] + " ");
        }
    }
}
