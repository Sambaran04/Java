import java.util.Arrays;

public class K_WeakestRowMatrix {
    public static void main(String[] args) {
        int[][] mat ={{1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1}};
        int k=3;
        System.out.println(Arrays.toString(kWeakestRows(mat, k)));
    }
    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] arr = new int[mat.length];
        int[] ans = new int[k];

        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat.length; j++) {
                count+= mat[i][j];
            }
            arr[i] = count;
        }
        Arrays.sort(arr);
        System.arraycopy(arr, 0, ans, 0, k);
        return ans;
    }
}
