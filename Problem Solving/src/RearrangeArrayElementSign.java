import java.util.Arrays;

public class RearrangeArrayElementSign {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
    public static int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int pos=0, neg=1;
        for (int num : nums) {
            if (num > 0) {
                ans[pos] = num;
                pos += 2;
            } else {
                ans[neg] = num;
                neg += 2;
            }
        }
        return ans;
    }
}
