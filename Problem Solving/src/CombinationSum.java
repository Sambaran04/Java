import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target)  {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        subset(0, arr, candidates, ans, target, 0);
        return ans;
    }
    public static void subset(int ind, List<Integer> arr, int[] nums, List<List<Integer>> ans, int target, int s){
        if(s==target){
            ans.add(new ArrayList<>(arr));
            return;
        }
        if(s>target || ind==nums.length) {return;}
        arr.add(nums[ind]);
        subset(ind, arr, nums, ans, target, s+nums[ind]);

        arr.removeLast();
        subset(ind+1, arr, nums, ans, target, s);
    }
}
