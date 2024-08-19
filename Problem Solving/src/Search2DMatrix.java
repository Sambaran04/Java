import java.util.Arrays;
// In this question matrix is fully sorted...
public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
//        System.out.println(Arrays.toString(searchMatrix(arr, 5)));
        System.out.println(binarySearch(arr, 9));
    }

    public static boolean binarySearch(int[][] matrix, int target){
        int n=matrix.length;
        int m = matrix[0].length;
        int low=0;
        int high=n*m-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            int row=mid/m;
            int col=mid%m;
            if (matrix[row][col]==target) return true;
            else if(matrix[row][col]<target) low=mid+1;
            else high=mid-1;
        }
        return false;
    }

    // search in the row provided between the cols provided
    public static int[] searchMatrix(int[][] matrix, int target) {
        int rowIdx = searchPotentialRow(matrix, target);
        if(rowIdx != -1) return binarySearchOverRow(rowIdx, matrix, target);
        else return new int[] {-1, -1};
    }
    private static int searchPotentialRow(int[][] matrix, int target){
        int low=0;
        int high = matrix.length-1;
        while (low <= high){
            int mid = low + (high-low)/2;
            if (matrix[mid][0] <= target && target <= matrix[mid][matrix[0].length-1]){
                return mid;
            }else if (matrix[mid][0]<target){
                low = mid+1;
            }else high=mid-1;
        }
        return -1;
    }
    private static int[] binarySearchOverRow(int rowIdx, int[][] matrix, int target){
        int low=0;
        int high = matrix[rowIdx].length-1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if (matrix[rowIdx][mid]==target) return new int[] {rowIdx, mid};
            else if (matrix[rowIdx][mid]>target) {
                high = mid-1;
            }else low=mid+1;
        }
        return new int[] {-1, -1};
    }
}
