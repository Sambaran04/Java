import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length<4){
            return new ArrayList<>();
        }
        if (nums.length==4){
            int sum = nums[0]+nums[1]+nums[2]+nums[3];
            if (sum!=target){
                return new ArrayList<>();
            }
        }
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i>0 && nums[i] == nums[i-1]){
                continue;
            }
            for (int j = i+1; j < nums.length; j++) {
                if (j != (i+1) && nums[j]==nums[j-1]){
                    continue;
                }
                int k=j+1;
                int l = nums.length-1;
                while (k<l){
                    long sum = nums[i];
                    sum+=nums[j];
                    sum+=nums[k];
                    sum+=nums[l];
                    if (sum==target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while (k<l && nums[k] == nums[k-1]){
                            k++;
                        }
                        while (k<l && nums[l]== nums[l+1]){
                            l--;
                        }
                    }
                    else if (sum<target){
                        k++;
                    }
                    else {
                        l--;
                    }
                }
            }
        }
        return ans;
    }
}
