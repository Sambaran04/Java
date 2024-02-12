public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(target, nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;

        int left = 0;
        int val_sum = 0;

        for (int i=0; i< nums.length; i++){
            val_sum += nums[i];

            while (val_sum >= target){
                result = Math.min(result, i+1-left);
                val_sum -= nums[left];
                left++;
            }
        }
        return (result != Integer.MAX_VALUE) ? result : 0;
    }
}
