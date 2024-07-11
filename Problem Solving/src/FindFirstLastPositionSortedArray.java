import java.util.Arrays;

public class FindFirstLastPositionSortedArray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int start = binary(nums, target, true);
        int end = binary(nums, target, false);
        return new int[] {start, end};
    }

    public static int binary(int[] nums, int target, boolean first){
        int ans=-1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target > nums[mid]) start = mid+1;
            else if(target<nums[mid]) end = mid-1;
            else{
                if(first){
                    ans = mid;
                    end = mid-1;
                }else{
                    ans = mid;
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}

