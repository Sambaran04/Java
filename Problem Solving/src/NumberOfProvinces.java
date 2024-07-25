import java.util.ArrayList;

public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        int V = isConnected[0].length;
        ArrayList<ArrayList<Integer>> ls = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < V; i++) {
            ls.add(new ArrayList<>());
        }
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (isConnected[i][j]==1 && i!=j){
                    ls.get(i).add(j);
                }
            }
        }
        boolean[] vis = new boolean[V];
        int count=0;
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                count++;
                dfs(i, vis, ls, V);
            }
        }
        return count;
    }
    static void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, int V){
        vis[node] = true;
        for (int i = 0; i < V; i++) {
            if (adj.get(node).get(i) == 1 && !vis[i]) {
                dfs(i, vis, adj, V);
            }
        }
    }
}
