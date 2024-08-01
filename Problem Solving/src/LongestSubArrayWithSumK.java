import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        System.out.println(lenOfLongSubarr(arr, 7, 3));
    }

    //    It's for Positive and Zero numbers only
    public static int lenOfLongSubarr(int[] A, int N, int K) {
        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < N; i++) {
            //calculate the prefix sum till index i:
            sum += A[i];

            // if the sum = k, update the maxLen:
            if (sum == K) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // calculate the sum of remaining part i.e. x-k:
            int rem = sum - K;

            //Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            //Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }
}
