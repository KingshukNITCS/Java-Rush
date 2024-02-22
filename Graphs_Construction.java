// Method. n is no. of nodes, m is no. of connections, edges is a 2D array with edge and it's neighbour. one entry for each connection 
void construction(int n, int m, int[m][2] edges)
{
  List<List<Integer>> graph = new ArrayList<>();
  for(int i=0; i<n; i++)
  {
    graph.add(new ArrayList<>());
  }
  for(int i=0; i<m; i++)
  {
    int u = edges[i][0];
    int v = edges[i][1];
    graph.get(u).add(v);
    graph.get(v).add(u);
  }
}
