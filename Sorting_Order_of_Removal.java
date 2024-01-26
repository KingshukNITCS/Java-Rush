/*

Given N length Array, at every step remove an array element. Cost to remove element = sum of array elements present. Find min cost to remove all the elements.

Note: Add to cost first and then remove.
Input Format

Integer representing N representing length of array
N numbers of Array
Constraints

1<= N <= 10 ^ 6
1<= A[i] <=10 ^ 9
Output Format

Return the min cost to remove all the elements.
Sample Input 0

3
3 2 5
Sample Output 0

17

  */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n]; int minc = 0;
        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        for(int i=n-1; i>=0; i--)
        {
            for(int j=0; j<=i; j++)
            {
                minc = minc + arr[j];
            }
        }
        System.out.print(minc);
    }
}
