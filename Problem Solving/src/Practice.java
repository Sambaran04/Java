import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int K = 10;
        System.out.println(binary(arr, 0, arr.length-1, K));
    }
    static int binary(int[] arr, int l, int r, int K){
        if (l<=r){
            int mid = l + (r-l)/2;
            if (K == arr[mid]) {
                return mid;
            }
            else if (K < arr[mid]){
                return binary(arr, l, mid-1, K);
            }
            else if(K>arr[mid]){
                return binary(arr, mid+1, r, K);
            }
        }
        return -1;
    }
}
