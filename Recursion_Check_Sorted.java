/*
Take an input N, the size of array.
Take N more inputs and store that in an array.

1.It reads a number N.
2.Take Another N numbers as input and store them in an Array.

Write a recursive function which returns true if the array is sorted and false
otherwise

print returned value.


Example(To be used only for expected output):
Input:
4
2 8 6 4
Output:
false
Input Format

Integer representing N representing length of array
N numbers of Array
Constraints

n <= 10 ^ 9
Output Format

Return true if array is sorted else false
Sample Input 0

5
10 20 30 40 50
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
        System.out.println(asort(arr,0,n-1)||dsort(arr,0,n-1));
    }
    public static boolean asort(int[] arr, int x, int y)
    {
        if(x==y) return true;
        if(asort(arr,x+1,y) && arr[x]<=arr[x+1]) return true;
        return false;
    }
    public static boolean dsort(int[] arr, int x, int y)
    {
        if(x==y) return true;
        if(dsort(arr,x+1,y) && arr[x]>=arr[x+1]) return true;
        return false;
    }
}
