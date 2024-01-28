/*
Given a sorted array of n integers and a number k, Return true if k is present otherwise return false.

Leetcode Link: https://leetcode.com/problems/binary-search/description/
Input Format

First line contains integer n representing the length of array
Second line contains n integers
Third line contains integer k
Constraints

1 <= n <= 10^9
Output Format

Return true if k is present else false.
Sample Input 0

10
4 7 10 13 15 20 21 24 26 28
13
Sample Output 0

true

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
                count++; break;
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
        if(count>0) System.out.println(true);
        else System.out.println(false);
    }
}
