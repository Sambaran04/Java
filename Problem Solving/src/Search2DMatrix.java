public class Search2DMatrix {
    public static void main(String[] args) {
        int[][]matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }

//    search in the row provided between the cols provided
    /*static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart+ (cEnd-cStart)/2;
            if (matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target){
                cStart = mid+1;
            }else {
                cEnd = mid-1;
            }
        }
        return new int[]{-1, -1};
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows==1){
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        int rStart=0;
        int rEnd=rows-1;
        int cMid = cols/2;

        while (rStart < (rEnd-1)){
            int mid = rStart + (rEnd-rStart)/2;
            if (matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target){
                rStart = mid;
            }else {
                rEnd=mid;
            }
        }
        if(matrix[rStart][cMid] == target){
            return new
        }
    }*/
public static boolean searchMatrix(int[][] matrix, int target) {
    int rowIdx = searchPotentialRow(matrix, target);
    if(rowIdx != -1) return binarySearchOverRow(rowIdx, matrix, target);
    else return false;
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
private static boolean binarySearchOverRow(int rowIdx, int[][] matrix, int target){
    int low=0;
    int high = matrix[rowIdx].length-1;
    while (low<=high){
        int mid = low + (high-low)/2;
        if (matrix[rowIdx][mid]==target) return true;
        else if (matrix[rowIdx][mid]>target) {
            high = mid-1;
        }else low=mid+1;
    }
    return false;
}
}
