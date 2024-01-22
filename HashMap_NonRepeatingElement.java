/*

Find the first non-repeating element in a given array arr of N integers.
GFG Link: https://practice.geeksforgeeks.org/problems/non-repeating-element3958/1

Input Format

The first line contains size of array.
Second line contains the elements of the array.
Constraints

1 <= N <= 10^7
-10^16 <= Ai <= 10^16
Array consists of only positive and negative integers and not zero.
Output Format

Output the required element
Sample Input 0

5
-1 2 -1 3 2
Sample Output 0

3
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long[] arr = new long[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextLong();
        }
        HashMap<Long, int[]> hmap = new HashMap<>();

        for(int i=0; i<n; i++)

        {

            if(hmap.containsKey(arr[i]))

            {

                int[] varr = hmap.get(arr[i]);

                varr[1]++;

                hmap.put(arr[i],varr);

            }

            else

            {

                int[] narr = new int[2];

                narr[0] = i;

                narr[1] = 1;

                hmap.put(arr[i],narr);

            }

        }

        int min = Integer.MAX_VALUE;
        int count = 0;
        

        for(Long key : hmap.keySet())

        { 

            int[] varr = hmap.get(key);

            

            if(varr[1]==1)

            {

                if(varr[0]<min) 
                {
                    min=varr[0]; count++;
                }

                else continue;

            }

            else continue;

        }

        if(count > 0) System.out.print(arr[min]);
        else System.out.print(-1);
    }
}
