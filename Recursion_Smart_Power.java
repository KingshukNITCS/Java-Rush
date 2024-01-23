/*

Given two Integer a and n, find a^n (a raise to power n).

Note: Use Recursion and Expected Time complexity is O(logN).

Leetcode Link: https://leetcode.com/problems/powx-n/
Input Format

Single line contains 2 integers a and n
Constraints

1<= a <= 10
1<= n <= 18
Output Format

Return the answer a^n
Sample Input 0

2
10
Sample Output 0

1024

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt(); long n = scn.nextLong();
        System.out.println(spow(a,n));

    }
    public static long spow(int a, long n)
    {
        if(n==1) return a;
        return(a*spow(a,n-1));
    }
}
