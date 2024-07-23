import java.util.HashMap;
import java.util.Map;

public class Exercise {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0};
//        System.out.println(firstMissingPositive(arr));
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            if (j > 0) {
                int value = map.getOrDefault(j, 0);
                map.put(j, value + 1);
            }
        }
        System.out.println(map.get(2));
        for (int i=2; i< arr.length; i++){
            if (map.get(i)==null){
                System.out.println(i);
            }
        }
    }
    public static int firstMissingPositive(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>0) {
                int value = map.getOrDefault(arr[i], 0);
                map.put(arr[i], value + 1);
            }
        }

        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() == 0) {
                return it.getKey();
            }
        }
        return arr.length+1;
    }
}
