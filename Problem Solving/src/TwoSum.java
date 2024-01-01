import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target){
        int start=0;
        int end = nums.length-1;
        while(start<end) {
            int sum = nums[start] + nums[end];

            if (sum > target) {
                end--;
            } else if (sum < target) {
                start++;
            } else {
                return new int[]{start+1, end};
            }
        }
        return new int[] {};
    }
}
