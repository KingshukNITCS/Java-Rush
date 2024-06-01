//{ Driver Code Starts


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.AllPrimeFactors(N);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends




class Solution
{
    public int[] AllPrimeFactors(int N)
    {
        int n=N;
        int[] arr = new int[n+1];
        for(int i=2; i<n+1; i++)
        {
            arr[i]=i;
        }
        for(int i=2; i<n+1; i++)
        {
            if(arr[i]==i)
            {
                for(int j=i*i; j<n+1; j+=i)
                {
                    arr[j]=i;
                }
            }
        }
        //System.out.print(Arrays.toString(arr));
        int x=N;
        
        HashMap<Integer, Integer> hmap = new HashMap<>();
        while(x>1)
        {
            int temp = arr[x];
            if(hmap.containsKey(temp))
            {
                hmap.put(temp, 1+hmap.get(temp));
            }
            else
            {
                hmap.put(temp,1);
            }
            x = x/temp;
        }
        int size = hmap.size();
        int count=0;
        int[] ans = new int[size];
        for(int z : hmap.keySet())
        {
            //System.out.println(z);
            ans[count++]=z;
        }
        Arrays.sort(ans);
        return ans;
    }
}
