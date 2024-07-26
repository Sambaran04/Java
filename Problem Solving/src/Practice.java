import java.security.KeyPair;
import java.util.*;

public class Practice {
    public static void main(String[] args) {

    }
    public int orangesRotting(int[][] grid) {
        if (grid==null || grid.length==0) return 0;
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int[][] vis = new int[rows][cols];
        int count=0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j]==2){
                    vis[i][j] = 2;
                    q.add(new Pair(i, j, 0));
                } else if (grid[i][j]==1) {
                    count++;
                }
            }
        }
        if (count==0) return 0;
        int tm=0;
        int[] drow = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};
        while (!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().time;
            q.poll();
            tm = Math.max(tm, t);
            for (int i = 0; i < 4; i++) {
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if (nrow>=0 && ncol>=0 && nrow<rows && ncol <cols && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    q.add(new Pair(nrow, ncol, t+1));
                    vis[nrow][ncol] = 2;
                    count--;
                }
            }
        }
        if (count!=0) return -1;
        return tm;
    }
}
