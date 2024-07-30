public class UpperBound {
    public static void main(String[] args) {
        long[] arr = {1, 2, 5, 6, 10};
        long x = 3;
        System.out.println(findUpper(arr, arr.length, x));
    }
    static int findUpper(long[] arr, int n, long x) {
        int left = 0, right = n - 1;
        int ceilIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                ceilIndex = mid;
                right = mid - 1;
            }
        }
        return ceilIndex;
    }
}
