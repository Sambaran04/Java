public class FibonacciDP {
    static final int MOD = 1000000007;

    static long topDown(int n) {
        return fib(n, new long[n+1]);
    }
    static long fib(int n, long[] dp){
        if(n<=1){
            return (long) n;
        }
        if(dp[n] !=0){
            return dp[n];
        }
        return dp[n] = (long) (fib(n-1, dp)+fib(n-2, dp)) %MOD;
    }

    static long bottomUp(int n) {
        if(n<=1){
            return (long) n;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            dp[i] = (dp[i-1]+dp[i-2]) %MOD;
        }
        return (long) dp[n];
    }
}
