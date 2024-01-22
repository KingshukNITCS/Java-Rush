/* 
Take as input N

Print numbers from 1 to N in N lines
Input Format

Integer representing n
Constraints

1 <= n <= 10 ^ 9
Output Format

Print numbers from 1 to N
Sample Input 0

4
Sample Output 0

1
2
3
4
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        inc(n);
    }
    public static void inc(int n)
    {
        if(n==1) System.out.println(1);
        else
        {
        inc(n-1);
        System.out.println(n);
        }
    }
}
