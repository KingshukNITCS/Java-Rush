/*

Given an array arr[] of length N ≥ 2. The task is to remove an element from the given array such that the GCD of the array after removing it is maximized.
Input Format

The first line contains the length of array N
The second line contains N element representing the element of Array
Constraints

1 <= N <= 10^4
1 <= arr[i] <= 10^9
Output Format

The maximum Possible GCD after deleting 1 element
Sample Input 0

5
24 16 18 30 15
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
        
        int ans=0;
        
        for(int i=0; i<n; i++)
        {
            int k=0;
            int[] arrm = new int[n-1];
            for(int j=0; j<n-1; j++)
            {
                if(k!=i) arrm[j]=arr[k];
                else j--;
                k++;
            }
            //System.out.println(Arrays.toString(arrm));
            ans = Math.max(ans,gcd_all(arrm,n-1));
        }
        System.out.println(ans);

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
