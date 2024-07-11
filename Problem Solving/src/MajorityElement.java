import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i=0; i<n; i++){
            int value = mp.getOrDefault(nums[i], 0);
            mp.put(nums[i], value+1);
        }
        for(Map.Entry<Integer, Integer> it:mp.entrySet()){
            if (it.getValue()>(n/2)) System.out.println(it.getKey());
        }
    }
}
