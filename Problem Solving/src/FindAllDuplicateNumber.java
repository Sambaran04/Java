import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
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
}
