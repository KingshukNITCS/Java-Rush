/* You are given an array of size 'n' and n elements of the same array. You are required to find and print all the subarrays of the given array. Each subarray should be space seperated and on a seperate lines. Refer to sample input and output.
Input Format

The first line contains and integer n
The second line contains n integer of array
Constraints

1 <= n <= 10
0 <= arr[i] <= 10 ^9
Output Format

Print all the subarrays where each subarray should be space seperated and on a seperate lines
Sample Input 0

3
10 20 30
Sample Output 0

10
10 20    
10 20 30    
20
20 30    
30
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
        
        for(int j=0; j<n; j++)
        {
        List<Integer> temp = new ArrayList<>();
        for(int k=j; k<n; k++)
        {
            temp.add(arr[k]);
            for(int z : temp)
            {
                System.out.print(z + " ");
            }
            System.out.println();
        }
        }
    }
  }
