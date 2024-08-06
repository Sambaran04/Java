import java.util.HashMap;

public class NumberSubArrayXorK {
    public static int subArray(int[] nums, int k){
        int count=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int xr = 0;
        map.put(xr, 1);
        for (int num : nums) {
            xr = xr ^ num;
            int x = xr ^ k;
            count += map.get(x);
            map.put(xr, map.get(xr) + 1);
        }
        return count;
    }
}
