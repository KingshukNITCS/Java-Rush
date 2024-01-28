/*

Given a sorted array of n integers and a number k, Return floor(k).
Input Format

First line contains integer n representing the length of array
Second line contains n integers
Third line contains integer k
Constraints

1 <= n <= 10^9
Output Format

Return floor of k.
Sample Input 0

9
-4 3 4 7 10 11 12 15 19
5
Sample Output 0

4
*/

import java.io.*;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++)

        {
            arr[i] = scn.nextInt();

        }

        int k = scn.nextInt();

        int start = 0, end = n-1; int count=0;

        while(start<=end)

        {

            int mid = (start+end)/2;

            if(arr[mid]==k)

            {

                System.out.println(arr[mid]); break;

            }

            if(arr[mid]>k)

            {

                end = mid-1;

            }

            if(arr[mid]<k)

            {

                start = mid+1;

            }

        }

        if(k<arr[0]) System.out.println(-1);
        else if(k>arr[n-1]) System.out.println(arr[n-1]);
        else if(arr[start]>k) System.out.println(arr[start-1]);
        else if(arr[start]<k) System.out.println(arr[start]);

    }

}
