import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k= 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }
            else {
                int pastIndex = map.get(nums[i]);
                if (Math.abs(pastIndex-i)<=k){
                    return true;
                }else {
                    map.put(nums[i], i);
                }
            }
        }
        return false;
    }

}
