/*

Take as input n

Print sum of n natural numbers using recursion
Input Format

Integer representing n
Constraints

1 <= n <= 10 ^ 9
Output Format

Integer representing sum of N Natural numbers
Sample Input 0

4
Sample Output 0

10
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(sum(n));
        
    }
    public static int sum(int n)
    {
        if(n==1) return 1;
        return (n+sum(n-1));
    }
}
