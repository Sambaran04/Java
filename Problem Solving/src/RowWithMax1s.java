public class RowWithMax1s {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}
        };
        System.out.println(rowWithMax1s(arr));
    }

    public static int rowWithMax1s(int[][] arr) {
        int max = 0;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = -1;
            count = arr[0].length - binary(arr[i]);
            if (count > max) {
                max = count;
                index = i;
            }
        }
        return index;
        // code here
    }

    public static int binary(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > 1) {
                end = mid - 1;
            } else if (arr[mid] < 1) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
}
