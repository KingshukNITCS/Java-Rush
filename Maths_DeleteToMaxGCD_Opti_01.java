import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] pgcd = new int[n];
        int[] sgcd = new int[n];
        pgcd[0] = arr[0];
        sgcd[n-1] = arr[n-1];
        for(int i=1; i<=n-1; i++)
        {
            pgcd[i] = gcd(pgcd[i-1],arr[i]);
            sgcd[n-1-i] = gcd(sgcd[n-i],arr[n-1-i]);
        }
        //System.out.println(Arrays.toString(pgcd));
        //System.out.println(Arrays.toString(sgcd));
        int maxgcd = Integer.MIN_VALUE;
        for(int i=0; i<=n-1; i++)
        {
            if(i==0) maxgcd = Math.max(maxgcd,sgcd[i+1]);
            else if(i==n-1) maxgcd = Math.max(maxgcd,pgcd[i-1]);
            else maxgcd = Math.max(maxgcd,gcd(sgcd[i+1],pgcd[i-1]));
        }
        System.out.println(maxgcd);
    }
    static int gcd(int x, int y)
    {
        if(x==0) return y;
        return gcd(y%x,x);
    }
}

/*
24, 16, 18, 30, 15
24, 8, 2, 2, 1
1, 1 ,3 ,15 ,15
*/
