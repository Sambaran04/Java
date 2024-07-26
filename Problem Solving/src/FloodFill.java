import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {
    public int[][] floodFillBFS(int[][] image, int sr, int sc, int color) {
        if (image==null || image.length==0 ||image[sr][sc] == color) return image;
        int rows = image.length;
        int cols = image[0].length;
        int init = image[sr][sc];
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(sr, sc, -1));
        image[sr][sc] = color;

        int[] drow = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};
        while (!q.isEmpty()) {
            Pair point = q.poll();
            int r = point.row;
            int c = point.col;
            for (int i = 0; i < 4; i++) {
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if (nrow >= 0 && ncol >= 0 && nrow < rows && ncol < cols && image[nrow][ncol] == init) {
                    image[nrow][ncol] = color;
                    q.add(new Pair(nrow, ncol, -1));
                }
            }
        }
        return image;
    }

    public int[][] floodFillDFS(int[][] image, int sr, int sc, int color) {
        int init = image[sr][sc];
        int[][] vis = image;
        int[] drow = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};
        dfs(sr, sc, vis, image, drow, dcol,color, init);
        return vis;
    }
    public static void dfs(int sr, int sc, int[][] vis, int[][] image, int[] drow, int[] dcol, int color, int init){
        vis[sr][sc] = color;
        int rows = image.length;
        int cols = image[0].length;
        for (int i = 0; i < 4; i++) {
            int nrow = sr + drow[i];
            int ncol = sc + dcol[i];
            if (nrow >= 0 && ncol >= 0 && nrow < rows && ncol < cols && image[nrow][ncol] == init && vis[nrow][ncol] !=color){
                dfs(nrow, ncol, vis, image, drow, dcol, color, init);
            }
        }
    }
}
