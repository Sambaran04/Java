import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int index=-1;
        int max=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        arr[index] = 0;
        index=-1;
        max=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        arr[index] = 0;
        index=-1;
        max=0;
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
