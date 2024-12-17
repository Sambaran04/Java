import java.util.*;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 5, 2, 11, 15, 20, 6, 17, 21};
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max2 = max;
                max = j;
            } else if (j > max2 && j != max) {
                max2 = j;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Maximum element is: "+max);
        System.out.println("2nd Maximum element is: "+max2);
    }
}