import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayLeaders {
    public static void main(String[] args) {
        int n=6;
        int[] arr = {16,17,4,3,5,2};
        System.out.println(Arrays.toString(new ArrayList[]{leaders(n, arr)}));
    }
    public static ArrayList<Integer> leaders(int n, int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[n-1];
        ans.add(arr[n - 1]);
        for (int i = n - 2; i >=0; i--) {
            if (arr[i]>=max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
