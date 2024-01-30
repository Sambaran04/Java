import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static int[] findErrorNums(int[] arr) {
        int i=0;
        while (i<arr.length){
            int correct = arr[i]-1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if (j+1 != arr[j]){
                return new int[] {arr[j], j+1};
            }
        }
        return new int[]{-1, -1};
    }

    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
