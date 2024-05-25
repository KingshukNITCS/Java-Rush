/*

Given N integers, Check if there exists a subsequence with gcd == 1.
Input Format

The first line contains the length of array N
The second line contains N element representing the element of Array
Constraints

1 <= N <= 10^4
1 <= arr[i] <= 10^9
Output Format

Output true if there exists a subsequence with GCD 1 else Output false.
Sample Input 0

4
4 6 3 8
Sample Output 0

true
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
        int k = gcd_all(arr,n);
        if(k==1) System.out.println("true");
        else System.out.println("false");

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
