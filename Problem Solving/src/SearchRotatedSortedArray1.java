public class SearchRotatedSortedArray1 {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if (nums[mid]==target){
                return mid;
            }
            if (nums[low] <=nums[mid]){
                if (nums[low]<=target && nums[mid]>=target){
                    high = mid-1;
                }
                else {
                    low=mid+1;
                }
            }
            else {
                if (nums[mid]<=target && nums[high]>=target){
                    low=mid+1;
                }else {
                    high = mid-1;
                }
            }
        }
        return -1;
    }

//    This solution is by Kunal
    public int search1(int[] nums, int target) {
        int pivot = peakElement(nums);

        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length-1);
        }
        else if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
        return binarySearch(nums, target, pivot+1, nums.length-1);
    }

    public int peakElement(int[] arr){
        int start=0;
        int end = arr.length -1;
        while(start<=end){
            int mid = start+ (end-start) /2;
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start < mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (arr[mid] <= arr[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    public int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start+(end - start) /2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid-1;
            }
            else{start = mid+1;}
        }
        return -1;
    }
}
