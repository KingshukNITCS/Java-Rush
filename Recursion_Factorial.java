/* Take as input n

Print n!
Input Format

Integer representing n
Constraints

1 <= n <= 10 ^ 9
Output Format

Integer representing n!
Sample Input 0

5
Sample Output 0

120
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.print(fact(n));
    }
    public static int fact(int n)
    {
        if(n==1) return 1;
        return(n*fact(n-1));
    }
}
