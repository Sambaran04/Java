import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> intSet = new HashSet<>();
        for (int num : nums){
            if(intSet.contains(num))
                return true;

            intSet.add(num);
        }
        return false;
    }
}
