public class FrogJump {
    public static void main(String[] args) {
        int[] arr = {10,20, 30, 10};
        int N = 4;
        System.out.println(minimumEnergy(arr, N));
    }
    public static int minimumEnergy(int[] arr, int N){
        return costTD(arr, N-1, new int[N]);
    }
    public static int costTD(int[] arr, int index, int[] dp){
        if (index==0){
            return 0;
        }
        if (dp[index]!=0){
            return dp[index];
        }
        int right = Integer.MAX_VALUE;
        int left = costTD(arr, index - 1, dp) + Math.abs(arr[index] - arr[index - 1]);
        if (index>1){
            right = costTD(arr, index-2, dp) + Math.abs(arr[index]-arr[index-2]);
        }
        dp[index] = Math.min(left, right);
        return dp[index];
    }
    public static int costBU(int[] arr, int index, int[] dp){
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++) {
            int left = dp[i-1]+ Math.abs(arr[i]-arr[i-1]);
            int right = Integer.MAX_VALUE;
            if (i>1){
                right = dp[i-2]+ Math.abs(arr[i]-arr[i-2]);
            }
            dp[i] = Math.min(left, right);
        }
        return dp[dp.length-1];
    }

}
