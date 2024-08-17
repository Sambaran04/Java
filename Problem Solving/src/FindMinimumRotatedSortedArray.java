public class FindMinimumRotatedSortedArray {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int ans = Integer.MAX_VALUE;
        while (low<=high){
            int mid = low + (high-low)/2;
            if (nums[low] <= nums[high]){
                ans = Math.min(ans, nums[low]);
                break;
            }
            if (nums[low]<=nums[mid]){
                ans = Math.min(ans, nums[low]);
                low = mid+1;
            }else {
                ans = Math.min(ans, nums[mid]);
                high = mid-1;
            }
        }
        return ans;
    }

//    Kunal's solution
    public int findMin1(int[] nums) {
        int pivot = findPivotWithDuplicates(nums);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            return nums[0];
        }

        // if pivot is found, you have found 2 asc sorted arrays
        return nums[pivot+1];
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
