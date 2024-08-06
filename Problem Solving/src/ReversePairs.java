import java.util.ArrayList;

public class ReversePairs {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    private static int countAndMerge(int[] arr, int low, int mid, int high) {
        int count = 0;
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int index = 0;

        // Count pairs
        while (left <= mid) {
            while (right <= high && arr[left] > 2L * arr[right]) {
                right++;
            }
            count += (right - mid - 1);
            left++;
        }

        // Merge two sorted halves
        left = low;
        right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];
            }
        }

        while (left <= mid) {
            temp[index++] = arr[left++];
        }

        while (right <= high) {
            temp[index++] = arr[right++];
        }

        // Copy temp back to arr
        System.arraycopy(temp, 0, arr, low, temp.length);

        return count;
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int cnt = 0;
        if (low >= high) return cnt;
        int mid = (low + high) / 2;
        cnt += mergeSort(arr, low, mid);  // left half
        cnt += mergeSort(arr, mid + 1, high); // right half
        cnt += countAndMerge(arr, low, mid, high); //Modification
        return cnt;
    }
}
