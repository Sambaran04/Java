public class HouseRobber2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums){
        if(nums.length==1){
            return nums[0];
        }
        int[] temp1 = new int[nums.length-1];
        int[] temp2 = new int[nums.length-1];
        for(int i=0; i<temp1.length; i++){
            temp1[i] = nums[i];
            temp2[i] = nums[i+1];
        }
        return Math.max(ans(temp1), ans(temp2));
    }
    public static int ans(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0], nums[1]);
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i=2; i<dp.length; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }
        return dp[dp.length-1];
    }
}
