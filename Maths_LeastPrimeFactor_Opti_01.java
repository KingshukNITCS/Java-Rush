// https://www.geeksforgeeks.org/problems/least-prime-factor5216/1?_gl=1*1mzkpu9*_ga*WEVqSkRobXk5WDY5YkhMV0tEVURteHdlX1lraGJOa3BXZjA5VnByRktYSEhVQzh5U3VHWllxSWh6TW51T0N5VA..*_ga_E752F18V9F*MTcxNzEwODg3My4xLjEuMTcxNzEwODg3My4wLjAuMA..

//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.leastPrimeFactor(n);
            for(int i = 1; i <=n; i++)
            {
                out.print(ans[i] + " ");
            }
            out.println();
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] leastPrimeFactor(int n)
    {
        int[] arr = new int[n+1];
        for(int i=0; i<n+1; i++)
        {
            arr[i]=i;
        }
        for(int i=2; i*i<n+1; i++)
        {
            if(arr[i]==i)
            {
                for(int j=i*i; j<n+1; j+=i)
                {
                    if(arr[j]>i) arr[j]=i;
                }
            }
        }
        return arr;
    }
}
