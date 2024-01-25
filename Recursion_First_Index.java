/*

Take an input N, the size of array.
Take N more inputs and store that in an array.

1.It reads a number N.
2.Take Another N numbers as input and store them in an Array.
3.It reads a Number M.

Write a recursive function which returns the first index at which M is found in
the array and -1 if M is not found anywhere.

print returned value.


Example(To be used only for expected output):
Input:
4
2 8 6 4 
5
Output:
-1
Input Format

Integer representing N representing length of array
N numbers of Array
Constraints

1<= N <= 10 ^ 9
1<= A[i] <=10 ^ 9
1<= M <= 10 ^ 9
Output Format

Return the first Index of the given number in the array.
Sample Input 0

5
10 20 30 40 10
20
Sample Output 0

1
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
        int m = scn.nextInt();
        System.out.print(findx(arr,m,0,n-1));
        
    }
    public static int findx(int[] arr, int m, int x, int y)
    {
        if(x>y) return -1;
        if(arr[x]==m) return x;
        else return(findx(arr,m,x+1,y));
    }
}
