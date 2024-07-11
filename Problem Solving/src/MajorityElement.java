import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int num : nums) {
            int value = mp.getOrDefault(num, 0);
            mp.put(num, value + 1);
        }
        for(Map.Entry<Integer, Integer> it:mp.entrySet()){
            if (it.getValue()>(n/2)) System.out.println(it.getKey());
        }
    }
    public int majorityElement(int[] nums) {
        int major = nums[0], vote=1;
        for(int i=1; i<nums.length; i++){
            if(vote==0){
                vote++;
                major = nums[i];
            }else if(major == nums[i]){
                vote++;
            }else{
                vote--;
            }
        }
        return major;
    }
}
