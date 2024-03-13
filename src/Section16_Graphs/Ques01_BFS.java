package Section16_Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Ques01_BFS {
	public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> bfs = new ArrayList<Integer>();
        int [] visited = new int[V];
        visited[0]=1;
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(0);
        while(!q.isEmpty()){
            int node = q.peek();
            q.poll();
            bfs.add(node);
            for(Integer it : adj.get(node)){
                if(visited[it]==0){
                    q.add(it);
                    visited[it]=1;
                }
                
            }
        }
        return bfs;
    }
}
