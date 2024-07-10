import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, 5, 1};
        int max=0;
        int smax=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                smax = max;
                max = arr[i];
            }
        }
        System.out.println(smax);
    }
}
