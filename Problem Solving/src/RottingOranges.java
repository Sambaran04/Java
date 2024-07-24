import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Pair{
    public int row;
    public int col;
    public int tm;

    public Pair(int row, int col, int tm) {
        this.row = row;
        this.col = col;
        this.tm = tm;
    }
}
public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int rows = grid.length;
        int col = grid[0].length;
        int freshcount = 0;
        int[][] vis = new int[rows][col];
        Queue<Pair> q = new LinkedList<>();
        for (int i=0; i<rows; i++){
            for (int j = 0; j < col; j++) {
                if (grid[i][j]==2){
                    q.add(new Pair(i, j, 0));
                    vis[i][j] = 2;
                }
                else if (grid[i][j]==1){
                    freshcount++;
                }
            }
        }
        if (freshcount==0) return 0;
        int tm =0;
        int drow[] = {-1, 0, 1, 0};
        int dcol[] = {0, 1, 0, -1};
        while (!q.isEmpty()){
            Pair point = q.poll();
            int r = point.row;
            int c = point.col;
            int t = point.tm;
            tm = Math.max(tm, t);
            for (int i = 0; i < 4; i++) {
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if (nrow>=0 && ncol>=0 && nrow<rows && ncol < col && grid[nrow][ncol]==1 && vis[nrow][ncol]==0){
                    q.add(new Pair(nrow, ncol, t+1));
                    vis[nrow][ncol] =2;
                    freshcount--;
                }
            }
        }
        if (freshcount!=0) return -1;
        return tm;
    }
}
