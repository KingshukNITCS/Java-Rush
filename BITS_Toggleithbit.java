/*

Given numbers n and k, toggle kth bit of number n. Rightmost bit is considered 0th bit and so on.
Input Format

the first line contains two integer n and k.
Constraints

1 <= 10^5 <= n
0 <= k <=31
Output Format

Print the decimal number after toggling the kth bit
Sample Input 0

75 4
Sample Output 0

91
  */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        if((n & (1<<k))==0)
        {
            //cbit=0
            n = n | (1<<k);
        }
        else
        {
            //cbit=1
            n = n ^ (1<<k);
        }
        System.out.print(n);
    }
}
