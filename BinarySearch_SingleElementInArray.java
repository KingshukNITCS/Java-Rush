/*

You are given an array consisting of n integers where every element appears exactly twice, except for one element which appears exactly once. Duplicate Numbers are adjacent to each other.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.

Leetcode Link: https://leetcode.com/problems/single-element-in-a-sorted-array/description/
Input Format

First line contains integer n representing the length of array
Second line contains n integers
Constraints

1 <= n <= 10^9
Output Format

Return the number appearing only once.
Sample Input 0

15
4 4 1 1 9 9 11 11 20 7 7 3 3 5 5
Sample Output 0

20

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
        
        System.out.print(once(arr, n));
    }
    public static int once(int[] arr, int n)
    {
        if(n==1 || arr[0]!=arr[1]) return(arr[0]);
        int start=0, end=n-1, ans=0;

        while(start<=end && start>=0 && end<n)

        {
            int mid = (start+end)/2;

            if(mid%2==0)

            {

                if(arr[mid]!=arr[mid-1])

                {
                    if(mid==n-1) return arr[mid];
                    if(arr[mid]!=arr[mid+1]) return arr[mid];

                    start=mid+1;

                }

                else end=mid-1;

            }

            else if(mid%2!=0)

            {

                if(arr[mid]==arr[mid-1])

                {

                    start=mid+1;

                }

                else 
                {
                    if(mid==n-1) return arr[mid];
                    if(arr[mid]!=arr[mid+1]) return arr[mid];
                    end=mid-1;
                }

            }

            ans=mid;
          
        }

        return(arr[ans]);
    }
}
