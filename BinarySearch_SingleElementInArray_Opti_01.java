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
        
        System.out.print(once(arr, n));
    }
    public static int once(int[] arr, int n)
    {
        if(n==1 || arr[0]!=arr[1]) return(arr[0]);
        if(arr[n-1]!=arr[n-2]) return(arr[n-1]);
        int start=2, end=n-3;

        while(start<=end)

        {
            int mid = (start+end)/2;
            if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1])
            {
                return arr[mid];
            }
            if(arr[mid] == arr[mid-1]) mid--;
            if(arr[mid] != arr[mid-1])
            {
                if(mid%2==0)
                {
                    start=mid+2;
                }
                else
                {
                    end=mid-1;
                }
            }
        }
        return -1;
    }

  }
