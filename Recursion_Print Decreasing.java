/*
Take as input N

Print numbers from N to 1 in N lines
Input Format

Integer representing n
Constraints

1 <= n <= 10 ^ 9
Output Format

Print Numbers from N to 1.
Sample Input 0

3
Sample Output 0

3
2
1
*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        dec(n);
    }
    public static void dec(int n)
    {
        if(n==1) 
        {
            System.out.println(1); return;
        }
        System.out.println(n);
        dec(n-1);
    }
}
