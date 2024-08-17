public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        int start = 1;
        int end = max;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (calculate(piles, mid) <= h) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int calculate(int[] arr, int hour) {
        int ans = 0;
        for (int j : arr) {
            ans += (int) Math.ceil((j / (double) hour));
        }
        return ans;
    }
}
