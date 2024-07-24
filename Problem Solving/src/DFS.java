import java.util.ArrayList;

public class DFS {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ls = new ArrayList<>();
        boolean[] vis = new boolean[V];
        vis[0] = true;
        dfs(0, vis, adj, ls);
        return ls;
    }
    public static void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls){
        vis[node] = true;
        ls.add(node);
        for (Integer it: adj.get(node)){
            if(!vis[it]){
                dfs(it, vis, adj, ls);
            }
        }
    }
}
