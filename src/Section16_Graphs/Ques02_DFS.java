package Section16_Graphs;

import java.util.ArrayList;

public class Ques02_DFS {

	public void DFS(int node ,  int [] visited , ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> dfs){
        visited[node]=1;
        dfs.add(node);
        for(Integer it : adj.get(node) ){
            if(visited[it]==0){
                DFS(it,visited,adj,dfs);
            }
        }
        
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int [] visited = new int[V];
        ArrayList<Integer> dfs = new ArrayList<Integer>();
        int start=0;
        DFS(start,visited,adj,dfs);
        return dfs;
    }
}
