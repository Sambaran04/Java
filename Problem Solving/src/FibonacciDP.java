public class FibonacciDP {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i+" :" +bottomUp2(i));
        }
    }

    static long topDown(int n) {
        return fib(n, new long[n + 1]);
    }

    static long fib(int n, long[] dp) {
        if (n <= 1) {
            return (long) n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        return dp[n] = (long) (fib(n - 1, dp) + fib(n - 2, dp)) % MOD;
    }

    static long bottomUp1(int n) {
        if (n <= 1) {
            return (long) n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }
        return (long) dp[n];
    }

    static long bottomUp2(int n) {
        if (n <= 1) {
            return (long) n;
        }
        int val1 = 0;
        int val2 = 1;
        for (int i = 2; i <n; i++) {
            int ans = val1 + val2;
            val1 = val2;
            val2 = ans;
        }
        return (long) val2;
    }
}
