import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < n; i++) {
            if (set.contains(nums2[i])) {
                arr.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int[] ans = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);
        }
        return ans;
    }
}