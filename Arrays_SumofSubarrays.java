/* Given an array A with N elements , you need to find the sum all sub arrays of array A. 
Input Format

First line contains size of the array
Second line contains the elements of the array
Constraints

1 ≤ N ≤ 10^3
1 ≤ A[i] ≤ 10^3
Output Format

Print the Sum of Subarray using Contribution technique.
Sample Input 0

4
5 3 -1 8
Sample Output 0

64
  */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        int n = scn.nextInt();
        int[] arr = new int[n];
        int[] psa = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt(); 
        }
        psa[0] = arr[0];
        for(int j=1; j<n; j++)
        {
            psa[j]=psa[j-1]+arr[j];
        }
        for(int k=0; k<n; k++)
        {
        for(int z=k; z<n; z++)
        {
            // subarr = k to z
            sum = sum + (psa[z]-psa[k]+arr[k]);
        }
        }
        System.out.print(sum);
    }
 }
