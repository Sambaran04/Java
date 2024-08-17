public class AggressiveCows {
    public static int aggCows(int[] arr, int cows) {
        if (cows <= 1) return -1;
        int low = 1;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (calculate(arr, mid, cows)){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return high;
    }
    public static boolean calculate(int[] arr, int dist, int cows){
        int count=1;
        int last = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]-last>=dist){
                count++;
                last = arr[i];
            }
            if (count>=cows){
                return true;
            }
        }
        return false;
    }
}
