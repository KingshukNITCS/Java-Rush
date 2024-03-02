//{ Driver Code Starts - https://www.geeksforgeeks.org/problems/number-of-provinces/1?utm_source=gfg
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
        ArrayList<ArrayList<Integer>> adjl = new ArrayList<ArrayList<Integer>>();
        for(int k=0; k<V; k++)
        {
            adjl.add(new ArrayList<Integer>());
        }
        for(int i=0; i<V; i++)
        {
            int rs = adj.get(i).size();
            for(int j=0; j<rs; j++)
            {
                if(adj.get(i).get(j)==1)
                {
                    adjl.get(i).add(j);
                    adjl.get(j).add(i);
                }
            }
        }
        boolean[] varr = new boolean[V];
        int prov=0;
        for(int vert=0; vert<V; vert++)
        {
            if(varr[vert]==false) 
            {
                varr[vert]=true;
                dfs(vert,varr,adjl);
                prov++;
            }
            else continue;
        }
        return prov;
    }
    static void dfs(int vert, boolean[] varr, ArrayList<ArrayList<Integer>> adj)
    {
        for(int vx : adj.get(vert))
        {
            if(varr[vx]==true) continue;
            else
            {
                varr[vx]=true;
                dfs(vx,varr,adj);
            }
        }
    }
};
