import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        // Add edges to the adjacency list
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u); // Since the graph is undirected
        }

        return adjList;
    }
}
