public class LowerBound {
    public static void main(String[] args) {
        long[] arr = {1, 2, 5, 6, 10};
        long x = 3;
        System.out.println(findFloor(arr, arr.length, x));
    }
    static int findFloor(long[] arr, int n, long x) {
        int left = 0, right = n - 1;
        int floorIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                floorIndex = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return floorIndex;
    }
}
