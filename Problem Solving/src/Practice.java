import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 4, 6, 8, 7};
        System.out.println(Arrays.toString(arr));
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclic(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int correct = arr[i]-1;
            if (arr[correct]!=arr[i]){
                swap(arr, correct, i);
            }
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
