import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
//    Used Cyclic Sort here
    public static List<Integer> findDuplicatesCyclic(int[] nums){
        int i=0;
        while (i< nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1){
                ans.add(nums[j]);
            }
        }
        return ans;
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int n:nums){
            n = Math.abs(n);
            if(nums[n-1] > 0) nums[n-1] *= -1;
            else result.add(n);
        }
        return result;
    }

    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
