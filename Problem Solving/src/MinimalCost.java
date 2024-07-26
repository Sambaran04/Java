public class MinimalCost {
    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 50, 20};
        int N = 5;
        int K = 3;
        System.out.println(cost(arr, K, new int[N]));
    }
    public static int cost(int[] arr, int K, int[] dp){
        dp[0]=0;
        for (int i = 1; i < dp.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <=K; j++) {
                if (i-j>=0){
                    int left = dp[i-j] + Math.abs(arr[i]-arr[i-j]);
                    min = Math.min(min, left);
                }
            }
            dp[i] = min;
        }
        return dp[dp.length-1];
    }
}
