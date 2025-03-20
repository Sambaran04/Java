import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Practice {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the value of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the value of K: ");
        int k = scanner.nextInt();
        System.out.print(Arrays.toString(twoSum(arr, k)));
    }

    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int val = target-arr[i];
            if (map.containsKey(val)){
                return new int[] {map.get(val), i};
            }else{
                map.put(arr[i], i);
            }
        }
        return new int[0];
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
