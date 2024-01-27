import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }
        for(int i=0; i<n-1; i++)
        {
            int x=0;
            while(x<n-1)
            {
                if(arr[x]>arr[x+1])
                {
                    int temp = arr[x];
                    arr[x] = arr[x+1];
                    arr[x+1] = temp;
                }
                x++;
            }
                 
        }
        for(int i=0; i<n; i++)

        {

            System.out.print(arr[i]+" ");

        }
    }
}
