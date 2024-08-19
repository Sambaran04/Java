import java.util.Arrays;

public class FindPeakElement2 {
    public static void main(String[] args) {
        int[][] arr = {{1, 4},
                {3, 2}};
        System.out.println(Arrays.toString(findPeakGrid(arr)));
    }

    public static int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high = m - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int maxRow = maxValue(mat, n, mid);
            int left = mid - 1 >= 0 ? mat[maxRow][mid - 1] : -1;
            int right = mid + 1 < m ? mat[maxRow][mid + 1] : -1;
            if (mat[maxRow][mid] > left && mat[maxRow][mid] > right) {
                return new int[]{maxRow, mid};
            } else if (mat[maxRow][mid] < left) high = mid - 1;
            else low = mid + 1;
        }
        return new int[]{-1, -1};
    }

    public static int maxValue(int[][] arr, int n, int col) {
        int max = -1;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i][col] > max) {
                max = arr[i][col];
                index = i;
            }
        }
        return index;
    }
}
