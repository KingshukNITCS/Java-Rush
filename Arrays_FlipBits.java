// https://www.geeksforgeeks.org/problems/flip-bits0240/1


//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.maxOnes(a, n));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution {

    public static int maxOnes(int a[], int n) {
        int count=0;
        //if 0 once we flip becomes 1 so net gain is +1
        //if 1 once we flip becomes 0 so net gain is -1
        for(int i=0; i<n; i++)
        {
            if(a[i]==0) a[i]=1;
            else if(a[i]==1)
            {
                count++; //no of 1 in original array
                a[i]=-1;
            }
        }
        //kadanes algo of max subarray
        int cmax = 0; //current max
        int omax = Integer.MIN_VALUE; //overall max
        for(int i=0; i<n; i++)
        {
            if(cmax>0) cmax=cmax+a[i];
            else cmax=a[i];
            omax=Math.max(cmax,omax);
        }
        //if after flip we gain anything then add otherwise original count of 1
        if(omax>0) return omax+count;
        else return count;
    } 
  }
          
