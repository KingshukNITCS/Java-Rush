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
        
        for(int j=0; j<n; j++)
        {
        
        for(int k=j; k<n; k++)
        {
            
            for(int z=j; z<=k; z++)
            {
                System.out.print(arr[z] + " ");
            }
            System.out.println();
        }
        }
    }
}
