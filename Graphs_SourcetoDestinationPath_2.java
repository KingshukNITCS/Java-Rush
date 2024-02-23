import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] edge = new int[m][2];
        for(int i=0; i<m; i++)
        {
        for(int j=0; j<2; j++)
        {
            edge[i][j] = scn.nextInt();
        }
        }
        int sn = scn.nextInt();
        int dn = scn.nextInt();
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int i=0; i<m; i++)
        {
            int u = edge[i][0];
            int v = edge[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        if(func(graph,n,m,edge,sn,dn)==true) System.out.print("true");
        else System.out.println("false");
    }
    static boolean func(List<List<Integer>> graph, int n, int m, int[][] edge, int sn, int dn)
    {
        Queue<Integer> q = new LinkedList<>();

        boolean[] visited = new boolean[n];

        for(int w=0; w<n; w++)

        {

            visited[w]=false;

        }

        q.add(sn);

        visited[sn]=true;

        while(q.size()>0)

        {

            int x = q.remove();

            List<Integer> temp = graph.get(x);

            for(int t : temp)

            {

                if(visited[t]==false)

                {

                    q.add(t);

              

                    visited[t]=true;

                }

                else continue;

            }

        }
        if(visited[dn]==true) return true;
        else return false;
    }
  }
