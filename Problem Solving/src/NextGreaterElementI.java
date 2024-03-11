import java.util.ArrayList;
import java.util.Arrays;

public class NextGreaterElementI {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i]==nums2[j]){
                    // Check if nums2[j+1]>nums1[i], if yes append the number else append -1
                    if (j == nums2.length-1){
                        ans[i] = -1;
                    }else if (nums2[j+1] < nums2[j]){
                        ans[i] = -1;
                    }else {
                        ans[i] = nums2[j+1];
                    }
                }
            }
        }
        return ans;
    }
}
