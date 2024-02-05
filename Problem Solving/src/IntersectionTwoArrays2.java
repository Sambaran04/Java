import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionTwoArrays2 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int first=0, second=0, k=0;

        int[] ans = new int[Math.min(nums1.length, nums2.length)];

        while (first< nums1.length && second< nums2.length){
            if (nums1[first]==nums2[second]){
                ans[k] = nums1[first];
                first++; second++; k++;
            } else if (nums1[first]>nums2[second]) {
                second++;
            }else first++;
        }
        return Arrays.copyOfRange(ans, 0, k);
    }
}
