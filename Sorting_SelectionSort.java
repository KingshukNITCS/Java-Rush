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
        for(int i=0; i<n-1; i++)
        {
            int minv = arr[i];
            int mini = i;
            for(int j=i+1; j<n; j++)
            {
                 if(arr[j]<minv)
                 {
                     minv = arr[j];
                     mini = j;
                 }
            }
            arr[mini] = arr[i];
            arr[i] = minv;
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
       
    }
}
