
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++)
        {
        for(int j=0; j<n; j++)
        {
            arr[i][j]=scn.nextInt();
        }         
        }        
        for(int i=0; i<n; i++)
        {
        for(int j=i+1; j<n; j++)
        {            
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;            
        }         
        }                
        for(int w=0; w<n; w++)
        {
        for(int z=0; z<n; z++)
        {
            System.out.print(arr[w][z]+" ");
        }
        System.out.println();
        }
    }
}
