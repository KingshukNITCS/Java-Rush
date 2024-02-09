import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        Queue<String> sq = new LinkedList<>();
        sq.add("1"); sq.add("2");
        String ans ="";
        for(int i=1; i<=k; i++)
        {
            String temp = sq.remove();
            if(i==k)
            { 
                ans = temp; break;
            }
            sq.add(temp+"1");
            sq.add(temp+"2");
        }
        System.out.print(ans);
    }
}

/* TC = O(k*digits.length)
SC = O(k)
*/
