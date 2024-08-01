import java.util.Arrays;
import java.util.Collections;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row = matrix.length;
        int col = matrix[0].length;
        rotate(matrix);
        for (int[] ints : matrix) {
            for (int j = 0; j < col; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row - 1; i++) {
            for (int j = i; j < col; j++) {
                swap1(matrix, i, j);
            }
        }
        for (int i = 0; i < row; i++) {
            reverse(matrix, 0, col-1, i);
        }
    }

    public static void rotateBruteForce(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] ans = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ans[j][col - i - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < row; i++) {
            System.arraycopy(ans[i], 0, matrix[i], 0, col);
        }
    }

    public static void swap1(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    public static void swap2(int[][] matrix, int i, int j, int row) {
        int temp = matrix[row][i];
        matrix[row][i] = matrix[row][j];
        matrix[row][j] = temp;
    }
    public static void reverse(int[][] arr, int i, int j, int row){
        while(i<j) {
            swap2(arr, i, j, row);
            i++;
            j--;
        }
    }
}
