/* Given Array of length n and two integers start and end representing index. Print space separated Subarray of the Array from start idx to end idx.
Input Format

The first line contains n representing length of Array
The second line represents n array elements
The third line contains 2 integers representing sp and ep.
Constraints

1 <= N <= 20
1 <= arr[i] <= 10^9
Output Format

Print space separated Subarray of the Array from start index to end index
Sample Input 0

5
10 20 30 40 50
2 4
Sample Output 0

30 40 50
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
            arr[i]=scn.nextInt();
        }
        int x = scn.nextInt();
        int y = scn.nextInt();
        int[] ans = new int[y-x+1];
        int j=0;
        while(x<=y)
        {
            ans[j]=arr[x];
            j++;
            x++;
        }
        for(int k : ans)
        {
            System.out.print(k + " ");
        }
    }
}
