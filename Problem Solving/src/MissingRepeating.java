public class MissingRepeating {
    int[] findTwoElement(int[] arr, int n) {
        if (n == 1) {
            return new int[]{-1, -1};
        }
        long sn = (long) n * (n + 1) / 2;
        long s2n = (long) sn * (2 * n + 1) / 3;
        long s1 = 0, s2 = 0;
        for (int i = 0; i < n; i++) {
            s1 += (long) arr[i];
            s2 += (long) arr[i] * (long) arr[i];
        }
        long val1 = sn - s1;
        long val2 = s2n - s2;
        val2 = val2 / val1;
        long x = (val1 + val2) / 2;
        long y = x - val1;
        return new int[]{(int) x, (int) y};
    }
}
