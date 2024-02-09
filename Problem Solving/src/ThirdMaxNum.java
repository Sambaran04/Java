import java.util.Arrays;
import java.util.HashSet;

public class ThirdMaxNum {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3,1};
        System.out.println(thirdMax(nums));

    }
    public static int thirdMax(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i:nums){
            hs.add(i);
        }
        int[] arr = new int[hs.size()];
        int k=0;

        for (int i:hs){
            arr[k] =i;
            k++;
        }
        Arrays.sort(arr);
        if (arr.length<3)
            return arr[arr.length-1];

        return arr[arr.length-3];
    }
}
