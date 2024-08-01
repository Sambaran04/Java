import java.util.HashMap;

public class SubarraySumK {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        System.out.println(subarraySum(nums, k));
    }

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count=0;
        int prefix=0;
        for (int num : nums) {
            prefix += num;
            int remove = prefix - k;
            count += map.getOrDefault(remove, 0);
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }
    public static int subarraySumIteration(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count=0;
        for(int i=0; i<nums.length; i++){
            int remain = k - nums[i];
            if (nums[i]==k){
                count++;
            }
            if(map.containsKey(remain)){
                count++;
            }
            map.put(nums[i], i);
        }
        return count;
    }
}
