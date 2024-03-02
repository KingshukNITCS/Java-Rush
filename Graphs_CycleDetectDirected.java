// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    //Function to return list containing vertices in Topological order. 
    static void topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int[] ans = new int[V]; int el=0;
        int[] ine = new int[V];
        for(int i=0; i<V; i++)
        {
            for(int vx : adj.get(i))
            {
                ine[vx]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int j=0; j<V; j++)
        {
            if(ine[j]==0) q.add(j);
        }
        while(q.size()>0)
        {
            int ve = q.remove();
            ans[el] = ve; el++;
            for(int k : adj.get(ve))
            {
                if(ine[k]==1)
                {
                    ine[k]--;
                    q.add(k);
                }
                if(ine[k]>1) ine[k]--;
            }
        }
        if(el<V) System.out.println("Cycle Exists");
        else System.out.println("Cycle doesn't Exist");
    }
 }
                  
