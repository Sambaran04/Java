public class MedianRowSortedMatrix {
    int median(int[][] matrix, int R, int C) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int i = 0; i < R; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][C - 1]);
        }
        int req = R * C / 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int val = blackBox(matrix, mid);
            if (val <= req) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }

    int upperBound(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return ans;
    }

    int blackBox(int[][] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += upperBound(arr[i], x);
        }
        return count;
    }
}
