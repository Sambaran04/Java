public class NumberOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int x = 2;
        System.out.println(count(arr, arr.length, x));
    }
    public static int count(int[] arr, int n, int x) {
        int start = binary(arr, x, true);
        int end = binary(arr, x, false);
        if (start == -1) return 0;
        return end-start+1;
    }

    public static int binary(int[] arr, int x, boolean first){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;

            if(x>arr[mid]) start = mid+1;
            else if (x<arr[mid]) end = mid-1;
            else{
                if(first){
                    ans = mid;
                    end = mid-1;
                }else{
                    ans = mid;
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
