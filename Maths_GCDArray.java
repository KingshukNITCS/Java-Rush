/*

Given N integers, Calculate the GCD of all the numbers
Input Format

The first line contains the length of array N
The second line contains N element representing the element of Array
Constraints

1 <= N <= 10^4
1 <= arr[i] <= 10^9
Output Format

Output the final GCD of Number
Sample Input 0

3
6 12 15
Sample Output 0

3

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=scn.nextInt();
        }
        System.out.println(gcd_all(arr,n));
    }
    static int gcd_all(int[] arr, int n)
    {
        int gcd=arr[0];
        for(int i=1; i<n; i++)
        {
            gcd=gcd_calc(gcd,arr[i]);
        }
        return gcd;
    }
    static int gcd_calc(int x, int y)
    {
        if(x==0) return y;
        int temp = gcd_calc(y%x,x);
        return temp;
    }
}
