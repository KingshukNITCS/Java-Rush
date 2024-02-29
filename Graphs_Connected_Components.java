//{ Driver Code Starts https://www.geeksforgeeks.org/problems/number-of-provinces/1?utm_source=gfg
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] varr = new boolean[V];
        int vert = 1; 
        int prov = 0;
        while(vert<=V)
        {
            if(dfs(vert,varr,adj) == true) prov++;
            vert++;
        }
        return prov;
    }
    static boolean dfs(int vert, boolean[] varr, ArrayList<ArrayList<Integer>> adj)
    {
        if(varr[vert-1]==true) return false;
        else
        {
            for(int av : adj.get(vert))
            {
                if(varr[av-1]==true) continue;
                else
                {
                    varr[av-1]=true;
                    dfs(av,varr,adj);
                }
            }
            return true;
        }
    }
};
