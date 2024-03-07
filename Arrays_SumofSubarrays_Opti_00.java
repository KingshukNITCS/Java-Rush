import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt(); 
        }
        
        for(int j=0; j<n; j++)
        {
            sum = sum + (arr[j]*(n-j)*(j+1));
        }
        
        System.out.print(sum);
    }
 }
