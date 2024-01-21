/* Given N 2D Points, Calculate no. of distinct points among them.

Ex: x[5] = {2, 1, 3, 2, 2}
    y[5] = {3, 1, 2, 3, 4}
    
The first array represents the x co-ordinates, the second array represents the y co-ordinate. Acoording to above examples the points are 
    (x[0],y[0])->(2,3)
    (x[1],y[1])->(1,1)
    (x[2],y[2])->(3,2)
    (x[3],y[3])->(2,3)
    (x[4],y[4])->(2,4)
    
Total number of distinct points are 4.
Input Format

The first line contains an Integer n denoting number of points.
Second line contains n integer denoting the x-coordinates.
Third line contains another n integer denoting the y-coordinates.
Constraints

1<=n<=10^5
Output Format

Output the distinct points count
Sample Input 0

5
2 1 3 2 2
3 1 2 3 4
Sample Output 0

4
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); int count=0;
        int[] xarr = new int[n];
        int[] yarr = new int[n];
        for(int i=0; i<n; i++)
        {
            xarr[i] = scn.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            yarr[i] = scn.nextInt();
        }
        HashMap<Integer, HashSet<Integer>> hmap = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            if(hmap.containsKey(xarr[i]))
            {
                HashSet<Integer> hset = hmap.get(xarr[i]);
                if(hset.contains(yarr[i]) count++;
                else 
                {
                    hset.add(yarr[i]);
                    hmap.put(xarr[i],hset);
                }
            }
            else
            {
                HashSet<Integer> hset = new HashSet<>();
                hset.add(yarr[i]);
                hmap.put(xarr[i],hset);
            }
        }
        System.out.print(n-count);
    }
}
