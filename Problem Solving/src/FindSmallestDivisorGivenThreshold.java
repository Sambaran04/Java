public class FindSmallestDivisorGivenThreshold {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(nums[i], min);
            max = Math.max(nums[i], max);
        }
        int low = min;
        int high = max;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (calculate(nums, mid) <= threshold) {
                high = mid - 1;
            } else {
                low = mid+1;
            }
        }
        return low;
    }

    public static int calculate(int[] nums, int mid) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans += Math.ceil(nums[i] / (double) mid);
        }
        return ans;
    }
}
