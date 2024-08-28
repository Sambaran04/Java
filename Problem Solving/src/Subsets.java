import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subsets(nums));
//        sequence(0, ans, arr, n);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        int n=nums.length;
        subset(0, arr, nums, n, ans);
        return ans;
    }
    public static void subset(int ind, List<Integer> arr, int[] nums, int n, List<List<Integer>> ans){
        if (ind==n){
            List<Integer> val = new ArrayList<>();
            for (Integer it:arr){
                val.add(it);
            }
            ans.add(val);
            return;
        }
        subset(ind+1, arr, nums, n, ans);
        arr.add(nums[ind]);
        subset(ind+1, arr, nums, n, ans);
        arr.removeLast();
    }
}
