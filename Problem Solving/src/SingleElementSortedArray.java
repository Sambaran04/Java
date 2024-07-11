import java.util.HashMap;
import java.util.Map;

public class SingleElementSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicateBinary(nums));
    }
    public static int singleNonDuplicateBinary(int[] nums){
        int n = nums.length;
        if(n==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];

        int low=1;
        int high = n-2;
        
        while (low<=high){
            int mid = low+ (high-low)/2;
            if(nums[mid]!= nums[mid-1] && nums[mid]!=nums[mid+1]) return mid;
            else if ((mid%2==1 && nums[mid]==nums[mid-1]) || (mid%2==0 && nums[mid]==nums[mid+1])) {
                low = mid+1;
            }else high=mid-1;
        }
        return -1;
    }
    public static int singleNonDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int value = map.getOrDefault(num, 0);
            map.put(num, value + 1);
        }
        for (Map.Entry<Integer, Integer> it:map.entrySet()){
            if(it.getValue() == 1) return it.getKey();
        }
        return -1;
    }
}
