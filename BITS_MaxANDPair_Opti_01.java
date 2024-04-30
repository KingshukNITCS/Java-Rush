import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=scn.nextInt();
        }
        for(int i=31; i>=0; i--)
        {
            
            int count=0;
            for(int j=0; j<n; j++)
            {
                int x = arr[j]; 
                
                
                if(checkBit(x,i)==true) count++;
                
            }
            if(count>=2)
            {
                for(int k=0; k<n; k++)
                {
                    if(checkBit(arr[k],i)==false)
                    {
                    arr[k]=0;
                    }
                }
            }
        }
        int ans=1; int xcount=0; int i=0;
        while(xcount<=2 && i<n)
        {
            if(arr[i]!=0)
            {
                
                xcount++;
                if(xcount==1) ans=arr[i];
                else ans=ans & arr[i];
            }
            i++;
        }
        System.out.print(ans);
    }
    public static boolean checkBit(int n, int i)
    {
        if((n & (1<<i)) == 0) return false;
        else return true;
    }
}

/*

4 -  00100
8 -  01000
12 - 01100
16 - 10000

*/
