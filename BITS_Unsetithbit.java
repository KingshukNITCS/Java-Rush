import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        if((n & (1<<k))==0);
        else
        {
            n = n ^ (1<<k);
        }
        System.out.print(n);
    }
}
